package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartTooltipValue {
	private String name = "";
	private String value = "";
	private String format = "";
	private String prefix = "";
	private String suffix = "";
	private String fontname = "Verdana";
	private String fontstyle = "Regula";
	private int fontsize = 11;
	private int fontcolor = Color.black.getRGB();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public String getPrefix() {
		return prefix;
	}
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}
	public String getSuffix() {
		return suffix;
	}
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}
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
	public int getFontsize() {
		return fontsize;
	}
	public void setFontsize(int fontsize) {
		this.fontsize = fontsize;
	}
	public int getFontcolor() {
		return fontcolor;
	}
	public void setFontcolor(int fontcolor) {
		this.fontcolor = fontcolor;
	}	
}
