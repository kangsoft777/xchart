package com.hbee.honeybee.entity;

import java.awt.Color;

public class DynamicChartInfo {
	private String name = "dynamic";
	private double minx = 0;
	private double maxx = 100;
	private double miny = 0;
	private double maxy = 100;
	private boolean autoxvalue = false;
	private boolean autoyvalue = false;
			
	private String type = null;
	private int width = 0;
	private int height = 0;
	private int centerx = 0;
	private int centery = 0;
	
	private int shapetype = 0; //0:line,1:rectangle,2:circle
	private int linewidth = 0;
	private int linecolor = Color.black.getRGB();
	private int fill_color = Color.white.getRGB();
	private int minlinewidth = 0;
	private int maxlinewidth = 0;
	private int x = 0; //line일경우 value:-1일때 line 종료를 의미 
	private int y = 0; //line일경우 value:-1일때 line 종료를 의미 
	private int w = 0; //line일경우 value:-1일때 line 종료를 의미
	private int h = 0; //line일경우 value:-1일때 line 종료를 의미

	
	private boolean isleftaxis = false;
	private boolean isbottomaxis = false;
	private String line_style = "solid";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public boolean isAutoxvalue() {
		return autoxvalue;
	}
	public void setAutoxvalue(boolean autoxvalue) {
		this.autoxvalue = autoxvalue;
	}
	public boolean isAutoyvalue() {
		return autoyvalue;
	}
	public void setAutoyvalue(boolean autoyvalue) {
		this.autoyvalue = autoyvalue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public int getCenterx() {
		return centerx;
	}
	public void setCenterx(int centerx) {
		this.centerx = centerx;
	}
	public int getCentery() {
		return centery;
	}
	public void setCentery(int centery) {
		this.centery = centery;
	}
	public int getShapetype() {
		return shapetype;
	}
	public void setShapetype(int shapetype) {
		this.shapetype = shapetype;
	}
	public int getLinewidth() {
		return linewidth;
	}
	public void setLinewidth(int linewidth) {
		this.linewidth = linewidth;
	}
	public int getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}	
	public int getMinlinewidth() {
		return minlinewidth;
	}
	public void setMinlinewidth(int minlinewidth) {
		this.minlinewidth = minlinewidth;
	}
	public int getMaxlinewidth() {
		return maxlinewidth;
	}
	public void setMaxlinewidth(int maxlinewidth) {
		this.maxlinewidth = maxlinewidth;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public boolean isIsleftaxis() {
		return isleftaxis;
	}
	public void setIsleftaxis(boolean isleftaxis) {
		this.isleftaxis = isleftaxis;
	}
	public boolean isIsbottomaxis() {
		return isbottomaxis;
	}
	public void setIsbottomaxis(boolean isbottomaxis) {
		this.isbottomaxis = isbottomaxis;
	}
	public int getFill_color() {
		return fill_color;
	}
	public void setFill_color(int fill_color) {
		this.fill_color = fill_color;
	}
	public String getLine_style() {
		return line_style;
	}
	public void setLine_style(String line_style) {
		this.line_style = line_style;
	}	
}
