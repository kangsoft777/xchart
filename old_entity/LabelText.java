package com.hbee.honeybee.entity;

public class LabelText {
	public LabelText(String text, int x, int y) {
		this.text = text;
		this.x = x;
		this.y = y;
	}
	
	private String text = "";
	private String origintext = "";
	private int x = 0;
	private int y = 0;
	private int startx = 0;
	private int starty = 0;
	private int endx = 0;
	private int endy = 0;
	private int icount = 0;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getOrigintext() {
		if(this.origintext.equals(""))
			return text;
		return origintext;
	}
	public void setOrigintext(String origintext) {
		this.origintext = origintext;
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
	public int getStartx() {
		return startx;
	}
	public void setStartx(int startx) {
		this.startx = startx;
	}
	public int getStarty() {
		return starty;
	}
	public void setStarty(int starty) {
		this.starty = starty;
	}
	public int getEndx() {
		return endx;
	}
	public void setEndx(int endx) {
		this.endx = endx;
	}
	public int getEndy() {
		return endy;
	}
	public void setEndy(int endy) {
		this.endy = endy;
	}
	public int getIcount() {
		return icount;
	}
	public void setIcount(int icount) {
		this.icount = icount;
	}
	public LabelText getClone() {
		LabelText lt = new LabelText(this.text,this.x,this.y);
		lt.setStartx(this.startx);
		lt.setStarty(this.starty);
		lt.setEndx(this.endx);
		lt.setEndy(this.endy);
		lt.setOrigintext(this.origintext);
		lt.setIcount(this.icount);
		return lt;
	}
}
