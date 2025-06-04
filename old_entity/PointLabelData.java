package com.hbee.honeybee.entity;

public class PointLabelData {
	private String text = "";
	private int x = 0;
	private int y = 0;
	private int basewidth = 0;
	private int baseheight = 0;
	private int width = 0;
	private int height = 0;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getBasewidth() {
		return basewidth;
	}
	public void setBasewidth(int basewidth) {
		this.basewidth = basewidth;
	}
	public int getBaseheight() {
		return baseheight;
	}
	public void setBaseheight(int baseheight) {
		this.baseheight = baseheight;
	}
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
