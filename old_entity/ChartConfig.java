package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.BarChartType;
import com.hbee.honeybee.enumeration.DataOrderType;
import com.hbee.honeybee.enumeration.LineType;
import com.hbee.honeybee.enumeration.MapDataType;
import com.hbee.honeybee.enumeration.MinMaxType;
import com.hbee.honeybee.enumeration.NotebookType;
import com.hbee.honeybee.enumeration.OutlierType;
import com.hbee.honeybee.enumeration.PieType;
import com.hbee.honeybee.enumeration.ShapeStyle;
import com.hbee.honeybee.enumeration.StatisticalType;

public class ChartConfig {
        private int idatabindingtype = 1;
        private boolean isThumbnail = false;
        private boolean isThumbnailColor = true;
        private boolean isPointVisible = false;
        private boolean isRegressionLine = false;
        private boolean isBoxPlotDot = false;
        private boolean islinearea = false;
        private boolean islinecurve = false;
        private boolean islinesignal = false;
        private boolean islinestack = false;
        private boolean isSequence = false;
        private boolean isInterpolation = false;
        private boolean isNormalization = false;
        private boolean isRowcount = true;
        private boolean isStatisticalView = false;
        private int waferindex = 0;
        private String quantile = "1,0.75,0.5,0.25,0";
        private String histogramtype = "normal"; //"density"
        private int binCount = 10;
        private int zerobinCount = 0;
        private int histgramLineColor = Color.green.getRGB();
        private boolean ishistogramLine = false;
        private boolean ishistogramMultiAxis = true;
        private boolean ishorizental = false;
        private boolean iscombination = false;
        private boolean isBarChartSummaryData = false;
        private boolean isBoxPlotStatisticalView = false;
        private boolean isBarStatisticalView = false;
        private boolean isBarpercentlabel = false;
        private boolean isDataSummaryMode = true;
        private boolean boxpointvisible = false;
        private BarChartType barcharttype = BarChartType.Slide;
        private boolean barsortbyvalue = false;
        private String[] barStatistical = new String[] {"Gap"}; //Gap,Sum,Avg
        private String[] boxplotStatistical = new String[] {"min","median","max","outlier"};
        private int rowheight = 17;
        private LineType lineType = LineType.None; // LineType.Nomal;
        private PieType pieType = PieType.None;
        private StatisticalType statisticalValueType = StatisticalType.Avg; 
        private StatisticalType statisticalValueType2 = StatisticalType.Avg; 
        private StatisticalType[] statisticalValueTypeMulti = new StatisticalType[] {StatisticalType.Avg};
        private String[] functionLines = null;
        private String[] dateTimeColumns = null;
        private String[] numericColumns = null;
        private int[] activeIndex = null;
        
        private String colorfirstAlign = "";
        private String leftfirstAlign = "";
    	private String rightfirstAlign = "";
    	private String bottomfirstAlign = "";
    	
    	private MinMaxType minmaxType = MinMaxType.ALL;
    	private boolean outlierMigration = false;
    	private boolean isseriesstatistical = false;
    	private boolean isEventLineLegend = false;
    	private boolean isEventLineShow = true;
    	// 현재 사용되지 않음.
    	//private String titleconcateStr = "_"; 
    	private String legendconcateStr = "_";
    	private boolean isMultiAxisDrawLine = true;
    	private boolean isMultiAxisDrawText = false;
    	
    	private int searchPointColor = new Color(6, 85, 6).getRGB();
    	private int searchPointAlpa = 70;
    	private int searchPointSize = 2;
    	private ShapeStyle searchPointShape = ShapeStyle.Circle;
    	private String mapType = "KOR_LEVEL1";
    	private boolean ismapfillcolor = true;
        private boolean ismaplabelvisible = false;
        private NotebookType notebookType =NotebookType.Python;
        private boolean isanimation = false;
        private int animationtime = 1000;
    	
