package com.hbee.honeybee.cc_entity;

import java.awt.Color;
import java.io.Serializable;

public class CC_axis implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 7143276126920746406L;
private boolean	visible = false;
private boolean axisvisible = false;
private String type= "left";
private int   size=0;
private int[] startpoint= null;
private int[] endpoint= null;
private int axiscolor= Color.lightGray.getRGB();
private int axiswidth=1; 
private boolean gridvisible = false;
private int[] grid= null;
private int gridcolor= Color.lightGray.getRGB();
private int gridwidth=1;
private int griddistance=0;
    
private int tickstroke=1;
private int[] tick= null;
private int[] mtick= null;
private boolean tickvisible = false;
private int  tickcolor=Color.lightGray.getRGB();
private int  tickwidth=5;
private boolean  mtickvisible = false;
private int mtickstroke=1;
private int mtickcolor=Color.lightGray.getRGB();
private int mtickwidth=3;

private boolean ishierarch = false;
private int hangle = 0;
private String[] hrtext = null;
private int[] hrx = null;
private int[] hry = null;

private int[] hrlinex = null;
private int[] hrliney = null;
private int[] hrlinex2 = null;
private int[] hrliney2 = null;

private boolean islabelvisible = false;
private String[] label=null;
private int[] labelpoints=null;
private int  angle=0;
private CC_font labelfont=new CC_font();
private CC_title   title=new CC_title();
private String numericformat = "#,###,##0";

/**
 * @return the visible
 */
public boolean isVisible() {
	return visible;
}

/**
 * @param visible the visible to set
 */
public void setVisible(boolean visible) {
	this.visible = visible;
}

/**
 * @return the axisvisible
 */
public boolean isAxisvisible() {
	return axisvisible;
}

/**
 * @param axisvisible the axisvisible to set
 */
public void setAxisvisible(boolean axisvisible) {
	this.axisvisible = axisvisible;
}

/**
 * @return the type
 */
public String getType() {
	return type;
}

/**
 * @param type the type to set
 */
public void setType(String type) {
	this.type = type;
}

/**
 * @return the size
 */
public int getSize() {
	return size;
}

/**
 * @param size the size to set
 */
public void setSize(int size) {
	this.size = size;
}

/**
 * @return the startpoint
 */
public int[] getStartpoint() {
	return startpoint;
}

/**
 * @param startpoint the startpoint to set
 */
public void setStartpoint(int[] startpoint) {
	this.startpoint = startpoint;
}

/**
 * @return the endpoint
 */
public int[] getEndpoint() {
	return endpoint;
}

/**
 * @param endpoint the endpoint to set
 */
public void setEndpoint(int[] endpoint) {
	this.endpoint = endpoint;
}

/**
 * @return the axiscolor
 */
public int getAxiscolor() {
	return axiscolor;
}

/**
 * @param axiscolor the axiscolor to set
 */
public void setAxiscolor(int axiscolor) {
	this.axiscolor = axiscolor;
}

/**
 * @return the axiswidth
 */
public int getAxiswidth() {
	return axiswidth;
}

/**
 * @param axiswidth the axiswidth to set
 */
public void setAxiswidth(int axiswidth) {
	this.axiswidth = axiswidth;
}

/**
 * @return the gridvisible
 */
public boolean isGridvisible() {
	return gridvisible;
}

/**
 * @param gridvisible the gridvisible to set
 */
public void setGridvisible(boolean gridvisible) {
	this.gridvisible = gridvisible;
}

/**
 * @return the grid
 */
public int[] getGrid() {
	return grid;
}

/**
 * @param grid the grid to set
 */
public void setGrid(int[] grid) {
	this.grid = grid;
}

/**
 * @return the gridcolor
 */
public int getGridcolor() {
	return gridcolor;
}

/**
 * @param gridcolor the gridcolor to set
 */
public void setGridcolor(int gridcolor) {
	this.gridcolor = gridcolor;
}

/**
 * @return the gridwidth
 */
public int getGridwidth() {
	return gridwidth;
}

/**
 * @param gridwidth the gridwidth to set
 */
public void setGridwidth(int gridwidth) {
	this.gridwidth = gridwidth;
}

public int getGriddistance() {
	return griddistance;
}

public void setGriddistance(int griddistance) {
	this.griddistance = griddistance;
}

/**
 * @return the tickstroke
 */
public int getTickstroke() {
	return tickstroke;
}

/**
 * @param tickstroke the tickstroke to set
 */
public void setTickstroke(int tickstroke) {
	this.tickstroke = tickstroke;
}

/**
 * @return the tick
 */
public int[] getTick() {
	return tick;
}

/**
 * @param tick the tick to set
 */
public void setTick(int[] tick) {
	this.tick = tick;
}

