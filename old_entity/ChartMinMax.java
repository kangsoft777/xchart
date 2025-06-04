package com.hbee.honeybee.entity;

import java.util.Map;

public class ChartMinMax {
	private int type = 2; // 0:data, 1:specification,2:data+specification,3:userdefine
	private Map<String,String> param = null;
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public Map<String, String> getParam() {
		return param;
	}
	public void setParam(Map<String, String> param) {
		this.param = param;
	}	
}
