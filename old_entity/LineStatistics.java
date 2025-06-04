package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.HashMap;

public class LineStatistics implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8843809049865858137L;
	private HashMap<LineStatisticsKey,LineStatisticsValue> sMap;
	
	public LineStatistics(HashMap<LineStatisticsKey,LineStatisticsValue> statMap) {
		this.sMap = statMap;
	}

	public LineStatistics() {
		// TODO Auto-generated constructor stub
		sMap = new HashMap<LineStatisticsKey, LineStatisticsValue>();
	}
	
	public LineStatisticsValue getValue(Short colorby, Short shapeby, Short sizeby) {
		LineStatisticsKey key = new LineStatisticsKey(colorby, shapeby, sizeby);
		
		return sMap.get(key);
	}
	
	public LineStatisticsValue getValue(Short colorby, Short shapeby) {
		LineStatisticsKey key = new LineStatisticsKey(colorby, shapeby, (short)-1);
		
		return sMap.get(key);
	}
	
	public LineStatisticsValue getValue(Short colorby) {
		LineStatisticsKey key = new LineStatisticsKey(colorby, (short)-1, (short)-1);
		
		return sMap.get(key);
	}
	
	public LineStatisticsValue getValue() {
		LineStatisticsKey key = new LineStatisticsKey((short)-1, (short)-1, (short)-1);
		
		return sMap.get(key);
	}
	
	public void setValue(Short colorby, Short shapeby, Short sizeby, double stddev, double avarage, int count) {
		LineStatisticsKey key = new LineStatisticsKey(colorby, shapeby, sizeby);
		LineStatisticsValue value = new LineStatisticsValue();
		value.setStddev(stddev);
		value.setTotalCount(count);
		value.setAvarage(avarage);
		sMap.put(key, value);
	}
	
	

	/**
	 * @return the sMap
	 */
	public HashMap<LineStatisticsKey, LineStatisticsValue> getsMap() {
		return sMap;
	}

	/**
	 * @param sMap the sMap to set
	 */
	public void setsMap(HashMap<LineStatisticsKey, LineStatisticsValue> sMap) {
		this.sMap = sMap;
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
		return "LineStatistics [sMap=" + sMap + "]";
	}
		
	
}
