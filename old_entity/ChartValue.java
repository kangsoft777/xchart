package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.OutlierType;

public class ChartValue {
	private boolean log = false;
	private boolean automatic = true;
	private double minvalue = 0;
	private boolean minautomatic = true;
	private double maxvalue = 0;
	private double axisminvalue = 0;
	private double axismaxvalue = 100;
	private boolean maxautomatic = true;
	
	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

	public double getMinvalue() {
		return minvalue;
	}

	public void setMinvalue(double minvalue) {
		this.minvalue = minvalue;
	}

	public boolean isMinautomatic() {
		return minautomatic;
	}

	public void setMinautomatic(boolean minautomatic) {
		this.minautomatic = minautomatic;
	}

	public double getMaxvalue() {
		return maxvalue;
	}

	public void setMaxvalue(double maxvalue) {
		this.maxvalue = maxvalue;
	}

	public double getAxisminvalue() {
		return axisminvalue;
	}

	public void setAxisminvalue(double axisminvalue) {
		this.axisminvalue = axisminvalue;
	}

	public double getAxismaxvalue() {
		return axismaxvalue;
	}

	public void setAxismaxvalue(double axismaxvalue) {
		this.axismaxvalue = axismaxvalue;
	}

	public boolean isMaxautomatic() {
		return maxautomatic;
	}

	public void setMaxautomatic(boolean maxautomatic) {
		this.maxautomatic = maxautomatic;
	}
}