        private boolean isNullIsZero = false;
        
        private double nullToNumeric = 0;
        private String nullToTimestamp = "1970-01-01 00:00:00.000";  // millisecond 
        private String nullToString = "[Null]";
		private boolean nullToLast = false;
		
		private boolean isbrokenlinefunnel = true; // funnel chart
		
		private int type3dType = 0; //0:scatter, 1:line, 2:surface, 3:bar
		private float applySpacing = 0.3f; //surface or bar의 밀도
		private String type3dAggregation = "Avg";
		
		private double tension = 0.85; //edgebundle chart에서 line 곡선자유도
		
		private boolean iscontourfillcolor = false;
		private double elevation = 30d;
		private double azimuth = -37.5f;
		
		private boolean isOutlier = false;
		private OutlierType outlierType = OutlierType.Except; 
	    private boolean isNrDistribution = true;
	    private int outlierSigma = 6;
	    private double outlierK = 1.5;
	    private double outlier_threshold = 2;
	    
	    private int timestamp_term = 0;
	    private String timestamp_interval = "Day";
	    private DataOrderType xalign = DataOrderType.Serial;
	    
	    private String colorexpression = "";
	    private String xexpression = "";
	    private String yexpression = "";	    
	    	    
		public double getElevation() {
			return elevation;
		}
		public void setElevation(double elevation) {
			this.elevation = elevation;
		}
		public double getAzimuth() {
			return azimuth;
		}
		public void setAzimuth(double azimuth) {
			this.azimuth = azimuth;
		}
		public boolean isOutlier() {
			return isOutlier;
		}
		public void setOutlier(boolean isOutlier) {
			this.isOutlier = isOutlier;
		}
		public OutlierType getOutlierType() {
			return outlierType;
		}
		public void setOutlierType(OutlierType outlierType) {
			this.outlierType = outlierType;
		}
		public boolean isNrDistribution() {
			return isNrDistribution;
		}
		public void setNrDistribution(boolean isNrDistribution) {
			this.isNrDistribution = isNrDistribution;
		}
		public int getOutlierSigma() {
			return outlierSigma;
		}
		public void setOutlierSigma(int outlierSigma) {
			this.outlierSigma = outlierSigma;
		}
		public double getOutlier_threshold() {
			return outlier_threshold;
		}
		public void setOutlier_threshold(double outlier_threshold) {
			this.outlier_threshold = outlier_threshold;
		}
		public double getOutlierK() {
			return outlierK;
		}
		public void setOutlierK(double outlierK) {
			this.outlierK = outlierK;
		}
		public boolean isIscontourfillcolor() {
			return iscontourfillcolor;
		}
		public void setIscontourfillcolor(boolean iscontourfillcolor) {
			this.iscontourfillcolor = iscontourfillcolor;
		}
		public String getType3dAggregation() {
			return type3dAggregation;
		}
		public void setType3dAggregation(String type3dAggregation) {
			this.type3dAggregation = type3dAggregation;
		}
		public float getApplySpacing() {
			return applySpacing;
		}
		public void setApplySpacing(float applySpacing) {
			this.applySpacing = applySpacing;
		}
		public double getTension() {
			return tension;
		}
		public void setTension(double tension) {
			this.tension = tension;
		}
		public int getType3dType() {
			return type3dType;
		}
		public void setType3dType(int type3dType) {
			this.type3dType = type3dType;
		}
		public boolean isIsbrokenlinefunnel() {
			return isbrokenlinefunnel;
		}
		public void setIsbrokenlinefunnel(boolean isbrokenlinefunnel) {
			this.isbrokenlinefunnel = isbrokenlinefunnel;
		}		
		public int[] getActiveIndex() {
			return activeIndex;
		}
		public void setActiveIndex(int[] activeIndex) {
			this.activeIndex = activeIndex;
		}
		public double getNullToNumeric() {
			return nullToNumeric;
		}
		public void setNullToNumeric(double nullToNumeric) {
			this.nullToNumeric = nullToNumeric;
		}
		
