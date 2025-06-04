package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class RegressionInfo implements Serializable{

	private static final long serialVersionUID = -5634480651101788813L;
	private Map<Short,RegressionItem> regMap;
	public RegressionInfo() {
		// TODO Auto-generated constructor stub
		regMap = new HashMap<Short,RegressionItem>();
	}
	
	public int size(){
		if(regMap == null)
			return 0;
		else
			return regMap.size();
	}
	
	public RegressionItem getItem(Short axisgroup) {
		RegressionItem item = regMap.get(axisgroup);
		
		if (item==null) {
			item = new RegressionItem();
			regMap.put(axisgroup, item);
			
		}
		
		return item;
	}
	
	public void putItem(Short axisgroup, RegressionItem item) {
		regMap.put(axisgroup, item);
	}
}
