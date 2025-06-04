package com.hbee.honeybee.entity;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

import com.hbee.honeybee.enumeration.ValueDataType;

public class CalField implements Serializable{
	public CalField() {
		String[] list = new String[] {"index","abs","avg","ceiling","contains","cos","sin",
				"count","split","date","add_year","add_month","add_week",
				"add_day","add_hour","add_minute","add_second","year",
				"month","day","week","floor","length","log","lower",
				"max","median","min","percentile","power","radians",
				"rank","rank_dense","lead","leg","replace","round",
				"rtrim","ltrim","stdev","stdevp","sum","today","trim",
				"upper","var","varp"};
		functionList.addAll(Arrays.asList(list)); 
		
		list = new String[] {"avg","count","max","median","min","percentile","rank","rank_dense","lead","leg","stdev","stdevp","sum","var","varp"};
		aggregationList.addAll(Arrays.asList(list)); 
	}
	private CalStatistical calstatistical = new CalStatistical();
	private List<String> functionList = new ArrayList<String>();
	private List<String> aggregationList = new ArrayList<String>();
	
	private String name = "";
	private ValueDataType type = ValueDataType.String;
	private String script = "";
	private String calculate = "";	
	private Object result = null;
	private char[] operand = new char[]{'/','*','+','-'};
	private Map<String,CalFieldValue> functions = new HashMap<String,CalFieldValue>();
	private boolean isaggregation = false;
	private boolean iserror = false;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ValueDataType getType() {
		return type;
	}
	public void setType(ValueDataType type) {
		this.type = type;
	}
	public String getScript() {
		return script;
	}
	public void setScript(String script) {
		this.script = script;
	}
	public boolean isIsaggregation() {
		return isaggregation;
	}
	public boolean isIserror() {
		return iserror;
	}	
	public Object getResult() {
		return result;
	}
	public void calDefine() {
		int checksum = 1;
		boolean isempty = false;
		String calscript = script;
		while(checksum == 1) {
			checksum = 0;
			isempty = false;
			String prescript = calscript;
			calscript = calState(calscript);
			if(prescript.contentEquals(calscript))
				isempty = true;
			String temp = calscript;
			String temp2 = calscript;
			for(int j=0;j<operand.length;j++)
				temp = temp.replace(String.valueOf(operand[j]), "").trim();
			for (Map.Entry<String, CalFieldValue> items : functions.entrySet()) {
				temp = temp.replace(items.getKey(), "").trim();
				temp2 = temp2.replace(items.getKey(), "").trim();
			}
			
			if(temp.indexOf("(") >= 0)
				checksum = 1;
			if(temp.indexOf("[") >= 0)
				checksum = 1;
			if(!temp.trim().equals("") && checksum == 0) {
				calscript = constCalculate(calscript);			
				checksum = 1;			
				break;
			}
			if(isempty)
				checksum = 0;
		}
		calculate = calscript;
		if(calculate.equals(""))
			iserror = true;
		else {
			int iaggregation = 0;
			int inoneaggregation = 0;
			for (Map.Entry<String, CalFieldValue> items : functions.entrySet()) {
				String function = items.getValue().getFunction();
				if(function.equals("")) continue;
				if(aggregationList.contains(function)) 
					iaggregation++;
				else
					inoneaggregation++;
			}
			
			if(iaggregation > 0 && inoneaggregation > 0)
				iserror = true;
			else if(iaggregation > 0)
				isaggregation = true;
		}
	}
	