		public String getNullToTimestamp() {
			return nullToTimestamp;
		}
		public void setNullToTimestamp(String nullToTimestamp) {
			this.nullToTimestamp = nullToTimestamp;
		}
		public String getNullToString() {
			return nullToString;
		}
		public void setNullToString(String nullToString) {
			this.nullToString = nullToString;
		}
		
		public boolean isNullToLast() {
			return nullToLast;
		}
		public void setNullToLast(boolean nullToLast) {
			this.nullToLast = nullToLast;
		}
		public String getMapType() {
			return mapType;
		}
		public void setMapType(String mapType) {
			this.mapType = mapType;
		}
		
		public boolean isIsmapfillcolor() {
			return ismapfillcolor;
		}
		public void setIsmapfillcolor(boolean ismapfillcolor) {
			this.ismapfillcolor = ismapfillcolor;
		}
		public MinMaxType getMinmaxType() {
			return minmaxType;
		}
		public void setMinmaxType(MinMaxType minmaxType) {
			this.minmaxType = minmaxType;
		}
		public boolean isOutlierMigration() {
			return outlierMigration;
		}
		public void setOutlierMigration(boolean outlierMigration) {
			this.outlierMigration = outlierMigration;
		}
		public StatisticalType getStatisticalValueType() {
			if(statisticalValueType == null)
				return StatisticalType.Avg;
			return statisticalValueType;
		}
		public StatisticalType getRealStatisticalValueType() {
			if(statisticalValueType == null)
				return StatisticalType.None;
			return statisticalValueType;
		}
		public void setStatisticalValueType(StatisticalType statisticalValueType) {
			this.statisticalValueType = statisticalValueType;
		}
		public StatisticalType getStatisticalValueType2() {
			if(statisticalValueType2 == null)
				return StatisticalType.Avg;
			return statisticalValueType2;
		}
		public StatisticalType getRealStatisticalValueType2() {
			if(statisticalValueType2 == null)
				return StatisticalType.None;
			return statisticalValueType2;
		}
		public void setStatisticalValueType2(StatisticalType statisticalValueType2) {
			this.statisticalValueType2 = statisticalValueType2;
		}
		public int getIdatabindingtype() {
			return idatabindingtype;
		}
		public void setIdatabindingtype(int idatabindingtype) {
			this.idatabindingtype = idatabindingtype;
		}
		public boolean isThumbnailColor() {
			return isThumbnailColor;
		}
		public void setThumbnailColor(boolean isThumbnailColor) {
			this.isThumbnailColor = isThumbnailColor;
		}
		public boolean isThumbnail() {
			return isThumbnail;
		}
		public void setThumbnail(boolean isThumbnail) {
			this.isThumbnail = isThumbnail;
		}
		public boolean isPointVisible() {
			return isPointVisible;
		}		
		public void setPointVisible(boolean isPointVisible) {
			this.isPointVisible = isPointVisible;
		}
		public String getQuantile() {
			return quantile;
		}
		public void setQuantile(String quantile) {
			this.quantile = quantile;
		}
		public int getBinCount() {
			return binCount;
		}
		public void setBinCount(int binCount) {
			this.binCount = binCount;
		}			
		public String getHistogramtype() {
			return histogramtype;
		}
		public void setHistogramtype(String histogramtype) {
			this.histogramtype = histogramtype;
		}
		public int getZerobinCount() {
			return zerobinCount;
		}
		public void setZerobinCount(int zerobinCount) {
			this.zerobinCount = zerobinCount;
		}
		public int getHistgramLineColor() {
			return histgramLineColor;
		}
		public void setHistgramLineColor(int histgramLineColor) {
			this.histgramLineColor = histgramLineColor;
		}		
		public boolean isIshistogramLine() {
			return ishistogramLine;
		}
		public void setIshistogramLine(boolean ishistogramLine) {
			this.ishistogramLine = ishistogramLine;
		}
		public boolean isIshistogramMultiAxis() {
			return ishistogramMultiAxis;
		}
		public void setIshistogramMultiAxis(boolean ishistogramMultiAxis) {
			this.ishistogramMultiAxis = ishistogramMultiAxis;
		}
		public boolean isIshorizental() {
			return ishorizental;
		}
		public void setIshorizental(boolean ishorizental) {
			this.ishorizental = ishorizental;
		}
		public boolean isIscombination() {
			return iscombination;
		}
		public void setIscombination(boolean iscombination) {
			this.iscombination = iscombination;
		}
		public boolean isRegressionLine() {
			return isRegressionLine;
		}
		public void setRegressionLine(boolean isRegressionLine) {
			this.isRegressionLine = isRegressionLine;
		}
		public boolean isBarChartSummaryData() {
			return isBarChartSummaryData;
		}
		public void setBarChartSummaryData(boolean isBarChartSummaryData) {
			this.isBarChartSummaryData = isBarChartSummaryData;
		}		
		public boolean isBoxPlotStatisticalView() {
			return isBoxPlotStatisticalView;
		}
		public void setBoxPlotStatisticalView(boolean isBoxPlotStatisticalView) {
			this.isBoxPlotStatisticalView = isBoxPlotStatisticalView;
		}		
		public boolean isBarStatisticalView() {
			return isBarStatisticalView;
		}
		public void setBarStatisticalView(boolean isBarStatisticalView) {
			this.isBarStatisticalView = isBarStatisticalView;
		}		
		public String[] getBarStatistical() {
			return barStatistical;
		}
		public void setBarStatistical(String[] barStatistical) {
			this.barStatistical = barStatistical;
		}
		public String[] getBoxplotStatistical() {
			return boxplotStatistical;
		}
		public void setBoxplotStatistical(String[] boxplotStatistical) {
			this.boxplotStatistical = boxplotStatistical;
		}
		public boolean isDataSummaryMode() {
			return isDataSummaryMode;
		}
		public void setDataSummaryMode(boolean isDataSummaryMode) {
			this.isDataSummaryMode = isDataSummaryMode;
		}		
		
