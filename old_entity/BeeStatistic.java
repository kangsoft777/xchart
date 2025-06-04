package com.hbee.honeybee.entity;

import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hbee.honeybee.legend.BoxPlotSeries;

public class BeeStatistic {
	public double getCorrcoef(double[] a, double[] b) {
		double amean = Arrays.stream(a).average().orElse(Double.NaN);
		double bmean = Arrays.stream(b).average().orElse(Double.NaN);

		double top_stat = 0;
		for (int i = 0; i < a.length; i++) {
			top_stat += a[i] * b[i];
		}
		top_stat = top_stat - (a.length * amean * bmean);

		double adot = 0;
		double bdot = 0;
		for (int i = 0; i < a.length; i++) {
			adot += a[i] * a[i];
			bdot += b[i] * b[i];
		}
		double down_stat1 = Math.sqrt(adot - a.length * Math.pow(amean, 2));
		double down_stat2 = Math.sqrt(bdot - b.length * Math.pow(bmean, 2));
		double coef = top_stat / (down_stat1 * down_stat2);

		return coef;
	}

	public HashMap<String, Double> getProcess(double[] dvalue, double standard,
			double error_value) {
		double usl = standard + error_value;
		double lsl = standard - error_value;
		double mean = Arrays.stream(dvalue).average().orElse(Double.NaN);
		double stdDev = getStdDev(dvalue);
		double cp = (usl - lsl) / 6 * stdDev;
		double cpk = (usl - mean) / 3 * stdDev;

		double[] value = new double[] { 0.3, 0.31, 0.32, 0.33, 0.34, 0.35,
				0.36, 0.37, 0.38, 0.39, 0.4, 0.41, 0.42, 0.43, 0.44, 0.45,
				0.46, 0.47, 0.48, 0.49, 0.5, 0.51, 0.52, 0.53, 0.54, 0.55,
				0.56, 0.57, 0.58, 0.59, 0.6, 0.61, 0.62, 0.63, 0.64, 0.65,
				0.66, 0.67, 0.68, 0.69, 0.7, 0.71, 0.72, 0.73, 0.74, 0.75,
				0.76, 0.77, 0.78, 0.79, 0.8, 0.81, 0.82, 0.83, 0.84, 0.85,
				0.86, 0.87, 0.88, 0.89, 0.9, 0.91, 0.92, 0.93, 0.94, 0.95,
				0.96, 0.97, 0.98, 0.99, 1., 1.01, 1.02, 1.03, 1.04, 1.05, 1.06,
				1.07, 1.08, 1.09, 1.1, 1.11, 1.12, 1.13, 1.14, 1.15, 1.16,
				1.17, 1.18, 1.19, 1.2, 1.21, 1.22, 1.23, 1.24, 1.25, 1.26,
				1.27, 1.28, 1.29, 1.3, 1.31, 1.32, 1.33, 1.34, 1.35, 1.36,
				1.37, 1.38, 1.39, 1.4, 1.41, 1.42, 1.43, 1.44, 1.45, 1.46,
				1.47, 1.48, 1.49, 1.5, 1.51, 1.52, 1.53, 1.54, 1.55, 1.56,
				1.57, 1.58, 1.59, 1.6, 1.61, 1.62, 1.63, 1.64, 1.65 };
		double[] ppm = new double[] { 184060, 176186, 168528, 161087, 153864,
				146859, 140071, 133499, 127143, 121000, 115070, 109348, 103835,
				98525, 93417, 88508, 83793, 79270, 74934, 70781, 66807, 63008,
				59380, 55917, 52616, 49471, 46479, 43633, 40930, 38364, 35930,
				33625, 31443, 29378, 27429, 25588, 23852, 22216, 20675, 19226,
				17865, 16586, 15386, 14262, 13209, 12225, 11304, 10444, 9642,
				8894, 8198, 7549, 6947, 6387, 5868, 5386, 4940, 4527, 4145,
				3792, 3467, 3167, 2890, 2635, 2401, 2186, 1988, 1807, 1641,
				1489, 1350, 1223, 1107, 1001, 904, 816, 726, 664, 598, 538,
				483, 434, 390, 350, 313, 280, 251, 240, 200, 179, 159, 142,
				126, 112, 100, 89, 79, 70, 62, 55, 48, 43, 38, 33, 29, 26, 23,
				17, 15, 13, 12, 10, 9, 8, 7, 6, 5, 5, 4, 3, 3, 3, 2, 2, 2, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 0, 0 };

		double ppmvalue = 0;
		int index = Arrays.asList(value).indexOf(Math.round(cpk * 100) / 100.0);
		if (index != -1)
			ppmvalue = ppm[index];
		HashMap<String, Double> map = new HashMap<String, Double>();

		map.put("cp", cp);
		map.put("cpk", cpk);
		map.put("ppm", ppmvalue);
		return map;
	}

