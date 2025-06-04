package com.hbee.honeybee.entity;

import java.awt.Color;

public class SpotFocus {
	private String type = "";
	private String operand = "in";
	private String value = "";
	private int color = Color.red.getRGB();
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
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}	
}
