package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.ValueDataType;

public class ChartAxis {
	public ChartAxis() {
		this.mintick.setCount(5);
		this.mintick.setLength(3);

		this.chartlabel.setNumericformat("#,##0.###");
		this.chartlabel.setDatetimeformat("MM-dd");
	}

	private int axistype = 0;
	private int datavaluetype = 1;  // 0:String, 1:Numeric , 2:DateTime
	private boolean ismultiaxis = false;
	private String groupName = "";
	private boolean ishorizontal = false;	
	private boolean isSerial = false;
	private boolean isaxis_synchronization = false;
	private boolean isrevers = false;
	private String typedefine = "Auto"; //Auto,Numeric,DateTime
		
	public int getAxistype() {
		return axistype;
	}

	public void setAxistype(int axistype) {
		this.axistype = axistype;
	}

	public int getDatavaluetype() {
		return datavaluetype;
	}

	public void setDatavaluetype(int datavaluetype) {
		this.datavaluetype = datavaluetype;
	}

	public boolean isIsmultiaxis() {
		return ismultiaxis;
	}

	public void setIsmultiaxis(boolean ismultiaxis) {
		this.ismultiaxis = ismultiaxis;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public boolean isIshorizontal() {
		return ishorizontal;
	}

	public void setIshorizontal(boolean ishorizontal) {
		this.ishorizontal = ishorizontal;
	}

	public boolean isIsgroupline() {
		return isgroupline;
	}

	public void setIsgroupline(boolean isgroupline) {
		this.isgroupline = isgroupline;
	}

	public String getGrouparea() {
		return grouparea;
	}

	public void setGrouparea(String grouparea) {
		this.grouparea = grouparea;
	}

	public boolean isIsvisible() {
		return isvisible;
	}

	public void setIsvisible(boolean isvisible) {
		this.isvisible = isvisible;
	}

	
	
	public ChartTitle getCharttile() {
		return charttile;
	}

	public void setCharttile(ChartTitle charttile) {
		this.charttile = charttile;
	}
	
	/**
	 * @return the islinevisible
	 */
	public boolean isIslinevisible() {
		return islinevisible;
	}

	/**
	 * @param islinevisible the islinevisible to set
	 */
	public void setIslinevisible(boolean islinevisible) {
		this.islinevisible = islinevisible;
	}

	/**
	 * @return the linecolor
	 */
	public int getLinecolor() {
		return linecolor;
	}

	/**
	 * @param linecolor the linecolor to set
	 */
	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}

	/**
	 * @return the linewidth
	 */
	public int getLinewidth() {
		return linewidth;
	}

	/**
	 * @param linewidth the linewidth to set
	 */
	public void setLinewidth(int linewidth) {
		this.linewidth = linewidth;
	}

	public ChartValue getChartvalue() {
		return chartvalue;
	}

	public void setChartvalue(ChartValue chartvalue) {
		this.chartvalue = chartvalue;
	}
	
	public ChartTick getTick() {
		return tick;
	}

	public void setTick(ChartTick tick) {
		this.tick = tick;
	}

	public ChartTick getMintick() {
		return mintick;
	}

	public void setMintick(ChartTick mintick) {
		this.mintick = mintick;
	}

	public ChartGrid getChartgrid() {
		return chartgrid;
	}

	public void setChartgrid(ChartGrid chartgrid) {
		this.chartgrid = chartgrid;
	}

	public ChartLabel getChartlabel() {
		return chartlabel;
	}

	public void setChartlabel(ChartLabel chartlabel) {
		this.chartlabel = chartlabel;
	}

	public boolean isIshierarch() {
		return ishierarch;
	}

	public void setIshierarch(boolean ishierarch) {
		this.ishierarch = ishierarch;
	}

	public boolean isSerial() {
		return isSerial;
	}

	public void setSerial(boolean isSerial) {
		this.isSerial = isSerial;
	}

	public boolean isIsaxis_synchronization() {
		return isaxis_synchronization;
	}

	public void setIsaxis_synchronization(boolean isaxis_synchronization) {
		this.isaxis_synchronization = isaxis_synchronization;
	}
	
	public String getTypedefine() {
		return typedefine;
	}

	public void setTypedefine(String typedefine) {
		this.typedefine = typedefine;
	}
	
	public boolean isIsrevers() {
		return isrevers;
	}

	public void setIsrevers(boolean isrevers) {
		this.isrevers = isrevers;
	}
	
	private boolean isgroupline = true;
	private String grouparea = "";
	private boolean isvisible = true;
	private int linecolor = Color.lightGray.getRGB();
	private int linewidth = 1;
	private boolean islinevisible = true;
	private ChartTitle charttile = new ChartTitle();
	private ChartValue chartvalue = new ChartValue();
	private ChartTick tick = new ChartTick();
	private ChartTick mintick = new ChartTick();
	private ChartGrid chartgrid = new ChartGrid();
	private ChartLabel chartlabel = new ChartLabel();
	private boolean ishierarch = false;
			
	public ValueDataType getValueDataType() {
		switch (datavaluetype) {
		case 1:
			return ValueDataType.Numeric;
		case 2:
			return ValueDataType.DateTime;
		default:
			return ValueDataType.String;
		}
	}
	
	public void clone(ChartAxis axis){
		this.isvisible = axis.isIsvisible();
		this.charttile.clone(axis.getCharttile());
		this.tick.clone(axis.getTick());
		this.mintick.clone(axis.getMintick());
		this.chartgrid.clone(axis.getChartgrid());
		this.chartlabel.clone(axis.getChartlabel());
		this.ishierarch = axis.isIshierarch();
		this.isaxis_synchronization = axis.isIsaxis_synchronization();
	}
}
