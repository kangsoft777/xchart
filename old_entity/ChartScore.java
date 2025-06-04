package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.ScoreType;

public class ChartScore {
	private ScoreType scoreType = ScoreType.Priority;
	private String[] scorefunctions = null; //"fscore", "rscore", "zscore", "cpcpk"
    private String ucl = null;
    private String lcl = null;
    private boolean isvalid = false;
	
	public ScoreType getScoreType() {
		return scoreType;
	}
	public void setScoreType(ScoreType scoreType) {
		this.scoreType = scoreType;
	}
	public String[] getScorefunctions() {
		return scorefunctions;
	}
	public void setScorefunctions(String[] scorefunctions) {
		this.scorefunctions = scorefunctions;
	}
	public String getUcl() {
		return ucl;
	}
	public void setUcl(String ucl) {
		this.ucl = ucl;
	}
	public String getLcl() {
		return lcl;
	}
	public void setLcl(String lcl) {
		this.lcl = lcl;
	}
	public boolean isIsvalid() {
		return isvalid;
	}
	public void setIsvalid(boolean isvalid) {
		this.isvalid = isvalid;
	}
}
