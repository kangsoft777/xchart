package com.hbee.honeybee.entity;

public class ChartLinQ {
	private boolean isminx = false;
	private boolean ismaxx = false;
	private boolean isminy = false;
	private boolean ismaxy = false;
	private boolean isminy2 = false;
	private boolean ismaxy2 = false;
	private boolean ismerge = false;
		
	private double minx = 0;
	private double maxx = 0;
	private double miny = 0;
	private double maxy = 0;
	private double miny2 = 0;
	private double maxy2 = 0;
	private int[] axesrect = null;
	private int[] visiblecolorby = null;
	private int index = 0;
	
	public boolean isIsminx() {
		return isminx;
	}
	public void setIsminx(boolean isminx) {
		this.isminx = isminx;
	}
	public boolean isIsmaxx() {
		return ismaxx;
	}
	public void setIsmaxx(boolean ismaxx) {
		this.ismaxx = ismaxx;
	}
	public boolean isIsminy() {
		return isminy;
	}
	public void setIsminy(boolean isminy) {
		this.isminy = isminy;
	}
	public boolean isIsmaxy() {
		return ismaxy;
	}
	public void setIsmaxy(boolean ismaxy) {
		this.ismaxy = ismaxy;
	}
	public boolean isIsminy2() {
		return isminy2;
	}
	public void setIsminy2(boolean isminy2) {
		this.isminy2 = isminy2;
	}
	public boolean isIsmaxy2() {
		return ismaxy2;
	}
	public void setIsmaxy2(boolean ismaxy2) {
		this.ismaxy2 = ismaxy2;
	}
	public boolean isIsmerge() {
		return ismerge;
	}
	public void setIsmerge(boolean ismerge) {
		this.ismerge = ismerge;
	}
	public double getMinx() {
		return minx;
	}
	public void setMinx(double minx) {
		this.minx = minx;
	}
	public double getMaxx() {
		return maxx;
	}
	public void setMaxx(double maxx) {
		this.maxx = maxx;
	}
	public double getMiny() {
		return miny;
	}
	public void setMiny(double miny) {
		this.miny = miny;
	}
	public double getMaxy() {
		return maxy;
	}
	public void setMaxy(double maxy) {
		this.maxy = maxy;
	}
	public double getMiny2() {
		return miny2;
	}
	public void setMiny2(double miny2) {
		this.miny2 = miny2;
	}
	public double getMaxy2() {
		return maxy2;
	}
	public void setMaxy2(double maxy2) {
		this.maxy2 = maxy2;
	}
	public int[] getAxesrect() {
		return axesrect;
	}
	public void setAxesrect(int[] axesrect) {
		this.axesrect = axesrect;
	}
	public int[] getVisiblecolorby() {
		return visiblecolorby;
	}
	public void setVisiblecolorby(int[] visiblecolorby) {
		this.visiblecolorby = visiblecolorby;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}	
}
