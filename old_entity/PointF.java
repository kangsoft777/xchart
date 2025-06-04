package com.hbee.honeybee.entity;

public class PointF {
	public PointF(float x, float y){
		this.x = x;
		this.y = y;
	}
	private float x = 0;
	private float y = 0;
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
}
