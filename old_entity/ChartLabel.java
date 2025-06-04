package com.hbee.honeybee.entity;

public class ChartLabel {
	private boolean isvisible = true;
	private ChartFont chartfont = new ChartFont();
	private int angle = 0;
	private int changeangle = -1;
	private String numericformat = "#,###,##0";
	private String datetimeformat = "MM-dd";
	private String virtualformat = "";
	private boolean isatuolength = false;
	private boolean isfixedlength = false;
	private boolean islabelmaxvisible = false;
	private int maxlength = 110;
	private int labelcount = 10;
	
	private boolean isminsize = false;
	private int bindmaxlength = 110;
	private int visualminsize = 120;

	public boolean isIsvisible() {
		return isvisible;
	}

	public void setIsvisible(boolean isvisible) {
		this.isvisible = isvisible;
	}

	public ChartFont getChartfont() {
		return chartfont;
	}

	public void setChartfont(ChartFont chartfont) {
		this.chartfont = chartfont;
	}

	public int getAngle() {
		if(changeangle == -1)
			return angle;
		else
			return changeangle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}

	public String getNumericformat() {
		return numericformat;
	}

	public void setNumericformat(String numericformat) {
		this.numericformat = numericformat;
	}

	public String getDatetimeformat() {
		if(datetimeformat == null || datetimeformat.replace(" ", "").equals(""))
			return "MM-dd";
		else
			return datetimeformat;
	}

	public void setDatetimeformat(String datetimeformat) {
		this.datetimeformat = datetimeformat;
	}

	public String getVirtualformat() {
		return virtualformat;
	}

	public void setVirtualformat(String virtualformat) {
		this.virtualformat = virtualformat;
	}

	public boolean isIsatuolength() {
		return isatuolength;
	}

	public void setIsatuolength(boolean isatuolength) {
		this.isatuolength = isatuolength;
	}

	public boolean isIsfixedlength() {
		return isfixedlength;		
	}

	public void setIsfixedlength(boolean isfixedlength) {
		this.isfixedlength = isfixedlength;
	}

	public boolean isIslabelmaxvisible() {
		return islabelmaxvisible;
	}

	public void setIslabelmaxvisible(boolean islabelmaxvisible) {
		this.islabelmaxvisible = islabelmaxvisible;
	}

	public int getMaxlength() {
		return maxlength;
	}

	public void setMaxlength(int maxlength) {
		this.maxlength = maxlength;
	}
	
	public boolean isIsminsize() {
		return isminsize;
	}

	public void setIsminsize(boolean isminsize) {
		this.isminsize = isminsize;
	}

	public int getVisualminsize() {
		return visualminsize;
	}

	public void setVisualminsize(int visualminsize) {
		this.visualminsize = visualminsize;
	}

	public int getBindmaxlength() {
		return bindmaxlength;
	}

	public void setBindmaxlength(int bindmaxlength) {
		this.bindmaxlength = bindmaxlength;
	}
	
	public int getLabelcount() {
		return labelcount;
	}

	public void setLabelcount(int labelcount) {
		this.labelcount = labelcount;
	}
	
	public void setChangeAngle(int angle) {
		this.changeangle = angle;
	}

	public void clone(ChartLabel label){
		this.isvisible = label.isIsvisible();
		this.chartfont.clone(label.getChartfont());
		this.angle = label.getAngle();
		this.numericformat = label.getNumericformat();
		this.datetimeformat = label.getDatetimeformat();
		this.isatuolength = label.isIsatuolength();
		this.maxlength = label.getMaxlength();
		this.labelcount = label.getLabelcount();
	}
}
