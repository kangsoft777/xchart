package com.hbee.honeybee.entity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Statistical {
	private boolean roundMode = true;
	private int iformatType = 0;

	private boolean isdoublemode = false;
	private boolean bsort = false;
	private boolean bstdev = false;
	private boolean bavg = false;
	private boolean bsum = false;
	private boolean bmin = false;
	private boolean bmax = false;
	private boolean bmedian = false;
	private boolean bq0 = false;
	private boolean bq1 = false;
	private boolean bq2 = false;
	private boolean bq3 = false;
	private boolean bq4 = false;
	private float whiskerLength = 1.5f;
	private int intformat = 5;

	private boolean roundmode = true;
	private double[] darray = null;
	private Object min = null;
	private Object max = null;
	private Object sum = null;
	private Object avg = null;
	private Object stdev = null;
	private Object median = null;
	private Object qWhiskerMin = null;
	private Object qWhiskerMax = null;
	private Object q0 = null;
	private Object q1 = null;
	private Object q2 = null;
	private Object q3 = null;
	private Object q4 = null;
	private Object sIGMA = null;

	public boolean isRoundmode() {
		return roundmode;
	}

	public void setRoundmode(boolean roundmode) {
		this.roundmode = roundmode;
	}

	public double[] getDarray() {
		return darray;
	}

	public void setDarray(double[] darray) {
		this.darray = darray;
		isdoublemode = true;
		ValueInitialize();
	}

	public boolean isRoundMode() {
		return roundMode;
	}

	public int getIformatType() {
		return iformatType;
	}

	public Object getMin() {
		if(min == null) {
			if(darray == null)
				return Double.NaN;
			min = Arrays.stream(darray).min().getAsDouble();
		}
		return min;
	}

	public int getCount() {
		if(this.darray != null)
			return this.darray.length;
		else
			return 0;
	}
	
	public Object getMax() {
		if(max == null) {
			if(darray == null)
				return Double.NaN;
			max = Arrays.stream(darray).max().getAsDouble();
		}
		return max;
	}

	public Object getSum() {
		if(sum == null) {
			if(darray == null)
				return Double.NaN;
			sum = Arrays.stream(darray).sum();
		}
		return sum;
	}

	public Object getAvg() {
		if(avg == null) {
			if(darray == null)
				return Double.NaN;
			avg = Arrays.stream(darray).average().orElse(Double.NaN);
		}
		return avg;
	}

	public Object getStdev() {
		if(stdev == null)
			stdev = getStdDev();
		return stdev;
	}

	public Object getMedian() {
		if(median == null)
			median = percentile(0.5);
		return median;
	}

	public Object getqWhiskerMin() {
		if(qWhiskerMin == null)
			qWhiskerMin = getWhisker(0);
		return qWhiskerMin;
	}

	public Object getqWhiskerMax() {
		if(qWhiskerMax == null)
			qWhiskerMax = getWhisker(1);
		return qWhiskerMax;
	}

	public Object getQ0() {
		if(q0 == null)
			Quartile(0);
		return q0;
	}

	public Object getQ1() {
		if(q1 == null)
			Quartile(1);
		return q1;
	}

	public Object getQ2() {
		if(q2 == null)
			Quartile(2);
		return q2;
	}

	public Object getQ3() {
		if(q3 == null)
			Quartile(3);
		return q3;
	}

	public Object getQ4() {
		if(q4 == null)
			Quartile(4);
		return q4;
	}

	public Object getsIGMA() {
		return sIGMA;
	}

	private void ValueInitialize() {
		bsort = false;
		bstdev = false;
		bavg = false;
		bsum = false;
		bmin = false;
		bmax = false;
		bmedian = false;
		bq0 = false;
		bq1 = false;
		bq2 = false;
		bq3 = false;
		bq4 = false;

		stdev = null;
		avg = null;
		sum = null;
		min = null;
		max = null;
		median = null;

		q0 = null;
		q1 = null;
		q2 = null;
		q3 = null;
		q4 = null;
	}

	public Object getStdDev() {
		if(darray == null)
			return Double.NaN;
		double ret = 0;
		double totalVariance = 0;

		double avg = Arrays.stream(darray).average().orElse(Double.NaN);
		int max = 0;

		max = this.darray.length;
		if (max == 0) {
			return ret;
		}
		for (int i = 0; i < max; i++) {
			totalVariance += Math.pow(darray[i] - avg, 2);
		}
		stdev = Math.sqrt(SafeDivide(totalVariance, max));
		return stdev;
	}

	public void setSort(boolean issort) {
		bsort = issort;
	}

	public Object Quartile(int ival) {
		switch (ival) {
		case 0:
			if (!bq0) {
				q0 = percentile(0.0);
				bq0 = true;
			}
			return q0;
		case 1:
			if (!bq1) {
				q1 = percentile(0.25);
				bq1 = true;
			}
			return q1;
		case 2:
			if (!bq2) {
				q2 = percentile(0.5);
				bq2 = true;
			}
			return q2;
		case 3:
			if (!bq3) {
				q3 = percentile(0.75);
				bq3 = true;
			}
			return q3;
		case 4:
			if (!bq4) {
				q4 = percentile(1.0);
				bq4 = true;
			}
			return q4;
		default:
			return null;
		}
	}

	public Object getWhisker(int itype) {
		whiskerLength = 1.5f;
		double dvalue = 0.0f;

		Object q1 = getQ1();
		Object q3 = getQ3();

		if (q1 == null || q1.equals(Double.NaN) || q3 == null
				|| q3.equals(Double.NaN))
			return Double.NaN;

		if (q1.equals(Double.NaN) || q3.equals(Double.NaN))
			return Double.NaN;

		boolean isexist = false;
		if (itype == 0) {
			dvalue = Double.valueOf(q1.toString())
					- whiskerLength
					* (Double.valueOf(q3.toString()) - Double.valueOf(q1
							.toString()));
			for (int i = 0; i < darray.length; i++) {
				if (dvalue < darray[i]) {
					dvalue = darray[i];
					isexist = true;
					break;
				}
			}
		} else {
			dvalue = Double.valueOf(q3.toString())
					+ whiskerLength
					* (Double.valueOf(q3.toString()) - Double.valueOf(q1
							.toString()));
			for (int i = darray.length - 1; i > 0; i--) {
				if (dvalue > darray[i]) {
					dvalue = darray[i];
					isexist = true;
					break;
				}
			}
		}

		return dvalue;
	}

	public double[] getQuartile() {
		double[] darray = new double[5];

		if (!bq0) {
			q0 = percentile(0.0);
			bq0 = true;
		}
		darray[0] = (double) q0;

		if (!bq1) {
			q1 = percentile(0.25);
			bq1 = true;
		}
		darray[1] = (double) q1;

		if (!bq2) {
			q2 = percentile(0.5);
			bq2 = true;
		}
		darray[2] = (double) q2;

		if (!bq3) {
			q3 = percentile(0.75);
			bq3 = true;
		}
		darray[3] = (double) q3;

		if (!bq4) {
			q4 = percentile(1.0);
			bq4 = true;
		}
		darray[4] = (double) q4;

		if (roundmode) {
			for (int i = 0; i < darray.length; i++) {
				darray[i] = (double) (Object) darray[i];
			}
			return darray;
		} else
			return darray;
	}

	public Object percentile(double n) {
		double dval = 0.0f;

		if (!bsort)
			DataSort();

		if (n > 1)
			n = n / 100;

		if (n == 0.0) {
			return darray[0];
		}
		if (n == 1.0) {
			dval = darray[darray.length - 1];
			return dval; // Math.Round(Convert.ToDouble(dval), _intformat);
		}
		double d = Double.NaN;
		d = n * (darray.length - 1);
		int index = (int) Math.floor(d);
		int num3 = (int) Math.ceil(d);
		if (index == num3) {
			dval = darray[index];
			return dval; // Math.Round(Convert.ToDouble(dval), _intformat);
		}

		dval = (darray[index] + ((d - index) * (darray[num3] - darray[index])));
		return dval;
	}

	public int[] IPercentile(double n, int icnt) {
		int[] iarray = new int[3];
		if (n > 1)
			n = n / 100;

		if (n == 0.0) {
			iarray[0] = 0;
			return iarray;
		}
		if (n == 1.0) {
			iarray[0] = icnt - 1;
			return iarray;
		}
		double d = n * (icnt - 1);
		int index = (int) Math.floor(d);
		int num3 = (int) Math.ceil(d);
		if (index == num3) {
			iarray[0] = index;
			return iarray;
		}

		iarray[0] = index;
		iarray[1] = (int) d;
		iarray[2] = num3;
		return iarray;
	}

	private void DataSort() {
		if (bsort)
			return;

		if (darray.length == 0) {
			min = Double.NaN;
			max = Double.NaN;
		} else {
			Arrays.sort(darray);
			min = darray[0];
			max = darray[darray.length - 1];
		}

		bmin = true;
		bmax = true;
		bsort = true;
	}

	private double SafeDivide(double value1, double value2) {
		double ret = 0;

		if ((value1 == 0) || (value2 == 0)) {
			return ret;
		}
		ret = value1 / value2;

		return ret;
	}

	public Object SetRound(Object oValue) {
		if (oValue == null || oValue.equals(Double.NaN))
			return oValue;

		if (!roundmode)
			return oValue;
		else {
			if (oValue.toString().toUpperCase().contentEquals("E")) {
				return oValue;
			} else {
				if (oValue.equals(Double.NaN))
					return Math.round(Double.valueOf(oValue.toString()));
				else
					return oValue;
			}
		}
	}
}
