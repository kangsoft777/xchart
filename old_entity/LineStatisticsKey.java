package com.hbee.honeybee.entity;

import java.io.Serializable;

public class LineStatisticsKey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1069656625430384303L;

	final static public Short NULL_VALUE = -1;
	
	private short colorby = NULL_VALUE;
	private short shapeby = NULL_VALUE;
	private short sizeby = NULL_VALUE;
	

	public LineStatisticsKey() {
		// TODO Auto-generated constructor stub
	}


	public LineStatisticsKey(short colorby, short shapeby, short sizeby) {
		this.colorby = colorby;
		this.shapeby = shapeby;
		this.sizeby = sizeby;
	}

	/** 
	 * {@inheritDoc}
	 * <pre>
	 * 
	 * </pre>
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int result = 17;
		  result = 31 * result + colorby;
		  result = 31 * result + shapeby;
		  result = 31 * result + sizeby;
		  return result;
	}


	/** 
	 * {@inheritDoc}
	 * <pre>
	 * 
	 * </pre>
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object o) {
		// TODO Auto-generated method stub
		if (o == this) {
		      return true;
	    }
	    if (!(o instanceof LineStatisticsKey)) {
	      return false;
	    }
	    LineStatisticsKey pn = (LineStatisticsKey) o;
	    boolean result = (pn.colorby == colorby && pn.shapeby == shapeby && pn.sizeby == sizeby);
	    return result;
	}
	
	/**
	 * @return the colorby
	 */
	public short getColorby() {
		return colorby;
	}


	/**
	 * @param colorby the colorby to set
	 */
	public void setColorby(short colorby) {
		this.colorby = colorby;
	}


	/**
	 * @return the shapeby
	 */
	public short getShapeby() {
		return shapeby;
	}


	/**
	 * @param shapeby the shapeby to set
	 */
	public void setShapeby(short shapeby) {
		this.shapeby = shapeby;
	}


	/**
	 * @return the sizeby
	 */
	public short getSizeby() {
		return sizeby;
	}


	/**
	 * @param sizeby the sizeby to set
	 */
	public void setSizeby(short sizeby) {
		this.sizeby = sizeby;
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
		return "LineStatisticsKey [colorby=" + colorby + ", shapeby=" + shapeby
				+ ", sizeby=" + sizeby + "]";
	}
	
	

	

}
