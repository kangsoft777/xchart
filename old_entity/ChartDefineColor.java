package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.EqualType;

public class ChartDefineColor {
	private String name = "";
	private EqualType equalType = EqualType.Equal;
	private int color = Color.white.getRGB();
    private boolean isgradient = false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
	public EqualType getEqualType() {
		return equalType;
	}
	public void setEqualType(EqualType equalType) {
		this.equalType = equalType;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public boolean isIsgradient() {
		return isgradient;
	}
	public void setIsgradient(boolean isgradient) {
		this.isgradient = isgradient;
	}
}
