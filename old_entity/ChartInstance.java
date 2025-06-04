package com.hbee.honeybee.entity;

public class ChartInstance {
	private ChartParameter chartparameter = null;
	private boolean isbase = true;
	private int width = 0;
	private int height = 0;
	private String[] axisgrouptext = null;
	private Short[] Axisgroupby = null;
	private String[] colortext = null;
	private Short[] colorby = null;
	private String[] shapetext =  null;
	private Short[] shapeby = null;
	private String[] sizetext = null;
	private Short[] sizeby = null;
	private String[] xmembers = null;
	private String[] ymembers = null;
	private Double[] xvalues = null;
	private Double[] yvalues = null;
	public ChartParameter getChartparameter() {
		return chartparameter;
	}
	public void setChartparameter(ChartParameter chartparameter) {
		this.chartparameter = chartparameter;
	}
	
	public boolean isIsbase() {
		return isbase;
	}
	public void setIsbase(boolean isbase) {
		this.isbase = isbase;
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
	public String[] getAxisgrouptext() {
		return axisgrouptext;
	}
	public void setAxisgrouptext(String[] axisgrouptext) {
		this.axisgrouptext = axisgrouptext;
	}
	public Short[] getAxisgroupby() {
		return Axisgroupby;
	}
	public void setAxisgroupby(Short[] axisgroupby) {
		Axisgroupby = axisgroupby;
	}
	public String[] getColortext() {
		return colortext;
	}
	public void setColortext(String[] colortext) {
		this.colortext = colortext;
	}
	public Short[] getColorby() {
		return colorby;
	}
	public void setColorby(Short[] colorby) {
		this.colorby = colorby;
	}
	public String[] getShapetext() {
		return shapetext;
	}
	public void setShapetext(String[] shapetext) {
		this.shapetext = shapetext;
	}
	public Short[] getShapeby() {
		return shapeby;
	}
	public void setShapeby(Short[] shapeby) {
		this.shapeby = shapeby;
	}
	public String[] getSizetext() {
		return sizetext;
	}
	public void setSizetext(String[] sizetext) {
		this.sizetext = sizetext;
	}
	public Short[] getSizeby() {
		return sizeby;
	}
	public void setSizeby(Short[] sizeby) {
		this.sizeby = sizeby;
	}
	public String[] getXmembers() {
		return xmembers;
	}
	public void setXmembers(String[] xmembers) {
		this.xmembers = xmembers;
	}
	public String[] getYmembers() {
		return ymembers;
	}
	public void setYmembers(String[] ymembers) {
		this.ymembers = ymembers;
	}
	public Double[] getXvalues() {
		return xvalues;
	}
	public void setXvalues(Double[] xvalues) {
		this.xvalues = xvalues;
	}
	public Double[] getYvalues() {
		return yvalues;
	}
	public void setYvalues(Double[] yvalues) {
		this.yvalues = yvalues;
	}
}
