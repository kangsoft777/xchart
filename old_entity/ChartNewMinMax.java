package com.hbee.honeybee.entity;

import java.io.Serializable;

public class ChartNewMinMax implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1717787297732270372L;
	
	private boolean isnewMinMaxMode = false;
	private double newMinx = 0;
	private double newMaxx = 0;
	private double newMiny = 0;
	private double newMaxy = 0;
	private double newMiny2 = 0;
	private double newMaxy2 = 0;
	private boolean isy2mode = false;
	
	public boolean isIsnewMinMaxMode() {
		return isnewMinMaxMode;
	}
	public void setIsnewMinMaxMode(boolean isnewMinMaxMode) {
		this.isnewMinMaxMode = isnewMinMaxMode;
	}
	public double getNewMinx() {
		return newMinx;
	}
	public void setNewMinx(double newMinx) {
		this.newMinx = newMinx;
	}
	public double getNewMaxx() {
		return newMaxx;
	}
	public void setNewMaxx(double newMaxx) {
		this.newMaxx = newMaxx;
	}
	public double getNewMiny() {
		return newMiny;
	}
	public void setNewMiny(double newMiny) {
		this.newMiny = newMiny;
	}
	public double getNewMaxy() {
		return newMaxy;
	}
	public void setNewMaxy(double newMaxy) {
		this.newMaxy = newMaxy;
	}
	public double getNewMiny2() {
		return newMiny2;
	}
	public void setNewMiny2(double newMiny2) {
		this.newMiny2 = newMiny2;
	}
	public double getNewMaxy2() {
		return newMaxy2;
	}
	public void setNewMaxy2(double newMaxy2) {
		this.newMaxy2 = newMaxy2;
	}		
	public boolean isIsy2mode() {
		return isy2mode;
	}
	public void setIsy2mode(boolean isy2mode) {
		this.isy2mode = isy2mode;
	}
	public void setInitialize(boolean isy2mode) {
		newMinx = Double.MAX_VALUE;
		newMaxx = -Double.MAX_VALUE;
		newMiny = Double.MAX_VALUE;
		newMaxy = -Double.MAX_VALUE;
		newMiny2 = -135792468;
		newMaxy2 = 135792468;
		this.isy2mode = isy2mode;
		if(isy2mode) {
			newMiny2 = Double.MAX_VALUE;
			newMaxy2 = -Double.MAX_VALUE;
		}		
	}	
	public void reMinMaxCal(ChartNewMinMax newMinMax) {
		if(!newMinMax.isnewMinMaxMode) return;
		if(!isnewMinMaxMode) {
			this.setIsnewMinMaxMode(true);
			this.setInitialize(newMinMax.isy2mode);
		}
		if(this.getNewMinx() > newMinMax.getNewMinx())
			this.setNewMinx(newMinMax.getNewMinx());
		if(this.getNewMaxx() < newMinMax.getNewMaxx())
			this.setNewMaxx(newMinMax.getNewMaxx());
		if(this.getNewMiny() > newMinMax.getNewMiny())
			this.setNewMiny(newMinMax.getNewMiny());
		if(this.getNewMaxy() < newMinMax.getNewMaxy())
			this.setNewMaxy(newMinMax.getNewMaxy());
		if(this.isy2mode) {
			if(this.getNewMiny2() > newMinMax.getNewMiny2())
				this.setNewMiny2(newMinMax.getNewMiny2());
			if(this.getNewMaxy2() < newMinMax.getNewMaxy2())
				this.setNewMaxy2(newMinMax.getNewMaxy2());
		}
	}
	
	public boolean isUsable() {
		if(newMinx == Double.MAX_VALUE)
			return false;
		if(newMaxx == -Double.MAX_VALUE)
			return false;
		if(newMiny == Double.MAX_VALUE)
			return false;
		if(newMaxy == -Double.MAX_VALUE)
			return false;
		if(newMiny2 == Double.MAX_VALUE)
			return false;
		if(newMaxy2 == -Double.MAX_VALUE)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "ChartNewMinMax [isnewMinMaxMode=" + isnewMinMaxMode + ", newMinx=" + newMinx + ", newMaxx=" + newMaxx
				+ ", newMiny=" + newMiny + ", newMaxy=" + newMaxy + ", newMiny2=" + newMiny2 + ", newMaxy2=" + newMaxy2
				+ ", isy2mode=" + isy2mode + "]";
	}
	
	
}
