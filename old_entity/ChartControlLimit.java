package com.hbee.honeybee.entity;

import java.awt.Color;

/**
 * @author hbee.ceo
 *
 */
public class ChartControlLimit {
	 public ControlLimitValue[] limitValues = null;
     public boolean area = false;
     private boolean isoutofcontrol = false;
     private int araaColor = Color.GREEN.getRGB();
     private int _transparent = 80;
     private String _inout = "In";
     private ChartFont font = new ChartFont();
     private boolean istextvisible = false;

	public ControlLimitValue[] getLimitValues() {
		return limitValues;
	}
	public void setLimitValues(ControlLimitValue[] limitValues) {
		this.limitValues = limitValues;
	}
	public boolean isArea() {
		return area;
	}
	public void setArea(boolean area) {
		this.area = area;
	}	
	public boolean isIsoutofcontrol() {
		return isoutofcontrol;
	}
	public void setIsoutofcontrol(boolean isoutofcontrol) {
		this.isoutofcontrol = isoutofcontrol;
	}
	public int getAraaColor() {
		return araaColor;
	}
	public void setAraaColor(int araaColor) {
		this.araaColor = araaColor;
	}
	public int get_transparent() {
		return _transparent;
	}
	public void set_transparent(int _transparent) {
		this._transparent = _transparent;
	}
	public String get_inout() {
		return _inout;
	}
	public void set_inout(String _inout) {
		this._inout = _inout;
	}
	public ChartFont getFont() {
		return font;
	}
	public void setFont(ChartFont font) {
		this.font = font;
	}
	public boolean isIstextvisible() {
		return istextvisible;
	}
	public void setIstextvisible(boolean istextvisible) {
		this.istextvisible = istextvisible;
	}
}
