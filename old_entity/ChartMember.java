package com.hbee.honeybee.entity;

import java.util.ArrayList;
import java.util.List;

public class ChartMember {
	 
	        private String[] split = null;
	        private String[] marker = null;
	        private String[] line = null;
	        private String[] legendorderby = null;
	        private String[] color  = null;
	        private String[] shape  = null;
	        private String[] size  = null;
	        private String[] hierarchy  = null;
	        private String[] x  = null;
	        private String[] x2  = null;
	        private String[] xlabel = null;
	        private String[] yorder = null;
	        private String[] y  = null;
	        private String[] y2  = null;
	        private String[] group  = null;
	        private String[] from  = null;
	        private String[] to  = null;
	        private String[] hyperlink = null;
	        private String[] image = null;
	        private String function  = null;
	        private String horizonCnt  = "";
	        private String aggregation = "";
	        private String diex = null;
	        private String diey = null;
	        private String diewidth = null;
	        private String dieheight = null;
	        private String originx = null;
	        private String originy = null;
	        private String flatzone = null;
	        private String xfunction = "";
	        private String yfunction = "";	       
	        private String grouptableFunctionType = "";
	        private String colortimestampformat = null;
	        private String xtimestampformat = null;	    
	        private String ytimestampformat = null;	    
	        private boolean ismeasureName = false;
	        private boolean isSplitPivot = false;
	        private boolean isColorbyPivot = false;
	        private String x_change_type = "";
	        private String y_change_type = "";
	        private String color_change_type = "";
	        
	        public String[] getSplit() {
				return split;
			}
			public void setSplit(String[] split) {
				this.split = split;
			}
			public String[] getMarker() {
				return marker;
			}
			public void setMarker(String[] marker) {
				this.marker = marker;
			}
			public String[] getLine() {
				return line;
			}
			public void setLine(String[] line) {
				this.line = line;
			}
			public String[] getLegendorderby() {
				return legendorderby;
			}
			public void setLegendorderby(String[] legendorderby) {
				this.legendorderby = legendorderby;
			}
			public String[] getColor() {
				return color;
			}
			public void setColor(String[] color) {
				this.color = color;
			}
			public String[] getShape() {
				return shape;
			}
			public void setShape(String[] shape) {
				this.shape = shape;
			}
			public String[] getSize() {
				return size;
			}
			public void setSize(String[] size) {
				this.size = size;
			}
			public String[] getHierarchy() {
				return hierarchy;
			}
			public void setHierarchy(String[] hierarchy) {
				this.hierarchy = hierarchy;
			}
			public String[] getX() {
				return x;
			}
			public void setX(String[] x) {
				this.x = x;
			}
			public String[] getX2() {
				return x2;
			}
			public void setX2(String[] x2) {
				this.x2 = x2;
			}			
			public String[] getXlabel() {
				return xlabel;
			}
			public void setXlabel(String[] xlabel) {
				this.xlabel = xlabel;
			}			
			public String[] getYorder() {
				return yorder;
			}
			public void setYorder(String[] yorder) {
				this.yorder = yorder;
			}
			public String[] getY() {
				return y;
			}
			public void setY(String[] y) {
				this.y = y;
			}
			public String[] getY2() {
				return y2;
			}
			public void setY2(String[] y2) {
				this.y2 = y2;
			}
			public String[] getGroup() {
				return group;
			}
			public void setGroup(String[] group) {
				this.group = group;
			}
			public String[] getFrom() {
				return from;
			}
			public void setFrom(String[] from) {
				this.from = from;
			}
			public String[] getTo() {
				return to;
			}
			public void setTo(String[] to) {
				this.to = to;
			}			
			public String[] getHyperlink() {
				return hyperlink;
			}
			public void setHyperlink(String[] hyperlink) {
				this.hyperlink = hyperlink;
			}				
			public String[] getImage() {
				return image;
			}
			public void setImage(String[] image) {
				this.image = image;
			}
			public String getDiex() {
				return diex;
			}
			public void setDiex(String diex) {
				this.diex = diex;
			}
			public String getDiey() {
				return diey;
			}
			public void setDiey(String diey) {
				this.diey = diey;
			}
			public String getDiewidth() {
				return diewidth;
			}
			public void setDiewidth(String diewidth) {
				this.diewidth = diewidth;
			}
			public String getDieheight() {
				return dieheight;
			}
			public void setDieheight(String dieheight) {
				this.dieheight = dieheight;
			}
			public String getOriginx() {
				return originx;
			}
			public void setOriginx(String originx) {
				this.originx = originx;
			}
			public String getOriginy() {
				return originy;
			}
			public void setOriginy(String originy) {
				this.originy = originy;
			}
			public String getFlatzone() {
				return flatzone;
			}
			public void setFlatzone(String flatzone) {
				this.flatzone = flatzone;
			}
			public String getFunction() {
				return function;
			}
			public void setFunction(String function) {
				this.function = function;
			}
			public String getHorizonCnt() {
				return horizonCnt;
			}
			public void setHorizonCnt(String horizonCnt) {
				this.horizonCnt = horizonCnt;
			}
			public String getAggregation() {
				return aggregation;
			}
			public void setAggregation(String aggregation) {
				this.aggregation = aggregation;
			}			
			public String getGrouptableFunctionType() {
				return grouptableFunctionType;
			}
			public void setGrouptableFunctionType(String grouptableFunctionType) {
				this.grouptableFunctionType = grouptableFunctionType;
			}
			
