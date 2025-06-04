package com.hbee.honeybee.entity;

import java.lang.reflect.Array;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class CalStatistical {
	private Statistical statistical = new Statistical();
	public Object calCulate(String function, String[] parameter, Object value, int index) {		
		String valuetype = value.getClass().getSimpleName();
		Object returnvalue = null;
		if(function == null || function.equals("")) return value;
		if(value == null) return returnvalue;
		String[] svalues = null;
		double[] dvalues = null;
		int[] ivalues = null;
		int param = 1;
		Timestamp[] tvalues = null;		
		if(parameter != null && parameter.length > 0) {
			for(int i=0;i<parameter.length;i++) {
				if(parameter[i] == null || parameter[i].equals("")) continue;
				parameter[i] = parameter[i].replace("'", "");
				parameter[i] = parameter[i].replace("\"", "");
			}
		}
		switch(function.toLowerCase()) {
			case "index": returnvalue = index; break;
			case "abs": Math.abs(Double.valueOf(value.toString()));  break;
			case "avg": 
				if(value instanceof int[]){
					ivalues = (int[])value;					
					if(ivalues != null) {
						int ival = 0;
						for(int i=0;i<ivalues.length;i++)
							ival += ivalues[i];						
						returnvalue = ival / ivalues.length;
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;		
					double dval = 0;					
					for(int i=0;i<dvalues.length;i++)
						dval += dvalues[i];						
					returnvalue = dval / dvalues.length;
				}
				break;
			case "ceiling": 
				returnvalue = Math.ceil(Double.valueOf(value.toString()));
				break;
			case "contains":  break;
			case "cos": 
				returnvalue = Math.cos(Double.valueOf(value.toString()));
				break;
			case "sin":
				returnvalue = Math.sin(Double.valueOf(value.toString()));
				break;
			case "count": 
				returnvalue = 0;
				if(value instanceof int[]){
					ivalues = (int[])value;					
					if(ivalues != null) {
						returnvalue = ivalues.length;
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;					
					if(dvalues != null) 
						returnvalue = dvalues.length;
				}else if(value instanceof Timestamp[]){
					tvalues = (Timestamp[])value;
					if(tvalues != null)
						returnvalue = tvalues.length;
				}else {
					svalues = (String[])value;
					if(svalues != null)
						returnvalue = svalues.length;
				}
				break;
			case "split":  
				if(parameter.length > 1) {
					String[] splititem = value.toString().split(parameter[0]);
					int idx = Integer.valueOf(parameter[1].trim()) - 1;
					if(idx < 0) idx = 0;
					if(splititem.length <= idx)
						returnvalue = splititem[splititem.length - 1];						
					else 
						returnvalue = splititem[idx];
				}
				break;				
			case "today": 
				returnvalue = new Date().getTime();
				break;
			case "add_year": 
				int ayear = Integer.valueOf(parameter[0]);
				double ayvalue = (double)value;
				Calendar aydate = Calendar.getInstance();
				aydate.setTimeInMillis((long)ayvalue);		
				aydate.add(Calendar.YEAR, ayear);
				returnvalue = aydate.getTimeInMillis();				
				break;
			case "add_month": 
				int amonth = Integer.valueOf(parameter[0]);
				double amvalue = (double)value;
				Calendar amdate = Calendar.getInstance();
				amdate.setTimeInMillis((long)amvalue);		
				amdate.add(Calendar.MONTH, amonth);
				returnvalue = amdate.getTimeInMillis();			
				break;
			case "add_week":  
				int aweek = Integer.valueOf(parameter[0]);
				double awvalue = (double)value;
				Calendar awdate = Calendar.getInstance();
				awdate.setTimeInMillis((long)awvalue);		
				awdate.add(Calendar.WEDNESDAY, aweek);
				returnvalue = awdate.getTimeInMillis();			
				break;
			case "add_day":  
				int aday = Integer.valueOf(parameter[0]);
				double advalue = (double)value;
				Calendar addate = Calendar.getInstance();
				addate.setTimeInMillis((long)advalue);		
				addate.add(Calendar.DATE, aday);
				returnvalue = addate.getTimeInMillis();			
				break;
			case "add_hour":  
				int ahour = Integer.valueOf(parameter[0]);
				double ahvalue = (double)value;
				Calendar ahdate = Calendar.getInstance();
				ahdate.setTimeInMillis((long)ahvalue);		
				ahdate.add(Calendar.HOUR, ahour);
				returnvalue = ahdate.getTimeInMillis();			
				break;
			case "add_minute":  
				int aminute = Integer.valueOf(parameter[0]);
				double amivalue = (double)value;
				Calendar amidate = Calendar.getInstance();
				amidate.setTimeInMillis((long)amivalue);		
				amidate.add(Calendar.MINUTE, aminute);
				returnvalue = amidate.getTimeInMillis();			
				break;
			case "add_second":  
				int asecond = Integer.valueOf(parameter[0]);
				double asvalue = (double)value;
				Calendar asdate = Calendar.getInstance();
				asdate.setTimeInMillis((long)asvalue);		
				asdate.add(Calendar.SECOND, asecond);
				returnvalue = asdate.getTimeInMillis();			
				break;
			case "year":  
				double yvalue = (double)value;
				Calendar ydate = Calendar.getInstance();
				ydate.setTimeInMillis((long)yvalue);				
				returnvalue = ydate.get(Calendar.YEAR);
				break;
			case "month": 
				double mvalue = (double)value;
				Calendar mdate = Calendar.getInstance();
				mdate.setTimeInMillis((long)mvalue);				
				returnvalue = mdate.get(Calendar.MONTH);
				break;
			case "day":  				
				double dvalue = (double)value;
				Calendar ddate = Calendar.getInstance();
				ddate.setTimeInMillis((long)dvalue);				
				returnvalue = ddate.get(Calendar.DATE);
				break;
			case "week":  
				double wvalue = (double)value;
				Calendar wdate = Calendar.getInstance();
				wdate.setTimeInMillis((long)wvalue);				
				returnvalue = wdate.get(Calendar.DAY_OF_WEEK);
				break;
			case "floor": 
				returnvalue = Math.floor(Double.valueOf(value.toString()));
				break;
			case "length":  
				returnvalue = value.toString().length();
				break;
			case "log":  
				returnvalue = Math.log10(Double.valueOf(value.toString()));
				break;
			case "lower":  
				returnvalue = value.toString().toLowerCase();
				break;
			case "max":  
				if(value instanceof int[]){
					ivalues = (int[])value;
					int imax = Integer.MIN_VALUE;
					if(ivalues != null) {
						for(int i=0;i<ivalues.length;i++)
							imax = Math.max(imax, ivalues[i]);
					}
					returnvalue = imax;
				}else if(value instanceof double[]){
					dvalues = (double[])value;
					double dmax = Double.MIN_VALUE;
					if(dvalues != null) {
						for(int i=0;i<dvalues.length;i++)
							dmax = Math.max(dmax, dvalues[i]);
					}
					returnvalue = dmax;
				}else if(value instanceof Timestamp[]){
					tvalues = (Timestamp[])value;
					double dtmax = Double.MIN_VALUE;
					if(tvalues != null) {
						for(int i=0;i<tvalues.length;i++)
						dtmax = Math.max(dtmax, tvalues[i].getTime());
					}
					returnvalue = dtmax;
				}else if(value instanceof String[]){
					svalues = (String[])value;
					Arrays.stream(svalues).sorted();
					returnvalue = svalues[svalues.length -1];
				}
				break;
			case "median":  
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						dvalues = new double[ivalues.length];
						for(int i=0;i<dvalues.length;i++)
							dvalues[i] = ivalues[i];						
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;					
				}
				if(dvalues != null) {
					statistical.setDarray(dvalues);
					returnvalue = statistical.getMedian();
				}
				break;
			case "min": 
				if(value instanceof int[]){
					ivalues = (int[])value;
					int imin = Integer.MIN_VALUE;
					if(ivalues != null) {
						for(int i=0;i<ivalues.length;i++)
							imin = Math.min(imin, ivalues[i]);
					}
					returnvalue = imin;
				}else if(value instanceof double[]){
					dvalues = (double[])value;
					double dmin = Double.MIN_VALUE;
					if(dvalues != null) {
						for(int i=0;i<dvalues.length;i++)
							dmin = Math.min(dmin, dvalues[i]);
					}
					returnvalue = dmin;
				}else if(value instanceof Timestamp[]){
					tvalues = (Timestamp[])value;
					double dtmin = Double.MIN_VALUE;
					if(tvalues != null) {
						for(int i=0;i<tvalues.length;i++)
							dtmin = Math.min(dtmin, tvalues[i].getTime());
					}
					returnvalue = dtmin;
				}else if(value instanceof String[]){
					svalues = (String[])value;
					Arrays.stream(svalues).sorted();
					returnvalue = svalues[0];
				}
				break;
			case "percentile": 
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						dvalues = new double[ivalues.length];
						for(int i=0;i<dvalues.length;i++)
							dvalues[i] = ivalues[i];						
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;					
				}
				if(dvalues != null) {
					double iparam = Double.valueOf(parameter[0]);
					statistical.setDarray(dvalues);
					if(iparam == 0)
						returnvalue = statistical.getQ0();
					else if(iparam == 0.25)
						returnvalue = statistical.getQ1();
					else if(iparam == 0.5)
						returnvalue = statistical.getQ2();
					else if(iparam == 0.75)
						returnvalue = statistical.getQ3();
					else if(iparam == 1)
						returnvalue = statistical.getQ4();
				}
				break;
			case "power":  				
				returnvalue = Math.pow(Double.valueOf(value.toString()),Double.valueOf(parameter[0]));
				break;
			case "radians":
				returnvalue = Math.toRadians(Double.valueOf(value.toString()));
				break;
			case "rank":  
			case "rank_dense":  
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						dvalues = new double[ivalues.length];
						for(int i=0;i<dvalues.length;i++)
							dvalues[i] = ivalues[i];						
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;					
				}
				if(dvalues != null) {
					SortedMap<Double,Integer> map = new TreeMap<Double,Integer>();
					for(int i=0;i<dvalues.length;i++)
						map.put(dvalues[i],i);
					int[] iarray = new int[dvalues.length];
					int idx = 0;
					for (Map.Entry<Double,Integer> item : map.entrySet()) {
						iarray[idx] = item.getValue();
						idx++;
					}
					returnvalue = iarray;
				}
				break;
			case "lead":  
				param = 1;
				if(parameter != null && parameter.length > 0)				
					param = Integer.valueOf(parameter[0]);
				
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						double[] iivalues = new double[ivalues.length];
						for(int i=0;i<dvalues.length - param;i++) 
							iivalues[i] = ivalues[i + param];
						returnvalue = iivalues;
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;
					if(dvalues != null) {
						double[] ddvalues = new double[dvalues.length];
						for(int i=0;i<dvalues.length - param;i++)
							ddvalues[i] = dvalues[i + param];
						returnvalue = ddvalues;
					}
				}else if(value instanceof Timestamp[]){
					tvalues = (Timestamp[])value;
					if(tvalues != null) {
						Timestamp[] ttvalues = new Timestamp[tvalues.length];
						for(int i=0;i<tvalues.length - param;i++)
							ttvalues[i] = tvalues[i + param];
						returnvalue = ttvalues;
					}
				}else if(value instanceof String[]){
					svalues = (String[])value;					
					if(svalues != null) {
						String[] ssvalues = new String[svalues.length];
						for(int i=0;i<svalues.length - param;i++)
							ssvalues[i] = svalues[i + param];
						returnvalue = ssvalues;
					}
				}								
				break;
			case "leg": 
				param = 1;
				if(parameter != null && parameter.length > 0)				
					param = Integer.valueOf(parameter[0]);
				
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						double[] iivalues = new double[ivalues.length];
						for(int i=param;i<dvalues.length;i++) 
							iivalues[i] = ivalues[i - param];
						returnvalue = iivalues;
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;
					if(dvalues != null) {
						double[] ddvalues = new double[dvalues.length];
						for(int i=param;i<dvalues.length;i++)
							ddvalues[i] = dvalues[i - param];
						returnvalue = ddvalues;
					}
				}else if(value instanceof Timestamp[]){
					tvalues = (Timestamp[])value;
					if(tvalues != null) {
						Timestamp[] ttvalues = new Timestamp[tvalues.length];
						for(int i=param;i<tvalues.length;i++)
							ttvalues[i] = tvalues[i - param];
						returnvalue = ttvalues;
					}
				}else if(value instanceof String[]){
					svalues = (String[])value;					
					if(svalues != null) {
						String[] ssvalues = new String[svalues.length];
						for(int i=param;i<svalues.length;i++)
							ssvalues[i] = svalues[i - param];
						returnvalue = ssvalues;
					}
				}	
				break;
			case "replace":  
				returnvalue = value.toString().replace(parameter[0], parameter[1]);
				break;
			case "round":  
				double rdparam = Double.valueOf(parameter[0]);				
				returnvalue = Math.round(Double.valueOf(value.toString()) * rdparam / rdparam);
				break;
			case "rtrim": 				
				returnvalue = value.toString().replaceAll("\\s+$","");
				break;
			case "ltrim": 
				returnvalue = value.toString().replaceAll("^\\s+",""); 
				break;
			case "trim":
				returnvalue = value.toString().trim();
				break;
			case "stdev":
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						dvalues = new double[ivalues.length];
						for(int i=0;i<dvalues.length;i++)
							dvalues[i] = ivalues[i];						
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;					
				}
				if(dvalues != null) {
					statistical.setDarray(dvalues);
					returnvalue = statistical.getStdDev();
				}
				break;
			case "stdevp":  
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						dvalues = new double[ivalues.length];
						for(int i=0;i<dvalues.length;i++)
							dvalues[i] = ivalues[i];						
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;					
				}
				if(dvalues != null) {
					statistical.setDarray(dvalues);
					returnvalue = statistical.getStdDev();
				}
				break;
			case "sum": 
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						int ivalue = 0;
						for(int i=0;i<ivalues.length;i++)
							ivalue += ivalues[i];
						returnvalue = ivalue;
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;
					if(dvalues != null) {
						double sdvalue = 0;
						for(int i=0;i<dvalues.length;i++)
							sdvalue += dvalues[i];
						returnvalue = sdvalue;
					}
				}
				break;			
			case "upper":  
				returnvalue = value.toString().toUpperCase();
				break;
			case "var":
			case "varp":  
				if(value instanceof int[]){
					ivalues = (int[])value;
					if(ivalues != null) {
						dvalues = new double[ivalues.length];
						for(int i=0;i<dvalues.length;i++)
							dvalues[i] = ivalues[i];						
					}
				}else if(value instanceof double[]){
					dvalues = (double[])value;					
				}
				if(dvalues != null) {
					statistical.setDarray(dvalues);					
				}
				break;
		}
		return returnvalue;
	}
	
	
}
