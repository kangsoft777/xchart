package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CondValue  implements Serializable{
	private String name = "";	
	private String operand = "=";
	private String target = "";
	private String targetvalue = "";
	private Object result = "";
	private List<String> list = null;
	private boolean isOther = false;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	public String getTarget() {
		return target;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getTargetvalue() {
		return targetvalue;
	}
	public void setTargetvalue(String targetvalue) {
		this.targetvalue = targetvalue;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public boolean isOther() {
		return isOther;
	}
	public void setOther(boolean isOther) {
		this.isOther = isOther;
	}	
	public List<String> getValues(){
		if(list == null) {
			list = new ArrayList<String>();
			String[] values = target.split(",");
			for(int i=0;i<values.length;i++)
				list.add(values[i]);
		}
			
		return list;
	}
}
