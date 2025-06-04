package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.DockType;

public class ChartLegend {
	public ChartLegend() {
	}

	private String legendtitle = "";
	private DockType docktype = DockType.Right;
	private ChartFont font = new ChartFont();
	private boolean visible = true;
	private boolean bordervisible = true;
	private boolean autosize = false;
	private boolean scrolldraw = true;
	private boolean isnaturalalign = false;
	private boolean isregularexpression = false;
	private boolean isreverse = false;
	private String valuealign = "none"; //none,desc,asc
	private String[] customalignment = null;
	private String[] customalignmentBottom = null;
	private int borderColor = Color.LIGHT_GRAY.getRGB();
	private int legendsize = 0;
	private int defaultsize = 120;
	private boolean checkboxmode = false;
	private String datetimeformat = "MM-dd";
	private boolean isdraw = true;
	private int maxcount = -1;
	
	public String getLegendtitle() {
		return legendtitle;
	}

	public void setLegendtitle(String legendtitle) {
		this.legendtitle = legendtitle;
	}

	public DockType getDocktype() {
		if (docktype == null)
			docktype = DockType.Right;

		return docktype;
	}

	public void setDocktype(DockType docktype) {
		this.docktype = docktype;
	}

	public ChartFont getFont() {
		return font;
	}

	public void setFont(ChartFont font) {
		this.font = font;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	
	public boolean isBordervisible() {
		return bordervisible;
	}

	public void setBordervisible(boolean bordervisible) {
		this.bordervisible = bordervisible;
	}

	public boolean isScrolldraw() {
		return scrolldraw;
	}

	public void setScrolldraw(boolean scrolldraw) {
		this.scrolldraw = scrolldraw;
	}

	public boolean isAutosize() {
		return autosize;
	}

	public void setAutosize(boolean autosize) {
		this.autosize = autosize;
	}

	public boolean isIsnaturalalign() {
		return isnaturalalign;
	}

	public void setIsnaturalalign(boolean isnaturalalign) {
		this.isnaturalalign = isnaturalalign;
	}

	public boolean isIsregularexpression() {
		return isregularexpression;
	}

	public void setIsregularexpression(boolean isregularexpression) {
		this.isregularexpression = isregularexpression;
	}

	public String[] getCustomalignment() {
		return customalignment;
	}

	public String[] getCustomalignmentBottom() {
		return customalignmentBottom;
	}

	public void setCustomalignmentBottom(String[] customalignmentBottom) {
		this.customalignmentBottom = customalignmentBottom;
	}

	public void setCustomalignment(String[] customalignment) {
		this.customalignment = customalignment;
	}

	public int getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(int borderColor) {
		this.borderColor = borderColor;
	}

	public int getLegendsize() {
		if (legendsize <= 0)
			return defaultsize;
		else
			return legendsize;
	}

	public void setLegendsize(int legendsize) {
		this.legendsize = legendsize;
	}

	public boolean isCheckboxmode() {
		return checkboxmode;
	}

	public void setCheckboxmode(boolean checkboxmode) {
		this.checkboxmode = checkboxmode;
	}

	public boolean isIsreverse() {
		return isreverse;
	}

	public void setIsreverse(boolean isreverse) {
		this.isreverse = isreverse;
	}

	public String getValuealign() {
		return valuealign;
	}

	public void setValuealign(String valuealign) {
		this.valuealign = valuealign;
	}

	public String getDatetimeformat() {
		return datetimeformat;
	}

	public void setDatetimeformat(String datetimeformat) {
		this.datetimeformat = datetimeformat;
	}

	public boolean isIsdraw() {
		return isdraw;
	}

	public void setIsdraw(boolean isdraw) {
		this.isdraw = isdraw;
	}

	public int getMaxcount() {
		return maxcount;
	}

	public void setMaxcount(int maxcount) {
		this.maxcount = maxcount;
	}		
}
