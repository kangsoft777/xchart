package com.hbee.honeybee.entity;

import java.awt.Color;

public class SpotFilter {
	private String type = null;	
	private String operand = "in";
	private String value = "";
	private boolean isothers = false;
	private int othercolor = Color.LIGHT_GRAY.getRGB();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}	
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public boolean isIsothers() {
		return isothers;
	}
	public void setIsothers(boolean isothers) {
		this.isothers = isothers;
	}
	public int getOthercolor() {
		return othercolor;
	}
	public void setOthercolor(int othercolor) {
		this.othercolor = othercolor;
	}	
}
