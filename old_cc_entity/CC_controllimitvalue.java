package com.hbee.honeybee.cc_entity;

import java.awt.Color;
import java.io.Serializable;

import com.hbee.honeybee.enumeration.ControlLimitType;

public class CC_controllimitvalue implements Serializable  {
	private static final long serialVersionUID = -2713031726887801779L;
	
	private int[] xvalues = null;
	private int[] yvalues = null;
	private int color = Color.red.getRGB();
	private int linewidth = 1;
	private String lineStyle = "Solid"; //Solid, Dashdot, Dash, Dot
	private String controlLimitType = "None";
	
	public int[] getXvalues() {
		return xvalues;
	}
	public void setXvalues(int[] xvalues) {
		this.xvalues = xvalues;
	}
	public int[] getYvalues() {
		return yvalues;
	}
	public void setYvalues(int[] yvalues) {
		this.yvalues = yvalues;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public int getLinewidth() {
		return linewidth;
	}
	public void setLinewidth(int linewidth) {
		this.linewidth = linewidth;
	}
	public String getLineStyle() {
		return lineStyle;
	}
	public void setLineStyle(String lineStyle) {
		this.lineStyle = lineStyle;
	}
	public String getControlLimitType() {
		return controlLimitType;
	}
	public void setControlLimitType(String controlLimitType) {
		this.controlLimitType = controlLimitType;
	}
}