	private double SafeDivide(double value1, double value2) {
		double ret = 0;

		if ((value1 == 0) || (value2 == 0)) {
			return ret;
		}
		ret = value1 / value2;

		return ret;
	}

	private double[] getVarStdDev(double[] value) {
		double ret = 0;
		double totalVariance = 0;

		double avg = Arrays.stream(value).average().orElse(Double.NaN);
		int max = 0;

		max = value.length;
		if (max == 0) {
			return new double[] {0,0};
		}
		for (int i = 0; i < max; i++) {
			totalVariance += Math.pow(value[i] - avg, 2);
		}
		double stdDev = Math.sqrt(SafeDivide(totalVariance, max));
		return new double[] {totalVariance,stdDev};
	}
	
	private double getStdDev(double[] value) {
		double ret = 0;
		double totalVariance = 0;

		double avg = Arrays.stream(value).average().orElse(Double.NaN);
		int max = 0;

		max = value.length;
		if (max == 0) {
			return ret;
		}
		for (int i = 0; i < max; i++) {
			totalVariance += Math.pow(value[i] - avg, 2);
		}
		return Math.sqrt(SafeDivide(totalVariance, max));
	}
	
	private double getStdDev(List<Double> value) {
		return getStdDev(getArray(value));
	}

	private double[] getArray(List<Double> value){
		double[] dvalue = new double[value.size()];
		for(int i=0;i<value.size();i++)
		dvalue[i] = value.get(i);
		return dvalue;
	}
	
	private double gammln(double xx) {
		double x, y, tmp, ser;
		x = y = tmp = ser = 0.0;

		final double[] cof = { 76.18009172947146, -86.50532032941677,
				24.01409824083091, -1.231739572450155, 0.1208650973866179e-2,
				-0.5395239384953e-5 };
		int j;
		y = x = xx;
		tmp = x + 5.5;
		tmp -= (x + 0.5) * Math.log(tmp);
		ser = 1.000000000190015;
		for (j = 0; j <= 5; j++) {
			ser += cof[j] / ++y;
		}

		return -tmp + Math.log(2.5066282746310005 * ser / x);
	}

	private double gamma(double x) {
		return Math.exp(gammln(x));
	}

	private double lgamma(double x) {
		double dvalue = Math.log(gamma(x));
		return dvalue;
	}

	private double inCompbeta(double a, double b, double x) {
		if (x == 0)
			return 0;
		else if (x == 1)
			return 1;
		else {
			double lbeta = lgamma(a + b) - lgamma(a) - lgamma(b) + a
					* Math.log(x) + b * Math.log(1 - x);
			if (x < (a + 1) / (a + b + 2))
				return Math.exp(lbeta) * contfractbeta(a, b, x) / a;
			else
				return 1 - Math.exp(lbeta) * contfractbeta(b, a, 1 - x) / b;
		}
	}

	private double contfractbeta(double a, double b, double x) {
		int ITMAX = 200;
		return contfractbeta(a, b, x, ITMAX);
	}