	private String constCalculate(String calscript) {
		int idotstart = calscript.indexOf("'");
		if(idotstart >= 0) {
			List<Integer> dotindexer = new ArrayList<Integer>();
			for(int j=0;j<calscript.length();j++) {
				if(calscript.charAt(j) == '\'') {
					dotindexer.add(j);
			  }
			}
			if(dotindexer.size() > 0 && dotindexer.size()%2 == 0) {
				String replacetext = "";
				int dotvaluestart = 0;
				for(int j=0;j<dotindexer.size();j+=2) {
					String key = "@Column" + functions.size();
					String dotvalue = calscript.substring(dotindexer.get(j),dotindexer.get(j+1) + 1);
					functions.put(key,new CalFieldValue());
					functions.get(key).setValue(dotvalue.replace("'", ""));
					if(!replacetext.equals(""))
						replacetext += " ";								
					replacetext += calscript.substring(dotvaluestart,dotindexer.get(j)) + " " + key;
					dotvaluestart = dotindexer.get(j+1) + 1;
				}							
				if(!replacetext.equals(""))
					replacetext += " ";			
				replacetext += calscript.substring(dotvaluestart,calscript.length());
				calscript = replacetext;
			}												
		}
		calscript = calscript.replace(" ", "");
		String temp = calscript;
		String temp2 = calscript;
		for(int j=0;j<operand.length;j++)
			temp = temp.replace(String.valueOf(operand[j]), "").trim();
		for (Map.Entry<String, CalFieldValue> items : functions.entrySet()) {
			temp = temp.replace(items.getKey(),"").trim();	
			temp2 = temp2.replace(items.getKey(), "").trim();
		}
		if(!temp.trim().equals("")){
			List<Integer> nonevalue = new ArrayList<Integer>();
			for(int i=0;i<temp2.length();i++) {
				for(int j=0;j<operand.length;j++) {
					if(temp2.charAt(i) == operand[j]) {
						nonevalue.add(i);
						break;
					}
			    }
			}
			if(temp2.length() != nonevalue.size()) {
				List<String> constitems = new ArrayList<String>();
				int preindex = nonevalue.get(0);
				int istart = 0;
				int iend = 0;
				
				for(int i=1;i<nonevalue.size();i++) {
					if(preindex + 1 != nonevalue.get(i)) {
						istart = preindex;
						iend = nonevalue.get(i);
						constitems.add(temp2.substring(istart,iend + 1));
						preindex = iend;
					}else
						preindex = nonevalue.get(i);
				}
				if(preindex + 1 != temp2.length()) {
					constitems.add(temp2.substring(preindex,temp2.length()));
				}else if(nonevalue.size() == 1) {
					if(preindex == 0)
						constitems.add(temp2.substring(0,temp2.length()));
					else
						constitems.add(temp2.substring(0,preindex+1));
				}

				if(nonevalue.size() > 1 && nonevalue.get(0) != 0) {
					constitems.add(temp2.substring(0,nonevalue.get(0)+1));
				}
				
				List<Integer> deleteindexer = new ArrayList<Integer>();
				for(int i=0;i<constitems.size();i++) {
					String substrf = constitems.get(i).substring(0,1);
					String substrl = constitems.get(i).substring(constitems.get(i).length()-1,constitems.get(i).length());
					String operstr = "";
					if(substrf.equals("(") || substrf.equals(")")) {
						operstr = constitems.get(i).substring(1,constitems.get(i).length());
						if(operstr.length() == 1 && isOperand(operstr.charAt(0)))
							deleteindexer.add(i);
						else
							constitems.set(i,operstr);
					}
					else if(substrl.equals("(") || substrl.equals(")")) {
						operstr = constitems.get(i).substring(0,constitems.get(i).length() - 1);
						if(operstr.length() == 1 && isOperand(operstr.charAt(0)))
							deleteindexer.add(i);
						else
							constitems.set(i, operstr);
					}
				}
				
				if(deleteindexer.size() > 0) {
					for(int i=deleteindexer.size() -1;i>=0;i--) {
						constitems.remove(constitems.get(deleteindexer.get(i)));
					}
				}
				
				for(int i=0;i<constitems.size();i++) {
					String key = "@Column" + functions.size();
					String constvalue = constitems.get(i);
					String changevalue = "";
					boolean operfirst = isOperand(constvalue.charAt(0));
					boolean operlast = isOperand(constvalue.charAt(constvalue.length() -1));
					istart = 0;
					iend = constvalue.length();
					String strfirst = "";
					String endlast = "";
					if(operfirst) {
						istart = 1;
						strfirst = constvalue.substring(0,1);
					}
					if(operlast) {
						iend = constvalue.length()-1;
						endlast = constvalue.substring(constvalue.length() - 1,constvalue.length());
					}
					changevalue = constvalue.substring(istart,iend);
					functions.put(key,new CalFieldValue());
					if(type == ValueDataType.Numeric)
						functions.get(key).setValue(Double.valueOf(changevalue.trim()));
					else
						functions.get(key).setValue(changevalue);
					calscript = calscript.replace(constvalue, strfirst + key + endlast);
				}
			}
		}	
		return calscript;
	}
	
