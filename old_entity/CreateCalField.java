package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.FieldNamingPolicy;
import com.hbee.honeybee.enumeration.AxisDataType;
import com.hbee.honeybee.enumeration.ValueDataType;

public class CreateCalField implements Serializable{	
	private List<CalField> field = new ArrayList<CalField>();
	private List<String> allcolumns = new ArrayList<String>();
	private boolean isaggregation = false;	
	public boolean isIsaggregation() {
		return isaggregation;
	}

	public List<CalField> getField() {
		return field;
	}

	public void setField(List<CalField> field) {
		this.field = field;
	}	
	
	public boolean isIserror() {
		for(int i=0;i<field.size();i++) {
			if(field.get(i).isIserror())
				return true;
		}
		return false;
	}	
	
	public List<String> getColumnList(){
		allcolumns.clear();
		for(int i=0;i<field.size();i++) {
			List<String> columns = getContinColumn(field.get(i).getScript());
			for(int j=0;j<columns.size();j++) {
				if(!allcolumns.contains(columns.get(j)))
					allcolumns.add(columns.get(j));
			}				
		}
		return allcolumns;
	}
	
	public void calDefine() {
		isaggregation = false;
		for(int i=0;i<field.size();i++) {
			field.get(i).calDefine();
			if(field.get(i).isIsaggregation())
				isaggregation = true;
		}
	}
	
	public List<Map<String,Object>> calCulate(List<Map<String,Object>> resultData,Map<String,ValueDataType> typeList,List<String> group,List<String> valuecolumns){
		List<Map<String,Object>> maplist = null;
		HashMap<String,List<Object>> arrayValue = null;
		if(group != null && group.size() > 0) {
			List<Map<String,Object>> calData = new ArrayList<Map<String,Object>>();
			List<String> valuecol = new ArrayList<String>();
			if(valuecolumns != null) {
				for(int i=0;i<valuecolumns.size();i++) {
					valuecol.add(valuecolumns.get(i));
				}
			}
			List<String> fieldcolumns = getColumnList();
			for(int i=0;i<fieldcolumns.size();i++) {
				if(!valuecol.contains(fieldcolumns.get(i)))
					valuecol.add(fieldcolumns.get(i));
			}
			
			arrayValue = new HashMap<String,List<Object>>();
			for(int i=0;i<valuecol.size();i++) {
				arrayValue.put(valuecol.get(i),new ArrayList<Object>());
			}
			
			String joinstr = "_";
			String strvalue = "";
			String groupString = "";
			String pregroupString = null;
			List<String> groupvalues = new ArrayList<String>();
			for(int i=0;i<resultData.size();i++) {
				groupString = "";				
				for(int g=0;g<group.size();g++) {
					strvalue = resultData.get(i).get(group.get(g)).toString();
					groupString += joinstr + strvalue;
				}
				
				if(pregroupString != null && !groupString.equals(pregroupString)) {
					HashMap<String,Object> uniquevalue = new HashMap<String,Object>();
					for(int g=0;g<groupvalues.size();g++) {
						uniquevalue.put(group.get(g), groupvalues.get(g));
					}
					for (Map.Entry<String, List<Object>> items : arrayValue.entrySet()) {
						int icount = items.getValue().size();
						Object obj = null;
						if(typeList.get(items.getKey()) == ValueDataType.Numeric) {
							double[] dvalues = new double[icount];
							for(int j=0;j<icount;j++) {
								dvalues[j] = (double)items.getValue().get(j);
							}
							obj = dvalues;
						}else if(typeList.get(items.getKey()) == ValueDataType.DateTime) {
							double[] tvalues = new double[icount];
							for(int j=0;j<icount;j++) {
								tvalues[j] = (double)items.getValue().get(j);
							}
							obj = tvalues;
						}else {
							String[] svalues = new String[icount];
							for(int j=0;j<icount;j++) {
								svalues[j] = items.getValue().get(j).toString();
							}
							obj = svalues;
						}
						items.getValue().clear();
						uniquevalue.put(items.getKey(),obj);
					}
					groupvalues.clear();
					calData.add(uniquevalue);
				}			
				
				if(groupvalues.size() == 0) {
					for(int g=0;g<group.size();g++) {
						strvalue = resultData.get(i).get(group.get(g)).toString();
						groupvalues.add(strvalue);
					}				
				}
				for (Map.Entry<String, List<Object>> items : arrayValue.entrySet()) {
					items.getValue().add(resultData.get(i).get(items.getKey()));
				}
				pregroupString = groupString;
			}
			
			if(groupvalues.size() > 0) {
				HashMap<String,Object> uniquevalue = new HashMap<String,Object>();
				for(int g=0;g<groupvalues.size();g++) {
					uniquevalue.put(group.get(g), groupvalues.get(g));
				}
				for (Map.Entry<String, List<Object>> items : arrayValue.entrySet()) {
					int icount = items.getValue().size();
					Object obj = null;
					if(typeList.get(items.getKey()) == ValueDataType.Numeric) {
						double[] dvalues = new double[icount];
						for(int j=0;j<icount;j++) {
							dvalues[j] = (double)items.getValue().get(j);
						}
						obj = dvalues;
					}else if(typeList.get(items.getKey()) == ValueDataType.DateTime) {
						double[] tvalues = new double[icount];
						for(int j=0;j<icount;j++) {
							tvalues[j] = (double)items.getValue().get(j);
						}
						obj = tvalues;
					}else {
						String[] svalues = new String[icount];
						for(int j=0;j<icount;j++) {
							svalues[j] = items.getValue().get(j).toString();
						}
						obj = svalues;
					}
					items.getValue().clear();
					uniquevalue.put(items.getKey(),obj);
				}
				groupvalues.clear();
				calData.add(uniquevalue);
			}	
			maplist = calData;
		}
		
		if(maplist == null)
			maplist = resultData;
		
		if(maplist.size() == 0) return maplist;
		for(int i=0;i<maplist.size();i++) {
			for(int j=0;j<field.size();j++) {
				field.get(j).calCulate(maplist.get(i),i);
				maplist.get(i).put(field.get(j).getName(),field.get(j).getResult());				
			}
			if(arrayValue != null) {
				for (Map.Entry<String, List<Object>> items : arrayValue.entrySet()) {
					if(valuecolumns != null && valuecolumns.contains(items.getKey())) continue;
					maplist.get(i).remove(items.getKey());
				}
			}
		}
		return maplist;
	}
	
	public List<String> getContinColumn(String script) {
		int startindex = 0;
		String column = "";
		List<String> columns = new ArrayList<String>();
		for(int i=0;i<script.length();i++) {
			if(script.charAt(i) == '[') {
			   startindex = i;
			   continue;
			}else if(startindex >= 0 && script.charAt(i) == ']') {
				column = script.substring(startindex + 1,i).trim();
				if(!columns.contains(column))
					columns.add(column);
				startindex = -1;
			}			
		}
		return columns;
	}
	
	public AxisDataType getAxisDataType(String column) {
		AxisDataType axisDataType = AxisDataType.String;
		for(int i=0;i<field.size();i++) {
			if(column.equals(field.get(i).getName())) {
				switch(field.get(i).getType()) {
		    	case DateTime:
		    		axisDataType = AxisDataType.TimeStamp;
		    		break;
		    	case Numeric:
		    		axisDataType = AxisDataType.Double;
		    		break;
		    	case String:
		    		axisDataType = AxisDataType.String;
		    		break;
		    	}
			}
		}
		return axisDataType;
	}
}
