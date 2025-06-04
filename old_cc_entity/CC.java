package com.hbee.honeybee.cc_entity;

import java.awt.Color;
import java.io.Serializable;

public class CC implements Serializable {
	/**
		 * 
		 */
	private static final long serialVersionUID = -3440095012456389779L;
	private int chartwidth = 0;
	private int chartheight = 0;
	private CC_title title = new CC_title();
	private CC_title subtitle = new CC_title();

	private int[] visualrect = null;
	private CC_axis leftaxis = new CC_axis();
	private CC_axis rightaxis = new CC_axis();
	private CC_axis bottomaxis = new CC_axis();
	private CC_axis topaxis = new CC_axis();
	private CC_pointlabel pointlabel = new CC_pointlabel();
	private CC_controllimit controllimit = new CC_controllimit();
	private CC_focus focus = new CC_focus();
	private CC_focus[] multifocus = null;
	private CC_referenceline[] referenceline = null;
	
	private int[] margins = new int[] {1,1,1,};
	private int pointFillMode = 0; // 0 : Both, 1 : Fill , 2 : Border
	private int pointBorderwidth = 1;
	private int pointtransparency = 0;
	
	private int shapeFillMode = 0; // 0 : Both, 1 : Fill , 2 : Border
	private int shapeBorderwidth = 1;
	private int shapetransparency = 0;
			
	private int backcolor = Color.white.getRGB();
	private int opacity = 100;
	private boolean backgradient = false;
	private int pointsize = 8;
	private int linewidth = 1;
	private int linecolor = Color.white.getRGB();
	private int pointcolor = Color.white.getRGB();
	private boolean pointgradient = false;
	private boolean point3d = false;
	private int edge_round = 0;
	private int fixedbarsize = 0;

	private boolean ishorizontal = false;
	
	private String[] statisticaltitle = null;
	private int[] statisticaltitlex = null;
	private int[] statisticaltitley = null;

	private String[] statisticaltext = null;
	private int[] statisticalx = null;
	private int[] statisticaly = null;

	/**
	 * @return the chartwidth
	 */
	public int getChartwidth() {
		return chartwidth;
	}

	/**
	 * @param chartwidth the chartwidth to set
	 */
	public void setChartwidth(int chartwidth) {
		this.chartwidth = chartwidth;
	}

	/**
	 * @return the chartheight
	 */
	public int getChartheight() {
		return chartheight;
	}

	/**
	 * @param chartheight the chartheight to set
	 */
	public void setChartheight(int chartheight) {
		this.chartheight = chartheight;
	}

	/**
	 * @return the title
	 */
	public CC_title getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(CC_title title) {
		this.title = title;
	}

	/**
	 * @return the subtitle
	 */
	public CC_title getSubtitle() {
		return subtitle;
	}

	/**
	 * @param subtitle the subtitle to set
	 */
	public void setSubtitle(CC_title subtitle) {
		this.subtitle = subtitle;
	}

	/**
	 * @return the visualrect
	 */
	public int[] getVisualrect() {
		return visualrect;
	}

	/**
	 * @param visualrect the visualrect to set
	 */
	public void setVisualrect(int[] visualrect) {
		this.visualrect = visualrect;
	}

	/**
	 * @return the leftaxis
	 */
	public CC_axis getLeftaxis() {
		return leftaxis;
	}

	/**
	 * @param leftaxis the leftaxis to set
	 */
	public void setLeftaxis(CC_axis leftaxis) {
		this.leftaxis = leftaxis;
	}

	/**
	 * @return the rightaxis
	 */
	public CC_axis getRightaxis() {
		return rightaxis;
	}

	/**
	 * @param rightaxis the rightaxis to set
	 */
	public void setRightaxis(CC_axis rightaxis) {
		this.rightaxis = rightaxis;
	}

	/**
	 * @return the bottomaxis
	 */
	public CC_axis getBottomaxis() {
		return bottomaxis;
	}

	/**
	 * @param bottomaxis the bottomaxis to set
	 */
	public void setBottomaxis(CC_axis bottomaxis) {
		this.bottomaxis = bottomaxis;
	}

	/**
	 * @return the topaxis
	 */
	public CC_axis getTopaxis() {
		return topaxis;
	}

	/**
	 * @param topaxis the topaxis to set
	 */
	public void setTopaxis(CC_axis topaxis) {
		this.topaxis = topaxis;
	}
	
	public CC_pointlabel getPointlabel() {
		return pointlabel;
	}

	public void setPointlabel(CC_pointlabel pointlabel) {
		this.pointlabel = pointlabel;
	}

	public CC_controllimit getControllimit() {
		return controllimit;
	}

	public void setControllimit(CC_controllimit controllimit) {
		this.controllimit = controllimit;
	}

	public int getPointFillMode() {
		return pointFillMode;
	}

	public void setPointFillMode(int pointFillMode) {
		this.pointFillMode = pointFillMode;
	}

	public int getPointBorderwidth() {
		return pointBorderwidth;
	}

	public void setPointBorderwidth(int pointBorderwidth) {
		this.pointBorderwidth = pointBorderwidth;
	}

