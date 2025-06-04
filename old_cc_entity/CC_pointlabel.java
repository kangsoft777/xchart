/**
 * 
 */
package com.hbee.honeybee.cc_entity;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.Serializable;

import com.hbee.honeybee.enumeration.PointShapeStyle;

/**
 * @author hbee.ceo
 *
 */
public class CC_pointlabel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2793031726887801766L;
	private boolean isline = false;
	private boolean isborder = false;
	private boolean isbrush = false;
	private int linecolor = Color.white.getRGB();
	private int bordercolor = Color.white.getRGB();
	private int brushcolor = Color.white.getRGB();
	private String[] lineposition = null;
	private String[] brushbox = null;
	private CC_font labelfont= new CC_font();
	private String[] labeltext = null;
	private String[] labeltext2 = null;
	private int[] x = null;
	private int[] y = null;
	private int[] x2 = null;
	private int[] y2 = null;
	private int linethick = 1;
	private int borderthick = 1;
	
	public boolean isIsborder() {
		return isborder;
	}
	public void setIsborder(boolean isborder) {
		this.isborder = isborder;
	}
	public boolean isIsbrush() {
		return isbrush;
	}
	public void setIsbrush(boolean isbrush) {
		this.isbrush = isbrush;
	}
	public int getBordercolor() {
		return bordercolor;
	}
	public void setBordercolor(int bordercolor) {
		this.bordercolor = bordercolor;
	}
	public int getBrushcolor() {
		return brushcolor;
	}
	public void setBrushcolor(int brushcolor) {
		this.brushcolor = brushcolor;
	}	
	public String[] getLineposition() {
		return lineposition;
	}
	public void setLineposition(String[] lineposition) {
		this.lineposition = lineposition;
	}
	public String[] getBrushbox() {
		return brushbox;
	}
	public void setBrushbox(String[] brushbox) {
		this.brushbox = brushbox;
	}	
	public CC_font getLabelfont() {
		return labelfont;
	}
	public void setLabelfont(CC_font labelfont) {
		this.labelfont = labelfont;
	}
	public String[] getLabeltext() {
		return labeltext;
	}
	public void setLabeltext(String[] labeltext) {
		this.labeltext = labeltext;
	}
	
	public String[] getLabeltext2() {
		return labeltext2;
	}
	public void setLabeltext2(String[] labeltext2) {
		this.labeltext2 = labeltext2;
	}		
	public int[] getX() {
		return x;
	}
	public void setX(int[] x) {
		this.x = x;
	}
	public int[] getY() {
		return y;
	}
	public void setY(int[] y) {
		this.y = y;
	}
	public int[] getX2() {
		return x2;
	}
	public void setX2(int[] x2) {
		this.x2 = x2;
	}
	public int[] getY2() {
		return y2;
	}
	public void setY2(int[] y2) {
		this.y2 = y2;
	}
	public int getBorderthick() {
		return borderthick;
	}
	public void setBorderthick(int borderthick) {
		this.borderthick = borderthick;
	}	
	public int getLinethick() {
		return linethick;
	}
	public void setLinethick(int linethick) {
		this.linethick = linethick;
	}
	public boolean isIsline() {
		return isline;
	}
	public void setIsline(boolean isline) {
		this.isline = isline;
	}
	public int getLinecolor() {
		return linecolor;
	}
	public void setLinecolor(int linecolor) {
		this.linecolor = linecolor;
	}			
}
