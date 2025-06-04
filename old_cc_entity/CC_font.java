package com.hbee.honeybee.cc_entity;

import java.awt.Color;
import java.io.Serializable;

public class CC_font implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -920881263784658435L;
	private String font="11px Arial";
	private int color= Color.white.getRGB();
	private int fontstyle = 0;
	/**
	 * @return the font
	 */
	public String getFont() {
		return font;
	}
	/**
	 * @param font the font to set
	 */
	public void setFont(String font) {
		this.font = font;
	}
	/**
	 * @return the color
	 */
	public int getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(int color) {
		this.color = color;
	}
	public int getFontstyle() {
		return fontstyle;
	}
	public void setFontstyle(int fontstyle) {
		this.fontstyle = fontstyle;
	}
	
	
}
