package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.AxisType;

public class ChangeMinMax implements Cloneable {
	private boolean isinitialize = true;
	private boolean isChanged = false;
	private boolean isXChanged = false;
	private boolean isYChanged = false;
	private boolean isY2Changed = false;
	private boolean isApplyMode = false;
	private double minXValue = 0;
	private double maxXValue = 0;
	private double multiminXValue = 0;
	private double multimaxXValue = 100;
	private double minYValue = 0;
	private double maxYValue = 0;
	private double minY2Value = 0;
	private double maxY2Value = 0;
	private short minXShort = 0;
	private short maxXShort = 0;
	private short minYShort = 0;
	private short maxYShort = 0;
	
	private double startXValue = 0;
	private double startYValue = 0;
	private double startY2Value = 0;
	
	private int xpoint = 0;
	private int ypoint = 0;
	private int x2point = 0;
	private int y2point = 0;
	private double[] preratio = null;
	private double statusratio = 1;
	private double[] movexpoint = null;
	private double[] moveypoint = null;
	private double[] movex2point = null;
	private double[] movey2point = null;
		
	public ChangeMinMax() {
		
	}
	
	public ChangeMinMax(boolean isinitialize, boolean isChanged,
			boolean isXChanged, boolean isYChanged, boolean isY2Changed,
			boolean isApplyMode, double minXValue, double maxXValue,
			double multiminXValue, double multimaxXValue, double minYValue,
			double maxYValue, double minY2Value, double maxY2Value,
			short minXShort, short maxXShort, short minYShort, short maxYShort) {
		super();
		this.isinitialize = isinitialize;
		this.isChanged = isChanged;
		this.isXChanged = isXChanged;
		this.isYChanged = isYChanged;
		this.isY2Changed = isY2Changed;
		this.isApplyMode = isApplyMode;
		this.minXValue = minXValue;
		this.maxXValue = maxXValue;
		this.multiminXValue = multiminXValue;
		this.multimaxXValue = multimaxXValue;
		this.minYValue = minYValue;
		this.maxYValue = maxYValue;
		this.minY2Value = minY2Value;
		this.maxY2Value = maxY2Value;
		this.minXShort = minXShort;
		this.maxXShort = maxXShort;
		this.minYShort = minYShort;
		this.maxYShort = maxYShort;
	}
	public synchronized ChangeMinMax cloneObject() {
		return new ChangeMinMax(isinitialize, isChanged, isXChanged,
				isYChanged, isY2Changed, isApplyMode, minXValue, maxXValue,
				multiminXValue, multimaxXValue, minYValue, maxYValue,
				minY2Value, maxY2Value, minXShort, maxXShort, minYShort,
				maxYShort);
		
	}
	public boolean isIsinitialize() {
		return isinitialize;
	}

	public void setIsinitialize(boolean isinitialize) {
		this.isinitialize = isinitialize;
	}

	public boolean getChanged() {
		return isXChanged || isYChanged || isChanged;
	}

	public void setChanged(boolean isChanged) {
		this.isChanged = isChanged;
	}

	public boolean isXChanged() {
		return isXChanged;
	}

	public void setXChanged(boolean isXChanged) {
		this.isXChanged = isXChanged;
	}

	public boolean isYChanged() {
		return isYChanged;
	}

	public void setYChanged(boolean isYChanged) {
		this.isYChanged = isYChanged;
	}

	public boolean isY2Changed() {
		return isY2Changed;
	}

	public void setY2Changed(boolean isY2Changed) {
		this.isY2Changed = isY2Changed;
	}

	public double getMinXValue() {
		return minXValue;
	}

	public void setMinXValue(double minXValue) {
		this.minXValue = minXValue;
	}

	public double getMaxXValue() {
		return maxXValue;
	}

	public void setMaxXValue(double maxXValue) {
		this.maxXValue = maxXValue;
	}

	public double getMultiminXValue() {
		return multiminXValue;
	}

	public void setMultiminXValue(double multiminXValue) {
		this.multiminXValue = multiminXValue;
	}

	public double getMultimaxXValue() {
		return multimaxXValue;
	}

	public void setMultimaxXValue(double multimaxXValue) {
		this.multimaxXValue = multimaxXValue;
	}

	public double getMinYValue() {
		return minYValue;
	}

	public void setMinYValue(double minYValue) {
		this.minYValue = minYValue;
	}

	public double getMaxYValue() {
		return maxYValue;
	}

	public void setMaxYValue(double maxYValue) {
		this.maxYValue = maxYValue;
	}

	public double getMinY2Value() {
		return minY2Value;
	}

	public void setMinY2Value(double minY2Value) {
		this.minY2Value = minY2Value;
	}

	public double getMaxY2Value() {
		return maxY2Value;
	}

