package com.hbee.honeybee.entity;

public class ChartPredict {
	private boolean isdescription = true;
	private boolean ispredict = false;
	private int predictype = 1; // 1 : simple Moving average, 2 : simple
								// Exponential Smoothing, 3 : double Exponential
								// Smoothing, 4 : Holt winters Exponential
								// Smoothing
	private String aggregationtype = "avg";
	private String averagesize = "2";
	private String automatic = "true";
	private String alpha = "null";
	private String beta = "null";
	private String gamma = "null";
	private String errortype = "additive";
	private String trendtype = "additive";
	private String seasonaltype = "additive";
	private String frequency = "12";
	private String damped = "true";
	private String phi = "null";
	private String predictperiod = "2";
	private String interval = "null";
	private String center = "true";
	private String[] predicts = null;

	public boolean isIsdescription() {
		return isdescription;
	}

	public void setIsdescription(boolean isdescription) {
		this.isdescription = isdescription;
	}

	public boolean isIspredict() {
		return ispredict;
	}

	public void setIspredict(boolean ispredict) {
		this.ispredict = ispredict;
	}

	public int getPredictype() {
		return predictype;
	}

	public void setPredictype(int predictype) {
		this.predictype = predictype;
	}

	public String getAggregationtype() {
		return aggregationtype;
	}

	public void setAggregationtype(String aggregationtype) {
		this.aggregationtype = aggregationtype;
	}

	public String getAveragesize() {
		return averagesize;
	}

	public void setAveragesize(String averagesize) {
		this.averagesize = averagesize;
	}

	public String getAutomatic() {
		return automatic;
	}

	public void setAutomatic(String automatic) {
		this.automatic = automatic;
	}

	public String getAlpha() {
		return alpha;
	}

	public void setAlpha(String alpha) {
		this.alpha = alpha;
	}

	public String getBeta() {
		return beta;
	}

	public void setBeta(String beta) {
		this.beta = beta;
	}

	public String getGamma() {
		return gamma;
	}

	public void setGamma(String gamma) {
		this.gamma = gamma;
	}

	public String getErrortype() {
		return errortype;
	}

	public void setErrortype(String errortype) {
		this.errortype = errortype;
	}

	public String getTrendtype() {
		return trendtype;
	}

	public void setTrendtype(String trendtype) {
		this.trendtype = trendtype;
	}

	public String getSeasonaltype() {
		return seasonaltype;
	}

	public void setSeasonaltype(String seasonaltype) {
		this.seasonaltype = seasonaltype;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getDamped() {
		return damped;
	}

	public void setDamped(String damped) {
		this.damped = damped;
	}

	public String getPhi() {
		return phi;
	}

	public void setPhi(String phi) {
		this.phi = phi;
	}

	public String getPredictperiod() {
		return predictperiod;
	}

	public void setPredictperiod(String predictperiod) {
		this.predictperiod = predictperiod;
	}

	public String getInterval() {
		return interval;
	}

	public void setInterval(String interval) {
		this.interval = interval;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String[] getPredicts() {
		if(!this.ispredict) return null;
		return predicts;
	}

	public void setPredicts(String[] predicts) {
		this.predicts = predicts;
	}
}
