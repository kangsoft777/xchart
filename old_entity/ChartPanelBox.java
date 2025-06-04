package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartPanelBox {
	private boolean gradiant = false;
	private boolean border = false;
	private int borderColor = Color.white.getRGB();
	private int borderwidth = 1;
	private int canvasColor = Color.TRANSLUCENT;
	private int backColor = Color.TRANSLUCENT;
	private int opacity = 100;
	private int leftoffset = 1;
	private int rightoffset = 1;
	private int topoffset = 1;
	private int bottomoffset = 1;
	private int columncount = 3;
	private int rowcount = 3;
	private int frame = 0;
	private int framelinewidth = 1;
	private int frameboardercolor = Color.white.getRGB();
	private boolean frameanimatin = true;

	public boolean isGradiant() {
		return gradiant;
	}

	public void setGradiant(boolean gradiant) {
		this.gradiant = gradiant;
	}

	public boolean isBorder() {
		return border;
	}

	public void setBorder(boolean border) {
		this.border = border;
	}

	public int getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(int borderColor) {
		this.borderColor = borderColor;
	}

	public int getBorderwidth() {
		return borderwidth;
	}

	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}

	public int getBackColor() {
		return backColor;
	}

	public void setBackColor(int backColor) {
		this.backColor = backColor;
	}

	public int getOpacity() {
		return opacity;
	}

	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}

	public int getCanvasColor() {
		return canvasColor;
	}

	public void setCanvasColor(int canvasColor) {
		this.canvasColor = canvasColor;
	}

	public int getLeftoffset() {
		return leftoffset;
	}

	public void setLeftoffset(int leftoffset) {
		this.leftoffset = leftoffset;
	}

	public int getRightoffset() {
		return rightoffset;
	}

	public void setRightoffset(int rightoffset) {
		this.rightoffset = rightoffset;
	}

	public int getTopoffset() {
		return topoffset;
	}

	public void setTopoffset(int topoffset) {
		this.topoffset = topoffset;
	}

	public int getBottomoffset() {
		return bottomoffset;
	}

	public void setBottomoffset(int bottomoffset) {
		this.bottomoffset = bottomoffset;
	}

	public int getColumncount() {
		return columncount;
	}

	public void setColumncount(int columncount) {
		this.columncount = columncount;
	}

	public int getRowcount() {
		return rowcount;
	}

	public void setRowcount(int rowcount) {
		this.rowcount = rowcount;
	}
		
	public int getFrame() {
		return frame;
		//return 1;
	}

	public void setFrame(int frame) {
		this.frame = frame;
	}

	public int getFramelinewidth() {
		return framelinewidth;
	}

	public void setFramelinewidth(int framelinewidth) {
		this.framelinewidth = framelinewidth;
	}

	public int getFrameboardercolor() {
		return frameboardercolor;
	}

	public void setFrameboardercolor(int frameboardercolor) {
		this.frameboardercolor = frameboardercolor;
	}

	public boolean isFrameanimatin() {
		return frameanimatin;
	}

	public void setFrameanimatin(boolean frameanimatin) {
		this.frameanimatin = frameanimatin;
	}

	public void clone(ChartPanelBox panel){
		this.border = panel.isBorder();
		this.borderColor = panel.getBorderColor();
		this.borderwidth = panel.getBorderwidth();
		this.canvasColor = panel.getCanvasColor();
		this.backColor = panel.getBackColor();
		this.opacity = panel.getOpacity();
		this.leftoffset = panel.getLeftoffset();
		this.rightoffset = panel.getRightoffset();
		this.topoffset = panel.getTopoffset();
		this.bottomoffset = panel.getBottomoffset();
		this.columncount = panel.getColumncount();
		this.rowcount = panel.getRowcount();
	}
}
