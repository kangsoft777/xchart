package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.ChartPart;

public class ChangeVisible {
	private ChartPart chartPart = ChartPart.Color;
    private int index = 0;
    private String name = "";
    private int visible = 0;
	public ChartPart getChartPart() {
		return chartPart;
	}
	public void setChartPart(ChartPart chartPart) {
		this.chartPart = chartPart;
	}
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
	public int getVisible() {
		return visible;
	}
	public void setVisible(int visible) {
		this.visible = visible;
	}
}