	private double contfractbeta(double a, double b, double x, int ITMAX) {
		double EPS = 3 * Math.pow(10, -7);
		double bm = 1.0, az = 1.0, am = 1.0;
		double qab = a + b;
		double qap = a + 1.0;
		double qam = a - 1.0;
		double bz = 1.0 - qab * x / qap;

		for (int i = 0; i < ITMAX; i++) {
			float em = (i + 1);
			float tem = em + em;
			double d = em * (b - em) * x / ((qam + tem) * (a + tem));
			double ap = az + d * am;
			double bp = bz + d * bm;
			d = -(a + em) * (qab + em) * x / ((qap + tem) * (a + tem));
			double app = ap + d * az;
			double bpp = bp + d * bz;
			double aold = az;
			am = ap / bpp;
			bm = bp / bpp;
			az = app / bpp;
			bz = 1.0;
			if (Math.abs(az - aold) < (EPS * Math.abs(az)))
				return az;
		}
		return Double.NaN;
	}

	private double getAvg(List<Double> value) {
		double dvalue = 0;
		for (int i = 0; i < value.size(); i++) {
			dvalue += value.get(i);
		}
		return dvalue / value.size();
	}

	public HashMap<String, Double> getAnova(short[] valueby, short[] indepby,
			double[] value) {
		return getAnova(valueby, indepby, value, false);
	}

	public HashMap<String, Double> getAnova(short[] valueby, short[] indepby,double[] value, boolean isinteraction) {
		HashMap<String, Double> returnvalue = new HashMap<String, Double>();
		HashMap<Short, List<Double>> map = new HashMap<Short, List<Double>>();
		List<Short> deplist = new ArrayList<Short>();
		List<Double> list = null;
		short key = 0;
		double sum = 0;
		for (int i = 0; i < indepby.length; i++) {
			key = indepby[i];
			Object objmap = map.get(indepby[i]);
			if (objmap == null) {
				List<Double> temp = new ArrayList<Double>();
				map.put(indepby[i], temp);
				list = temp;
			}
			else 
				list = (List<Double>)objmap;
			sum += value[i];
			list.add(value[i]);
			if(!deplist.contains(valueby[i]))
				deplist.add(valueby[i]);
		}

		int icount = deplist.size();
		double total_mean = sum / value.length;
		switch (icount) {
		case 1:
			double between_groups = 0;
			double within_groups = 0;
			for (Map.Entry<Short, List<Double>> series : map.entrySet()) {
				list = series.getValue();
				double part_mean = getAvg(list);
				double part_sstr = list.size() * Math.pow(part_mean - total_mean, 2);
				double part_sse = 0;
				for (int i = 0; i < list.size(); i++) {
					part_sse += Math.pow(list.get(i) - part_mean, 2);
				}

				between_groups += part_sstr;
				within_groups += part_sse;
			}

			
			double sst = between_groups + within_groups;
			double b_df = map.size() - 1;
			double w_df = value.length - map.size();
			double t_df = b_df + w_df;

			double mstr = between_groups / b_df;
			double mse = within_groups / w_df;
			double f_value = mstr / mse;
			double p_value = 1 - inCompbeta(0.5 * b_df, 0.5 * w_df, b_df
					* f_value / (b_df * f_value + w_df));

			returnvalue.put("F-value", f_value);
			returnvalue.put("P-value", p_value);
			break;
		default:
			if (isinteraction) {
				returnvalue.put(getTwoWayAnova(sum, valueby, indepby, value),
						0d);
			} else {
				returnvalue.put(
						getTwoWayAnovaNotInte(total_mean, valueby, indepby,
								value), 0d);
			}
			break;
		}
		return returnvalue;
	}

