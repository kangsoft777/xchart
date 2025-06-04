package com.hbee.honeybee.entity;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import com.hbee.honeybee.enumeration.FocusType;
import com.hbee.honeybee.enumeration.PointShapeStyle;
import com.hbee.honeybee.enumeration.ShapeStyle;
import com.hbee.honeybee.enumeration.ValueDataType;
import com.hbee.honeybee.implement.StringCollection;

public class ChartFocus {
	private boolean iscalcualte = false;
	private boolean isuseful = true;
	private String name = "";
	private String targetItem = "";
	private int targetIndex = 0;
	private FocusType focusType = FocusType.Point;
	private String operand = "=";
	private short soperand = 0;
	private ValueDataType valueType = ValueDataType.String;
	private boolean iscase = false;
	private boolean isString = true;
	private String focusValue = "";
	private String replaceValue = null;
	private boolean isImagemode = false;
	private boolean isColormode = false;
	private boolean isShapemode = false;
	private boolean isSizemode = false;
	private String imageString = null;
	private int color = Color.blue.getRGB();
	private ShapeStyle shapeType = ShapeStyle.Circle; 
	private int size = 0;
	private short shortvalue = 0;
	private short shortvalue2 = 0;
	private short intvalue = 0;
	private double dvalue = 0;
	private double dvalue2 = 0;
	
	private List<Short> shortList = null;	
	private List<Integer> intList = null;	
	private List<Double> doubleList = null;	
	private double[] doublecollection = null;
	private boolean isstringvalue = false;
	private boolean isdoublevalue = false;
	private int collectionsize = 0;	
	private boolean israngevalue = false;	
	private Map<Short,Map<Double,Double>> groupList = null;
	private boolean ismultimode = false;
	private Map<Short,Map<Double,Double>> multiList = null;
	private double lastvalue = 0;
	
