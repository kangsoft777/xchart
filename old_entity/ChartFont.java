package com.hbee.honeybee.entity;

import java.awt.Color;
import java.awt.Font;

public class ChartFont {
	private String fontname = "Verdana";
	private String fontstyle = "regular";
	private float defaultfontsize = 11f;
	private float fontsize = 11f;
	private int fontcolor = Color.black.getRGB();

	public String getFontname() {
		return fontname;
	}

	public void setFontname(String fontname) {
		this.fontname = fontname;
	}

	public String getFontstyle() {
		return fontstyle;
	}

	public void setFontstyle(String fontstyle) {
		this.fontstyle = fontstyle;
	}

	public float getDefaultfontsize() {
		return defaultfontsize;
	}

	public void setDefaultfontsize(float defaultfontsize) {
		this.defaultfontsize = defaultfontsize;
	}

	public float getFontsize() {
		return fontsize;
	}

	public void setFontsize(float fontsize) {
		this.fontsize = fontsize;
	}

	public int getFontcolor() {
		return fontcolor;
	}

	public void setFontcolor(int fontcolor) {
		this.fontcolor = fontcolor;
	}

	public Font getFont() { return getFont(this.getFontname());}
	public Font getFont(String fontname) {
		return getFont(fontname,(int) this.getFontsize());
	}
	public Font getFont(String fontname, int fontsize) {
		int ifontstyle = 0;
		switch(fontstyle.toLowerCase()){
		case "bold":
			ifontstyle = Font.BOLD;
			break;
		case "regular":
			ifontstyle = Font.PLAIN;
			break;
		case "italic":
			ifontstyle = Font.ITALIC;
			break;
		case "italicbold":
		case "bolditalic":
			ifontstyle = 3;
			break;
		}
		return  new Font(fontname, ifontstyle, fontsize);
	}
	
	public void clone(ChartFont font){
		this.fontname = font.getFontname();
		this.fontstyle = font.getFontstyle();
		this.defaultfontsize = font.getDefaultfontsize();
		this.fontsize = font.getFontsize();
		this.fontcolor = font.getFontcolor();
	}
}
