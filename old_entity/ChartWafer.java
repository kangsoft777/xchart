package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.WaferClassificationType;
import com.hbee.honeybee.enumeration.WaterPatternType;

public class ChartWafer {
	private boolean isVisibleText = true;
	private boolean isClusterAuto = false;
	private WaterPatternType patternType = WaterPatternType.None;
	private int kvalue = 16;
	private int clusterMaxValue = 30;
	private int model_number = 1;
	private int seed = 0;
	private String[] clusterparam = null;
	private String[] zoneparam = null;
	private String goodbinValue = "1";

	public String getGoodbinValue() {
		return goodbinValue;
	}

	public void setGoodbinValue(String goodbinValue) {
		this.goodbinValue = goodbinValue;
	}

	public boolean isVisibleText() {
		return isVisibleText;
	}

	public void setVisibleText(boolean isVisibleText) {
		this.isVisibleText = isVisibleText;
	}

	public boolean isClusterAuto() {
		return isClusterAuto;
	}

	public void setClusterAuto(boolean isClusterAuto) {
		this.isClusterAuto = isClusterAuto;
	}

	public WaterPatternType getPatternType() {
		return patternType;
	}

	public void setPatternType(WaterPatternType patternType) {
		this.patternType = patternType;
	}

	public int getKvalue() {
		return kvalue;
	}

	public void setKvalue(int kvalue) {
		this.kvalue = kvalue;
	}

	public int getClusterMaxValue() {
		return clusterMaxValue;
	}

	public void setClusterMaxValue(int clusterMaxValue) {
		this.clusterMaxValue = clusterMaxValue;
	}

	public int getSeed() {
		return seed;
	}

	public void setSeed(int seed) {
		this.seed = seed;
	}

	public String[] getClusterparam() {
		return clusterparam;
	}

	public void setClusterparam(String[] clusterparam) {
		this.clusterparam = clusterparam;
	}

	public int getModel_number() {
		return model_number;
	}

	public void setModel_number(int model_number) {
		this.model_number = model_number;
	}

	public String[] getZoneparam() {
		return zoneparam;
	}

	public void setZoneparam(String[] zoneparam) {
		this.zoneparam = zoneparam;
	}
}
