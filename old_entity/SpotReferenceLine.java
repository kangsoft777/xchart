package com.hbee.honeybee.entity;

import java.awt.Color;

public class SpotReferenceLine {
	private String type = "";
    private String value = ""; 
    private String aggregation = "avg";
    private String label = "";
    private int color = Color.white.getRGB();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getAggregation() {
		return aggregation;
	}
	public void setAggregation(String aggregation) {
		this.aggregation = aggregation;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}    
}