	private String getTwoWayAnovaNotInte(double total_mean, short[] value1,
			short[] value2, double[] value) {
		List<Double> list = null;

		double a_between_groups = 0;
		double b_between_groups = 0;
		double within_groups = 0;
		int asize = 0;
		int bsize = 0;

		HashMap<String, Double> returnvalue = new HashMap<String, Double>();
		HashMap<Short, List<Double>> amap = new HashMap<Short, List<Double>>();
		HashMap<Short, List<Double>> bmap = new HashMap<Short, List<Double>>();

		short key = 0;
		for (int i = 0; i < value1.length; i++) {
			key = value1[i];
			Object objmap = amap.get(key);
			if (objmap == null) {
				List<Double> temp = new ArrayList<Double>();
				amap.put(key, temp);
				list = temp;
			}
			list = amap.get(key);
			list.add(value[i]);
		}

		for (int i = 0; i < value2.length; i++) {
			key = value2[i];
			Object objmap = bmap.get(key);
			if (objmap == null) {
				List<Double> temp = new ArrayList<Double>();
				bmap.put(key, temp);
				list = temp;
			}
			list = bmap.get(key);
			list.add(value[i]);
		}

		for (Map.Entry<Short, List<Double>> series : amap.entrySet()) {
			list = series.getValue();
			double a_part_mean = getAvg(list);
			double part_ssa = bmap.size()
					* Math.pow(a_part_mean - total_mean, 2);
			a_between_groups += part_ssa;
		}

		for (Map.Entry<Short, List<Double>> series : bmap.entrySet()) {
			list = series.getValue();
			double b_part_mean = getAvg(list);
			double part_ssb = amap.size()
					* Math.pow(b_part_mean - total_mean, 2);
			b_between_groups += part_ssb;
		}

		double sst = 0;
		for (int i = 0; i < value.length; i++) {
			sst += Math.pow(value[i] - total_mean, 2);
		}
		within_groups = sst - a_between_groups - b_between_groups;
		double a_df = amap.size() - 1;
		double b_df = bmap.size() - 1;
		double w_df = a_df * b_df;
		double t_df = amap.size() * bmap.size() - 1;

		double msa = a_between_groups / a_df;
		double msb = b_between_groups / b_df;
		double mse = within_groups / w_df;
		double af_value = msa / mse;
		double bf_value = msb / mse;
		double ap_value = 1 - inCompbeta(0.5 * a_df, 0.5 * w_df, a_df
				* af_value / (a_df * af_value + w_df));
		double bp_value = 1 - inCompbeta(0.5 * b_df, 0.5 * w_df, b_df
				* bf_value / (b_df * bf_value + w_df));

		return "";
	}

	private String getTwoWayAnova(double sum, short[] value1, short[] value2,
			double[] value) {
		List<Double> list = null;

		double a_between_groups = 0;
		double b_between_groups = 0;
		double within_groups = 0;
		int asize = 0;
		int bsize = 0;

		HashMap<String, Double> returnvalue = new HashMap<String, Double>();
		HashMap<Short, List<Double>> amap = new HashMap<Short, List<Double>>();
		HashMap<Short, List<Double>> bmap = new HashMap<Short, List<Double>>();

		int rownumber = value.length;
		short key = 0;
		for (int i = 0; i < value1.length; i++) {
			key = value1[i];
			Object objmap = amap.get(key);
			if (objmap == null) {
				List<Double> temp = new ArrayList<Double>();
				amap.put(key, temp);
				list = temp;
			}
			else
				list = (List<Double>)objmap;
			list.add(value[i]);
		}

		for (int i = 0; i < value2.length; i++) {
			key = value2[i];
			Object objmap = bmap.get(key);
			if (objmap == null) {
				List<Double> temp = new ArrayList<Double>();
				bmap.put(key, temp);
				list = temp;
			}
			else 
				list = (List<Double>)objmap;
			list.add(value[i]);
		}

		for (Map.Entry<Short, List<Double>> series : amap.entrySet()) {
			list = series.getValue();
			double a_part_mean = getAvg(list);
			double part_ssa = bmap.size() * Math.pow(a_part_mean - sum, 2);
			a_between_groups += part_ssa;
		}

		for (Map.Entry<Short, List<Double>> series : bmap.entrySet()) {
			list = series.getValue();
			double b_part_mean = getAvg(list);
			double part_ssb = amap.size() * Math.pow(b_part_mean - sum, 2);
			b_between_groups += part_ssb;
		}

		double sst = 0;
		for (int i = 0; i < value.length; i++) {
			sst += Math.pow(value[i] - sum, 2);
		}
		within_groups = sst - a_between_groups - b_between_groups;
		double a_df = amap.size() - 1;
		double b_df = bmap.size() - 1;
		double w_df = a_df * b_df;
		double t_df = amap.size() * bmap.size() - 1;

		double msa = a_between_groups / a_df;
		double msb = b_between_groups / b_df;
		double mse = within_groups / w_df;
		double af_value = msa / mse;
		double bf_value = msb / mse;
		double ap_value = 1 - inCompbeta(0.5 * a_df, 0.5 * w_df, a_df
				* af_value / (a_df * af_value + w_df));
		double bp_value = 1 - inCompbeta(0.5 * b_df, 0.5 * w_df, b_df
				* bf_value / (b_df * bf_value + w_df));

		return "";
	}
	
