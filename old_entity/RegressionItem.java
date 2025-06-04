package com.hbee.honeybee.entity;

import java.io.Serializable;

public class RegressionItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8982516210070112907L;
	
	private double avgx; 
	private double avgy;
	
	private double stddevPopX; 
	private double stddevPopy;

	public RegressionItem() {
		// TODO Auto-generated constructor stub
	}






	public RegressionItem(double avgx, double avgy, double stddevPopX,
			double stddevPopy) {
		super();
		this.avgx = avgx;
		this.avgy = avgy;
		this.stddevPopX = stddevPopX;
		this.stddevPopy = stddevPopy;
	}






	/**
	 * @return the avgx
	 */
	public double getAvgx() {
		return avgx;
	}



	/**
	 * @param avgx the avgx to set
	 */
	public void setAvgx(double avgx) {
		this.avgx = avgx;
	}



	/**
	 * @return the avgy
	 */
	public double getAvgy() {
		return avgy;
	}



	/**
	 * @param avgy the avgy to set
	 */
	public void setAvgy(double avgy) {
		this.avgy = avgy;
	}



	/**
	 * @return the stddevPopX
	 */
	public double getStddevPopX() {
		return stddevPopX;
	}



	/**
	 * @param stddevPopX the stddevPopX to set
	 */
	public void setStddevPopX(double stddevPopX) {
		this.stddevPopX = stddevPopX;
	}



	/**
	 * @return the stddevPopy
	 */
	public double getStddevPopY() {
		return stddevPopy;
	}


	/**
	 * @param stddevPopy the stddevPopy to set
	 */
	public void setStddevPopY(double stddevPopy) {
		this.stddevPopy = stddevPopy;
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
		return "RegressionItem [avgx=" + avgx + ", avgy=" + avgy
				+ ", stddevPopX=" + stddevPopX + ", stddevPopy=" + stddevPopy
				+ "]";
	}
}