		public PieType getPieType() {
			return pieType;
		}
		public void setPieType(PieType pieType) {
			this.pieType = pieType;
		}
		public boolean isBoxpointvisible() {
			return boxpointvisible;
		}
		public void setBoxpointvisible(boolean boxpointvisible) {
			this.boxpointvisible = boxpointvisible;
		}
		public boolean isBoxPlotDot() {
			return isBoxPlotDot;
		}
		public void setBoxPlotDot(boolean isBoxPlotDot) {
			this.isBoxPlotDot = isBoxPlotDot;
		}
		public boolean isLineArea() {
			return islinearea;
		}
		public void setLineArea(boolean isLineArea) {
			this.islinearea = isLineArea;
		}		
		public boolean isIslinecurve() {
			return islinecurve;
		}
		public void setIslinecurve(boolean islinecurve) {
			this.islinecurve = islinecurve;
		}
		public boolean isIslinesignal() {
			return islinesignal;
		}
		public void setIslinesignal(boolean islinesignal) {
			this.islinesignal = islinesignal;
		}		
		public boolean isIslinestack() {
			return islinestack;
		}
		public void setIslinestack(boolean islinestack) {
			this.islinestack = islinestack;
		}
		public int getWaferindex() {
			return waferindex;
		}
		public void setWaferindex(int waferindex) {
			this.waferindex = waferindex;
		}
		public BarChartType getBarcharttype() {
			return barcharttype;
		}
		public void setBarcharttype(BarChartType barcharttype) {
			this.barcharttype = barcharttype;
		}
		public boolean isBarsortbyvalue() {
			return barsortbyvalue;
		}
		public void setBarsortbyvalue(boolean barsortbyvalue) {
			this.barsortbyvalue = barsortbyvalue;
		}
		public int getRowheight() {
			return rowheight;
		}
		public void setRowheight(int rowheight) {
			this.rowheight = rowheight;
		}
		public LineType getLineType() {
			return lineType;
		}
		public void setLineType(LineType lineType) {
			this.lineType = lineType;
		}
		public String[] getFunctionLines() {
			return functionLines;
		}
		public void setFunctionLines(String[] functionLines) {
			this.functionLines = functionLines;
		}
		public String[] getDateTimeColumns() {
			return dateTimeColumns;
		}
		public void setDateTimeColumns(String[] dateTimeColumns) {
			this.dateTimeColumns = dateTimeColumns;
		}
		public String[] getNumericColumns() {
			return numericColumns;
		}
		public void setNumericColumns(String[] numericColumns) {
			this.numericColumns = numericColumns;
		}
		public boolean getDistributionMode(){
			if(this.lineType != lineType.None)
				return true;
			else
				return false;
		}
		public String getColorfirstAlign() {
			return colorfirstAlign;
		}
		public void setColorfirstAlign(String colorfirstAlign) {
			this.colorfirstAlign = colorfirstAlign;
		}
		public String getLeftfirstAlign() {
			return leftfirstAlign;
		}
		public void setLeftfirstAlign(String leftfirstAlign) {
			this.leftfirstAlign = leftfirstAlign;
		}
		public String getRightfirstAlign() {
			return rightfirstAlign;
		}
		public void setRightfirstAlign(String rightfirstAlign) {
			this.rightfirstAlign = rightfirstAlign;
		}
		public String getBottomfirstAlign() {
			return bottomfirstAlign;
		}
		public void setBottomfirstAlign(String bottomfirstAlign) {
			this.bottomfirstAlign = bottomfirstAlign;
		}
		public boolean isSequence() {
			return isSequence;
		}
		public void setSequence(boolean isSequence) {
			this.isSequence = isSequence;
		}
		public boolean isInterpolation() {
			return isInterpolation;
		}
		public void setInterpolation(boolean isInterpolation) {
			this.isInterpolation = isInterpolation;
		}
		public boolean isNormalization() {
			return isNormalization;
		}
		public void setNormalization(boolean isNormalization) {
			this.isNormalization = isNormalization;
		}
		
