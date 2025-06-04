package com.hbee.honeybee.entity;

public class ChartItemAlign {
	private String[] items = null;

	public String[] getItems() {
		return items;
	}

	public void setItems(String[] items) {
		this.items = items;
	}
	
	public boolean isAlign(int length) {
		return this.items != null && this.items.length == length;
	}
}
