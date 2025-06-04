package com.hbee.honeybee.entity;

import java.util.HashMap;
import java.util.Map;

public class CategoryTreeNode {
	private long count = 0;
	private String columnName = "";
	private Map<String,CategoryTreeNode> node = new HashMap<String,CategoryTreeNode>();
	
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
	public Map<String,CategoryTreeNode> getNode() {
		return node;
	}
	public void setNode(Map<String,CategoryTreeNode> node) {
		this.node = node;
	}
	public long getTotalCount(){
		if(node.size() == 0) return count;
		int toalcnt = 0;		
		for (Map.Entry<String, CategoryTreeNode> item : node.entrySet()) {
			toalcnt += item.getValue().getTotalCount();
		}
		return toalcnt;
	}
}
