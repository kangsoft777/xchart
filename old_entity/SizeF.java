package com.hbee.honeybee.entity;

public class SizeF {
	public SizeF(){}
	public SizeF(float width, float height){
		this.width = width;
		this.height = height;
	}
	private float width = 0;
	private float height = 0;

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
}
