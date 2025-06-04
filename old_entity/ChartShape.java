package com.hbee.honeybee.entity;

import java.util.ArrayList;
import java.util.List;

import com.hbee.honeybee.enumeration.BoxType;
import com.hbee.honeybee.enumeration.PointShapeStyle;
import com.hbee.honeybee.enumeration.ShapeStyle;

public class ChartShape {
	 private PointShapeStyle pointShapeStyle = PointShapeStyle.Both;
	 private PointShapeStyle shapeStyle = PointShapeStyle.Both;
     private ShapeStyle defaultShapeStyle = ShapeStyle.Circle;
     private ShapeStyle defaultShapeStyle2 = ShapeStyle.LeftTriangle;
     private BoxType barShapeType = BoxType.Box;
     private boolean isGradient = false;
     private ShapeStyle[] shapeStyleIndexer = null;
     private int transparency = 0;
     private int shapeFillMode = 0; //0 : Both, 1 : Fill , 2 : Border
     private int lineWidth = 1;
     private int edge_round = 0;
     
     private boolean isShapegradient = false;
     private int shapetransparency = 0;
     private int shapelineWidth = 1;
     private int fixedbarsize = 0;
     
	public PointShapeStyle getPointShapeStyle() {
		return pointShapeStyle;
	}
	public void setPointShapeStyle(PointShapeStyle pointShapeStyle) {
		this.pointShapeStyle = pointShapeStyle;
	}	
	public PointShapeStyle getShapeStyle() {
		return shapeStyle;
	}
	public void setShapeStyle(PointShapeStyle shapeStyle) {
		this.shapeStyle = shapeStyle;
	}
	public ShapeStyle getDefaultShapeStyle() {
		return defaultShapeStyle;
	}
	public void setDefaultShapeStyle(ShapeStyle defaultShapeStyle) {
		this.defaultShapeStyle = defaultShapeStyle;
	}		
	public ShapeStyle getDefaultShapeStyle2() {
		return defaultShapeStyle2;
	}
	public void setDefaultShapeStyle2(ShapeStyle defaultShapeStyle2) {
		this.defaultShapeStyle2 = defaultShapeStyle2;
	}	
	public BoxType getBarShapeType() {
		return barShapeType;
	}
	public void setBarShapeType(BoxType barShapeType) {
		this.barShapeType = barShapeType;
	}
	/**
	 * @return the isGradient
	 */
	public boolean isGradient() {
		return isGradient;
	}
	/**
	 * @param isGradient the isGradient to set
	 */
	public void setGradient(boolean isGradient) {
		this.isGradient = isGradient;
	}
	public ShapeStyle[] getShapeStyleIndexer() {
		if(shapeStyleIndexer == null)
			shapeStyleIndexer = ShapeStyle.values();
		return shapeStyleIndexer;
	}
	public void setShapeStyleIndexer(ShapeStyle[] shapeStyleIndexer) {
		this.shapeStyleIndexer = shapeStyleIndexer;
	}
	public int getTransparency() {		
		return transparency;
	}
	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}
	public int getShapeFillMode() {
		return shapeFillMode;
	}
	public void setShapeFillMode(int shapeFillMode) {
		this.shapeFillMode = shapeFillMode;
	}
	public int getLineWidth() {
		return lineWidth;
	}
	public void setLineWidth(int lineWidth) {
		this.lineWidth = lineWidth;
	}	
	public boolean isShapegradient() {
		return isShapegradient;
	}
	public void setShapegradient(boolean isShapegradient) {
		this.isShapegradient = isShapegradient;
	}
	public int getShapetransparency() {
		return shapetransparency;
	}
	public void setShapetransparency(int shapetransparency) {
		this.shapetransparency = shapetransparency;
	}
	public int getShapelineWidth() {
		return shapelineWidth;
	}
	public void setShapelineWidth(int shapelineWidth) {
		this.shapelineWidth = shapelineWidth;
	}	
	public int getEdge_round() {
		return edge_round;
	}
	public void setEdge_round(int edge_round) {
		this.edge_round = edge_round;
	}	
	public int getFixedbarsize() {
		return fixedbarsize;
	}
	public void setFixedbarsize(int fixedbarsize) {
		this.fixedbarsize = fixedbarsize;
	}
	public void clone(ChartShape shape){
		 this.pointShapeStyle = shape.getPointShapeStyle();
	     this.defaultShapeStyle = shape.getDefaultShapeStyle();
	     this.shapeStyleIndexer = shape.getShapeStyleIndexer();
	     this.transparency = shape.getTransparency();
	     this.shapeFillMode = shape.getShapeFillMode();
	     this.lineWidth = shape.getLineWidth();
	     	     
	     this.isShapegradient = shape.isShapegradient();
	     this.shapelineWidth = shape.getShapelineWidth();
	     this.shapetransparency = shape.getShapetransparency();
	}
}
