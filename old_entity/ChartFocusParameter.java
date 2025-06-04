package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartFocusParameter {
	private boolean ismeetall = false;
	private boolean islegnedsinglecolor = false;
	private int singlecolor = Color.lightGray.getRGB();
	
	public boolean isIsmeetall() {
		return ismeetall;
	}

	public void setIsmeetall(boolean ismeetall) {
		this.ismeetall = ismeetall;
	}

	public boolean isIslegnedsinglecolor() {
		return islegnedsinglecolor;
	}

	public void setIslegnedsinglecolor(boolean islegnedsinglecolor) {
		this.islegnedsinglecolor = islegnedsinglecolor;
	}

	public int getSinglecolor() {
		return singlecolor;
	}

	public void setSinglecolor(int singlecolor) {
		this.singlecolor = singlecolor;
	}

	private ChartFocus[] chartfocus;

	public ChartFocus[] getChartfocus() {
		return chartfocus;
	}
	
	public ChartFocus[] cloneChartfocus() {
		if(chartfocus != null && chartfocus.length > 0) {
			ChartFocus[] focus = new ChartFocus[chartfocus.length];
			for(int i=0;i<chartfocus.length;i++)
				focus[i] = chartfocus[i].getClone();
			return focus;
		}else 
			return null;		
	}

	public void setChartfocus(ChartFocus[] chartfocus) {
		this.chartfocus = chartfocus;
	}	
	
	public void  calRefresh() {
		if(chartfocus != null) {
			for(int i=0;i<chartfocus.length;i++)
				chartfocus[i].calRefresh();
		}
	}
}
