package com.hbee.honeybee.entity;

public class AnovaStatistical {
	private String legend = "";
	private String dependency = "";
	private int count = 0;
	private double min = 0;
	private double max = 0;
	private double var = 0;
	private double stddev = 0;
	private double fvalue = 0;
	private double pvalue = 0;
	private String evaluation = "";
	
	public String getLegend() {
		return legend;
	}
	public void setLegend(String legend) {
		this.legend = legend;
	}
	public String getDependency() {
		return dependency;
	}
	public void setDependency(String dependency) {
		this.dependency = dependency;
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
	public double getFvalue() {
		return fvalue;
	}
	public void setFvalue(double fvalue) {
		this.fvalue = fvalue;
	}
	public double getPvalue() {
		return pvalue;
	}
	public void setPvalue(double pvalue) {
		this.pvalue = pvalue;
	}
	public String getEvaluation() {
		return evaluation;
	}
	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
	}
}
