package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ColorbyCollection implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1573497065103266569L;
	private double[] minx = null;
	private double[] maxx = null;
	private double[] miny = null;
	private double[] maxy = null;
	private double[] miny2 = null;
	private double[] maxy2 = null;
	/**
	 * @return the minx
	 */
	public double[] getMinx() {
		return minx;
	}
	/**
	 * @param minx the minx to set
	 */
	public void setMinx(double[] minx) {
		this.minx = minx;
	}
	/**
	 * @return the maxx
	 */
	public double[] getMaxx() {
		return maxx;
	}
	/**
	 * @param maxx the maxx to set
	 */
	public void setMaxx(double[] maxx) {
		this.maxx = maxx;
	}
	/**
	 * @return the miny
	 */
	public double[] getMiny() {
		return miny;
	}
	/**
	 * @param miny the miny to set
	 */
	public void setMiny(double[] miny) {
		this.miny = miny;
	}
	/**
	 * @return the maxy
	 */
	public double[] getMaxy() {
		return maxy;
	}
	/**
	 * @param maxy the maxy to set
	 */
	public void setMaxy(double[] maxy) {
		this.maxy = maxy;
	}
	/**
	 * @return the miny2
	 */
	public double[] getMiny2() {
		return miny2;
	}
	/**
	 * @param miny2 the miny2 to set
	 */
	public void setMiny2(double[] miny2) {
		this.miny2 = miny2;
	}
	/**
	 * @return the maxy2
	 */
	public double[] getMaxy2() {
		return maxy2;
	}
	/**
	 * @param maxy2 the maxy2 to set
	 */
	public void setMaxy2(double[] maxy2) {
		this.maxy2 = maxy2;
	}
	
	public void setColorCollection(Map<Integer,ColorMinMax> value){
		if(value == null) return;
		int icount = value.size();
		minx = new double[icount];
		maxx = new double[icount];
		miny = new double[icount];
		maxy = new double[icount];
		miny2 = new double[icount];
		maxy2 = new double[icount];				
		
		for (int i=0;i<icount;i++) {
			minx[i] = value.get(i).getMinx();
			maxx[i] = value.get(i).getMaxx();
			miny[i] = value.get(i).getMiny();
			maxy[i] = value.get(i).getMaxy();
			miny2[i] = value.get(i).getMiny2();
			maxy2[i] = value.get(i).getMaxy2();
		}
	}
	
	public Map<Integer,ColorMinMax> getColorMinMax(){
		Map<Integer,ColorMinMax> colorby = new HashMap<Integer,ColorMinMax>();
		if(minx == null || minx.length == 0) return colorby;
		int icount = minx.length;
		for(int i=0;i<icount;i++){
			ColorMinMax colorMinMax = new ColorMinMax();
			colorMinMax.setIndex(i);
			colorMinMax.setMinx(minx[i]);
			colorMinMax.setMaxx(maxx[i]);
			colorMinMax.setMiny(miny[i]);
			colorMinMax.setMaxy(maxy[i]);	
			colorMinMax.setMiny2(miny2[i]);
			colorMinMax.setMaxy2(maxy2[i]);				
			colorby.put(i, colorMinMax);
		}
		return colorby;
	}
}
