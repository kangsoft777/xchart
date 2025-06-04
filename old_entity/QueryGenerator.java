package com.hbee.honeybee.entity;
import java.util.*;
import java.util.stream.Collectors;

public class QueryGenerator {
	public String buildQuery(ChartMember member, String aggregation, String aggregation2, String seriestype,Map<String, String> columnDataTypeMap, Map<String, String> aliasColumns) {

        // 1) GROUP BY 대상 컬럼들 (split, marker, color, shape, size, hierarchy, group, hyperlink, image, from, to 등)
        Set<String> groupByCols = new LinkedHashSet<>();
        addAllIfNotNull(groupByCols, member.getSplit());
        addAllIfNotNull(groupByCols, member.getMarker());
        addAllIfNotNull(groupByCols, member.getColor());
        addAllIfNotNull(groupByCols, member.getShape());
        addAllIfNotNull(groupByCols, member.getSize());
        addAllIfNotNull(groupByCols, member.getHierarchy());
        addAllIfNotNull(groupByCols, member.getGroup());
        addAllIfNotNull(groupByCols, member.getHyperlink());
        addAllIfNotNull(groupByCols, member.getImage());
        addAllIfNotNull(groupByCols, member.getFrom());
        addAllIfNotNull(groupByCols, member.getTo());

        // 2) SELECT 절
        List<String> selectList = new ArrayList<>();
        // groupByCols는 그대로 SELECT
        for (String col : groupByCols) {
            selectList.add(col);
        }

        // 3) X 컬럼들 처리
        //    - seriestype이 (Scatter|Line) AND xCol의 데이터타입이 (timestamp|String)이면 => group by
        //    - 그 외 => 집계 함수로 처리
        // usedAliases: 이미 사용된 alias 모음 (중복 방지)
        Set<String> usedAliases = new LinkedHashSet<>(groupByCols); 

        boolean isScatterLine = "Scatter".equalsIgnoreCase(seriestype) || "Line".equalsIgnoreCase(seriestype);

        if (member.getX() != null && member.getX().length > 0) {
            for (String xCol : member.getX()) {
                // xCol의 데이터 타입 얻기 (기본값: numeric 가정)
                String dtype = columnDataTypeMap.getOrDefault(xCol, "numeric");

                if (isScatterLine && (dtype.equalsIgnoreCase("timestamp") || dtype.equalsIgnoreCase("String"))) {
                    // GROUP BY 대상으로 처리
                    groupByCols.add(xCol);
                    // SELECT에도 원본 컬럼(또는 필요한 경우 alias) 추가
                    // 만약 이미 selectList에 xCol이 없다면 추가
                    if (!selectList.contains(xCol)) {
                        selectList.add(xCol);
                    }
                } else {
                    // 집계 처리 => y (aggregation) 비슷하게 SUM, AVG 등 적용
                    // 여기서는 예시로 SUM()을 기본값, seriestype이 Bar일 때도 SUM()이라 가정
                    String aggFunc = isBlank(aggregation)
                                     ? member.getAggregation().toUpperCase()
                                     : "SUM";
                    // xCol이 만약 다른 yCol과 중복될 수 있으므로 unique alias
                    String uniqueAlias = getUniqueAlias(xCol, usedAliases);
                    selectList.add(aggFunc + "(" + xCol + ") AS " + uniqueAlias);
                    aliasColumns.put(xCol, uniqueAlias);
                }
            }
        }

        // 4) Y / Y2 처리 (기존 로직 동일)
        //    - y, y2에 있는 컬럼들도 집계. 중복 alias 방지
        if (member.getY() != null && member.getY().length > 0) {
            String aggFunc = isBlank(aggregation)
                    ? aggregation.toUpperCase()
                    : "SUM";

            for (String yCol : member.getY()) {
                String uniqueAlias = getUniqueAlias(yCol, usedAliases);
                selectList.add(aggFunc + "(" + yCol + ") AS " + uniqueAlias);
                aliasColumns.put(yCol, uniqueAlias);
            }
        }

        if (member.getY2() != null && member.getY2().length > 0) {
            String aggFunc2 = isBlank(aggregation2)
                    ? aggregation2.toUpperCase()
                    : "SUM";

            for (String y2Col : member.getY2()) {
                String uniqueAlias = getUniqueAlias(y2Col, usedAliases);
                selectList.add(aggFunc2 + "(" + y2Col + ") AS " + uniqueAlias);
                aliasColumns.put(y2Col, uniqueAlias);
            }
        }

        // SELECT 절 문자열화
        String selectClause = selectList.stream()
                .distinct()
                .collect(Collectors.joining(", "));

        // GROUP BY 절 (중복 제거)
        // (y, y2, x - 집계된 것들은 제외)
        // 이미 groupByCols에 들어간 것만 사용
        String groupByClause = "";
        if (!groupByCols.isEmpty()) {
            groupByClause = "GROUP BY " + String.join(", ", groupByCols);
        }

        // ORDER BY (GROUP BY 컬럼들)
        String orderByClause = "";
        if (!groupByCols.isEmpty()) {
            orderByClause = "ORDER BY " + String.join(", ", groupByCols);
        }

        // 최종 쿼리
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ").append(selectClause).append("\n");
        sb.append("FROM some_table\n");
        if (!groupByClause.isEmpty()) {
            sb.append(groupByClause).append("\n");
        }
        if (!orderByClause.isEmpty()) {
            sb.append(orderByClause);
        }

        return sb.toString();
    }

	private boolean isBlank(String value) {
		if(value == null || value.equals(""))
			return true;
		else
			return false;
	}
	
    // ---------------------------------------------------
    // 도우미 메서드들
    // ---------------------------------------------------

    /** 배열이 null/비어있지 않다면, 해당 요소들을 groupByCols에 추가 */
    private void addAllIfNotNull(Set<String> groupByCols, String[] arr) {
        if (arr != null && arr.length > 0) {
            groupByCols.addAll(Arrays.asList(arr));
        }
    }

    /**
     * 이미 사용된 alias(usedAliases)와 중복되지 않는 alias를 구함
     */
    private String getUniqueAlias(String originalAlias, Set<String> usedAliases) {
        String candidate = originalAlias;
        int counter = 2;
        while (usedAliases.contains(candidate)) {
            candidate = originalAlias + "_" + counter;
            counter++;
        }
        usedAliases.add(candidate);
        return candidate;
    }
}
