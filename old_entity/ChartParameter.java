package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.BoxType;
import com.hbee.honeybee.enumeration.SeriesType;
import com.hbee.honeybee.enumeration.TypeSeries;

public class ChartParameter {
	public ChartParameter(){
		bottomAxis.getChartlabel().setAngle(90);
		rightAxis.getChartgrid().setIsvisible(false);
	}
	private SeriesType seriesType = SeriesType.Scatter;
	private SeriesType notebookseriesType = SeriesType.None;
	private SeriesType subseriesType = SeriesType.None;
	private TypeSeries typeSeries = TypeSeries.Time;
    private String name = "";
    private boolean isnotebook = false;
    private boolean galleryMode = true;
    private boolean ischangemode = false;
    private boolean isredrawmode = false;
    private boolean isaccpaint = true;
    private ChartConfig config = new ChartConfig();
    private ChartMember member = new ChartMember();
    private ChartTitle title = new ChartTitle();
    private ChartTitle subTitle = new ChartTitle();
    private ChartLegend legend = new ChartLegend();
    private ChartAxis leftAxis = new ChartAxis();
    private ChartAxis rightAxis = new ChartAxis();   
	private ChartAxis bottomAxis = new ChartAxis();
    private ChartPanelBox panel = new ChartPanelBox();
    private ChartPalette palette = new ChartPalette();
    private ChartShape chartshape = new ChartShape();
    private ChartPointSize pointSize = new ChartPointSize();
    private ChartControlLimit controlLimit = new ChartControlLimit();
    private PointLabel pointLabel = new PointLabel();
    private ChartSplit chartSplit = new ChartSplit();
    private ChartAnimation chartAnimation = new ChartAnimation();
    
    private ChangeColor[] changeColors = null;
    private ChangeShape[] changeShapes = null;
    private ChangeVisible[] changeVisibles = null;
    
    private boolean ischangeColorsBinding = false;
    private boolean ischangeShapesBinding = false;
    private boolean ischangeVisiblesBinding = false;
    
    private ChartFavorite[] chartfavorites = null;
    private ChartDefineColor[] chartdefinecolors = null;
    private ChangeMinMax statuschangeMinMax = null;
    private ChangeMinMax changeMinMax = new ChangeMinMax();
    private ChartScore chartScore = new ChartScore();
    private ChartPredict chartPredict = new ChartPredict();
    private ChartWafer chartWafer = new ChartWafer();
    private ChartTools chartTools = null;
    private ChartFontSize chartfontSize = new ChartFontSize(); 
    private EventLine[] eventLine = null;
    private ChartFocusParameter chartFocusParameter = new ChartFocusParameter();
    private ChartNewMinMax chartNewMinMax = new ChartNewMinMax();
    private ChartTooltip chartTooltip = new ChartTooltip();
    private ChartMinMax chartMinMax = new ChartMinMax();
    private ChartSelection chartselection = new ChartSelection();
    private ChartItemAlign chartLegendAlign = new ChartItemAlign();
    private ChartItemAlign chartXLabelAlign = new ChartItemAlign();
    private DynamicChartInfo[] dynamicChartinfo = null;
    private ChartMultiAxis chartMultiAxis = new ChartMultiAxis();
    private ChartStatistical chartStatistical = null;
    private SpotLight spotLight = new SpotLight();
    private ChartReference chartReference = new ChartReference();
    
