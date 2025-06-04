package com.hbee.honeybee.entity;

import java.io.Serializable;

public class LegendStatistical  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4455781376744912230L;
	private String legend = "";
	private int count = 0;
	private double min = 0;
	private double max = 0;
	private double minx = 0;
	private double maxx = 0;
	private double var = 0;
	private double stddev = 0;
	private double pp = 0;
	private double ppk = 0;
	public String getLegend() {
		return legend;
	}
	public void setLegend(String legend) {
		this.legend = legend;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getMin() {
		return min;
	}
	public void setMin(double min) {
		this.min = min;
	}
	public double getMax() {
		return max;
	}
	public void setMax(double max) {
		this.max = max;
	}
	public double getVar() {
		return var;
	}
	public void setVar(double var) {
		this.var = var;
	}
	public double getStddev() {
		return stddev;
	}
	public void setStddev(double stddev) {
		this.stddev = stddev;
	}
	public double getPp() {
		return pp;
	}
	public void setPp(double pp) {
		this.pp = pp;
	}
	public double getPpk() {
		return ppk;
	}
	public void setPpk(double ppk) {
		this.ppk = ppk;
	}
	public double getMinx() {
		return minx;
	}
	public void setMinx(double minx) {
		this.minx = minx;
	}
	public double getMaxx() {
		return maxx;
	}
	public void setMaxx(double maxx) {
		this.maxx = maxx;
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
		return "LegendStatistical [legend=" + legend + ", count=" + count
				+ ", min=" + min + ", max=" + max + ", minx=" + minx
				+ ", maxx=" + maxx + ", var=" + var + ", stddev=" + stddev
				+ ", pp=" + pp + ", ppk=" + ppk + "]";
	}	
	
	
}
