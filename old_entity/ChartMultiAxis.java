package com.hbee.honeybee.entity;

public class ChartMultiAxis {
	private int multiAxisType = 0; //Manual Layout= 0, Rows and Columns = 1;
    private boolean isautogrid = true;
    private String[] rows =  new String[] {};
    private String[] columns = new String[] {};
    private int rowcount = 2;
    private int columncount = 2;
        
	public int getMultiAxisType() {
		return multiAxisType;
	}
	public void setMultiAxisType(int multiAxisType) {
		this.multiAxisType = multiAxisType;
	}
	public String[] getRows() {
		return rows;
	}
	public void setRows(String[] rows) {
		this.rows = rows;
	}
	public String[] getColumns() {
		return columns;
	}
	public void setColumns(String[] columns) {
		this.columns = columns;
	}
	public boolean isIsautogrid() {
		return isautogrid;
	}
	public void setIsautogrid(boolean isautogrid) {
		this.isautogrid = isautogrid;
	}
	public int getRowcount() {
		return rowcount;
	}
	public void setRowcount(int rowcount) {
		this.rowcount = rowcount;
	}
	public int getColumncount() {
		return columncount;
	}
	public void setColumncount(int columncount) {
		this.columncount = columncount;
	}
}
