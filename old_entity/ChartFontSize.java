package com.hbee.honeybee.entity;

public class ChartFontSize {
	  private boolean autoSize = true;      
      private float minsize = 11;
      private float maxsize = 20;
      private float labelmaxsize = 17;
      private int sizeStepCount = 10;
      private int resolution_width = 1600;
      private int resolution_height = 900;
      
	public boolean isAutoSize() {
		return autoSize;
	}
	public void setAutoSize(boolean autoSize) {
		this.autoSize = autoSize;
	}
	public float getMinsize() {
		return minsize;
	}
	public void setMinsize(float minsize) {
		this.minsize = minsize;
	}
	public float getMaxsize() {
		return maxsize;
	}
	public void setMaxsize(float maxsize) {
		this.maxsize = maxsize;
	}
	public float getLabelmaxsize() {
		return labelmaxsize;
	}
	public void setLabelmaxsize(float labelmaxsize) {
		this.labelmaxsize = labelmaxsize;
	}
	public int getSizeStepCount() {
		return sizeStepCount;
	}
	public void setSizeStepCount(int sizeStepCount) {
		this.sizeStepCount = sizeStepCount;
	}
	public int getResolution_width() {
		return resolution_width;
	}
	public void setResolution_width(int resolution_width) {
		this.resolution_width = resolution_width;
	}
	public int getResolution_height() {
		return resolution_height;
	}
	public void setResolution_height(int resolution_height) {
		this.resolution_height = resolution_height;
	}
}