	public int getPointtransparency() {
		return pointtransparency;
	}

	public void setPointtransparency(int pointtransparency) {
		this.pointtransparency = pointtransparency;
	}
	
	/**
	 * @return the shapeFillMode
	 */
	public int getShapeFillMode() {
		return shapeFillMode;
	}

	/**
	 * @param shapeFillMode the shapeFillMode to set
	 */
	public void setShapeFillMode(int shapeFillMode) {
		this.shapeFillMode = shapeFillMode;
	}
	
	public int getShapeBorderwidth() {
		return shapeBorderwidth;
	}

	public void setShapeBorderwidth(int shapeBorderwidth) {
		this.shapeBorderwidth = shapeBorderwidth;
	}
	
	public int getShapetransparency() {
		return shapetransparency;
	}

	public void setShapetransparency(int shapetransparency) {
		this.shapetransparency = shapetransparency;
	}

	public int[] getMargins() {
		return margins;
	}

	public void setMargins(int[] margins) {
		this.margins = margins;
	}

	/**
	 * @return the backcolor
	 */
	public int getBackcolor() {
		return backcolor;
	}

	/**
	 * @param backcolor the backcolor to set
	 */
	public void setBackcolor(int backcolor) {
		this.backcolor = backcolor;
	}

	public int getOpacity() {
		return opacity;
	}

	public void setOpacity(int opacity) {
		this.opacity = opacity;
	}

	/**
	 * @return the backgradient
	 */
	public boolean isBackgradient() {
		return backgradient;
	}

	/**
	 * @param backgradient the backgradient to set
	 */
	public void setBackgradient(boolean backgradient) {
		this.backgradient = backgradient;
	}

	/**
	 * @return the pointsize
	 */
	public int getPointsize() {
		return pointsize;
	}

	/**
	 * @param pointsize the pointsize to set
	 */
	public void setPointsize(int pointsize) {
		this.pointsize = pointsize;
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

	/**
	 * @return the pointgradient
	 */
	public boolean isPointgradient() {
		return pointgradient;
	}

	/**
	 * @param pointgradient the pointgradient to set
	 */
	public void setPointgradient(boolean pointgradient) {
		this.pointgradient = pointgradient;
	}

	/**
	 * @return the point3d
	 */
	public boolean isPoint3d() {
		return point3d;
	}

	/**
	 * @param point3d the point3d to set
	 */
	public void setPoint3d(boolean point3d) {
		this.point3d = point3d;
	}

	/**
	 * @return the ishorizontal
	 */
	public boolean isIshorizontal() {
		return ishorizontal;
	}

	/**
	 * @param ishorizontal the ishorizontal to set
	 */
	public void setIshorizontal(boolean ishorizontal) {
		this.ishorizontal = ishorizontal;
	}

	public int getLinecolor() {
		return linecolor;
	}

	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}

	public int getPointcolor() {
		return pointcolor;
	}

	public void setPointcolor(int pointcolor) {
		this.pointcolor = pointcolor;
	}

	public int getEdge_round() {
		return edge_round;
	}

	public void setEdge_round(int edge_round) {
		this.edge_round = edge_round;
	}

	public int getFixedbarsize() {
		return fixedbarsize;
	}

	public void setFixedbarsize(int fixedbarsize) {
		this.fixedbarsize = fixedbarsize;
	}

	public String[] getStatisticaltitle() {
		return statisticaltitle;
	}
	
	public void setStatisticaltitle(String[] statisticaltitle) {
		this.statisticaltitle = statisticaltitle;
	}
	
	public int[] getStatisticaltitlex() {
		return statisticaltitlex;
	}
	
	public void setStatisticaltitlex(int[] statisticaltitlex) {
		this.statisticaltitlex = statisticaltitlex;
	}
	
	public int[] getStatisticaltitley() {
		return statisticaltitley;
	}
	
	public void setStatisticaltitley(int[] statisticaltitley) {
		this.statisticaltitley = statisticaltitley;
	}
	
	public String[] getStatisticaltext() {
		return statisticaltext;
	}
	
	public void setStatisticaltext(String[] statisticaltext) {
		this.statisticaltext = statisticaltext;
	}
	
	public int[] getStatisticalx() {
		return statisticalx;
	}
	
	public void setStatisticalx(int[] statisticalx) {
		this.statisticalx = statisticalx;
	}
	
	public int[] getStatisticaly() {
		return statisticaly;
	}
	
	public void setStatisticaly(int[] statisticaly) {
		this.statisticaly = statisticaly;
	}

	public CC_focus getFocus() {
		return focus;
	}

	public void setFocus(CC_focus focus) {
		this.focus = focus;
	}

	public CC_focus[] getMultifocus() {
		return multifocus;
	}

	public void setMultifocus(CC_focus[] multifocus) {
		this.multifocus = multifocus;
	}

	public CC_referenceline[] getReferenceline() {
		return referenceline;
	}

	public void setReferenceline(CC_referenceline[] referenceline) {
		this.referenceline = referenceline;
	}			
}
