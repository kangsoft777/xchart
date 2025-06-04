package com.hbee.honeybee.entity;

import java.awt.Color;

import com.hbee.honeybee.enumeration.PointShapeStyle;
import com.hbee.honeybee.enumeration.ShapeStyle;

public class BeeShape {
	private ShapeStyle shapeStyle = ShapeStyle.Rectangle;
	private ShapeStyle defaultShapeStyle = ShapeStyle.Circle;
	private PointShapeStyle pointShapeStyle = PointShapeStyle.Both;
	private Color color;
	private Color pencolor = Color.black;
	private int horizSize = 10;
	private int verSize = 10;
	private int penwidth;
	private boolean isTransparent = false;
	private boolean isPenvisible = true;
	private boolean is2mode = false;

	public ShapeStyle getShapeStyle() {
		return shapeStyle;
	}

	public void setShapeStyle(ShapeStyle shapeStyle) {
		this.shapeStyle = shapeStyle;
	}

	public ShapeStyle getDefaultShapeStyle() {
		return defaultShapeStyle;
	}

	public void setDefaultShapeStyle(ShapeStyle defaultShapeStyle) {
		this.defaultShapeStyle = defaultShapeStyle;
	}

	public PointShapeStyle getPointShapeStyle() {
		return pointShapeStyle;
	}

	public void setPointShapeStyle(PointShapeStyle pointShapeStyle) {
		this.pointShapeStyle = pointShapeStyle;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
		this.pencolor = color.darker();
	}

	public Color getPencolor() {
		if(this.is2mode)
			return Color.black;
		else
			return pencolor;
	}

	public void setPencolor(Color pencolor) {
		this.pencolor = pencolor;
	}

	public int getHorizSize() {
		return horizSize;
	}

	public void setHorizSize(int horizSize) {
		this.horizSize = horizSize;
	}

	public int getVerSize() {
		return verSize;
	}

	public void setVerSize(int verSize) {
		this.verSize = verSize;
	}

	public void setSize(int size) {
		this.horizSize = size;
		this.verSize = size;
	}

	public int getPenwidth() {
		if (penwidth == 0)
			penwidth = 1;
		return penwidth;
	}

	public void setPenwidth(int penwidth) {
		this.penwidth = penwidth;
	}

	public boolean isTransparent() {
		return isTransparent;
	}

	public void setTransparent(boolean isTransparent) {
		this.isTransparent = isTransparent;
	}

	public boolean isPenvisible() {
		return isPenvisible;
	}

	public void setPenvisible(boolean isPenvisible) {
		this.isPenvisible = isPenvisible;
	}
	
	public boolean isIs2mode() {
		return is2mode;
	}

	public void setIs2mode(boolean is2mode) {
		this.is2mode = is2mode;
	}

	public BeeShape clone() {
		BeeShape shape = new BeeShape();
		shape.setShapeStyle(this.shapeStyle);
		shape.setDefaultShapeStyle(this.defaultShapeStyle);
		shape.setPointShapeStyle(this.pointShapeStyle);
		shape.setColor(this.color);
		shape.setPencolor(this.pencolor);
		shape.setHorizSize(this.horizSize);
		shape.setVerSize(this.verSize);
		shape.setPenwidth(this.penwidth);
		shape.setTransparent(this.isTransparent);
		shape.setPenvisible(this.isPenvisible);

		return shape;
	}
}
