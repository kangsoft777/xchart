package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartStatistic {
	private String type = "colorby";
	private String[] value = null;
	private String caption = "";
	private int color = Color.black.getRGB();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getValue() {
		return value;
	}
	public void setValue(String[] value) {
		this.value = value;
	}
	public String getCaption() {
		return caption;
	}
	public void setCaption(String caption) {
		this.caption = caption;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}	
}