	public boolean isIsuseful() {
		return isuseful;
	}    
	public void setIsuseful(boolean isuseful) {
		this.isuseful = isuseful;
	}	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTargetItem() {
		return targetItem;
	}	
	public void setTargetItem(String targetItem) {
		this.targetItem = targetItem;
	}
	public FocusType getFocusType() {
		return focusType;		
	}
	public void setFocusType(FocusType focusType) {
		this.focusType = focusType;
	}	
	public String getOperand() {
		return operand;
	}
	public void setOperand(String operand) {
		this.operand = operand;
	}
	public ValueDataType getValueType() {
		return valueType;
	}
	public void setValueType(ValueDataType valueType) {
		this.valueType = valueType;
	}				
	public boolean isIscase() {
		return iscase;
	}
	public void setIscase(boolean iscase) {
		this.iscase = iscase;
	}
	public String getFocusValue() {
		return focusValue;
	}
	public void setFocusValue(String focusValue) {
		this.focusValue = focusValue;
		if(this.focusValue != null)
			this.focusValue = this.focusValue.trim();
	}
	public boolean isImagemode() {
		return isImagemode;
	}
	public void setImagemode(boolean isImagemode) {
		this.isImagemode = isImagemode;
	}
	public boolean isColormode() {
		return isColormode;
	}
	public void setColormode(boolean isColormode) {
		this.isColormode = isColormode;
	}
	public boolean isShapemode() {
		return isShapemode;
	}
	public void setShapemode(boolean isShapemode) {
		this.isShapemode = isShapemode;
	}
	public boolean isSizemode() {
		return isSizemode;
	}
	public void setSizemode(boolean isSizemode) {
		this.isSizemode = isSizemode;
	}	
	public String getImageString() {
		return imageString;
	}
	public void setImageString(String imageString) {
		this.imageString = imageString;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public ShapeStyle getShapeType() {
		return shapeType;
	}
	public void setShapeType(ShapeStyle shapeType) {
		this.shapeType = shapeType;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}	
	public BufferedImage getImage() throws IOException {
		if(imageString == null) return null;
		byte[] image = Base64.getDecoder().decode(imageString);
		BufferedImage img = ImageIO.read(new ByteArrayInputStream(image));
		return img;
	}
	
	public int getItemIndex() {
		return targetIndex;
	}
	
	public boolean ischeck() {
		return shortList == null;
	}
	
	public void replaceValue(String value) {
		this.replaceValue = value;
	}
	
	public void calCulate(StringCollection collection) {
		if(iscalcualte) return;
		
		String fValue = focusValue;
		if(replaceValue != null)
			fValue = replaceValue;
		
		shortvalue = -1;
		intvalue = -1;
		dvalue = -1;
		
		if(shortList == null)
			shortList = new ArrayList<Short>();
		shortList.clear();
		switch(targetItem.toLowerCase()) {
		case "markerby":
			targetIndex = 0;
			break;
		case "groupby":
			targetIndex = 1;
			break;
		case "colorby":
			targetIndex = 2;
			break;
		case "shapeby":
			targetIndex = 3;
			break;
		case "sizeby":
			targetIndex = 4;
			break;
		case "xvalue":
			targetIndex = 5;	
			if(collection == null || collection.size() == 0)
				valueType = ValueDataType.Numeric;
			break;
		case "yvalue":
			targetIndex = 6;
			if(collection == null || collection.size() == 0)
				valueType = ValueDataType.Numeric;
			break;
		case "y2value":
			targetIndex = 7;
			if(collection == null || collection.size() == 0)
				valueType = ValueDataType.Numeric;
			break;
		}
		if(targetIndex < 5) {
			if(collection == null || collection.size() == 0) {		
				isuseful = false;
				return;
			}else
				isstringvalue = true;
		}
		
		if(collection != null && collection.size() > 0) {
		    if(operand.equals("=")) {
				for(int i=0;i<collection.size();i++) {				
					if(collection.get(i).toLowerCase().equals(fValue.toLowerCase())) {
						shortvalue = (short)i; 
						break;
					}				
				}
				if(targetIndex == 0)
					intvalue = shortvalue;
			}else if(operand.equals("in")){
				String[] values = fValue.split(",");			
				for(int i=0;i<collection.size();i++) {
					for(int j=0;j<values.length;j++) {
						if(collection.get(i).toLowerCase().equals(values[j].toLowerCase())) {
							shortList.add((short)i);
							break;
						}
					}
				}
				if(targetIndex == 0) {
					for(int i=0;i<shortList.size();i++)
						intList.add((int)shortList.get(i));
				}				
			}
		}
		if(valueType == ValueDataType.DateTime) {
			try {
				Date date;
				if(operand.equals("between")) {
					String[] values = fValue.split(",");	
					if(values.length > 1) {
						try{
							 date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(values[0].trim());
							 dvalue = date.getTime();
							 date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(values[1].trim());
							 dvalue2 = date.getTime();
					     }catch (NumberFormatException nfe) {isuseful = false;}//false defined
					}else
						isuseful = false;
				}else {				
					date = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS").parse(fValue);
					dvalue = date.getTime();
				}
			} catch (Exception e) {isuseful = false;} // false binding
		}else if(valueType == ValueDataType.Numeric) {
			if(operand.equals("in")) {
				String[] values = fValue.split(",");	
				doubleList = new ArrayList<Double>();
				for(int i=0;i<values.length;i++) {
					 try{
						 doubleList.add(Double.parseDouble(values[i].trim()));
				     }catch (NumberFormatException ex){ }//continue					
				}
			}else if(operand.equals("between")) {
				String[] values = fValue.split(",");	
				if(values.length > 1) {
					try{
						 dvalue = Double.parseDouble(values[0].trim());
						 dvalue2 = Double.parseDouble(values[1].trim());
				     }catch (NumberFormatException nfe) {isuseful = false;} //false defined
				}else
					isuseful = false;
			}else {
				try {				
					dvalue = Double.parseDouble(fValue);
					shortvalue = (short)dvalue;
			    } catch (NumberFormatException nfe) {isuseful = false;} //false defined
			}
		}
				
		switch(operand) {
		case "=":
			soperand = 0;
			break;		
		case "in":
			soperand = 1;
			break;	
		case ">":		
			isdoublevalue = true;
			soperand = 2;
			break;			
		case ">=":
			isdoublevalue = true;
			soperand = 3;
			break;		
		case "<":
			isdoublevalue = true;
			soperand = 4;
			break;	
		case "<=":
			isdoublevalue = true;
			soperand = 5;
			break;	
		case "between":
			isdoublevalue = true;
			soperand = 6;
			break;
		}
				
		if(isstringvalue && isdoublevalue && collection != null && collection.size() > 0) {
			doublecollection = new double[collection.size()];
			try {
				dvalue = Double.parseDouble(fValue);				
			}catch(Exception e) { //NaN defined
				dvalue = Double.NaN; 
			}
			for(int i=0;i<collection.size();i++) {
				String strval = collection.get(i);
				try {
				double dval = Double.parseDouble(strval);
				doublecollection[i] = dval;
				}catch(Exception e) { //NaN defined
					doublecollection[i] = Double.NaN; 
				}
			}
			collectionsize = doublecollection.length;
		}
		iscalcualte = true;
	}
			
	public boolean getCondition(Object value,short groupindex,double xvalue) {
		if(israngevalue) {
			if(groupList.containsKey(groupindex)) {
				if(ismultimode) {
					Map<Double,Double> values = groupList.get(groupindex);
					boolean iscontain = false;
					for (Map.Entry<Double, Double> item : values
							.entrySet()) {
						iscontain = false;
						if(item.getKey() == lastvalue)
							iscontain = item.getKey() <= xvalue && item.getValue() >= xvalue;
						else
							iscontain = item.getKey() <= xvalue && item.getValue() > xvalue;
						if(iscontain) {							
							dvalue = this.multiList.get(groupindex).get(item.getKey());
							return getCondition(value);
						}
					}	
					return false;
				}else
					dvalue = groupList.get(groupindex).get(xvalue);
			}
			else
				return false;
		}
		return getCondition(value);
	}
	public boolean getCondition(Object value) {
		if(value == null) return false;
		boolean rval = false;
		if(isstringvalue && isdoublevalue) {
			int idx = Integer.valueOf(value.toString());				
			if(collectionsize <= idx) return false;
			value = doublecollection[idx];
		}else if(valueType == ValueDataType.String && soperand >=2)
			value = Double.valueOf(value.toString());
			
		switch(soperand) {
		case 0:
			if(valueType == ValueDataType.Numeric)
				return (dvalue == (double)value); 		
			else
				return (shortvalue == (short)value); 			
		case 1:
			if(valueType == ValueDataType.Numeric)
				return doubleList.contains((double)value);
			else
				return shortList.contains((short)value);
		case 2:			
			return dvalue < (double)value;			
		case 3:
			return dvalue <= (double)value;			
		case 4:
			return dvalue > (double)value;
		case 5:
			return dvalue >= (double)value;
		case 6:
			return dvalue2 >= (double)value && dvalue <= (double)value;
		}
		return rval;
	}
	
	public void setGroupBinding(Map<Short,Map<Double,Double>> grouplist) {
		this.groupList = grouplist;		
        if(this.groupList != null && this.groupList.size() > 0)
        	israngevalue = true;
	}
	
	public boolean isMultiMode() {
		return ismultimode;
	}
	
	public void setMultiBinding(Map<Short,Map<Double,Double>> multiList,double lastvalue) {
		this.multiList = multiList;
		this.lastvalue = lastvalue;
        if(this.multiList != null && this.multiList.size() > 0)
        	ismultimode = true;
	}
	
	public String getParam() {
		String[] items = new String[8];
		items[0] = focusType.toString();
		items[1] = imageString;
		items[2] = isColormode ? "1" : "0";
		items[3] = String.valueOf(color);
		items[4] = isShapemode ? "1" : "0";
		items[5] = shapeType.toString();
		items[6] = isSizemode ? "1" : "0";
		items[7] = String.valueOf(size);
		if(items[1] == null)
			items[1] = "";
		return String.join("`", items);
	}
	
	public void calRefresh() {
		iscalcualte = false;
	}
	
	public ChartFocus getClone() {
		ChartFocus chartFocus = new ChartFocus();		  
		chartFocus.setIsuseful(this.isuseful); 
		chartFocus.setName(this.name);
		chartFocus.setTargetItem(this.targetItem); 
		chartFocus.setFocusType(this.focusType); 
		chartFocus.setOperand(this.operand); 
		chartFocus.setValueType(this.valueType); 
		chartFocus.setIscase(this.iscase); 
		chartFocus.setFocusValue(this.focusValue);
		chartFocus.setImagemode(this.isImagemode); 
		chartFocus.setColormode(this.isColormode); 
		chartFocus.setShapemode(this.isShapemode);
		chartFocus.setSizemode(this.isSizemode); 
		chartFocus.setImageString(this.imageString); 
		chartFocus.setColor(this.color); 
		chartFocus.setShapeType(this.shapeType); 
		chartFocus.setSize(this.size);
		return chartFocus;
	}
}
