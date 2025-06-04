/**
 * 
 */
package com.hbee.honeybee.entity;

import java.io.Serializable;

/**
 * <pre>
 * 
 * </pre>
 *
 * @author HBee
 * @since  2018. 7. 6.
 */
public class ControlLimitKey implements Comparable<ControlLimitKey>,Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2533059026546126970L;
	private final Short axisgroupby;
	private final Double axisValue;
	private String eventTitle = "";

	/**
	 * <pre>
	 * 
	 * </pre>
	 *
	 */
	public ControlLimitKey(Short axisgroupby, Double axisValue) {
		// TODO Auto-generated constructor stub
		this.axisgroupby = axisgroupby;
		this.axisValue = axisValue;
	}
	
	public ControlLimitKey(Short axisgroupby, Double axisValue, String eventTitle) {
		// TODO Auto-generated constructor stub
		this.axisgroupby = axisgroupby;
		this.axisValue = axisValue;
		this.eventTitle = eventTitle;
	}
	
	



	/**
	 * @return the axisgroupby
	 */
	public Short getAxisgroupby() {
		return axisgroupby;
	}





	/**
	 * @return the axisValue
	 */
	public Double getAxisValue() {
		return axisValue;
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
        return (int)((axisgroupby << 16) + axisValue);
	}


	/** 
	 * {@inheritDoc}
	 * <pre>
	 * 
	 * </pre>
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object O) {
		if (!(O instanceof ControlLimitKey)) return false;
		if (((ControlLimitKey) O).axisgroupby == axisgroupby && 
				((ControlLimitKey) O).axisValue == axisValue) return true;
	    return false;
	}

	@Override
	public int compareTo(ControlLimitKey o) {
		
		// TODO Auto-generated method stub
		if (this.axisgroupby.shortValue() == o.getAxisgroupby().shortValue() && 
				this.axisValue.doubleValue() == o.getAxisValue().doubleValue()) return 0;
		else if (this.axisgroupby.shortValue() == o.getAxisgroupby().shortValue()) return this.axisValue.compareTo(o.getAxisValue());
		else return this.axisgroupby.compareTo(o.getAxisgroupby());
		//else return -1;
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
		return "ControlLimitKey [axisgroupby=" + axisgroupby + ", axisValue="
				+ axisValue + "]";
	}





	/**
	 * @return the eventTitle
	 */
	public String getEventTitle() {
		return eventTitle;
	}





	/**
	 * @param eventTitle the eventTitle to set
	 */
	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	

	
}
