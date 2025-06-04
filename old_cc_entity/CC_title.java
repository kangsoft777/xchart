package com.hbee.honeybee.cc_entity;

import java.io.Serializable;

import com.hbee.honeybee.enumeration.AlignType;

public class CC_title implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2485991946594341279L;
	private boolean visible = false;
	private String title= "";
	private CC_font titlefont= new CC_font();
	private int  angle= 0;
	private AlignType align = AlignType.center;
	private int[]  position = null;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the titlefont
	 */
	public CC_font getTitlefont() {
		return titlefont;
	}
	/**
	 * @param titlefont the titlefont to set
	 */
	public void setTitlefont(CC_font titlefont) {
		this.titlefont = titlefont;
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
	
	public AlignType getAlign() {
		return align;
	}
	public void setAlign(AlignType align) {
		this.align = align;
	}
	/**
	 * @return the position
	 */
	public int[] getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(int[] position) {
		this.position = position;
	}
}
