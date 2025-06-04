package com.hbee.honeybee.entity;

public class ChartReference {
	private boolean ismergemode = false;
	private boolean isReference = false;
	private boolean isMerge = false;
	private boolean isBar = false;
	private String[] xcolumn = null;
	private int xvalueType = 0; //0:String, 1:Numeric , 2:DateTime
	private double minxvalue = 0d;
	private double maxxvalue = 0d;
	private int left = 0;
	private int top = 0;
	private int width = 0;
	private int height = 0;
	
	public boolean isIsmergemode() {
		return ismergemode;
	}
	public void setIsmergemode(boolean ismergemode) {
		this.ismergemode = ismergemode;
	}
	public boolean isReference() {
		return isReference;
	}
	public void setReference(boolean isReference) {
		this.isReference = isReference;
	}	
	public boolean isMerge() {
		return isMerge;
	}
	public void setMerge(boolean isMerge) {
		this.isMerge = isMerge;
	}
	public boolean isBar() {
		return isBar;
	}
	public void setBar(boolean isBar) {
		this.isBar = isBar;
	}	
	public String[] getXcolumn() {
		return xcolumn;
	}
	public void setXcolumn(String[] xcolumn) {
		this.xcolumn = xcolumn;
	}		
	public int getXvalueType() {
		return xvalueType;
	}
	public void setXvalueType(int xvalueType) {
		this.xvalueType = xvalueType;
	}
	public double getMinxvalue() {
		return minxvalue;
	}	
	public void setMinxvalue(double minxvalue) {
		this.minxvalue = minxvalue;
	}
	public double getMaxxvalue() {
		return maxxvalue;
	}
	public void setMaxxvalue(double maxxvalue) {
		this.maxxvalue = maxxvalue;
	}	
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getTop() {
		return top;
	}
	public void setTop(int top) {
		this.top = top;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