/**
 * @return the mtick
 */
public int[] getMtick() {
	return mtick;
}

/**
 * @param mtick the mtick to set
 */
public void setMtick(int[] mtick) {
	this.mtick = mtick;
}

/**
 * @return the tickvisible
 */
public boolean isTickvisible() {
	return tickvisible;
}

/**
 * @param tickvisible the tickvisible to set
 */
public void setTickvisible(boolean tickvisible) {
	this.tickvisible = tickvisible;
}

/**
 * @return the tickcolor
 */
public int getTickcolor() {
	return tickcolor;
}

/**
 * @param tickcolor the tickcolor to set
 */
public void setTickcolor(int tickcolor) {
	this.tickcolor = tickcolor;
}

/**
 * @return the tickwidth
 */
public int getTickwidth() {
	return tickwidth;
}

/**
 * @param tickwidth the tickwidth to set
 */
public void setTickwidth(int tickwidth) {
	this.tickwidth = tickwidth;
}

/**
 * @return the mtickstroke
 */
public int getMtickstroke() {
	return mtickstroke;
}

/**
 * @param mtickstroke the mtickstroke to set
 */
public void setMtickstroke(int mtickstroke) {
	this.mtickstroke = mtickstroke;
}

/**
 * @return the mtickvisible
 */
public boolean isMtickvisible() {
	return mtickvisible;
}

/**
 * @param mtickvisible the mtickvisible to set
 */
public void setMtickvisible(boolean mtickvisible) {
	this.mtickvisible = mtickvisible;
}

/**
 * @return the mtickcolor
 */
public int getMtickcolor() {
	return mtickcolor;
}

/**
 * @param mtickcolor the mtickcolor to set
 */
public void setMtickcolor(int mtickcolor) {
	this.mtickcolor = mtickcolor;
}

/**
 * @return the mtickwidth
 */
public int getMtickwidth() {
	return mtickwidth;
}

/**
 * @param mtickwidth the mtickwidth to set
 */
public void setMtickwidth(int mtickwidth) {
	this.mtickwidth = mtickwidth;
}

public boolean isIslabelvisible() {
	return islabelvisible;
}

public void setIslabelvisible(boolean islabelvisible) {
	this.islabelvisible = islabelvisible;
}

/**
 * @return the label
 */
public String[] getLabel() {
	return label;
}

/**
 * @param label the label to set
 */
public void setLabel(String[] label) {
	this.label = label;
}

/**
 * @return the labelpoints
 */
public int[] getLabelpoints() {
	return labelpoints;
}

/**
 * @param labelpoints the labelpoints to set
 */
public void setLabelpoints(int[] labelpoints) {
	this.labelpoints = labelpoints;
}

/**
 * @return the angle
 */
public int getAngle() {
	return angle;
}

/**
 * @param angle the angle to set
 */
public void setAngle(int angle) {
	this.angle = angle;
}

/**
 * @return the labelfont
 */
public CC_font getLabelfont() {
	return labelfont;
}

/**
 * @param labelfont the labelfont to set
 */
public void setLabelfont(CC_font labelfont) {
	this.labelfont = labelfont;
}

/**
 * @return the title
 */
public CC_title getTitle() {
	return title;
}

/**
 * @param title the title to set
 */
public void setTitle(CC_title title) {
	this.title = title;
}

public boolean isIshierarch() {
	return ishierarch;
}

public void setIshierarch(boolean ishierarch) {
	this.ishierarch = ishierarch;
}

public int getHangle() {
	return hangle;
}

public void setHangle(int hangle) {
	this.hangle = hangle;
}

public String[] getHrtext() {
	return hrtext;
}

public void setHrtext(String[] hrtext) {
	this.hrtext = hrtext;
}

public int[] getHrx() {
	return hrx;
}

public void setHrx(int[] hrx) {
	this.hrx = hrx;
}

public int[] getHry() {
	return hry;
}

public void setHry(int[] hry) {
	this.hry = hry;
}

public int[] getHrlinex() {
	return hrlinex;
}

public void setHrlinex(int[] hrlinex) {
	this.hrlinex = hrlinex;
}

public int[] getHrliney() {
	return hrliney;
}

public void setHrliney(int[] hrliney) {
	this.hrliney = hrliney;
}

public int[] getHrlinex2() {
	return hrlinex2;
}

public void setHrlinex2(int[] hrlinex2) {
	this.hrlinex2 = hrlinex2;
}

public int[] getHrliney2() {
	return hrliney2;
}

public void setHrliney2(int[] hrliney2) {
	this.hrliney2 = hrliney2;
}

public String getNumericformat() {
	return numericformat;
}

public void setNumericformat(String numericformat) {
	this.numericformat = numericformat;
}

}

