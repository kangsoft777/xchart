package com.hbee.honeybee.entity;

import java.awt.Color;

public class Pen {
	public Pen(Color color){
		this.color = color;
	}
	private int width = 1;
	private Color color; // = Color.black;
	private boolean visible = true;
	
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
}