	private boolean isOperand(char value) {
		for(int j=0;j<operand.length;j++) {
			if(value == operand[j]) {
				return true;
			}
	    }
		return false;
	}
	
	private boolean isFormula(String temp) {
		for(int j=0;j<operand.length;j++)
			temp = temp.replace(String.valueOf(operand[j]), "").trim();
		for (Map.Entry<String, CalFieldValue> items : functions.entrySet()) {
			temp = temp.replace(items.getKey(),"").trim();	
		}
		temp = temp.replace("(", "");
		temp = temp.replace(")", "");
		return temp.trim().equals("");
	}
	
	private String calState(String script) {
		String name = "";
		String key = "";
		String front = "";		
		String backend = "";	
		int istart = -1;
		int iend = -1;
		int lastindex = script.indexOf(")");
		if(lastindex < 0) {
			istart = script.indexOf("[");
			iend = script.indexOf("]");
			if(istart >= 0 && iend >= 0) {
				name = script.substring(istart + 1,iend);
				key = "@Column" + functions.size();
				functions.put(key, new CalFieldValue());
				functions.get(key).setField(name);
				front = script.substring(0,istart - 1).trim();
				backend = script.substring(iend + 1,script.length()).trim();
				script = front + " " + key + " " + backend;
			}
			
			int checksum = 0;
			while(checksum == 0) {
				istart = script.indexOf("'");
				iend = script.lastIndexOf("'");
				if(istart >= 0 && iend >= 0 && istart != iend) {
					checksum = 1;
					for(int i=istart + 1;i<script.length();i++) {
						if(script.charAt(i) == '\'') {
							iend = i;
							name = script.substring(istart + 1,iend);
							key = "@Column" + functions.size();
							functions.put(key, new CalFieldValue());
							functions.get(key).setValue(name.replace("'", ""));
							front = script.substring(0,istart - 1).trim();
							backend = script.substring(iend + 1,script.length()).trim();
							script = front + " " + key + " " + backend;
							checksum = 0;
							break;
						}
					}							
				}else
					checksum = 1;				
			}
			return script;
		}
		String temp = script.substring(0,lastindex);
		int firstindex = temp.lastIndexOf("(");
		
		name = "";
		key = "@Column" + functions.size();
		String value = script.substring(firstindex,lastindex + 1);
		String function = "";
		String first = script.substring(0,firstindex).trim();
		boolean isbreak = false;
		
		for(int i=first.length()-1;i>=0;i--) {			
			for(int j=0;j<operand.length;j++) {
				if(first.charAt(i) == operand[j]) {
					isbreak = true;
					function = first.substring(i + 1,first.length()).trim();
					break;
				}
			}
			if(isbreak)
				break;
			else if(first.charAt(i) == '(') {
				function = first.substring(i + 1,first.length()).trim();
				break;
			}
		}
		if(function.equals("")) {
			int iformula = 0;
			for (Map.Entry<String, CalFieldValue> items : functions.entrySet()) {
				if(value.indexOf(items.getKey()) >= 0) 
					iformula++;
			}
			if(iformula > 0) {
				String formula = script.substring(firstindex,lastindex + 1);
				if(!isFormula(formula)) {
					formula = constCalculate(formula);
				}
				key = "@Column" + functions.size();
				functions.put(key, new CalFieldValue());
				functions.get(key).setFormula(formula);
				front = script.substring(0,firstindex).trim();
				front = front.substring(0,front.length());
				backend = script.substring(lastindex + 1,script.length()).trim();
				script = front + " " + key + " " + backend;
				return script.trim();
			}
			else
				function = first;
		}
		
		key = "@Column" + functions.size();
		functions.put(key, new CalFieldValue());
		String parameters = value;
		istart = value.indexOf("[");
		iend = value.indexOf("]");
		if(istart >= 0 && iend >= 0) {
			name = value.substring(istart + 1,iend);
		}
		functions.get(key).setField(name);
		functions.get(key).setFunction(function);
		if(function.equals(""))
			functions.get(key).setFormula(parameters);
		else {
			int paramindex = parameters.indexOf(",");
			if(paramindex >= 0)
				functions.get(key).setParameters(parameters.substring(paramindex + 1,parameters.length()-1));
		}
		front = script.substring(0,firstindex).trim();
		front = front.substring(0,front.length() - function.length());
		backend = script.substring(lastindex + 1,script.length()).trim();
		script = front + " " + key + " " + backend;
		return script;
	}		
	
