package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartFavorite {
	private String name = "";
	private int color = Color.white.getRGB();
	private String[] values = null;
	private boolean others = false;
	
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
	public String[] getValues() {
		return values;
	}
	public void setValues(String[] values) {
		this.values = values;
	}
	/**
	 * @return the others
	 */
	public boolean isOthers() {
		return others;
	}
	/**
	 * @param others the others to set
	 */
	public void setOthers(boolean others) {
		this.others = others;
	}
}
