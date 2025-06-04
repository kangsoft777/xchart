package com.hbee.honeybee.entity;

public class ChartStatistical {
	private String position = "right";
	private ChartStatistic[] chartstatistic = null;
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public ChartStatistic[] getChartstatistic() {
		return chartstatistic;
	}
	public void setChartstatistic(ChartStatistic[] chartstatistic) {
		this.chartstatistic = chartstatistic;
	}	
}
