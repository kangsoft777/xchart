package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.HorizontalType;
import com.hbee.honeybee.enumeration.PointShapeStyle;
import com.hbee.honeybee.enumeration.VerticalType;

/**
 * @author hbee.ceo
 *
 */
public class PointLabel {
	private boolean visible = false;
	private int visibleType = 0;  //0:Noe,1:All,2:Selected Points,3:Focus Points,4:Min/Max,5:Line End
    private int angle = 45;
    private String orientation = "Horizontal";
    private String position = "Bottom"; //Top,Left,Right,Bottom,Center
    private ChartFont chartFont = new ChartFont();
    private String labelValue = "YValue"; //Series,XValue,YValue
    private String labelFormat = "#,##0";
    private String prefix = "";
    private String suffix = "";
    private String lineStyle = "Solid"; //Solid, Dashdot, Dash, Dot
    private boolean islinevisible = false;
    private HorizontalType horizontalType = HorizontalType.Center;
    private VerticalType verticalType = VerticalType.Top;
    private int linethickness = 1;
    private int linecolor = Color.DARK_GRAY.getRGB();
    private int linelength = 10;
    private boolean boxvisible = false; 
    private PointShapeStyle boxStyle = PointShapeStyle.Both;
    private int backcolor = Color.TRANSLUCENT;
    private int bordercolor = Color.DARK_GRAY.getRGB();
    private int borderthickness = 1;
    private int decimal_places = 0;
    private boolean isminy = false;
    private boolean ismaxy = false;
    private boolean isminx = false;
    private boolean ismaxx = false;
    
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public int getVisibleType() {
		return visibleType;
	}
	public void setVisibleType(int visibleType) {
		this.visibleType = visibleType;
	}			
	public boolean isIsminy() {
		return isminy;
	}
	public void setIsminy(boolean isminy) {
		this.isminy = isminy;
	}
	public boolean isIsmaxy() {
		return ismaxy;
	}
	public void setIsmaxy(boolean ismaxy) {
		this.ismaxy = ismaxy;
	}
	public boolean isIsminx() {
		return isminx;
	}
	public void setIsminx(boolean isminx) {
		this.isminx = isminx;
	}
	public boolean isIsmaxx() {
		return ismaxx;
	}
	public void setIsmaxx(boolean ismaxx) {
		this.ismaxx = ismaxx;
	}
	public HorizontalType getHorizontalType() {
		return horizontalType;
	}
	public void setHorizontalType(HorizontalType horizontalType) {
		this.horizontalType = horizontalType;
	}
	public VerticalType getVerticalType() {
		return verticalType;
	}
	public void setVerticalType(VerticalType verticalType) {
		this.verticalType = verticalType;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public boolean isIslinevisible() {
		return islinevisible;
	}
	public void setIslinevisible(boolean islinevisible) {
		this.islinevisible = islinevisible;
	}
	public int getAngle() {
		return angle;
	}
	public void setAngle(int angle) {
		this.angle = angle;
	}
	public String getOrientation() {
		return orientation;
	}
	public void setOrientation(String orientation) {
		this.orientation = orientation;
	}
	public ChartFont getChartFont() {
		return chartFont;
	}
	public void setChartFont(ChartFont chartFont) {
		this.chartFont = chartFont;
	}	
	public String getLabelValue() {
		return labelValue;
	}
	public void setLabelValue(String labelValue) {
		this.labelValue = labelValue;
	}
	public String getLabelFormat() {
		return labelFormat;
	}
	public void setLabelFormat(String labelFormat) {
		this.labelFormat = labelFormat;
	}
	public String getLineStyle() {
		return lineStyle;
	}
	public void setLineStyle(String lineStyle) {
		this.lineStyle = lineStyle;
	}
	public int getLinethickness() {
		return linethickness;
	}
	public void setLinethickness(int linethickness) {
		this.linethickness = linethickness;
	}
	public int getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}
	public int getLinelength() {
		return linelength;
	}
	public void setLinelength(int linelength) {
		this.linelength = linelength;
	}
	public int getBackcolor() {
		return backcolor;
	}
	public void setBackcolor(int backcolor) {
		this.backcolor = backcolor;
	}	
	public boolean isBoxvisible() {
		return boxvisible;
	}
	public void setBoxvisible(boolean boxvisible) {
		this.boxvisible = boxvisible;
	}
	public PointShapeStyle getBoxStyle() {
		return boxStyle;
	}
	public void setBoxStyle(PointShapeStyle boxStyle) {
		this.boxStyle = boxStyle;
	}
	public int getBordercolor() {
		return bordercolor;
	}
	public void setBordercolor(int bordercolor) {
		this.bordercolor = bordercolor;
	}
	public int getBorderthickness() {
		return borderthickness;
	}
	public void setBorderthickness(int borderthickness) {
		this.borderthickness = borderthickness;
	}
	public int getDecimal_places() {
		return decimal_places;
	}
	public void setDecimal_places(int decimal_places) {
		this.decimal_places = decimal_places;
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
}
