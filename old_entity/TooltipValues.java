package com.hbee.honeybee.entity;

import java.awt.Color;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.function.ToLongBiFunction;

import javax.sound.sampled.Line;

import com.hbee.honeybee.cc_entity.CC;
import com.hbee.honeybee.enumeration.ShapeStyle;

public class TooltipValues  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5339349575159787481L;	
	private String seriesType = "Scatter";
	private String seriesSubType = "None";
	private String notebookseriesType = "Scatter";
	private String title = "";
	private String titlefont = "";
	private String typeSeries = "Time";
	private String heatmapAggregation = "Avg";
	private int titlecolor = Color.black.getRGB();	
	private int chartwidth = 0;
	private int chartheight = 0;
	private int left = 0;
	private int top = 0;
	private int width = 0;
	private int height = 0;
	private int rowcount = 0;
	private int pointwidth = 6;
	private int pointheight = 6;
	private int imagemzxsize = 200;
	private int linewidth = 1;
	private boolean islegendvisible = false;
	private boolean islegendautosize = true;
	private int legendleft = 0;
	private int legendtop = 0;
	private int legendwidth = 0;
	private int legendheight = 0;
	private int legendchangewidth = 0;
	private int legendchangeheight = 0;
	private int legendfontsize = 10;
	private int[] legendrect = null;
	private int[] marginrect = null;
	private boolean islegendscroll = false;
	private boolean legendcheckboxmode = false;	
	private boolean islegenddraw = true;
	private int backcolor = Color.white.getRGB();
	private boolean isRowcount = true;
	private boolean isBase = false;
	private boolean isColorShapeEqual = false;
	private boolean isimagemode = false;
	private boolean ishorizontal = false;
	private boolean isbrokenlinefunnel = false;
	private boolean isrevers = false;
	private boolean isthumbnailmode = false;
	private boolean isscalemode = false;
	private String legendPosition = "Right";
	private String legendfontName = "Arial";
	private String legendfontStyle = "regular";
	private int legendforecolor = Color.black.getRGB();
	private int legendbordercolor = Color.LIGHT_GRAY.getRGB();
	private boolean legendbordervisible = true;
	private String pointStyle = "Circle";
	private String pointStyle2 = "LeftTriangle";
	
	private int pointColor = Color.black.getRGB();
	private int shapepenwidth = 1;
	private int pointShapeStyle = 0; //Both, Brush, Border
	
	private String splitbarValue = "";
	private Long[] indexer = null;
	private Double[] dXValue = null;
	private Double[] dYValue = null;
	private Double[] dY2Value = null;
	private Integer[] count = null;
	private Float[] chipXValue = null;
	private Float[] chipYValue = null;
	private Short[] pXValue = null;
	private Short[] pYValue = null;
	private Short[] pY2Value = null;
	private Integer[] markerValue = null;
	private Short[] groupValue = null;
	private Short[] colorValue = null;
	private Short[] shapeValue = null;
	private Short[] sizeValue = null;
	private Short[] focusValue = null;
	private String[] markerText = null;
	private String[] colorText = null;
	private String[] shapeText = null;
	private String[] sizeText = null;
	private Double[] sizearray = null;
	private int[] colors = null;
	private int[] darkcolors = null;
	private int[] dynamiccolors = null;
	private int[] dynamicdarkcolors = null;	
	private int[] sankeycolors = null;
	private String[] shapes = null;
	private String[] xmember = null;
	private String[] ymember = null;
	private String[] boxvalue = null;
	private String[] axisLine = null;
	private String[] axisInfo = null;
	private boolean ismultiaxisdrawline = false;
	private boolean ismultiaxisdrawtext = false;
	private int[] dduplicate = null;
    	
	private Short[] containColors = null;
	private Short[] containShapes = null;

	private Short[] unvisibleColors = null;
	private Short[] unvisibleShapes = null;
	private boolean ispointvisible = false;
	private boolean ishighlight = false;
	private boolean isSplitBar = false;
	private boolean isy2mode = false;
	private boolean iseventLine = false;
	private boolean iseventVisible = false;
	private int eventLineIndex = 0;
	private int splitBarX = 0;

	private double minxvalue = 0;
	private double maxxvalue = 0;
	private double minyvalue = 0;
	private double maxyvalue = 0;
	private double miny2value = 0;
	private double maxy2value = 0;
	private boolean ismerge = true;

	private boolean isresgressionline = false;
	private boolean isGradient = false;
	
	private Map<Integer,Double> regression1 = null;
	private Map<Integer,Double> regression2 = null;
	private Map<Integer,Double> regression3 = null;
	private Map<Integer,Integer> regression4 = null;
	private Map<Integer,Double> avgx = null;
	private Map<Integer,Double> avgy = null;
	private Map<Integer,Double> stdDevx = null;
	private Map<Integer,Double> stdDevy = null;
	private Map<Integer,Double[]> regressionlinexvalues = null;
	private Map<Integer,Double[]> regressionlineyvalues = null;
	
	private Map<Integer,Integer[]> regressionrectsx = null;
	private Map<Integer,Integer[]> regressionrectsy = null;
	private String controllimitinout = "In";
	private String[][] seriesToolValue = null;
	private double[] firstvalue = null;
	private double[] endvalue = null;
	private boolean scrolldraw = true;
	
	private int[] selectindexer = null;
	private String selectfilename = null;
	private String[] predictiondata = null;
	private int[] lefttitlerect = null;
	private int[] bottomtitlerect = null;
	private int xvalueType = 0; // 0:String, 1:Numeric , 2:DateTime
	private int yvalueType = 0; // 0:String, 1:Numeric , 2:DateTime
	private String message = "";
	
	private boolean isrecalminmax = false;
	private double tempminx = 0;
	private double tempmaxx = 0;
	private double tempminy = 0;
	private double tempmaxy = 0;
	private double tempminy2 = 0;
	private double tempmaxy2 = 0;
	
	private boolean istimeserialize = false;
	private double[] timexvalues = null;
	private double[] timeyvalues = null;
	private String inout = "In";
	private CC cc = null;
	private boolean isanimation = false;
	private boolean isthumbaniltooltip = false;
	
	private Short[] sublineX = null;
	private Short[] sublineY = null;
	private Short[] sublineColorValue = null;
	private int[] sublineColors = null;
	private boolean isareain = false;
	private int areacoloralpha = 0;
	private int[] sublineAreaColors = null;
	private Short[] sublineAreax = null;
	private Short[] sublineAreay = null;
	private Short[] sublineAreagroup = null;
	private Short[] centerxy = null;
		
	private int bottomaxislabelsize = 0;
	private boolean isvirtualgroup = false;
	private String[] virtualxlabels = null;
	private int[] virtualxlabelpoints = null;
	private int[] virtualxlabelpoints2 = null;
	private String[] virtualfontinfo = null;
	private int maxXmemberSize = 0;
	private boolean isXmemberOmit = false;
	private boolean isvirtualOmit = false;
	
	private boolean islegnedsinglecolor = false;
	private int singlecolor = Color.gray.getRGB();
	private String[] focusparameter = null;
	private int[] focuscolors = null;
	private int[] focusdarkcolors = null;
	
	private boolean islegendrealign = false;
	
	private boolean islinearea = false;
	private boolean islinepoint = false;
	
    private String defaultShapeStyle = "Circle";
    private String defaultShapeStyle2 = "LeftTriangle";
    
    private int ctl_outcount = 0;
    
    private int startcolor = Color.red.getRGB();
	private int endcolor = Color.blue.getRGB();
	
	private int xcellsize = 1;
	private int ycellsize = 1;
	
	private boolean isredraw = true;
				
	public int getStartcolor() {
		return startcolor;
	}

	public void setStartcolor(int startcolor) {
		this.startcolor = startcolor;
	}

	public int getEndcolor() {
		return endcolor;
	}

	public void setEndcolor(int endcolor) {
		this.endcolor = endcolor;
	}

	public boolean isIsthumbaniltooltip() {
		return isthumbaniltooltip;
	}

	public void setIsthumbaniltooltip(boolean isthumbaniltooltip) {
		this.isthumbaniltooltip = isthumbaniltooltip;
	}
	
	public String getTypeSeries() {
		return typeSeries;
	}

	public void setTypeSeries(String typeSeries) {
		this.typeSeries = typeSeries;
	}

	public String getHeatmapAggregation() {
		return heatmapAggregation;
	}

	public void setHeatmapAggregation(String heatmapAggregation) {
		this.heatmapAggregation = heatmapAggregation;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitlefont() {
		return titlefont;
	}

	public void setTitlefont(String titlefont) {
		this.titlefont = titlefont;
	}

	public int getTitlecolor() {
		return titlecolor;
	}

	public void setTitlecolor(int titlecolor) {
		this.titlecolor = titlecolor;
	}

	/**
	 * @return the inout
	 */
	public String getInout() {
		return inout;
	}

	/**
	 * @param inout the inout to set
	 */
	public void setInout(String inout) {
		this.inout = inout;
	}

	public int getXvalueType() {
		return xvalueType;
	}

	public void setXvalueType(int xvalueType) {
		this.xvalueType = xvalueType;
	}

	public int getYvalueType() {
		return yvalueType;
	}

	public void setYvalueType(int yvalueType) {
		this.yvalueType = yvalueType;
	}

	public String getNotebookseriesType() {
		return notebookseriesType;
	}

	public void setNotebookseriesType(String notebookseriesType) {
		this.notebookseriesType = notebookseriesType;
	}

	public String getSeriesType() {
		return seriesType;
	}

	public void setSeriesType(String seriesType) {
		this.seriesType = seriesType;
	}

	public String getSeriesSubType() {
		return seriesSubType;
	}

	public void setSeriesSubType(String seriesSubType) {
		this.seriesSubType = seriesSubType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int[] getLefttitlerect() {
		return lefttitlerect;
	}

	public void setLefttitlerect(int[] lefttitlerect) {
		this.lefttitlerect = lefttitlerect;
	}

	public int[] getBottomtitlerect() {
		return bottomtitlerect;
	}

	public void setBottomtitlerect(int[] bottomtitlerect) {
		this.bottomtitlerect = bottomtitlerect;
	}

	public String[][] getSeriesToolValue() {
		return seriesToolValue;
	}

	public void setSeriesToolValue(String[][] seriesToolValue) {
		this.seriesToolValue = seriesToolValue;
	}

	public boolean isColorShapeEqual() {
		return isColorShapeEqual;
	}

	public void setColorShapeEqual(boolean isColorShapeEqual) {
		this.isColorShapeEqual = isColorShapeEqual;
	}

	public boolean isIsresgressionline() {
		return isresgressionline;
	}

	public void setIsresgressionline(boolean isresgressionline) {
		this.isresgressionline = isresgressionline;
	}

	public Map<Integer, Double> getRegression1() {
		return regression1;
	}

	public void setRegression1(Map<Integer, Double> regression1) {
		this.regression1 = regression1;
	}

	public Map<Integer, Double> getRegression2() {
		return regression2;
	}

	public void setRegression2(Map<Integer, Double> regression2) {
		this.regression2 = regression2;
	}
	
	public Map<Integer, Double> getRegression3() {
		return regression3;
	}

	public void setRegression3(Map<Integer, Double> regression3) {
		this.regression3 = regression3;
	}

	public Map<Integer, Integer> getRegression4() {
		return regression4;
	}

	public void setRegression4(Map<Integer, Integer> regression4) {
		this.regression4 = regression4;
	}

	public Map<Integer, Double> getAvgx() {
		return avgx;
	}

	public void setAvgx(Map<Integer, Double> avgx) {
		this.avgx = avgx;
	}

	public Map<Integer, Double> getAvgy() {
		return avgy;
	}

	public void setAvgy(Map<Integer, Double> avgy) {
		this.avgy = avgy;
	}

	/**
	 * @return the stdDevx
	 */
	public Map<Integer, Double> getStdDevx() {
		return stdDevx;
	}

	/**
	 * @param stdDevx the stdDevx to set
	 */
	public void setStdDevx(Map<Integer, Double> stdDevx) {
		this.stdDevx = stdDevx;
	}

	/**
	 * @return the stdDevy
	 */
	public Map<Integer, Double> getStdDevy() {
		return stdDevy;
	}

	/**
	 * @param stdDevy the stdDevy to set
	 */
	public void setStdDevy(Map<Integer, Double> stdDevy) {
		this.stdDevy = stdDevy;
	}

	public Map<Integer, Double[]> getRegressionlinexvalues() {
		return regressionlinexvalues;
	}

	public void setRegressionlinexvalues(
			Map<Integer, Double[]> regressionlinexvalues) {
		this.regressionlinexvalues = regressionlinexvalues;
	}

	public Map<Integer, Double[]> getRegressionlineyvalues() {
		return regressionlineyvalues;
	}

	public void setRegressionlineyvalues(
			Map<Integer, Double[]> regressionlineyvalues) {
		this.regressionlineyvalues = regressionlineyvalues;
	}

	public Map<Integer,Integer[]> getRegressionrectsx() {
		return regressionrectsx;
	}

	public void setRegressionrectsx(Map<Integer,Integer[]> regressionrectsx) {
		this.regressionrectsx = regressionrectsx;
	}

	public Map<Integer,Integer[]> getRegressionrectsy() {
		return regressionrectsy;
	}

	public void setRegressionrectsy(Map<Integer,Integer[]> regressionrectsy) {
		this.regressionrectsy = regressionrectsy;
	}

	public boolean isBase() {
		return isBase;
	}

	public void setBase(boolean isBase) {
		this.isBase = isBase;
	}

	public int getChartwidth() {
		return chartwidth;
	}

	public void setChartwidth(int chartwidth) {
		this.chartwidth = chartwidth;
	}

	public int getChartheight() {
		return chartheight;
	}

	public void setChartheight(int chartheight) {
		this.chartheight = chartheight;
	}

	public int getLeft() {
		return left;
	}

	public void setLeft(int left) {
		this.left = left;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getRowcount() {
		return rowcount;
	}

	public void setRowcount(int rowcount) {
		this.rowcount = rowcount;
	}

	public boolean isRowcount() {
		return isRowcount;
	}

	public void setRowcount(boolean isRowcount) {
		this.isRowcount = isRowcount;
	}

	public boolean isSplitBar() {
		return isSplitBar;
	}

	public void setSplitBar(boolean isSplitBar) {
		this.isSplitBar = isSplitBar;
	}

	public int getSplitBarX() {
		return splitBarX;
	}

	public void setSplitBarX(int splitBarX) {
		this.splitBarX = splitBarX;
	}

	public String getSplitbarValue() {
		return splitbarValue;
	}

	public void setSplitbarValue(String splitbarValue) {
		this.splitbarValue = splitbarValue;
	}

	/**
	 * @return the ispointvisible
	 */
	public boolean isIspointvisible() {
		return ispointvisible;
	}

	/**
	 * @param ispointvisible the ispointvisible to set
	 */
	public void setIspointvisible(boolean ispointvisible) {
		this.ispointvisible = ispointvisible;
	}

	public boolean isIshighlight() {
		return ishighlight;
	}

	public void setIshighlight(boolean ishighlight) {
		this.ishighlight = ishighlight;
	}

	public int getPointwidth() {
		return pointwidth;
	}

	public void setPointwidth(int pointwidth) {
		this.pointwidth = pointwidth;
	}

	public int getPointheight() {
		return pointheight;
	}

	public void setPointheight(int pointheight) {
		this.pointheight = pointheight;
	}

	public int getImagemzxsize() {
		return imagemzxsize;
	}

	public void setImagemzxsize(int imagemzxsize) {
		this.imagemzxsize = imagemzxsize;
	}

	public int getLinewidth() {
		return linewidth;
	}

	public void setLinewidth(int linewidth) {
		this.linewidth = linewidth;
	}

	public int getLegendleft() {
		return legendleft;
	}

	public void setLegendleft(int legendleft) {
		this.legendleft = legendleft;
	}

	public int getLegendtop() {
		return legendtop;
	}

	public void setLegendtop(int legendtop) {
		this.legendtop = legendtop;
	}

	public int getLegendwidth() {
		return legendwidth;
	}

	public void setLegendwidth(int legendwidth) {
		this.legendwidth = legendwidth;
	}

	public int getLegendheight() {
		return legendheight;
	}

	public void setLegendheight(int legendheight) {
		this.legendheight = legendheight;
	}
	
	public int getLegendchangewidth() {
		return legendchangewidth;
	}

	public void setLegendchangewidth(int legendchangewidth) {
		this.legendchangewidth = legendchangewidth;
	}

	public int getLegendchangeheight() {
		return legendchangeheight;
	}

	public void setLegendchangeheight(int legendchangeheight) {
		this.legendchangeheight = legendchangeheight;
	}

	public int getLegendfontsize() {
		return legendfontsize;
	}

	public void setLegendfontsize(int legendfontsize) {
		this.legendfontsize = legendfontsize;
	}

	public String getLegendfontName() {
		return legendfontName;
	}

	public void setLegendfontName(String legendfontName) {
		this.legendfontName = legendfontName;
	}

	public String getLegendfontStyle() {
		return legendfontStyle;
	}

	public void setLegendfontStyle(String legendfontStyle) {
		this.legendfontStyle = legendfontStyle;
	}

	public int getLegendforecolor() {
		return legendforecolor;
	}

	public void setLegendforecolor(int legendforecolor) {
		this.legendforecolor = legendforecolor;
	}

	public int getLegendbordercolor() {
		return legendbordercolor;
	}

	public void setLegendbordercolor(int legendbordercolor) {
		this.legendbordercolor = legendbordercolor;
	}	
	
	/**
	 * @return the legendbordervisible
	 */
	public boolean isLegendbordervisible() {
		return legendbordervisible;
	}

	/**
	 * @param legendbordervisible the legendbordervisible to set
	 */
	public void setLegendbordervisible(boolean legendbordervisible) {
		this.legendbordervisible = legendbordervisible;
	}

	public boolean isIslegendscroll() {
		return islegendscroll;
	}

	public void setIslegendscroll(boolean islegendscroll) {
		this.islegendscroll = islegendscroll;
	}

	public int getBackcolor() {
		return backcolor;
	}

	public void setBackcolor(int backcolor) {
		this.backcolor = backcolor;
	}

	public boolean isIslegendvisible() {
		return islegendvisible;
	}

	public void setIslegendvisible(boolean islegendvisible) {
		this.islegendvisible = islegendvisible;
	}

	public boolean isIslegendautosize() {
		return islegendautosize;
	}

	public void setIslegendautosize(boolean islegendautosize) {
		this.islegendautosize = islegendautosize;
	}

	public int[] getLegendrect() {
		return legendrect;
	}

	public void setLegendrect(int[] legendrect) {
		this.legendrect = legendrect;
	}

	public String getLegendPosition() {
		return legendPosition;
	}

	public void setLegendPosition(String legendPosition) {
		this.legendPosition = legendPosition;
	}

	public int[] getMarginrect() {
		return marginrect;
	}

	public void setMarginrect(int[] marginrect) {
		this.marginrect = marginrect;
	}

	public String getPointStyle() {
		return pointStyle;
	}

	public void setPointStyle(String pointStyle) {
		this.pointStyle = pointStyle;
	}
	
	public String getPointStyle2() {
		return pointStyle2;
	}

	public void setPointStyle2(String pointStyle2) {
		this.pointStyle2 = pointStyle2;
	}

	public int getPointColor() {
		return pointColor;
	}

	public void setPointColor(int pointColor) {
		this.pointColor = pointColor;
	}

	public int getShapepenwidth() {
		return shapepenwidth;
	}

	public void setShapepenwidth(int shapepenwidth) {
		this.shapepenwidth = shapepenwidth;
	}

	public int getPointShapeStyle() {
		return pointShapeStyle;
	}

	public void setPointShapeStyle(int pointShapeStyle) {
		this.pointShapeStyle = pointShapeStyle;
	}

	public Long[] getIndexer() {
		return indexer;
	}

	public void setIndexer(Long[] indexer) {
		this.indexer = indexer;
	}

	public Double[] getdXValue() {
		return dXValue;
	}

	public void setdXValue(Double[] dXValue) {
		this.dXValue = dXValue;
	}

	public Double[] getdYValue() {
		return dYValue;
	}

	public void setdYValue(Double[] dYValue) {
		this.dYValue = dYValue;
	}

	public Double[] getdY2Value() {
		return dY2Value;
	}

	public void setdY2Value(Double[] dY2Value) {
		this.dY2Value = dY2Value;
	}

	public Integer[] getCount() {
		return count;
	}

	public void setCount(Integer[] count) {
		this.count = count;
	}

	public Float[] getChipXValue() {
		return chipXValue;
	}

	public void setChipXValue(Float[] chipXValue) {
		this.chipXValue = chipXValue;
	}

	public Float[] getChipYValue() {
		return chipYValue;
	}

	public void setChipYValue(Float[] chipYValue) {
		this.chipYValue = chipYValue;
	}

	public Short[] getpXValue() {
		return pXValue;
	}

	public void setpXValue(Short[] pXValue) {
		this.pXValue = pXValue;
	}

	public Short[] getpYValue() {
		return pYValue;
	}

	public void setpYValue(Short[] pYValue) {
		this.pYValue = pYValue;
	}

	public Short[] getpY2Value() {
		return pY2Value;
	}

	public void setpY2Value(Short[] pY2Value) {
		this.pY2Value = pY2Value;
	}

	public boolean isIsy2mode() {
		return isy2mode;
	}

	public void setIsy2mode(boolean isy2mode) {
		this.isy2mode = isy2mode;
	}

	public Integer[] getMarkerValue() {
		return markerValue;
	}

	public void setMarkerValue(Integer[] markerValue) {
		this.markerValue = markerValue;
	}

	public Short[] getGroupValue() {
		return groupValue;
	}

	public void setGroupValue(Short[] groupValue) {
		this.groupValue = groupValue;
	}

	public Short[] getColorValue() {
		return colorValue;
	}

	public void setColorValue(Short[] colorValue) {
		this.colorValue = colorValue;
	}

	public Short[] getShapeValue() {
		return shapeValue;
	}

	public void setShapeValue(Short[] shapeValue) {
		this.shapeValue = shapeValue;
	}

	public Short[] getSizeValue() {
		return sizeValue;
	}

	public void setSizeValue(Short[] sizeValue) {
		this.sizeValue = sizeValue;
	}

	public Short[] getFocusValue() {
		return focusValue;
	}

	public void setFocusValue(Short[] focusValue) {
		this.focusValue = focusValue;
	}

	public String[] getMarkerText() {
		return markerText;
	}

	public void setMarkerText(String[] markerText) {
		this.markerText = markerText;
	}

	public String[] getColorText() {
		return colorText;
	}

	public void setColorText(String[] colorText) {
		this.colorText = colorText;
	}

	public String[] getShapeText() {
		return shapeText;
	}

	public void setShapeText(String[] shapeText) {
		this.shapeText = shapeText;
	}

	public String[] getSizeText() {
		return sizeText;
	}

	public void setSizeText(String[] sizeText) {
		this.sizeText = sizeText;
	}
	
	public Double[] getSizearray() {
		return sizearray;
	}

	public void setSizearray(Double[] sizearray) {
		this.sizearray = sizearray;
	}

	public int[] getColors() {
		return colors;
	}

	public void setColors(int[] colors) {
		this.colors = colors;
	}

	public int[] getDarkcolors() {
		return darkcolors;
	}

	public void setDarkcolors(int[] darkcolors) {
		this.darkcolors = darkcolors;
	}
	
	public int[] getDynamiccolors() {
		return dynamiccolors;
	}

	public void setDynamiccolors(int[] dynamiccolors) {
		this.dynamiccolors = dynamiccolors;
	}

	public int[] getDynamicdarkcolors() {
		return dynamicdarkcolors;
	}

	public void setDynamicdarkcolors(int[] dynamicdarkcolors) {
		this.dynamicdarkcolors = dynamicdarkcolors;
	}
	
	public int[] getSankeycolors() {
		return sankeycolors;
	}

	public void setSankeycolors(int[] sankeycolors) {
		this.sankeycolors = sankeycolors;
	}
	
	public String[] getShapes() {
		return shapes;
	}

	public void setShapes(String[] shapes) {
		this.shapes = shapes;
	}

	public String[] getXmember() {
		return xmember;
	}

	public void setXmember(String[] xmember) {
		this.xmember = xmember;
	}

	public String[] getYmember() {
		return ymember;
	}

	public void setYmember(String[] ymember) {
		this.ymember = ymember;
	}

	public String[] getBoxvalue() {
		return boxvalue;
	}

	public void setBoxvalue(String[] boxvalue) {
		this.boxvalue = boxvalue;
	}

	public String[] getAxisLine() {
		return axisLine;
	}

	public void setAxisLine(String[] axisLine) {
		this.axisLine = axisLine;
	}
	
	public String[] getAxisInfo() {
		return axisInfo;
	}

	public void setAxisInfo(String[] axisInfo) {
		this.axisInfo = axisInfo;
	}

	public int[] getDduplicate() {
		return dduplicate;
	}

	public void setDduplicate(int[] dduplicate) {
		this.dduplicate = dduplicate;
	}

	public boolean isIsmultiaxisdrawline() {
		return ismultiaxisdrawline;
	}

	public void setIsmultiaxisdrawline(boolean ismultiaxisdrawline) {
		this.ismultiaxisdrawline = ismultiaxisdrawline;
	}

	public boolean isIsmultiaxisdrawtext() {
		return ismultiaxisdrawtext;
	}

	public void setIsmultiaxisdrawtext(boolean ismultiaxisdrawtext) {
		this.ismultiaxisdrawtext = ismultiaxisdrawtext;
	}

	public Short[] getContainColors() {
		return containColors;
	}

	public void setContainColors(Short[] containColors) {
		this.containColors = containColors;
	}

	public Short[] getContainShapes() {
		return containShapes;
	}

	public void setContainShapes(Short[] containShapes) {
		this.containShapes = containShapes;
	}

	public Short[] getUnvisibleColors() {
		return unvisibleColors;
	}

	public void setUnvisibleColors(Short[] unvisibleColors) {
		this.unvisibleColors = unvisibleColors;
	}

	public Short[] getUnvisibleShapes() {
		return unvisibleShapes;
	}

	public void setUnvisibleShapes(Short[] unvisibleShapes) {
		this.unvisibleShapes = unvisibleShapes;
	}

	public boolean isIsmerge() {
		return ismerge;
	}

	public String getControllimitinout() {
		return controllimitinout;
	}

	public void setControllimitinout(String controllimitinout) {
		this.controllimitinout = controllimitinout;
	}

	public void setIsmerge(boolean ismerge) {
		this.ismerge = ismerge;
	}

	public double[] getFirstvalue() {
		return firstvalue;
	}

	public void setFirstvalue(double[] firstvalue) {
		this.firstvalue = firstvalue;
	}

	public double[] getEndvalue() {
		return endvalue;
	}

	public void setEndvalue(double[] endvalue) {
		this.endvalue = endvalue;
	}

	public boolean isScrolldraw() {
		return scrolldraw;
	}

	public void setScrolldraw(boolean scrolldraw) {
		this.scrolldraw = scrolldraw;
	}

	public boolean isLegendcheckboxmode() {
		return legendcheckboxmode;
	}

	public void setLegendcheckboxmode(boolean legendcheckboxmode) {
		this.legendcheckboxmode = legendcheckboxmode;
	}

	public boolean isIslegenddraw() {
		return islegenddraw;
	}

	public void setIslegenddraw(boolean islegenddraw) {
		this.islegenddraw = islegenddraw;
	}

	public int[] getSelectindexer() {
		return selectindexer;
	}

	public void setSelectindexer(int[] selectindexer) {
		this.selectindexer = selectindexer;
	}

	public String getSelectfilename() {
		return selectfilename;
	}

	public void setSelectfilename(String selectfilename) {
		this.selectfilename = selectfilename;
	}

	public String[] getPredictiondata() {
		return predictiondata;
	}

	public void setPredictiondata(String[] predictiondata) {
		this.predictiondata = predictiondata;
	}
	
	public boolean isIseventLine() {
		return iseventLine;
	}

	public void setIseventLine(boolean iseventLine) {
		this.iseventLine = iseventLine;
	}

	public boolean isIseventVisible() {
		return iseventVisible;
	}

	public void setIseventVisible(boolean iseventVisible) {
		this.iseventVisible = iseventVisible;
	}

	public int getEventLineIndex() {
		return eventLineIndex;
	}

	public void setEventLineIndex(int eventLineIndex) {
		this.eventLineIndex = eventLineIndex;
	}
	
	public double getMinxvalue() {
		return minxvalue;
	}

	public void setMinxvalue(double minxvalue) {
		this.minxvalue = minxvalue;
	}

	public double getMaxxvalue() {
		return maxxvalue;
	}

	public void setMaxxvalue(double maxxvalue) {
		this.maxxvalue = maxxvalue;
	}

	public double getMinyvalue() {
		return minyvalue;
	}

	public void setMinyvalue(double minyvalue) {
		this.minyvalue = minyvalue;
	}

	public double getMaxyvalue() {
		return maxyvalue;
	}

	public void setMaxyvalue(double maxyvalue) {
		this.maxyvalue = maxyvalue;
	}

	public double getMiny2value() {
		return miny2value;
	}

	public void setMiny2value(double miny2value) {
		this.miny2value = miny2value;
	}

	public double getMaxy2value() {
		return maxy2value;
	}

	public void setMaxy2value(double maxy2value) {
		this.maxy2value = maxy2value;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isIsrecalminmax() {
		return isrecalminmax;
	}

	public void setIsrecalminmax(boolean isrecalminmax) {
		this.isrecalminmax = isrecalminmax;
	}

	public double getTempminx() {
		return tempminx;
	}

	public void setTempminx(double tempminx) {
		this.tempminx = tempminx;
	}

	public double getTempmaxx() {
		return tempmaxx;
	}

	public void setTempmaxx(double tempmaxx) {
		this.tempmaxx = tempmaxx;
	}

	public double getTempminy() {
		return tempminy;
	}

	public void setTempminy(double tempminy) {
		this.tempminy = tempminy;
	}

	public double getTempmaxy() {
		return tempmaxy;
	}

	public void setTempmaxy(double tempmaxy) {
		this.tempmaxy = tempmaxy;
	}

	public double getTempminy2() {
		return tempminy2;
	}

	public void setTempminy2(double tempminy2) {
		this.tempminy2 = tempminy2;
	}

	public double getTempmaxy2() {
		return tempmaxy2;
	}

	public void setTempmaxy2(double tempmaxy2) {
		this.tempmaxy2 = tempmaxy2;
	}

	public boolean isIstimeserialize() {
		return istimeserialize;
	}

	public void setIstimeserialize(boolean istimeserialize) {
		this.istimeserialize = istimeserialize;
	}

	public double[] getTimexvalues() {
		return timexvalues;
	}

	public void setTimexvalues(double[] timexvalues) {
		this.timexvalues = timexvalues;
	}

	public double[] getTimeyvalues() {
		return timeyvalues;
	}

	public void setTimeyvalues(double[] timeyvalues) {
		this.timeyvalues = timeyvalues;
	}	
	
	/**
	 * @return the isGradient
	 */
	public boolean isGradient() {
		return isGradient;
	}

	/**
	 * @param isGradient the isGradient to set
	 */
	public void setGradient(boolean isGradient) {
		this.isGradient = isGradient;
	}
	
	public boolean isIshorizontal() {
		return ishorizontal;
	}

	public void setIshorizontal(boolean ishorizontal) {
		this.ishorizontal = ishorizontal;
	}

	public boolean isIsbrokenlinefunnel() {
		return isbrokenlinefunnel;
	}

	public void setIsbrokenlinefunnel(boolean isbrokenlinefunnel) {
		this.isbrokenlinefunnel = isbrokenlinefunnel;
	}

	public boolean isIsrevers() {
		return isrevers;
	}

	public void setIsrevers(boolean isrevers) {
		this.isrevers = isrevers;
	}

	public boolean isIsthumbnailmode() {
		return isthumbnailmode;
	}

	public void setIsthumbnailmode(boolean isthumbnailmode) {
		this.isthumbnailmode = isthumbnailmode;
	}

	public boolean isIsscalemode() {
		return isscalemode;
	}

	public void setIsscalemode(boolean isscalemode) {
		this.isscalemode = isscalemode;
	}

	/**
	 * @return the cc
	 */
	public CC getCc() {
		return cc;
	}

	/**
	 * @param cc the cc to set
	 */
	public void setCc(CC cc) {
		this.cc = cc;
	}

	public boolean isIsanimation() {
		return isanimation;
	}

	public void setIsanimation(boolean isanimation) {
		this.isanimation = isanimation;
	}
	
	public boolean isIsimagemode() {
		return isimagemode;
	}

	public void setIsimagemode(boolean isimagemode) {
		this.isimagemode = isimagemode;
	}

	public Short[] getSublineX() {
		return sublineX;
	}

	public void setSublineX(Short[] sublineX) {
		this.sublineX = sublineX;
	}

	public Short[] getSublineY() {
		return sublineY;
	}

	public void setSublineY(Short[] sublineY) {
		this.sublineY = sublineY;
	}

	public Short[] getSublineColorValue() {
		return sublineColorValue;
	}

	public void setSublineColorValue(Short[] sublineColorValue) {
		this.sublineColorValue = sublineColorValue;
	}

	public int[] getSublineColors() {
		return sublineColors;
	}

	public void setSublineColors(int[] sublineColors) {
		this.sublineColors = sublineColors;
	}

	public Short[] getSublineAreax() {
		return sublineAreax;
	}

	public void setSublineAreax(Short[] sublineAreax) {
		this.sublineAreax = sublineAreax;
	}

	public Short[] getSublineAreay() {
		return sublineAreay;
	}

	public void setSublineAreay(Short[] sublineAreay) {
		this.sublineAreay = sublineAreay;
	}
	
	public boolean isIsareain() {
		return isareain;
	}

	public void setIsareain(boolean isareain) {
		this.isareain = isareain;
	}
	
	public int getAreacoloralpha() {
		return areacoloralpha;
	}

	public void setAreacoloralpha(int areacoloralpha) {
		this.areacoloralpha = areacoloralpha;
	}

	public int[] getSublineAreaColors() {
		return sublineAreaColors;
	}

	public void setSublineAreaColors(int[] sublineAreaColors) {
		this.sublineAreaColors = sublineAreaColors;
	}

	public Short[] getSublineAreagroup() {
		return sublineAreagroup;
	}

	public void setSublineAreagroup(Short[] sublineAreagroup) {
		this.sublineAreagroup = sublineAreagroup;
	}
	
	public Short[] getCenterxy() {
		return centerxy;
	}

	public void setCenterxy(Short[] centerxy) {
		this.centerxy = centerxy;
	}

	public String[] getFocusparameter() {
		return focusparameter;
	}

	public void setFocusparameter(String[] focusparameter) {
		this.focusparameter = focusparameter;
	}
		
	public int[] getFocuscolors() {
		return focuscolors;
	}

	public void setFocuscolors(int[] focuscolors) {
		this.focuscolors = focuscolors;
	}

	public int[] getFocusdarkcolors() {
		return focusdarkcolors;
	}

	public void setFocusdarkcolors(int[] focusdarkcolors) {
		this.focusdarkcolors = focusdarkcolors;
	}

	public boolean isIslegnedsinglecolor() {
		return islegnedsinglecolor;
	}

	public void setIslegnedsinglecolor(boolean islegnedsinglecolor) {
		this.islegnedsinglecolor = islegnedsinglecolor;
	}

	public int getSinglecolor() {
		return singlecolor;
	}

	public void setSinglecolor(int singlecolor) {
		this.singlecolor = singlecolor;
	}

	public boolean isIsvirtualgroup() {
		return isvirtualgroup;
	}

	public void setIsvirtualgroup(boolean isvirtualgroup) {
		this.isvirtualgroup = isvirtualgroup;
	}

	public String[] getVirtualxlabels() {
		return virtualxlabels;
	}

	public int getBottomaxislabelsize() {
		return bottomaxislabelsize;
	}

	public void setBottomaxislabelsize(int bottomaxislabelsize) {
		this.bottomaxislabelsize = bottomaxislabelsize;
	}

	public void setVirtualxlabels(String[] virtualxlabels) {
		this.virtualxlabels = virtualxlabels;
	}

	public int getMaxXmemberSize() {
		return maxXmemberSize;
	}

	public void setMaxXmemberSize(int maxXmemberSize) {
		this.maxXmemberSize = maxXmemberSize;
	}

	public int[] getVirtualxlabelpoints() {
		return virtualxlabelpoints;
	}

	public void setVirtualxlabelpoints(int[] virtualxlabelpoints) {
		this.virtualxlabelpoints = virtualxlabelpoints;
	}	

	public int[] getVirtualxlabelpoints2() {
		return virtualxlabelpoints2;
	}

	public void setVirtualxlabelpoints2(int[] virtualxlabelpoints2) {
		this.virtualxlabelpoints2 = virtualxlabelpoints2;
	}

	public String[] getVirtualfontinfo() {
		return virtualfontinfo;
	}

	public void setVirtualfontinfo(String[] virtualfontinfo) {
		this.virtualfontinfo = virtualfontinfo;
	}
	
	public boolean isXmemberOmit() {
		return isXmemberOmit;
	}

	public void setXmemberOmit(boolean isXmemberOmit) {
		this.isXmemberOmit = isXmemberOmit;
	}
	
	public boolean isIsvirtualOmit() {
		return isvirtualOmit;
	}

	public void setIsvirtualOmit(boolean isvirtualOmit) {
		this.isvirtualOmit = isvirtualOmit;
	}
	
	public boolean isIslegendrealign() {
		return islegendrealign;
	}

	public void setIslegendrealign(boolean islegendrealign) {
		this.islegendrealign = islegendrealign;
	}

	public boolean isIslinearea() {
		return islinearea;
	}

	public void setIslinearea(boolean islinearea) {
		this.islinearea = islinearea;
	}

	public boolean isIslinepoint() {
		return islinepoint;
	}

	public void setIslinepoint(boolean islinepoint) {
		this.islinepoint = islinepoint;
	}

	public String getDefaultShapeStyle() {
		return defaultShapeStyle;
	}

	public void setDefaultShapeStyle(String defaultShapeStyle) {
		this.defaultShapeStyle = defaultShapeStyle;
	}

	public String getDefaultShapeStyle2() {
		return defaultShapeStyle2;
	}

	public void setDefaultShapeStyle2(String defaultShapeStyle2) {
		this.defaultShapeStyle2 = defaultShapeStyle2;
	}
	
	public int getCtl_outcount() {
		return ctl_outcount;
	}

	public void setCtl_outcount(int ctl_outcount) {
		this.ctl_outcount = ctl_outcount;
	}
	
	public int getXcellsize() {
		return xcellsize;
	}

	public void setXcellsize(int xcellsize) {
		this.xcellsize = xcellsize;
	}

	public int getYcellsize() {
		return ycellsize;
	}

	public void setYcellsize(int ycellsize) {
		this.ycellsize = ycellsize;
	}
	
	public boolean isIsredraw() {
		return isredraw;
	}

	public void setIsredraw(boolean isredraw) {
		this.isredraw = isredraw;
	}

	public void setValueBinding(Long[] new_indexer,
								Double[] new_dXValue,
								Double[] new_dYValue,
								Double[] new_dY2Value,
								Float[] new_chipXValue,
								Float[] new_chipYValue,
								Short[] new_pXValue,
								Short[] new_pYValue,
								Short[] new_pY2Value,
								Integer[] new_markerValue,
								Short[] new_groupValue,
								Short[] new_colorValue,
								Short[] new_shapeValue,
								Short[] new_sizeValue,
								Short[] new_focusValue) {
		this.dXValue = new_dXValue;
		this.dYValue = new_dYValue;
		this.dY2Value = new_dY2Value;
		this.chipXValue = new_chipXValue;
		this.chipYValue = new_chipYValue;
		this.pXValue = new_pXValue;
		this.pYValue = new_pYValue;
		this.pY2Value = new_pY2Value;
		this.markerValue = new_markerValue;
		this.groupValue = new_groupValue;
		this.colorValue = new_colorValue;
		this.shapeValue = new_shapeValue;
		this.sizeValue = new_sizeValue;
		this.focusValue = new_focusValue;		
	}

	public TooltipValues getClone() {
		TooltipValues tooltipValues = new TooltipValues();
		tooltipValues.setTitle(this.getTitle());
		tooltipValues.setTitlefont(this.titlefont);
		tooltipValues.setTitlecolor(this.getTitlecolor());
		tooltipValues.setInout(this.getInout());
		tooltipValues.setXvalueType(this.getXvalueType());
		tooltipValues.setYvalueType(this.getYvalueType());
		tooltipValues.setNotebookseriesType(this.getNotebookseriesType());
		tooltipValues.setSeriesType(this.getSeriesType());
		tooltipValues.setTypeSeries(this.typeSeries);
		tooltipValues.setHeatmapAggregation(this.heatmapAggregation);
		tooltipValues.setStartcolor(this.startcolor);
		tooltipValues.setEndcolor(this.endcolor);
		tooltipValues.setLefttitlerect(this.getLefttitlerect());
		tooltipValues.setBottomtitlerect(this.getBottomtitlerect());
		tooltipValues.setSeriesToolValue(this.getSeriesToolValue());
		tooltipValues.setColorShapeEqual(this.isColorShapeEqual());
		tooltipValues.setIsresgressionline(this.isIsresgressionline());
		tooltipValues.setRegression1(this.getRegression1());
		tooltipValues.setRegression2(this.getRegression2());
		tooltipValues.setRegression3(this.getRegression3());
		tooltipValues.setRegression4(this.getRegression4());
		tooltipValues.setAvgx(this.getAvgx());
		tooltipValues.setAvgy(this.getAvgy());
		tooltipValues.setStdDevx(this.getStdDevx());
		tooltipValues.setStdDevy(this.getStdDevy());
		tooltipValues.setRegressionlinexvalues(this.getRegressionlinexvalues());
		tooltipValues.setRegressionlineyvalues(this.getRegressionlineyvalues());
		tooltipValues.setRegressionrectsx(this.getRegressionrectsx());
		tooltipValues.setRegressionrectsy(this.getRegressionrectsy());
		tooltipValues.setBase(this.isBase());
		tooltipValues.setChartwidth(this.getChartwidth());
		tooltipValues.setChartheight(this.getChartheight());
		tooltipValues.setLeft(this.getLeft());
		tooltipValues.setTop(this.getTop());
		tooltipValues.setWidth(this.getWidth());
		tooltipValues.setHeight(this.getHeight());
		tooltipValues.setRowcount(this.getRowcount());
		tooltipValues.setSplitBar(this.isSplitBar());
		tooltipValues.setSplitBarX(this.getSplitBarX());
		tooltipValues.setSplitbarValue(this.getSplitbarValue());
		tooltipValues.setIspointvisible(this.isIspointvisible());
		tooltipValues.setIshighlight(this.isIshighlight());
		tooltipValues.setPointwidth(this.getPointwidth());
		tooltipValues.setPointheight(this.getPointheight());
		tooltipValues.setLegendleft(this.getLegendleft());
		tooltipValues.setLegendtop(this.getLegendtop());
		tooltipValues.setLegendwidth(this.getLegendwidth());
		tooltipValues.setLegendheight(this.getLegendheight());
		tooltipValues.setLegendfontsize(this.getLegendfontsize());
		tooltipValues.setLegendfontName(this.getLegendfontName());
		tooltipValues.setLegendfontStyle(this.getLegendfontStyle());
		tooltipValues.setLegendforecolor(this.getLegendforecolor());
		tooltipValues.setLegendbordercolor(this.getLegendbordercolor());
		tooltipValues.setLegendbordervisible(this.isLegendbordervisible());
		tooltipValues.setIslegendscroll(this.isIslegendscroll());
		tooltipValues.setBackcolor(this.getBackcolor());
		tooltipValues.setIslegendautosize(this.isIslegendautosize());
		tooltipValues.setLegendrect(this.getLegendrect());
		tooltipValues.setLegendPosition(this.getLegendPosition());
		tooltipValues.setPointStyle(this.getPointStyle());
		tooltipValues.setPointStyle2(this.getPointStyle2());
		tooltipValues.setIsy2mode(this.isIsy2mode());
		tooltipValues.setMarkerText(this.getMarkerText());
		tooltipValues.setColorText(this.getColorText());
		tooltipValues.setShapeText(this.getShapeText());
		tooltipValues.setSizeText(this.getSizeText());
		tooltipValues.setColors(this.getColors());
		tooltipValues.setDarkcolors(this.getDarkcolors());
		tooltipValues.setShapes(this.getShapes());
		tooltipValues.setXmember(this.getXmember());
		tooltipValues.setYmember(this.getYmember());
		tooltipValues.setBoxvalue(this.getBoxvalue());
		tooltipValues.setAxisLine(this.getAxisLine());
		tooltipValues.setDduplicate(this.dduplicate);
		tooltipValues.setIsmultiaxisdrawline(this.isIsmultiaxisdrawline());
		tooltipValues.setIsmultiaxisdrawtext(this.isIsmultiaxisdrawtext());
		tooltipValues.setContainColors(this.getContainColors());
		tooltipValues.setContainShapes(this.getContainShapes());
		tooltipValues.setUnvisibleColors(this.getUnvisibleColors());
		tooltipValues.setUnvisibleShapes(this.getUnvisibleShapes());
		tooltipValues.setControllimitinout(this.getControllimitinout());
		tooltipValues.setControllimitinout(this.getControllimitinout());
		tooltipValues.setIsmerge(this.isIsmerge());
		tooltipValues.setFirstvalue(this.getFirstvalue());
		tooltipValues.setEndvalue(this.getEndvalue());
		tooltipValues.setScrolldraw(this.isScrolldraw());
		tooltipValues.setLegendcheckboxmode(this.isLegendcheckboxmode());
		tooltipValues.setSelectindexer(this.getSelectindexer());
		tooltipValues.setSelectfilename(this.getSelectfilename());
		tooltipValues.setPredictiondata(this.getPredictiondata());
		tooltipValues.setIseventLine(this.isIseventLine());
		tooltipValues.setIseventVisible(this.isIseventVisible());
		tooltipValues.setEventLineIndex(this.getEventLineIndex());
		tooltipValues.setMinxvalue(this.getMinxvalue());
		tooltipValues.setMaxxvalue(this.getMaxxvalue());
		tooltipValues.setMinyvalue(this.getMinyvalue());
		tooltipValues.setMaxyvalue(this.getMaxyvalue());
		tooltipValues.setMiny2value(this.getMiny2value());
		tooltipValues.setMaxy2value(this.getMaxy2value());
		tooltipValues.setMessage(this.getMessage());
		tooltipValues.setIsrecalminmax(this.isIsrecalminmax());
		tooltipValues.setTempminx(this.getTempminx());
		tooltipValues.setTempmaxx(this.getTempmaxx());
		tooltipValues.setTempminy(this.getTempminy());
		tooltipValues.setTempmaxy(this.getTempmaxy());
		tooltipValues.setTempminy2(this.getTempminy2());
		tooltipValues.setTempmaxy2(this.getTempmaxy2());
		tooltipValues.setIstimeserialize(this.isIstimeserialize());
		tooltipValues.setTimexvalues(this.getTimexvalues());
		tooltipValues.setTimeyvalues(this.getTimeyvalues());
		tooltipValues.setGradient(this.isGradient());
		tooltipValues.setCc(this.getCc());
		tooltipValues.setIsanimation(this.isIsanimation());
		tooltipValues.setSublineAreax(this.sublineAreax);
		tooltipValues.setSublineAreay(this.sublineAreay);
		tooltipValues.setSublineColors(this.sublineColors);
		tooltipValues.setSublineColorValue(this.sublineColorValue);
		tooltipValues.setSublineX(this.sublineX);
		tooltipValues.setSublineY(this.sublineY);
		tooltipValues.setIsareain(this.isareain);
		tooltipValues.setAreacoloralpha(this.areacoloralpha);
		tooltipValues.setSublineAreaColors(this.sublineAreaColors);
		tooltipValues.setSublineAreagroup(this.sublineAreagroup);
		tooltipValues.setCenterxy(this.centerxy);
		tooltipValues.setFocusparameter(this.focusparameter);
		tooltipValues.setFocuscolors(this.focuscolors);
		tooltipValues.setIslegnedsinglecolor(this.islegnedsinglecolor);
		tooltipValues.setSinglecolor(this.singlecolor);
		tooltipValues.setBottomaxislabelsize(this.bottomaxislabelsize);
		tooltipValues.setIsvirtualgroup(this.isvirtualgroup);
		tooltipValues.setVirtualxlabels(this.virtualxlabels);
		tooltipValues.setVirtualxlabelpoints(this.virtualxlabelpoints);
		tooltipValues.setVirtualxlabelpoints2(this.virtualxlabelpoints2);
		tooltipValues.setVirtualfontinfo(this.virtualfontinfo);
		tooltipValues.setMaxXmemberSize(this.maxXmemberSize);
		tooltipValues.setXmemberOmit(this.isXmemberOmit);
		tooltipValues.setIsvirtualOmit(this.isvirtualOmit);
		tooltipValues.setIslinepoint(this.islinepoint);
		tooltipValues.setIslinearea(this.islinearea);
		tooltipValues.setXcellsize(this.xcellsize);
		tooltipValues.setYcellsize(this.ycellsize);
		return tooltipValues;
	}
	
	public void setBinding(LinkValues linkValues) {
		if (linkValues == null)
			return;
		this.typeSeries = linkValues.getTypeSeries().toString();
		this.heatmapAggregation = linkValues.getHeatmapAggregation();
		this.indexer = linkValues.getIndexer();
		this.dXValue = linkValues.getdXValue();
		this.dYValue = linkValues.getdYValue();
		this.dY2Value = linkValues.getdY2Value();
		this.count = linkValues.getCount();
		this.pXValue = linkValues.getpXValue();
		this.pYValue = linkValues.getpYValue();
		this.pY2Value = linkValues.getpY2Value();
		this.markerValue = linkValues.getMarkerValue();	
		this.groupValue = linkValues.getGroupValue();
		this.colorValue = linkValues.getColorValue();
		this.shapeValue = linkValues.getShapeValue();
		this.sizeValue = linkValues.getSizeValue();
		this.focusValue = linkValues.getFocusValue();
		this.markerText = linkValues.getMarkerText();
		this.colorText = linkValues.getColorText();
		this.shapeText = linkValues.getShapeText();
		this.sizeText = linkValues.getSizeText();
		this.sizearray = linkValues.getSizearray();
		this.startcolor = linkValues.getStartcolor();
		this.endcolor = linkValues.getEndcolor();
		//this.xmember = linkValues.getXmember();
		//this.ymember = linkValues.getYmember();
		this.boxvalue = linkValues.getBoxValue();
		this.focusparameter = linkValues.getFocusparameter();
		this.focuscolors = linkValues.getFocuscolors();
		this.islegnedsinglecolor = linkValues.isIslegnedsinglecolor();
		this.singlecolor = linkValues.getSinglecolor();
		this.dduplicate = linkValues.getDduplicate(); 

		this.isresgressionline = linkValues.isIsresgressionline();
		this.regression1 = linkValues.getRegression1();
		this.regression2 = linkValues.getRegression2();
		this.regression3 = linkValues.getRegression3();
		this.regression4 = linkValues.getRegression4();
		this.avgx = linkValues.getAvgx();
		this.avgy = linkValues.getAvgy();
		this.stdDevx = linkValues.getStdDevx();
		this.stdDevy = linkValues.getStdDevy();
		this.regressionlinexvalues = linkValues.getRegressionlinexvalues();
		this.regressionlineyvalues = linkValues.getRegressionlineyvalues();
		this.regressionrectsx = linkValues.getRegressionrectsx();
		this.regressionrectsy = linkValues.getRegressionrectsy();
		this.seriesToolValue = linkValues.getSeriesToolValue();
		
		this.areacoloralpha = linkValues.getAreacoloralpha();
		this.sublineAreax = linkValues.getSublineAreax();
		this.sublineAreay = linkValues.getSublineAreay();
		this.sublineColors = linkValues.getSublineColors();
		this.sublineColorValue = linkValues.getSublineColorValue();
		this.sublineX = linkValues.getSublineX();
		this.sublineY = linkValues.getSublineY();
		this.isareain = linkValues.isIsareain();
		this.sublineAreagroup = linkValues.getSublineAreagroup();
		this.sublineAreaColors = linkValues.getSublineAreaColors();
		this.centerxy = linkValues.getCenterxy();	
		this.xcellsize = linkValues.getXcellsize();
		this.ycellsize = linkValues.getYcellsize();
	}
}
