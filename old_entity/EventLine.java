package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.FontLocationType;

public class EventLine {
	private String name = "EventLine";
	private String column = "";
	private int lineColor = Color.WHITE.getRGB();
	private int width = 1;
	private boolean isHorizontal = true;
	private FontLocationType fontlocationType = FontLocationType.Top;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public int getLineColor() {
		return lineColor;
	}

	public void setLineColor(int lineColor) {
		this.lineColor = lineColor;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isHorizontal() {
		return isHorizontal;
	}

	public void setHorizontal(boolean isHorizontal) {
		this.isHorizontal = isHorizontal;
	}

	public FontLocationType getFontlocationType() {
		return fontlocationType;
	}

	public void setFontlocationType(FontLocationType fontlocationType) {
		this.fontlocationType = fontlocationType;
	}
}