			/**
			 * @return the xfunction
			 */
			public String getXfunction() {
				return xfunction;
			}
			/**
			 * @param xfunction the xfunction to set
			 */
			public void setXfunction(String xfunction) {
				this.xfunction = xfunction;
			}
			/**
			 * @return the yfunction
			 */
			public String getYfunction() {
				return yfunction;
			}
			/**
			 * @param yfunction the yfunction to set
			 */
			public void setYfunction(String yfunction) {
				this.yfunction = yfunction;
			}						
			public boolean isIsmeasureName() {
				return ismeasureName;
			}
			public void setIsmeasureName(boolean ismeasureName) {
				this.ismeasureName = ismeasureName;
			}
			
			public boolean isSplitPivot() {
				return isSplitPivot;
			}
			public void setSplitPivot(boolean isSplitPivot) {
				this.isSplitPivot = isSplitPivot;
			}
			public boolean isColorbyPivot() {
				return isColorbyPivot;
			}
			public void setColorbyPivot(boolean isColorbyPivot) {
				this.isColorbyPivot = isColorbyPivot;
			}			
			public String getX_change_type() {
				return x_change_type;
			}
			public void setX_change_type(String x_change_type) {
				this.x_change_type = x_change_type;
			}
			public String getY_change_type() {
				return y_change_type;
			}
			public void setY_change_type(String y_change_type) {
				this.y_change_type = y_change_type;
			}				
			public String getColor_change_type() {
				return color_change_type;
			}
			public void setColor_change_type(String color_change_type) {
				this.color_change_type = color_change_type;
			}			
			public String getColortimestampformat() {
				return colortimestampformat;
			}
			public void setColortimestampformat(String colortimestampformat) {
				this.colortimestampformat = colortimestampformat;
			}
			public String getXtimestampformat() {
				return xtimestampformat;
			}
			public void setXtimestampformat(String xtimestampformat) {
				this.xtimestampformat = xtimestampformat;
			}					
			public String getYtimestampformat() {
				return ytimestampformat;
			}
			public void setYtimestampformat(String ytimestampformat) {
				this.ytimestampformat = ytimestampformat;
			}
			public void clear()
	        {
	            this.split = null;
	            this.marker = null;
	            this.line = null;
	            this.color = null;
	            this.shape = null;
	            this.size = null;
	            this.hierarchy = null;
	            this.x = null;
	            this.y = null;
	            this.y2 = null;
	            this.group = null;
	            this.from = null;
	            this.to = null;
	            this.function = null;
	            this.horizonCnt = null;
	        }
	        public String getColumn(String value)
	        {
	            if (value == null || value.equals("")) return "";
	            String[] items = value.split("^");
	            for(int i=0;i<items.length;i++)
	            {
	                String[] values = items[i].split("=");
	                if (values[0].toUpperCase() == "COLUMN")
	                    return values[1];
	            }
	            return "";
	        }
	        
	        public String getFunction(String value)
	        {
	            if (value == null || value.equals("")) return "";
	            String[] items = value.split("^");
	            for(int i=0;i<items.length;i++)
	            {
	                String[] values = items[i].split("=");
	                if (values[0].toUpperCase() == "FUNCTION")
	                    return values[1];
	            }
	            return "";
	        }	        
}
