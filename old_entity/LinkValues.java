package com.hbee.honeybee.entity;

import java.awt.Color;
import java.awt.Image;
import java.util.Map;

import com.hbee.honeybee.enumeration.AxisType;
import com.hbee.honeybee.enumeration.TypeSeries;

public class LinkValues {
	private boolean iscolorby = false;
	private boolean isshapeby = false;
	private boolean issizeby = false;
	private TypeSeries typeSeries = TypeSeries.Time;
	private String heatmapAggregation = "Avg";
	
	private String title = "";
	private Double[] dXValue = null;
	private Double[] dYValue = null;
	private Double[] dY2Value = null;
	private Integer[] count = null;
	private Short[] pXValue = null;
	private Short[] pYValue = null;
	private Short[] pY2Value = null;
	private Short[] containValue = null;
	private Integer[] markerValue = null;
	private Short[] colorValue = null;
	private Short[] shapeValue = null;
	private Short[] sizeValue = null;
	private Short[] groupValue = null;
	private Short[] focusValue = null;
	private Integer[] seriesIndexer = null;
	private Integer[][] seriesValues = null;
	private Integer[][] matrixPointer = null;
	private Short[][] serieslinesX = null;
	private Short[][] serieslinesY = null;
	private Integer[] serieslinesIndexer = null;
	private Short[] toolValue = null;
	private Long[] indexer = null;

	private String[] xmember = null;
	private String[] ymember = null;

	private String[] markerText = null;
	private String[] colorText = null;
	private String[] shapeText = null;
	private String[] sizeText = null;
	private String[] toolText = null;

	private String[] boxValue = null;
	private String[][] seriesToolValue = null;
	private String[] controlLimit = null;
	private String[] pointLabel = null;
	private int[] dduplicate = null;

	private Double[] sizearray = null;
	private float orMinXValue = 0;
	private float orMaxXValue = 0;
	private Float[] orMinXValues = null;
	private Float[] orMaxXValues = null;
	private float orMinYValue = 0;
	private float orMaxYValue = 0;
	private float orMinY2Value = 0;
	private float orMaxY2Value = 0;
	private float minXValue = 0;
	private float maxXValue = 0;
	private Float[] minXValues = null;
	private Float[] maxXValues = null;
	private float minYValue = 0;
	private float maxYValue = 0;
	private float minY2Value = 0;
	private float maxY2Value = 0;
	private String chartRect = "";
	private String getImageRectangle = "";

	private Short[] orPXValue = null;
	private Short[] oPYValue = null;
	private Short[] orColorValue = null;
	private String[] orPointLabel = null;
	private String orChartRect = "";

	private int[] colors = null;
	private int[] darkcolors = null;
	
	private int[] subcolors = null;
	private int[] subdarkcolors = null;
	
	private boolean isColorBy = false;
	private boolean iIsShpaeBy = false;
	private boolean isSizeBy = false;
	private boolean isToggle = false;
	private Image baseImage = null;
	private double iPercent = 0;
	private int width = 0;
	private int height = 0;
	private int legendSize = 0;	
	private boolean isSplitMode = false;
	private int thumbnailWidth = 0;
	private int thumbnailHeight = 0;
	private int xcellsize = 1;
	private int ycellsize = 1;

	private boolean isresgressionline = false;
	private Map<Integer, Double> regression1 = null;
	private Map<Integer, Double> regression2 = null;
	private Map<Integer, Double> regression3 = null;
	private Map<Integer, Integer> regression4 = null;
	private Map<Integer, Double> avgx = null;
	private Map<Integer, Double> avgy = null;
	private Map<Integer, Double> stdDevx = null;
	private Map<Integer, Double> stdDevy = null;
	private Map<Integer, Double[]> regressionlinexvalues = null;
	private Map<Integer, Double[]> regressionlineyvalues = null;
	private Map<Integer, Integer[]> regressionrectsx = null;
	private Map<Integer, Integer[]> regressionrectsy = null;
	
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
	
	private boolean islegnedsinglecolor = false;
	private int singlecolor = Color.gray.getRGB();
	private String[] focusparameter = null;
	private int[] focuscolors = null;
	private int startcolor = Color.red.getRGB();
	private int endcolor = Color.blue.getRGB();
	
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

	public TypeSeries getTypeSeries() {
		return typeSeries;
	}

	public void setTypeSeries(TypeSeries typeSeries) {
		this.typeSeries = typeSeries;
	}

	public String getHeatmapAggregation() {
		return heatmapAggregation;
	}

	public void setHeatmapAggregation(String heatmapAggregation) {
		this.heatmapAggregation = heatmapAggregation;
	}

	public boolean isIsresgressionline() {
		return isresgressionline;
	}

	public void setIsresgressionline(boolean isresgressionline) {
		this.isresgressionline = isresgressionline;
	}

	public boolean isIscolorby() {
		return iscolorby;
	}

	public void setIscolorby(boolean iscolorby) {
		this.iscolorby = iscolorby;
	}

	public boolean isIsshapeby() {
		return isshapeby;
	}

