package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.hbee.honeybee.enumeration.CondFieldType;

public class CondField implements Serializable {
	private String name = "";
	private CondFieldType fieldType = CondFieldType.FillColor.Value;
	private List<CondValue> value = new ArrayList<CondValue>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CondFieldType getFieldType() {
		return fieldType;
	}
	public void setFieldType(CondFieldType fieldType) {
		this.fieldType = fieldType;
	}
	public List<CondValue> getValue() {
		return value;
	}
	public void setValue(List<CondValue> value) {
		this.value = value;
	}
}