	public void calCulate(Map<String,Object> resultData, int index){
		for (Map.Entry<String, CalFieldValue> items : functions.entrySet()) {
			if(items.getValue().getField().equals("")) {
				items.getValue().setResult(items.getValue().getValue());
				continue;			
			}
			String keyvalue = items.getValue().getField();
			if(!resultData.containsKey(items.getValue().getField())) continue;
			Object obj = resultData.get(items.getValue().getField());
			items.getValue().setResult(calstatistical.calCulate(items.getValue().getFunction(), items.getValue().getParameters().split(","), obj, index));
		}
		
		for (Map.Entry<String, CalFieldValue> items : functions.entrySet()) {
			String formula = items.getValue().getFormula();
			if(formula.equals("")) continue;
			int startindex = formula.lastIndexOf("(");
			int endindex = formula.indexOf(")");
			if(startindex >= 0 && endindex >= 0) {
				formula = formula.substring(startindex + 1,endindex).trim();
			}			
			items.getValue().setResult(getFormulaValue(formula));
		}
		result = getFormulaValue(calculate);		
	}
	
	private Object getFormulaValue(String formula) {
		if(formula == null) return "";
		formula = formula.replace("(", "");
		formula = formula.replace(")", "");
		formula = formula.trim();
		if(formula.equals("")) return "";
		Object value = null;
	    List<Integer> operindexer = new ArrayList<Integer>();
	    int istart = 0;	    
	    List<Object> list = new ArrayList<Object>();		
	    String keycolumn = "";
	    for(int i=0;i<formula.length();i++) {
	    	if(isOperand(formula.charAt(i))) {
	    		if(istart != i) {
	    			keycolumn = formula.substring(istart,i).trim();	    		
	    			if(functions.containsKey(keycolumn)) {
	    				if(functions.get(keycolumn).getResult() == null && !functions.get(keycolumn).getFormula().equals(""))
	    					functions.get(keycolumn).setResult(getFormulaValue(functions.get(keycolumn).getFormula()));
	    				list.add(functions.get(keycolumn).getResult());	    				
	    			}
	    			list.add(formula.substring(i,i+1));
	    			
	    			istart = i+1;
	    		}
	    	}
	    }
	    
	    if(istart != formula.length() - 1) {
			keycolumn = formula.substring(istart,formula.length()).trim();	    		
			if(functions.containsKey(keycolumn)) {
				if(functions.get(keycolumn).getResult() == null && !functions.get(keycolumn).getFormula().equals(""))
					functions.get(keycolumn).setResult(getFormulaValue(functions.get(keycolumn).getFormula()));				
				list.add(functions.get(keycolumn).getResult());	    				
			}
		}
			
		Object frontvalue = null;
		Object lastvalue = null;
		String operandvalue = "";
		
		for(int i=0;i<list.size();i++) {
			boolean isskip = false;
			for(int j=0;j<operand.length;j++) {
				if(list.get(i).toString().charAt(0) == operand[j]) {
					operandvalue = list.get(i).toString();
					isskip = true;
					break;
				}
			}
			if(isskip) continue;
			if(frontvalue == null) {
				frontvalue = list.get(i);
			}else {
				if(type == ValueDataType.Numeric)
					lastvalue = Double.valueOf(list.get(i).toString());		
				else
					lastvalue = list.get(i);
				switch(operandvalue) {
				case "*":
					if(type == ValueDataType.Numeric)
						value = (double)frontvalue * (double)lastvalue;
					break;
				case "/":
					if(type == ValueDataType.Numeric)
						value = (double)frontvalue / (double)lastvalue;
					break;
				case "-":
					if(type == ValueDataType.Numeric)
						value = (double)frontvalue - (double)lastvalue;
					break;
				case "+":
					if(type == ValueDataType.Numeric)
						value = (double)frontvalue + (double)lastvalue;
					else
						value = frontvalue.toString() + lastvalue.toString();
					break;
				}
				frontvalue = value;
			}
		}
		if(value == null)
			value = frontvalue;
		return value;
	}
}