	public void setIsshapeby(boolean isshapeby) {
		this.isshapeby = isshapeby;
	}

	public boolean isIssizeby() {
		return issizeby;
	}

	public void setIssizeby(boolean issizeby) {
		this.issizeby = issizeby;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public Short[] getContainValue() {
		return containValue;
	}

	public void setContainValue(Short[] containValue) {
		this.containValue = containValue;
	}

	public Integer[] getMarkerValue() {
		return markerValue;
	}

	public void setMarkerValue(Integer[] markerValue) {
		this.markerValue = markerValue;
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
	
	public Short[] getGroupValue() {
		return groupValue;
	}

	public void setGroupValue(Short[] groupValue) {
		this.groupValue = groupValue;
	}

	public Short[] getFocusValue() {
		return focusValue;
	}

	public void setFocusValue(Short[] focusValue) {
		this.focusValue = focusValue;
	}

	public Integer[] getSeriesIndexer() {
		return seriesIndexer;
	}

	public void setSeriesIndexer(Integer[] seriesIndexer) {
		this.seriesIndexer = seriesIndexer;
	}

	public Integer[][] getSeriesValues() {
		return seriesValues;
	}

	public void setSeriesValues(Integer[][] seriesValues) {
		this.seriesValues = seriesValues;
	}

	public Integer[][] getMatrixPointer() {
		return matrixPointer;
	}

	public void setMatrixPointer(Integer[][] matrixPointer) {
		this.matrixPointer = matrixPointer;
	}

	public Short[][] getSerieslinesX() {
		return serieslinesX;
	}

	public void setSerieslinesX(Short[][] serieslinesX) {
		this.serieslinesX = serieslinesX;
	}

	public Short[][] getSerieslinesY() {
		return serieslinesY;
	}

	public void setSerieslinesY(Short[][] serieslinesY) {
		this.serieslinesY = serieslinesY;
	}

	public Integer[] getSerieslinesIndexer() {
		return serieslinesIndexer;
	}

	public void setSerieslinesIndexer(Integer[] serieslinesIndexer) {
		this.serieslinesIndexer = serieslinesIndexer;
	}

	public Short[] getToolValue() {
		return toolValue;
	}

	public void setToolValue(Short[] toolValue) {
		this.toolValue = toolValue;
	}

	public Long[] getIndexer() {
		return indexer;
	}

	public void setIndexer(Long[] indexer) {
		this.indexer = indexer;
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

	public String[] getToolText() {
		return toolText;
	}

	public void setToolText(String[] toolText) {
		this.toolText = toolText;
	}

	public String[] getBoxValue() {
		return boxValue;
	}

	public void setBoxValue(String[] boxValue) {
		this.boxValue = boxValue;
	}
	
	public Double[] getSizearray() {
		return sizearray;
	}

	public void setSizearray(Double[] sizearray) {
		this.sizearray = sizearray;
	}

	public String[][] getSeriesToolValue() {
		return seriesToolValue;
	}

	public void setSeriesToolValue(String[][] seriesToolValue) {
		this.seriesToolValue = seriesToolValue;
	}

	public String[] getControlLimit() {
		return controlLimit;
	}

	public void setControlLimit(String[] controlLimit) {
		this.controlLimit = controlLimit;
	}

	public String[] getPointLabel() {
		return pointLabel;
	}

	public void setPointLabel(String[] pointLabel) {
		this.pointLabel = pointLabel;
	}

	public float getOrMinXValue() {
		return orMinXValue;
	}

	public void setOrMinXValue(float orMinXValue) {
		this.orMinXValue = orMinXValue;
	}

	public float getOrMaxXValue() {
		return orMaxXValue;
	}

	public void setOrMaxXValue(float orMaxXValue) {
		this.orMaxXValue = orMaxXValue;
	}

	public Float[] getOrMinXValues() {
		return orMinXValues;
	}

	public void setOrMinXValues(Float[] orMinXValues) {
		this.orMinXValues = orMinXValues;
	}

	public Float[] getOrMaxXValues() {
		return orMaxXValues;
	}

	public void setOrMaxXValues(Float[] orMaxXValues) {
		this.orMaxXValues = orMaxXValues;
	}

	public float getOrMinYValue() {
		return orMinYValue;
	}

	public void setOrMinYValue(float orMinYValue) {
		this.orMinYValue = orMinYValue;
	}

	public float getOrMaxYValue() {
		return orMaxYValue;
	}

	public void setOrMaxYValue(float orMaxYValue) {
		this.orMaxYValue = orMaxYValue;
	}

	public float getOrMinY2Value() {
		return orMinY2Value;
	}

	public void setOrMinY2Value(float orMinY2Value) {
		this.orMinY2Value = orMinY2Value;
	}

	public float getOrMaxY2Value() {
		return orMaxY2Value;
	}

	public void setOrMaxY2Value(float orMaxY2Value) {
		this.orMaxY2Value = orMaxY2Value;
	}

	public float getMinXValue() {
		return minXValue;
	}

	public void setMinXValue(float minXValue) {
		this.minXValue = minXValue;
	}

	public float getMaxXValue() {
		return maxXValue;
	}

	public void setMaxXValue(float maxXValue) {
		this.maxXValue = maxXValue;
	}

	public Float[] getMinXValues() {
		return minXValues;
	}

	public void setMinXValues(Float[] minXValues) {
		this.minXValues = minXValues;
	}

	public Float[] getMaxXValues() {
		return maxXValues;
	}

	public void setMaxXValues(Float[] maxXValues) {
		this.maxXValues = maxXValues;
	}

	public float getMinYValue() {
		return minYValue;
	}

	public void setMinYValue(float minYValue) {
		this.minYValue = minYValue;
	}

	public float getMaxYValue() {
		return maxYValue;
	}

	public void setMaxYValue(float maxYValue) {
		this.maxYValue = maxYValue;
	}

	public float getMinY2Value() {
		return minY2Value;
	}

	public void setMinY2Value(float minY2Value) {
		this.minY2Value = minY2Value;
	}

	public float getMaxY2Value() {
		return maxY2Value;
	}

	public void setMaxY2Value(float maxY2Value) {
		this.maxY2Value = maxY2Value;
	}

	public String getChartRect() {
		return chartRect;
	}

	public void setChartRect(String chartRect) {
		this.chartRect = chartRect;
	}

	public String getGetImageRectangle() {
		return getImageRectangle;
	}

	public void setGetImageRectangle(String getImageRectangle) {
		this.getImageRectangle = getImageRectangle;
	}

	public Short[] getOrPXValue() {
		return orPXValue;
	}

	public void setOrPXValue(Short[] orPXValue) {
		this.orPXValue = orPXValue;
	}

	public Short[] getoPYValue() {
		return oPYValue;
	}

	public void setoPYValue(Short[] oPYValue) {
		this.oPYValue = oPYValue;
	}

	public Short[] getOrColorValue() {
		return orColorValue;
	}

	public void setOrColorValue(Short[] orColorValue) {
		this.orColorValue = orColorValue;
	}

	public String[] getOrPointLabel() {
		return orPointLabel;
	}

	public void setOrPointLabel(String[] orPointLabel) {
		this.orPointLabel = orPointLabel;
	}

	public int[] getDduplicate() {
		return dduplicate;
	}

	public void setDduplicate(int[] dduplicate) {
		this.dduplicate = dduplicate;
	}

	public String getOrChartRect() {
		return orChartRect;
	}

	public void setOrChartRect(String orChartRect) {
		this.orChartRect = orChartRect;
	}

	public boolean isColorBy() {
		return isColorBy;
	}

	public void setColorBy(boolean isColorBy) {
		this.isColorBy = isColorBy;
	}

	public boolean isiIsShpaeBy() {
		return iIsShpaeBy;
	}

	public void setiIsShpaeBy(boolean iIsShpaeBy) {
		this.iIsShpaeBy = iIsShpaeBy;
	}

	public boolean isSizeBy() {
		return isSizeBy;
	}

	public void setSizeBy(boolean isSizeBy) {
		this.isSizeBy = isSizeBy;
	}

	public boolean isToggle() {
		return isToggle;
	}

	public void setToggle(boolean isToggle) {
		this.isToggle = isToggle;
	}

	public Image getBaseImage() {
		return baseImage;
	}

	public void setBaseImage(Image baseImage) {
		this.baseImage = baseImage;
	}

	public double getiPercent() {
		return iPercent;
	}

	public void setiPercent(double iPercent) {
		this.iPercent = iPercent;
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

	public int getLegendSize() {
		return legendSize;
	}

	public void setLegendSize(int legendSize) {
		this.legendSize = legendSize;
	}

	public boolean isSplitMode() {
		return isSplitMode;
	}

	public void setSplitMode(boolean isSplitMode) {
		this.isSplitMode = isSplitMode;
	}

	public int getThumbnailWidth() {
		return thumbnailWidth;
	}

	public void setThumbnailWidth(int thumbnailWidth) {
		this.thumbnailWidth = thumbnailWidth;
	}

	public int getThumbnailHeight() {
		return thumbnailHeight;
	}

	public void setThumbnailHeight(int thumbnailHeight) {
		this.thumbnailHeight = thumbnailHeight;
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
	
	public int[] getSubcolors() {
		return subcolors;
	}

	public void setSubcolors(int[] subcolors) {
		this.subcolors = subcolors;
	}

	public int[] getSubdarkcolors() {
		return subdarkcolors;
	}

	public void setSubdarkcolors(int[] subdarkcolors) {
		this.subdarkcolors = subdarkcolors;
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

	public Double[] getRangeValue(int index, AxisType axisType) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		Double[] values = new Double[2];
		if (axisType == AxisType.Bottom) {
			if (this.minXValues != null && this.minXValues.length > index)
				min = minXValues[index];
			else if (this.orMinXValues != null)
				min = this.orMinXValues[index];
			if (this.maxXValues != null && this.maxXValues.length > index)
				max = this.maxXValues[index];
			else if (this.orMaxXValues != null)
				max = this.orMaxXValues[index];
		}
		values[0] = min;
		values[1] = max;
		return values;
	}
}
