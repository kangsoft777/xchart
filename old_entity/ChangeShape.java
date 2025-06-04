package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.ShapeStyle;

public class ChangeShape {
	private int index = 0;
	private String name = "";
	private String shape = ShapeStyle.Circle.toString();

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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}
}
