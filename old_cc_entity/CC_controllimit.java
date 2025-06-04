package com.hbee.honeybee.cc_entity;

import java.awt.Color;
import java.io.Serializable;

public class CC_controllimit implements Serializable {
	private static final long serialVersionUID = -2793031726887801719L;
	
	private boolean isarea = false;
    private int araaColor = Color.GREEN.getRGB();
    private int transparent = 80;
    private String inout = "In";
    private CC_controllimitvalue[] controllimitvalue = null;
	public boolean isIsarea() {
		return isarea;
	}
	public void setIsarea(boolean isarea) {
		this.isarea = isarea;
	}
	public int getAraaColor() {
		return araaColor;
	}
	public void setAraaColor(int araaColor) {
		this.araaColor = araaColor;
	}
	public int getTransparent() {
		return transparent;
	}
	public void setTransparent(int transparent) {
		this.transparent = transparent;
	}	
	public String getInout() {
		return inout;
	}
	public void setInout(String inout) {
		this.inout = inout;
	}
	public CC_controllimitvalue[] getControllimitvalue() {
		return controllimitvalue;
	}
	public void setControllimitvalue(CC_controllimitvalue[] controllimitvalue) {
		this.controllimitvalue = controllimitvalue;
	}
}
