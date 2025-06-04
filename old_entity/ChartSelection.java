package com.hbee.honeybee.entity;

public class ChartSelection {
	private boolean isDefaultFields = true; //우선순위 : 1.marker by, 2.color by, 3.shape by
	private String[] selectionFileds = null;
	private String concatStr = "_";
	
	public boolean isDefaultFields() {
		if(selectionFileds != null && selectionFileds.length > 0 && !selectionFileds[0].equals(""))
			return false;
		else
			return isDefaultFields;
	}
	public void setDefaultFields(boolean isDefaultFields) {
		this.isDefaultFields = isDefaultFields;
	}	
	public String getConcatStr() {
		return concatStr;
	}
	public void setConcatStr(String concatStr) {
		this.concatStr = concatStr;
	}
	public String[] getSelectionFileds() {
		return selectionFileds;
	}
	public void setSelectionFileds(String[] selectionFileds) {
		this.selectionFileds = selectionFileds;
		if(selectionFileds == null || selectionFileds.length == 0)
			this.isDefaultFields = true;
		else
			this.isDefaultFields = false;
	}	
}