		/**
		 * @return the isRowcount
		 */
		public boolean isRowcount() {
			return isRowcount;
		}
		/**
		 * @param isRowcount the isRowcount to set
		 */
		public void setRowcount(boolean isRowcount) {
			this.isRowcount = isRowcount;
		}
		public boolean isIsseriesstatistical() {
			return isseriesstatistical;
		}
		public void setIsseriesstatistical(boolean isseriesstatistical) {
			this.isseriesstatistical = isseriesstatistical;
		}
		/*
		public String getTitleconcateStr() {
			return titleconcateStr;
		}
		public void setTitleconcateStr(String titleconcateStr) {
			this.titleconcateStr = titleconcateStr;
		}
		*/
		public String getLegendconcateStr() {
			return legendconcateStr;
		}
		public void setLegendconcateStr(String legendconcateStr) {
			this.legendconcateStr = legendconcateStr;
		}
		public boolean isEventLineLegend() {
			return isEventLineLegend;
		}
		public void setEventLineLegend(boolean isEventLineLegend) {
			this.isEventLineLegend = isEventLineLegend;
		}
		public boolean isEventLineShow() {
			return isEventLineShow;
		}
		public void setEventLineShow(boolean isEventLineShow) {
			this.isEventLineShow = isEventLineShow;
		}
		public boolean isMultiAxisDrawLine() {
			return isMultiAxisDrawLine;
		}
		public void setMultiAxisDrawLine(boolean isMultiAxisDrawLine) {
			this.isMultiAxisDrawLine = isMultiAxisDrawLine;
		}
		public boolean isMultiAxisDrawText() {
			return isMultiAxisDrawText;
		}
		public void setMultiAxisDrawText(boolean isMultiAxisDrawText) {
			this.isMultiAxisDrawText = isMultiAxisDrawText;
		}
		public int getSearchPointColor() {
			return searchPointColor;
		}
		public void setSearchPointColor(int searchPointColor) {
			this.searchPointColor = searchPointColor;
		}
		public int getSearchPointAlpa() {
			return searchPointAlpa;
		}
		public void setSearchPointAlpa(int searchPointAlpa) {
			this.searchPointAlpa = searchPointAlpa;
		}
		public int getSearchPointSize() {
			return searchPointSize;
		}
		public void setSearchPointSize(int searchPointSize) {
			this.searchPointSize = searchPointSize;
		}
		public ShapeStyle getSearchPointShape() {
			return searchPointShape;
		}
		public void setSearchPointShape(ShapeStyle searchPointShape) {
			this.searchPointShape = searchPointShape;
		}
		public boolean isIsmaplabelvisible() {
			return ismaplabelvisible;
		}
		public void setIsmaplabelvisible(boolean ismaplabelvisible) {
			this.ismaplabelvisible = ismaplabelvisible;
		}
		public NotebookType getNotebookType() {
			return notebookType;
		}
		public void setNotebookType(NotebookType notebookType) {
			this.notebookType = notebookType;
		}
		/**
		 * @return the isNullIsZero
		 */
		public boolean isNullIsZero() {
			return isNullIsZero;
		}
		/**
		 * @param isNullIsZero the isNullIsZero to set
		 */
		public void setNullIsZero(boolean isNullIsZero) {
			this.isNullIsZero = isNullIsZero;
		}
		/**
		 * @return the isanimation
		 */
		public boolean isIsanimation() {
			return isanimation;
		}
		/**
		 * @param isanimation the isanimation to set
		 */
		public void setIsanimation(boolean isanimation) {
			this.isanimation = isanimation;
		}
		/**
		 * @return the animationtime
		 */
		public int getAnimationtime() {
			return animationtime;
		}
		/**
		 * @param animationtime the animationtime to set
		 */
		public void setAnimationtime(int animationtime) {
			this.animationtime = animationtime;
		}
		public boolean isIslinearea() {
			return islinearea;
		}
		public void setIslinearea(boolean islinearea) {
			this.islinearea = islinearea;
		}
		public int getTimestamp_term() {
			return timestamp_term;
		}
		public void setTimestamp_term(int timestamp_term) {
			this.timestamp_term = timestamp_term;
		}
		public String getTimestamp_interval() {
			return timestamp_interval;
		}
		public void setTimestamp_interval(String timestamp_interval) {
			this.timestamp_interval = timestamp_interval;
		}
		public DataOrderType getXalign() {
			return xalign;
		}
		public void setXalign(DataOrderType xalign) {
			this.xalign = xalign;
		}
		public boolean isStatisticalView() {
			return isStatisticalView;
		}
		public void setStatisticalView(boolean isStatisticalView) {
			this.isStatisticalView = isStatisticalView;
		}
		public StatisticalType[] getStatisticalValueTypeMulti() {
			return statisticalValueTypeMulti;
		}
		public void setStatisticalValueTypeMulti(StatisticalType[] statisticalValueTypeMulti) {
			this.statisticalValueTypeMulti = statisticalValueTypeMulti;
		}
		public String getColorexpression() {
			return colorexpression;
		}
		public void setColorexpression(String colorexpression) {
			this.colorexpression = colorexpression;
		}
		public String getXexpression() {
			return xexpression;
		}
		public void setXexpression(String xexpression) {
			this.xexpression = xexpression;
		}
		public String getYexpression() {
			return yexpression;
		}
		public void setYexpression(String yexpression) {
			this.yexpression = yexpression;
		}		
}
