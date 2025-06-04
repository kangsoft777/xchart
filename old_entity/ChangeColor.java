package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChangeColor {
	private int index = 0;
	private String name = "";
	private int color = Color.WHITE.getRGB();
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
    
}