	public List<LegendStatistical> getStatistical(String[] legend, short[] legendby, double[] value,short[] spby, double[] ucl, double[] lcl){
		List<LegendStatistical> statisticalList = new ArrayList<LegendStatistical>();
		HashMap<Short,List<Double>> map = new HashMap<Short, List<Double>>();
		HashMap<Short,double[]> spmap = new HashMap<Short, double[]>();
		List<Double> list = null;
		Short key = 0;
		for(int i=0;i<value.length;i++){
			key = legendby[i];
			Object obj = map.get(key);
			if(obj == null){
				List<Double> dvalues = new ArrayList<Double>();
				map.put(key, dvalues);
				list = dvalues;
			}
			else 
				list = (List<Double>)obj;
			list.add(value[i]);
		}
		
		for(int i=0;i<spby.length;i++){
			key = spby[i];
			Object obj = map.get(key);
			if(obj == null){
				double[] dvalues = new double[] {ucl[i],lcl[i]};
				spmap.put(key, dvalues);
			}
		}
		
		for (Map.Entry<Short, List<Double>> series : map.entrySet()) {
			list = series.getValue();
			LegendStatistical statistical = new LegendStatistical();
			
			double[] dvalues = getArray(series.getValue());
			int count = dvalues.length;
			double sum = 0;
			double avg = 0;
			double min = Double.MAX_VALUE;
			double max = Double.MIN_VALUE;
			double var = 0;
			double stddev = 0;
			double[] vals = getVarStdDev(dvalues);
			var = vals[0];
			stddev = vals[1];
			for(int i=0;i<count;i++){
				count++;
				min = Math.min(min, dvalues[i]);
				max = Math.max(max, dvalues[i]);
				sum += dvalues[i];
			}
			avg = sum/count;
			statistical.setCount(count);
			statistical.setMin(min);
			statistical.setMax(max);
			statistical.setLegend(legend[series.getKey()]);
			statistical.setStddev(stddev);
			statistical.setVar(var);
			if(spby != null && spby.length > 0 && spmap.containsKey(key)){
				double pp = (spmap.get(key)[0] - spmap.get(key)[1])/(6*stddev);
				double ppk = (spmap.get(key)[0] - avg)/(3 * stddev);
				statistical.setPp(pp);
				statistical.setPp(ppk);
			}else{
				statistical.setPp(Double.NaN);
				statistical.setPp(Double.NaN);
			}
			statisticalList.add(statistical);
		}
		return statisticalList;
	}

	public List<AnovaStatistical> getAnovaStatistical(String[] legend, short[] legendby, String[] dependency, short[] dependencyby, double[] value, double standardvalue){
		List<AnovaStatistical> statisticalList = new ArrayList<AnovaStatistical>();
		
		return statisticalList;
	}
	
	public double[] getTrendLine(double[] x, double[] y){
		double[] values = new double[2];
		double xmean = Arrays.stream(x).average().orElse(Double.NaN);
		double ymean = Arrays.stream(y).average().orElse(Double.NaN);
		double a = 0;
		double b = 0;
		double dvalue1 = 0;
		double dvalue2 = 0;
		for(int i=0;i<x.length;i++){
			dvalue1 += (x[i] - xmean) * (y[i] - ymean);
			dvalue2 += Math.pow((x[i] - xmean),2);
		}
		a = dvalue1/dvalue2;
		b = ymean - a * xmean;
		values = new double[] {a,b};
		return values;
	}
	
	public double[] getTrendLine2(double[] x, double[] y){
		double[] values = new double[2];
		return values;
	}
}
