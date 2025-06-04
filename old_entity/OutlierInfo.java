package com.hbee.honeybee.entity;

import java.io.Serializable;

public class OutlierInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5223503033986111105L;
	
	private double y1Avg=0.0;
	private double y1Stddev=0.0;
	private double y1Q1=0.0;
	private double y1Q3=0.0;
	
	private long outlierCount = 0;
	
	private double y2Avg=0.0;
	private double y2Stddev=0.0;
	private double y2Q1=0.0;
	private double y2Q3=0.0;
	public double getY1Avg() {
		return y1Avg;
	}
	public void setY1Avg(double y1Avg) {
		this.y1Avg = y1Avg;
	}
	public double getY1Stddev() {
		return y1Stddev;
	}
	public void setY1Stddev(double y1Stddev) {
		this.y1Stddev = y1Stddev;
	}
	public double getY1Q1() {
		return y1Q1;
	}
	public void setY1Q1(double y1q1) {
		y1Q1 = y1q1;
	}
	public double getY1Q3() {
		return y1Q3;
	}
	public void setY1Q3(double y1q3) {
		y1Q3 = y1q3;
	}
	public double getY2Avg() {
		return y2Avg;
	}
	public void setY2Avg(double y2Avg) {
		this.y2Avg = y2Avg;
	}
	public double getY2Stddev() {
		return y2Stddev;
	}
	public void setY2Stddev(double y2Stddev) {
		this.y2Stddev = y2Stddev;
	}
	public double getY2Q1() {
		return y2Q1;
	}
	public void setY2Q1(double y2q1) {
		y2Q1 = y2q1;
	}
	public double getY2Q3() {
		return y2Q3;
	}
	public void setY2Q3(double y2q3) {
		y2Q3 = y2q3;
	}
	
	
	public long getOutlierCount() {
		return outlierCount;
	}
	public void setOutlierCount(long outlierCount) {
		this.outlierCount = outlierCount;
	}
	@Override
	public String toString() {
		return "OutlierInfo [y1Avg=" + y1Avg + ", y1Stddev=" + y1Stddev + ", y1Q1=" + y1Q1 + ", y1Q3=" + y1Q3
				+ ", outlierCount=" + outlierCount + ", y2Avg=" + y2Avg + ", y2Stddev=" + y2Stddev + ", y2Q1=" + y2Q1
				+ ", y2Q3=" + y2Q3 + "]";
	}


}
