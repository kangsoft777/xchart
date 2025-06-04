package com.hbee.honeybee.entity;

import java.util.List;
import java.util.Map;

import com.hbee.honeybee.enumeration.AxisDataType;

public class BindParameter {
	
	public String title;
	public String subtitle;
	public int width;
	public int height;
 
	public Double minx;
	public Double maxx;
	public Double miny;
	public Double maxy;
	public Double avgx;
	public Double avgy;
	public Double miny2;
	public Double maxy2;
	public int rowcount;
	
	public List<String> markertext;
	public List<Integer> markerby;
	public List<String> grouptext;
	public List<Short> groupby;
	public List<String> colortext;
	public List<Short> colorby;
	public List<String> shapetext;
	public List<Short> shapeby;
	public List<String> sizetext;
	public List<Short> sizeby;
	
	public List<String> xmembers;
	public List<Double> xvalues;
	public List<Double> x2values;
	public List<String> ymembers;
	public List<Double> yvalues;
	public List<String> y2members;
	public List<Double> y2values;
	public List<Short> xpoints;
	public List<Short> ypoints;
	public List<Long> rowid;

	public boolean isbase;
	public boolean isDraw;

	public AxisDataType xAxisDataType;
	public AxisDataType yAxisDataType;
	public LineStatistics lineStatistics;
	public OutlierInfo outLierInfo;

	public List<String> yValueStrings;
	
	public RegressionInfo regressionInfo;
	
	public String[] predictdata;
	public double[] predictxvalue;
	public double[][] predictyvalue;
	
	public String[] defectParam;
	public List<LegendStatistical> seriesStatisticalList;
	public Map<Double, OutlierInfo> boxPlotXAxisStatiscal  = null;
	
	public boolean isXmemberOmit=false;  // X축 무제한이 적용되었는지의 여부
	public int maxXmemberSize=0;	     // X축 무제한이 적용되었을 경우 X 라벨의 최대길이
	
	public List<ControlLimit> dataControlLimitList;  // out of Limit 을 찾기위한 데이터
	
	public BindParameter() {
		// TODO Auto-generated constructor stub
	}

	/** 
	 * {@inheritDoc}
	 * <pre>
	 * 
	 * </pre>
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BindParameter [title=" + title + ", width=" + width
				+ ", height=" + height + ", minx=" + minx + ", maxx=" + maxx
				+ ", miny=" + miny + ", maxy=" + maxy + ", avgx=" + avgx
				+ ", avgy=" + avgy + ", miny2=" + miny2 + ", maxy2=" + maxy2
				+ ", rowcount=" + rowcount + ", markertext=" + markertext
				+ ", markerby=" + markerby + ", grouptext=" + grouptext
				+ ", groupby=" + groupby + ", colortext=" + colortext
				+ ", colorby=" + colorby + ", shapetext=" + shapetext
				+ ", shapeby=" + shapeby + ", sizetext=" + sizetext
				+ ", sizeby=" + sizeby + ", xmembers=" + xmembers
				+ ", xvalues=" + xvalues + ", x2values=" + x2values
				+ ", ymembers=" + ymembers + ", yvalues=" + yvalues
				+ ", y2members=" + y2members + ", y2values=" + y2values
				+ ", xpoints=" + xpoints + ", ypoints=" + ypoints + ", rowid="
				+ rowid + ", isbase=" + isbase + ", isDraw=" + isDraw
				+ ", xAxisDataType=" + xAxisDataType + ", yAxisDataType="
				+ yAxisDataType + ", lineStatistics=" + lineStatistics + "]";
	}

	
	
	

}
