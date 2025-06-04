package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.TreeMap;


import com.hbee.honeybee.enumeration.AxisType;
import com.hbee.honeybee.enumeration.ControlLimitType;

public class ControlLimit implements Serializable{
	private static Logger logger = LoggerFactory.getLogger(ControlLimit.class);
	private boolean isMulti = true;
	private ControlLimitType controlLimitType = ControlLimitType.None;
	private boolean isLazyLoad = false;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name = "";
	private AxisType axisType = AxisType.Left;
	private double minValue = Double.MAX_VALUE;
	private double maxValue = Double.MIN_VALUE;

	private TreeMap<ControlLimitKey, Double> limitValues; 
	private HashMap<Short, Double> singleCheckMap;  // <axisgroupby,lastAxisvalue>
	
	private boolean isEventLine = false;
	private boolean isBandLine = false;
	
	
	public ControlLimit(String name)
	{
		this.name = name;
		limitValues = new TreeMap<ControlLimitKey, Double>();
		singleCheckMap = new HashMap<Short, Double>();
	}
	
	public ControlLimit(String name, AxisType axisType)
	{
		this(name);
		this.axisType = axisType;
	}
	
	public TreeMap<ControlLimitKey, Double> getKeyValue(){
		return limitValues;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the minValue
	 */
	public double getMinValue() {
		return minValue;
	}

	/**
	 * @return the maxValue
	 */
	public double getMaxValue() {
		return maxValue;
	}

	private void updateMinMaxValue(double currentValue) {
		 if(currentValue < minValue) minValue = currentValue;
		 if(currentValue > maxValue) maxValue = currentValue;
	}
	
	/**
	 * @return the axisType
	 */
	public AxisType getAxisType() {
		return axisType;
	}

	
	public ControlLimitType getControlLimitType() {
		return controlLimitType;
	}

	public void setControlLimitType(ControlLimitType controlLimitType) {
		this.controlLimitType = controlLimitType;
	}

	public void put(Short axisgroupby, Double axisValue, Double limitValue) {
		
		if(isMulti==false) {  // 멀티라인이 아니라면 각 Axis 그룹에서 최종의 값을 취함, 맵에서 체크 하여 라스트
			Double lastAxisvalue = singleCheckMap.get(axisgroupby);
			if(lastAxisvalue==null) {  // 값이 없다면 라스트로 간주하고 집어넣음
				singleCheckMap.put(axisgroupby, axisValue);
				//System.out.println("First.. "+axisgroupby+","+axisValue+","+limitValue+",");
			} else if (axisValue > lastAxisvalue) {  // 이전 값이 존재하고 클 경우
				singleCheckMap.put(axisgroupby, axisValue);
				
				// Min/Max 초기화 (다시 계산해야됨)
//				minValue = Double.MAX_VALUE;
//				maxValue = Double.MIN_VALUE;
				//System.out.println("Accepting..(Replace) "+axisgroupby+","+axisValue+","+limitValue+",");
			} else if (axisValue == lastAxisvalue) {  // 이전 값과 같을 경우
				// DO Nothing..
				//System.out.println("Accepting..(Nothing) "+axisgroupby+","+axisValue+","+limitValue+",");
			} else {
				//System.out.println("Dropping.. "+axisgroupby+","+axisValue+","+limitValue+",");
				return;  // 이외의 값은 받아들이지 않음
			}
		}
		
		ControlLimitKey key = new ControlLimitKey(axisgroupby,axisValue);
		Double currentValue =  limitValues.get(key);
		if (currentValue ==null || limitValue.doubleValue() > currentValue.doubleValue()) {
			limitValues.put(key, limitValue);
			updateMinMaxValue(limitValue.doubleValue());
		}
	}
	
	public void put(Short axisgroupby, Double axisValue, Double limitValue, String eventTitle) {
		
		ControlLimitKey key = new ControlLimitKey(axisgroupby,axisValue,eventTitle);
		Double currentValue =  limitValues.get(key);
		if (currentValue ==null || limitValue.doubleValue() > currentValue.doubleValue()) {
			limitValues.put(key, limitValue);
			if (isBandLine) {
				String[] yvalues = eventTitle.split(",");
				updateMinMaxValue(Double.parseDouble(yvalues[0]));
				updateMinMaxValue(Double.parseDouble(yvalues[1]));
			} else updateMinMaxValue(limitValue.doubleValue());
		}
	}


	public Double get(Short axisgroupby, Double axisValue) {
		return limitValues.get(new ControlLimitKey(axisgroupby,axisValue));
	}
	
	public Iterator<Entry<ControlLimitKey, Double>> getIterator() {
		return limitValues.entrySet().iterator();
	}



	@Override
	public String toString() {
		return "ControlLimit [isMulti=" + isMulti + ", isLazyLoad=" + isLazyLoad + ", name=" + name + ", axisType="
				+ axisType + ", minValue=" + minValue + ", maxValue=" + maxValue + ", isEventLine=" + isEventLine
				+ ", isBandLine=" + isBandLine + "]";
	}

	/**
	 * @return the isEventLine
	 */
	public boolean isEventLine() {
		return isEventLine;
	}

	public boolean isMulti() {
		return isMulti;
	}

	public void setMulti(boolean isMulti) {
		this.isMulti = isMulti;
	}

	/**
	 * @param isEventLine the isEventLine to set
	 */
	public void setEventLine(boolean isEventLine) {
		this.isEventLine = isEventLine;
	}

	/**
	 * @return the limitValues
	 */
	public TreeMap<ControlLimitKey, Double> getLimitValues() {
		return limitValues;
	}

	/**
	 * @param limitValues the limitValues to set
	 */
	public void setLimitValues(TreeMap<ControlLimitKey, Double> limitValues) {
		this.limitValues = limitValues;
	}

	/**
	 * @return the isBandLine
	 */
	public boolean isBandLine() {
		return isBandLine;
	}

	/**
	 * @param isBandLine the isBandLine to set
	 */
	public void setBandLine(boolean isBandLine) {
		this.isBandLine = isBandLine;
	}

	public boolean isLazyLoad() {
		return isLazyLoad;
	}

	public void setLazyLoad(boolean isLazyLoad) {
		this.isLazyLoad = isLazyLoad;
	}
	
	// 데이터 건수를 줄이기 위함
	public void summarize() {
		Iterator<Entry<ControlLimitKey, Double>> enties= limitValues.entrySet().iterator();
		TreeMap<ControlLimitKey, Double> newlimitValues = new TreeMap<ControlLimitKey, Double>();
		
		Entry<ControlLimitKey, Double> prevEntry = null;
		short prevGroup = -1;
		double prevValue = 0;
		while (enties.hasNext()) {
			Entry<ControlLimitKey, Double> entry = enties.next();
			
			Short group =  entry.getKey().getAxisgroupby();
			//Double axisValue =  entry.getKey().getAxisValue();
			Double limitValue =  entry.getValue();
			//Double xvalue =  entry.getKey().getXvalue();
			
			if (prevGroup!=group) {  // 그룹이 달라지거나 값이 바뀌면 변곡점 저장
				newlimitValues.put(entry.getKey(), limitValue);
				prevGroup = group;
				prevValue = limitValue;
			} else if (prevGroup==group && prevValue != limitValue) {  // 그룹이 달라지거나 값이 바뀌면 변곡점 저장
				newlimitValues.put(entry.getKey(), limitValue);
				prevGroup = group;
				prevValue = limitValue;
			}
		}
		logger.info("## Limit {} is summarize  {} -> {}", name, limitValues.size(), newlimitValues.size());
		limitValues = newlimitValues;  // 치환

	}
	
	
}
