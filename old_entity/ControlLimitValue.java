package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.AxisType;
import com.hbee.honeybee.enumeration.ControlLimitType;

public class ControlLimitValue {
	private String name = "";
	private AxisType axis = AxisType.Left;
	private String column = "";
	private String function = "";
	private int lineColor = Color.WHITE.getRGB();
	private String lineStyle = "Solid"; //Solid, Dashdot, Dash, Dot
	private int width = 1;
	private boolean isMulti = false;
	private boolean isArea = false;
	private ControlLimitType controlLimitType = ControlLimitType.None;
	private boolean isEventLine = false;
	private boolean isBandLine = false;
	private boolean isReferenceLine = false;
	private boolean isEachColor = false;
	private boolean isInterval = false;
	private String column2 = "";  // for bandLine 
	private String legendRegEx = "";  // for Ref EventLine
	private String referencevalue = "";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AxisType getAxis() {
		return axis;
	}

	public void setAxis(AxisType axis) {
		this.axis = axis;
	}

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getFunction() {
		return function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public int getLineColor() {
		return lineColor;
	}

	public void setLineColor(int lineColor) {
		this.lineColor = lineColor;
	}

	public String getLineStyle() {
		return lineStyle;
	}

	public void setLineStyle(String lineStyle) {
		this.lineStyle = lineStyle;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public boolean isMulti() {
		return isMulti;
	}

	public void setMulti(boolean isMulti) {
		this.isMulti = isMulti;
	}

	public boolean isArea() {
		return isArea;
	}

	public void setArea(boolean isArea) {
		this.isArea = isArea;
	}

	public ControlLimitType getControlLimitType() {
		return controlLimitType;
	}

	public void setControlLimitType(ControlLimitType controlLimitType) {
		this.controlLimitType = controlLimitType;
	}

	/**
	 * @return the isEventLine
	 */
	public boolean isEventLine() {
		return isEventLine;
	}

	/**
	 * @param isEventLine the isEventLine to set
	 */
	public void setEventLine(boolean isEventLine) {
		this.isEventLine = isEventLine;
	}

	/**
	 * @return the isEachColor
	 */
	public boolean isEachColor() {
		return isEachColor;
	}

	/**
	 * @param isEachColor the isEachColor to set
	 */
	public void setEachColor(boolean isEachColor) {
		this.isEachColor = isEachColor;
	}

	/**
	 * @return the isBandLine
	 */
	public boolean isBandLine() {
		return isBandLine;
	}

	/**
	 * @param isBandLine the isBandLine to set
	 */
	public void setBandLine(boolean isBandLine) {
		this.isBandLine = isBandLine;
	}

	public boolean isReferenceLine() {
		return isReferenceLine;
	}

	public void setReferenceLine(boolean isReferenceLine) {
		this.isReferenceLine = isReferenceLine;
	}

	/**
	 * @return the isInterval
	 */
	public boolean isInterval() {
		return isInterval;
	}

	/**
	 * @param isInterval the isInterval to set
	 */
	public void setInterval(boolean isInterval) {
		this.isInterval = isInterval;
	}

	/**
	 * @return the column2
	 */
	public String getColumn2() {
		return column2;
	}

	/**
	 * @param column2 the column2 to set
	 */
	public void setColumn2(String column2) {
		this.column2 = column2;
	}

	/**
	 * @return the legendRegEx
	 */
	public String getLegendRegEx() {
		return legendRegEx;
	}

	/**
	 * @param legendRegEx the legendRegEx to set
	 */
	public void setLegendRegEx(String legendRegEx) {
		this.legendRegEx = legendRegEx;
	}
	
	public String getReferencevalue() {
		return referencevalue;
	}

	public void setReferencevalue(String referencevalue) {
		this.referencevalue = referencevalue;
	}

	/** 
	 * {@inheritDoc}
	 * <pre>
	 * 
	 * </pre>
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ControlLimitValue [name=" + name + ", axis=" + axis
				+ ", column=" + column + ", function=" + function
				+ ", lineColor=" + lineColor + ", width=" + width
				+ ", isMulti=" + isMulti + ", isArea=" + isArea
				+ ", controlLimitType=" + controlLimitType + ", isEventLine="
				+ isEventLine + ", isBandLine=" + isBandLine + ", isReferenceLine=" + isReferenceLine + ", isEachColor="
				+ isEachColor + ", isInterval=" + isInterval + ", column2="
				+ column2 + ", legendRegEx=" + legendRegEx + ", referencevalue=" + referencevalue + "]";
	}
}
