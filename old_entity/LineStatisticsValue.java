package com.hbee.honeybee.entity;

import java.io.Serializable;

public class LineStatisticsValue implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3697569319569393807L;
	double stddev=0.0;
	double avarage=0.0;
	int totalCount = 0;

	public LineStatisticsValue() {
		// TODO Auto-generated constructor stub
	}

	public LineStatisticsValue(double stddev, int totalCount) {
		this.stddev = stddev;
		this.totalCount = totalCount;
	}
	
	public LineStatisticsValue(double stddev, double avarage, int totalCount) {
		this.stddev = stddev;
		this.avarage = avarage;
		this.totalCount = totalCount;
	}
	
	/**
	 * @return the stddev
	 */
	public double getStddev() {
		return stddev;
	}

	/**
	 * @param stddev the stddev to set
	 */
	public void setStddev(double stddev) {
		this.stddev = stddev;
	}

	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	

	/**
	 * @return the avarage
	 */
	public double getAvarage() {
		return avarage;
	}



	/**
	 * @param avarage the avarage to set
	 */
	public void setAvarage(double avarage) {
		this.avarage = avarage;
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
		return "LineStatisticsValue [stddev=" + stddev + ", avarage=" + avarage
				+ ", totalCount=" + totalCount + "]";
	}
}
