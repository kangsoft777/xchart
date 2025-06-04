package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartGrid {
	private boolean isvisible = true;
	private int linecolor = Color.lightGray.getRGB();
	private boolean isdot = false;
	private int width = 1;
	private int distance = 0;

	public boolean isIsvisible() {
		return isvisible;
	}

	public void setIsvisible(boolean isvisible) {
		this.isvisible = isvisible;
	}

	public int getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}

	public boolean isIsdot() {
		return isdot;
	}

	public void setIsdot(boolean isdot) {
		this.isdot = isdot;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public void clone(ChartGrid grid){
		this.isvisible = grid.isIsvisible();
		this.linecolor = grid.getLinecolor();
		this.isdot = grid.isIsdot();
		this.width = grid.getWidth();
		this.distance = grid.getDistance();
	}
}
