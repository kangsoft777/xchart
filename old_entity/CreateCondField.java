package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CreateCondField implements Serializable {
	private List<CondField> field = new ArrayList<CondField>();

	public List<CondField> getField() {
		return field;
	}

	public void setField(List<CondField> field) {
		this.field = field;
	}
}