	public void setMaxY2Value(double maxY2Value) {
		this.maxY2Value = maxY2Value;
	}

	public short getMinXShort() {
		return minXShort;
	}

	public void setMinXShort(short minXShort) {
		this.minXShort = minXShort;
	}

	public short getMaxXShort() {
		return maxXShort;
	}

	public void setMaxXShort(short maxXShort) {
		this.maxXShort = maxXShort;
	}

	public short getMinYShort() {
		return minYShort;
	}

	public void setMinYShort(short minYShort) {
		this.minYShort = minYShort;
	}

	public short getMaxYShort() {
		return maxYShort;
	}

	public void setMaxYShort(short maxYShort) {
		this.maxYShort = maxYShort;
	}

	public int getXpoint() {
		return xpoint;
	}

	public void setXpoint(int xpoint) {
		this.xpoint = xpoint;
	}

	public int getYpoint() {
		return ypoint;
	}

	public void setYpoint(int ypoint) {
		this.ypoint = ypoint;
	}

	public int getX2point() {
		return x2point;
	}

	public void setX2point(int x2point) {
		this.x2point = x2point;
	}

	public int getY2point() {
		return y2point;
	}

	public void setY2point(int y2point) {
		this.y2point = y2point;
	}

	public double[] getPreratio() {
		return preratio;
	}

	public void setPreratio(double[] preratio) {
		this.preratio = preratio;
	}

	public double getStatusratio() {
		return statusratio;
	}

	public void setStatusratio(double statusratio) {
		this.statusratio = statusratio;
	}

	public double[] getMovexpoint() {
		return movexpoint;
	}

	public void setMovexpoint(double[] movexpoint) {
		this.movexpoint = movexpoint;
	}

	public double[] getMoveypoint() {
		return moveypoint;
	}

	public void setMoveypoint(double[] moveypoint) {
		this.moveypoint = moveypoint;
	}

	public double[] getMovex2point() {
		return movex2point;
	}

	public void setMovex2point(double[] movex2point) {
		this.movex2point = movex2point;
	}

	public double[] getMovey2point() {
		return movey2point;
	}

	public void setMovey2point(double[] movey2point) {
		this.movey2point = movey2point;
	}
	
	public double getStartXValue() {
		return startXValue;
	}

	public void setStartXValue(double startXValue) {
		this.startXValue = startXValue;
	}

	public double getStartYValue() {
		return startYValue;
	}

	public void setStartYValue(double startYValue) {
		this.startYValue = startYValue;
	}

	public double getStartY2Value() {
		return startY2Value;
	}

	public void setStartY2Value(double startY2Value) {
		this.startY2Value = startY2Value;
	}

	public void setValueBinding(boolean ischange, boolean ismultiaxis,
			boolean isxmode, boolean isymode, boolean isy2mode,
			double minxValue, double maxxValue, double minyValue,
			double maxyValue, double miny2Value, double maxy2Value) {

		this.isinitialize = false;
		this.isXChanged = ischange;
		this.isYChanged = ischange;
		this.isChanged = ischange;

		if (isxmode) {
			if (ismultiaxis) {
				this.multiminXValue = minxValue;
				this.multimaxXValue = maxxValue;
			} else {
				this.minXValue = minxValue;
				this.maxXValue = maxxValue;
			}
		}
		if (isymode) {
			this.minYValue = minyValue;
			this.maxYValue = maxyValue;
		}
		if (isy2mode) {
			this.minY2Value = miny2Value;
			this.maxY2Value = maxy2Value;
		}
		
		if(minxValue == Double.POSITIVE_INFINITY || minxValue == Double.NEGATIVE_INFINITY){
			minxValue = 0;
		}
		
		if(maxxValue == Double.POSITIVE_INFINITY || maxxValue == Double.NEGATIVE_INFINITY){
			maxxValue = 0;
		}
		
		if(minyValue == Double.POSITIVE_INFINITY || minyValue == Double.NEGATIVE_INFINITY){
			minyValue = 0;
		}
		
		if(maxyValue == Double.POSITIVE_INFINITY || maxyValue == Double.NEGATIVE_INFINITY){
			maxyValue = 0;
		}
	}

	public Double[] getRangeValue(int index, AxisType axisType,
			boolean ismultiaxis) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		Double[] values = new Double[2];
		switch (axisType) {
		case Left:
			values[0] = (double) minYValue;
			values[1] = (double) maxYValue;
			break;
		case Right:
			values[0] = (double) minY2Value;
			values[1] = (double) maxY2Value;
			break;
		case Bottom:
			values[0] = (double) minXValue;
			values[1] = (double) maxXValue;
			break;
		}
		return values;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * <pre>
	 * 
	 * </pre>
	 * 
	 * @see java.lang.Object#clone()
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
