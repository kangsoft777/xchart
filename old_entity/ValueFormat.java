package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.StringAlignment;

public class ValueFormat {
	private String valueformat = "#,##0.###";
	private String datetimeformat = "yyyy-MM-dd";
	private StringAlignment alignment = StringAlignment.Default;
	private int isEAxisValueFormat = -1;
	private boolean islocalTime = true;
   
	public String getValueformat() {
		return valueformat;
	}

	public void setValueformat(String valueformat) {
		this.valueformat = valueformat;
	}

	public String getDatetimeformat() {
		return datetimeformat;
	}

	public void setDatetimeformat(String datetimeformat) {
		this.datetimeformat = datetimeformat;
	}

	public StringAlignment getAlignment() {
		return alignment;
	}

	public void setAlignment(StringAlignment alignment) {
		this.alignment = alignment;
	}

	public int getIsEAxisValueFormat() {
		return isEAxisValueFormat;
	}

	public void setIsEAxisValueFormat(int isEAxisValueFormat) {
		this.isEAxisValueFormat = isEAxisValueFormat;
	}

	public boolean isIslocalTime() {
		return islocalTime;
	}

	public void setIslocalTime(boolean islocalTime) {
		this.islocalTime = islocalTime;
	}
	
	public String getFormatString(boolean isdate){
		if(isdate)
			return this.datetimeformat;
		else
			return this.valueformat;
	}
}