	public ChartSelection getChartselection() {
		return chartselection;
	}
	public void setChartselection(ChartSelection chartselection) {
		this.chartselection = chartselection;
	}
	public ChartMinMax getChartMinMax() {
		return chartMinMax;
	}
	public void setChartMinMax(ChartMinMax chartMinMax) {
		this.chartMinMax = chartMinMax;
	}
	public ChartTooltip getChartTooltip() {
		return chartTooltip;
	}
	public void setChartTooltip(ChartTooltip chartTooltip) {
		this.chartTooltip = chartTooltip;
	}
	public ChartNewMinMax getChartNewMinMax() {
		return chartNewMinMax;
	}
	public void setChartNewMinMax(ChartNewMinMax chartNewMinMax) {
		this.chartNewMinMax = chartNewMinMax;
	}
	public ChartFocusParameter getChartFocusParameter() {
		return chartFocusParameter;
	}	
	public void setChartFocusParameter(ChartFocusParameter chartFocusParameter) {
		this.chartFocusParameter = chartFocusParameter;
	}
	public SeriesType getSeriesType() {
		return seriesType;
	}
	public void setSeriesType(SeriesType seriesType) {
		this.seriesType = seriesType;
	}
	public SeriesType getApplySeriesType() {
		if(seriesType == SeriesType.Bar) {
			if(this.chartshape != null && this.chartshape.getBarShapeType() != BoxType.Box) {
				if(this.chartshape.getBarShapeType() == BoxType.Line || this.chartshape.getBarShapeType() == BoxType.LinePoint)
					return SeriesType.Line;						
				else if(this.chartshape.getBarShapeType() == BoxType.Point)
					return SeriesType.Scatter;
			}
		}
		return seriesType;
	}
	public SeriesType getNotebookseriesType() {
		return notebookseriesType;
	}
	public void setNotebookseriesType(SeriesType notebookseriesType) {
		this.notebookseriesType = notebookseriesType;
	}	
	public boolean isIsnotebook() {
		return isnotebook;
	}
	public void setIsnotebook(boolean isnotebook) {
		this.isnotebook = isnotebook;
	}
	public SeriesType getSubseriesType() {
		return subseriesType;
	}	
	public void setSubseriesType(SeriesType subseriesType) {
		this.subseriesType = subseriesType;
	}	
	public TypeSeries getTypeSeries() {
		return typeSeries;
	}
	public void setTypeSeries(TypeSeries typeSeries) {
		this.typeSeries = typeSeries;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGalleryMode() {
		return galleryMode;
	}
	public void setGalleryMode(boolean galleryMode) {
		this.galleryMode = galleryMode;
	}
	public boolean isIschangemode() {
		return ischangemode;
	}
	public void setIschangemode(boolean ischangemode) {
		this.ischangemode = ischangemode;
	}	
	public boolean isIsredrawmode() {
		return isredrawmode;
	}
	public void setIsredrawmode(boolean isredrawmode) {
		this.isredrawmode = isredrawmode;
	}
	public ChartConfig getConfig() {
		return config;
	}
	public void setConfig(ChartConfig config) {
		this.config = config;
	}
	public ChartMember getMember() {
		return member;
	}
	public void setMember(ChartMember member) {
		this.member = member;
	}
	public ChartTitle getTitle() {
		return title;
	}
	public void setTitle(ChartTitle title) {
		this.title = title;
	}
	public ChartTitle getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(ChartTitle subTitle) {
		this.subTitle = subTitle;
	}
	public ChartLegend getLegend() {
		return legend;
	}
	public void setLegend(ChartLegend legend) {
		this.legend = legend;
	}
	public ChartAxis getLeftAxis() {
		return leftAxis;
	}
	public void setLeftAxis(ChartAxis leftAxis) {
		this.leftAxis = leftAxis;
	}
	public ChartAxis getRightAxis() {
		return rightAxis;
	}
	public void setRightAxis(ChartAxis rightAxis) {
		this.rightAxis = rightAxis;
	}
	public ChartAxis getBottomAxis() {
		return bottomAxis;
	}
	public void setBottomAxis(ChartAxis bottomAxis) {
		this.bottomAxis = bottomAxis;
	}
	public ChartPanelBox getPanel() {
		return panel;
	}
	public void setPanel(ChartPanelBox panel) {
		this.panel = panel;
	}
	public ChartPalette getPalette() {
		return palette;
	}
	public void setPalette(ChartPalette palette) {
		this.palette = palette;
	}
	public ChartShape getChartshape() {
		return chartshape;
	}
	public void setChartshape(ChartShape chartshape) {
		this.chartshape = chartshape;
	}
	public ChartPointSize getPointSize() {
		return pointSize;
	}
	public void setPointSize(ChartPointSize pointSize) {
		this.pointSize = pointSize;
	}
	public ChartControlLimit getControlLimit() {
		return controlLimit;
	}
	public void setControlLimit(ChartControlLimit controlLimit) {
		this.controlLimit = controlLimit;
	}
	public PointLabel getPointLabel() {
		return pointLabel;
	}
	public void setPointLabel(PointLabel pointLabel) {
		this.pointLabel = pointLabel;
	}
	public ChartSplit getChartSplit() {
		return chartSplit;
	}
	public void setChartSplit(ChartSplit chartSplit) {
		this.chartSplit = chartSplit;
	}	
	public ChartAnimation getChartAnimation() {
		return chartAnimation;
	}
	public void setChartAnimation(ChartAnimation chartAnimation) {
		this.chartAnimation = chartAnimation;
	}
	public ChangeColor[] getChangeColors() {
		return changeColors;
	}
	public void setChangeColors(ChangeColor[] changeColors) {
		this.changeColors = changeColors;
	}
	public ChangeShape[] getChangeShapes() {
		return changeShapes;
	}
	public void setChangeShapes(ChangeShape[] changeShapes) {
		this.changeShapes = changeShapes;
	}
	public ChangeVisible[] getChangeVisibles() {
		return changeVisibles;
	}
	public void setChangeVisibles(ChangeVisible[] changeVisibles) {
		this.changeVisibles = changeVisibles;
	}		
	public boolean isIschangeColorsBinding() {
		if(this.changeColors == null || this.changeColors.length == 0) return true;
		return ischangeColorsBinding;
	}
	public void setIschangeColorsBinding(boolean ischangeColorsBinding) {
		this.ischangeColorsBinding = ischangeColorsBinding;
	}
	public boolean isIschangeShapesBinding() {
		if(this.changeShapes == null || this.changeShapes.length == 0) return true;
		return ischangeShapesBinding;
	}
	public void setIschangeShapesBinding(boolean ischangeShapesBinding) {
		this.ischangeShapesBinding = ischangeShapesBinding;
	}
	public boolean isIschangeVisiblesBinding() {
		if(this.changeVisibles == null || this.changeVisibles.length == 0) return true;
		return ischangeVisiblesBinding;
	}
	public void setIschangeVisiblesBinding(boolean ischangeVisiblesBinding) {
		this.ischangeVisiblesBinding = ischangeVisiblesBinding;
	}
	public ChartFavorite[] getChartfavorites() {
		return chartfavorites;
	}
	public void setChartfavorites(ChartFavorite[] chartfavorites) {
		this.chartfavorites = chartfavorites;
	}	
	public ChartDefineColor[] getChartdefinecolors() {
		return chartdefinecolors;
	}
	public void setChartdefinecolors(ChartDefineColor[] chartdefinecolors) {
		this.chartdefinecolors = chartdefinecolors;
	}
	public ChangeMinMax getChangeMinMax() {
		return changeMinMax;
	}
	public void setChangeMinMax(ChangeMinMax changeMinMax) {
		this.changeMinMax = changeMinMax;
	}
	public ChangeMinMax getStatusChangeMinMax() {
		return statuschangeMinMax;
	}
	public void setStatusChangeMinMax(ChangeMinMax changeMinMax) {
		this.statuschangeMinMax = changeMinMax;
	}
	public ChartScore getChartScore() {
		return chartScore;
	}
	public void setChartScore(ChartScore chartScore) {
		this.chartScore = chartScore;
	}
	public ChartPredict getChartPredict() {
		return chartPredict;
	}
	public void setChartPredict(ChartPredict chartPredict) {
		this.chartPredict = chartPredict;
	}	
	public ChartWafer getChartWafer() {
		return chartWafer;
	}
	public void setChartWafer(ChartWafer chartWafer) {
		this.chartWafer = chartWafer;
	}	
	public ChartTools getChartTools() {
		return chartTools;
	}
	public void setChartTools(ChartTools chartTools) {
		this.chartTools = chartTools;
	}	
	public ChartFontSize getChartfontSize() {
		return chartfontSize;
	}
	public void setChartfontSize(ChartFontSize chartfontSize) {
		this.chartfontSize = chartfontSize;
	}	
	public EventLine[] getEventLine() {
		return eventLine;
	}
	public void setEventLine(EventLine[] eventLine) {
		this.eventLine = eventLine;
	}		
	/**
	 * @return the isaccpaint
	 */
	public boolean isIsaccpaint() {
		return isaccpaint;
	}
	/**
	 * @param isaccpaint the isaccpaint to set
	 */
		
	public void setIsaccpaint(boolean isaccpaint) {
		this.isaccpaint = isaccpaint;
	}	
	public ChartItemAlign getChartLegendAlign() {
		return chartLegendAlign;
	}
	public void setChartLegendAlign(ChartItemAlign chartLegendAlign) {
		this.chartLegendAlign = chartLegendAlign;
	}	
	public ChartItemAlign getChartXLabelAlign() {
		return chartXLabelAlign;
	}
	public void setChartXLabelAlign(ChartItemAlign chartXLabelAlign) {
		this.chartXLabelAlign = chartXLabelAlign;
	}	 
	public DynamicChartInfo[] getDynamicChartinfo() {
		return dynamicChartinfo;
	}
	public void setDynamicChartinfo(DynamicChartInfo[] dynamicChartinfo) {
		this.dynamicChartinfo = dynamicChartinfo;
	}	
	public ChartMultiAxis getChartMultiAxis() {
		return chartMultiAxis;
	}
	public void setChartMultiAxis(ChartMultiAxis chartMultiAxis) {
		this.chartMultiAxis = chartMultiAxis;
	}		
	public ChartStatistical getChartStatistical() {
		return chartStatistical;
	}
	public void setChartStatistical(ChartStatistical chartStatistical) {
		this.chartStatistical = chartStatistical;
	}		
	public SpotLight getSpotLight() {
		return spotLight;
	}
	public void setSpotLight(SpotLight spotLight) {
		this.spotLight = spotLight;
	}	
	public ChartReference getChartReference() {
		return chartReference;
	}
	public void setChartReference(ChartReference chartReference) {
		this.chartReference = chartReference;
	}
	@Override
	public String toString() {
		return "ChartParameter [seriesType=" + seriesType + ", name=" + name
				+ ", galleryMode=" + galleryMode + ", config=" + config
				+ ", member=" + member + ", title=" + title + ", subTitle="
				+ subTitle + ", legend=" + legend + ", leftAxis=" + leftAxis
				+ ", rigthAxis=" + rightAxis + ", bottomAxis=" + bottomAxis
				+ ", panel=" + panel + ", palette=" + palette + ", chartshape="
				+ chartshape + ", pointSize=" + pointSize + ", controlLimit="
				+ controlLimit + ", pointLabel=" + pointLabel
				+ ", chartSplit="
				+ chartSplit + "]";
	}
}
