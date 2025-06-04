package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.TooltipType;

public class ChartTooltip {
	private boolean isRound = true;
	private int transparency = 70;
	private int backcolor = Color.lightGray.getRGB();
	private boolean isborder = false;
	private int bordercolor = Color.gray.getRGB();	
	private TooltipType tooltipType = TooltipType.DefaultTooltip;
	private ChartTooltipValue[] tooltipitems = null;
	
	public boolean isRound() {
		return isRound;
	}
	public void setRound(boolean isRound) {
		this.isRound = isRound;
	}
	public int getTransparency() {
		return transparency;
	}
	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}
	public int getBackcolor() {
		return backcolor;
	}
	public void setBackcolor(int backcolor) {
		this.backcolor = backcolor;
	}
	public boolean isIsborder() {
		return isborder;
	}
	public void setIsborder(boolean isborder) {
		this.isborder = isborder;
	}
	public int getBordercolor() {
		return bordercolor;
	}
	public void setBordercolor(int bordercolor) {
		this.bordercolor = bordercolor;
	}	
	public TooltipType getTooltipType() {
		return tooltipType;
	}
	public void setTooltipType(TooltipType tooltipType) {
		this.tooltipType = tooltipType;
	}
	public ChartTooltipValue[] getTooltipitems() {
		return tooltipitems;
	}
	public void setTooltipitems(ChartTooltipValue[] tooltipitems) {
		this.tooltipitems = tooltipitems;
	}	
}
