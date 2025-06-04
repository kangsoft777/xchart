package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartTick {
	private boolean isvisible = true;
	private int count = 1;
	private int length = 5;
	private int width = 1;
	private int linecolor = Color.lightGray.getRGB();

	public boolean isIsvisible() {
		return isvisible;
	}

	public void setIsvisible(boolean isvisible) {
		this.isvisible = isvisible;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}
	
	public void clone(ChartTick tick){
		this.isvisible = tick.isIsvisible();
		this.count = tick.getCount();
		this.length = tick.getLength();
		this.width = tick.getWidth();
		this.linecolor = tick.getLinecolor();

	}
}
