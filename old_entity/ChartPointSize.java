package com.hbee.honeybee.entity;

public class ChartPointSize {
	   private boolean autoSize = true;
       private int fixSize = 6;
       private int defaultWidth = 6;
       private int defaultHeight = 6;             
       private double defaultSize = 2.7;
       private double minsize = 2;
       private double maxsize = 10;
       private int sizeStepCount = 10;
       private float sizeRange = 0;
       private float sizeStep = 0;
       private int[] sizes = null;
       private int linewidth = 1;
       private int minImagesize = 35;
       private int maxImagesize = 120;
       private int tooltipImageMaxsize = 200; //Range : 100 ~ 250
	public boolean isAutoSize() {
		return autoSize;
	}
	public void setAutoSize(boolean autoSize) {
		this.autoSize = autoSize;
	}
	public int getFixSize() {
		return fixSize;
	}
	public void setFixSize(int fixSize) {
		this.fixSize = fixSize;
	}		
	public int getMinImagesize() {
		return minImagesize;
	}
	public void setMinImagesize(int minImagesize) {
		this.minImagesize = minImagesize;
	}
	public int getMaxImagesize() {
		return maxImagesize;
	}
	public void setMaxImagesize(int maxImagesize) {
		this.maxImagesize = maxImagesize;
	}	
	public int getTooltipImageMaxsize() {
		return tooltipImageMaxsize;
	}
	public void setTooltipImageMaxsize(int tooltipImageMaxsize) {
		this.tooltipImageMaxsize = tooltipImageMaxsize;
	}
	public double getDefaultSize() {
		return defaultSize;
	}
	public void setDefaultSize(double defaultSize) {
		this.defaultSize = defaultSize;
	}
	public int getDefaultWidth() {
		return defaultWidth;
	}
	public void setDefaultWidth(int defaultWidth) {
		this.defaultWidth = defaultWidth;
	}
	public int getDefaultHeight() {
		return defaultHeight;
	}
	public void setDefaultHeight(int defaultHeight) {
		this.defaultHeight = defaultHeight;
	}
	public double getMinsize() {
		return minsize;
	}
	public void setMinsize(double minsize) {
		this.minsize = minsize;
	}
	public double getMaxsize() {
		return maxsize;
	}
	public void setMaxsize(double maxsize) {
		this.maxsize = maxsize;
	}
	public int getSizeStepCount() {
		return sizeStepCount;
	}
	public void setSizeStepCount(int sizeStepCount) {
		this.sizeStepCount = sizeStepCount;
	}
	public float getSizeRange() {
		return sizeRange;
	}
	public void setSizeRange(float sizeRange) {
		this.sizeRange = sizeRange;
	}
	public float getSizeStep() {
		return sizeStep;
	}
	public void setSizeStep(float sizeStep) {
		this.sizeStep = sizeStep;
	}
	public int[] getSizes() {
		return sizes;
	}
	public void setSizes(int[] sizes) {
		this.sizes = sizes;
	}
	public int getLinewidth() {
		return linewidth;
	}
	public void setLinewidth(int linewidth) {
		this.linewidth = linewidth;
	}
}
