package com.hbee.honeybee.entity;

public class Size {
	public Size(){}
	public Size(int width, int height){
		this.width = width;
		this.height = height;
	}
	private int width = 0;
	private int height = 0;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}
