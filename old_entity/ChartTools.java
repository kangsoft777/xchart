package com.hbee.honeybee.entity;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

import com.hbee.honeybee.enumeration.ToolType;

public class ChartTools {
	private boolean[] isposmode = null;
	private boolean isScaleMode = false;
	private double minx = 0;
	private double maxx = 0;
	private double miny = 0;
	private double maxy = 0;
	private double miny2 = 0;
	private double maxy2 = 0;

	private ToolType[] toolType = null;
	private String[] parameter = null;
	private String[] texts = null;
	private int[] width = null;
	private int[] shapestyle = null;
	private int[] ibordercolor = null;
	private int[] ifillcolor = null;
	private int[] ifontcolor = null;
	private String[] axisindex = null;
	private String[] fontvalue = null;
	
	public boolean[] isIsposmode() {
		return isposmode;
	}

	public void setIsposmode(boolean[] isposmode) {
		this.isposmode = isposmode;
	}

	public boolean isScaleMode() {
		return isScaleMode;
	}

	public void setScaleMode(boolean isScaleMode) {
		this.isScaleMode = isScaleMode;
	}

	public double getMinx() {
		return minx;
	}

	public void setMinx(double minx) {
		this.minx = minx;
	}

	public double getMaxx() {
		return maxx;
	}

	public void setMaxx(double maxx) {
		this.maxx = maxx;
	}

	public double getMiny() {
		return miny;
	}

	public void setMiny(double miny) {
		this.miny = miny;
	}

	public double getMaxy() {
		return maxy;
	}

	public void setMaxy(double maxy) {
		this.maxy = maxy;
	}

	public double getMiny2() {
		return miny2;
	}

	public void setMiny2(double miny2) {
		this.miny2 = miny2;
	}

	public double getMaxy2() {
		return maxy2;
	}

	public void setMaxy2(double maxy2) {
		this.maxy2 = maxy2;
	}

	public ToolType[] getToolType() {
		return toolType;
	}

	public void setToolType(ToolType[] toolType) {
		this.toolType = toolType;
	}

	public String[] getParameter() {
		return parameter;
	}

	public void setParameter(String[] parameter) {
		this.parameter = parameter;
	}

	public String[] getTexts() {
		return texts;
	}

	public void setTexts(String[] texts) {
		this.texts = texts;
	}

	public int[] getWidth() {
		return width;
	}

	public void setWidth(int[] width) {
		this.width = width;
	}

	public int[] getShapestyle() {
		return shapestyle;
	}

	public void setShapestyle(int[] shapestyle) {
		this.shapestyle = shapestyle;
	}

	public int[] getIbordercolor() {
		return ibordercolor;
	}

	public void setIbordercolor(int[] ibordercolor) {
		this.ibordercolor = ibordercolor;
	}

	public int[] getIfillcolor() {
		return ifillcolor;
	}

	public void setIfillcolor(int[] ifillcolor) {
		this.ifillcolor = ifillcolor;
	}

	public int[] getIfontcolor() {
		return ifontcolor;
	}
	
	public void setIfontcolor(int[] ifontcolor) {
		this.ifontcolor = ifontcolor;
	}	

	/**
	 * @return the axisindex
	 */
	public String[] getAxisindex() {
		return axisindex;
	}

	/**
	 * @param axisindex the axisindex to set
	 */
	public void setAxisindex(String[] axisindex) {
		this.axisindex = axisindex;
	}

	public String[] getFontvalue() {
		return fontvalue;
	}

	public void setFontvalue(String[] fontvalue) {
		this.fontvalue = fontvalue;
	}
	
	public ToolType getType(int index){
		if (toolType == null || toolType.length <= index)
			return ToolType.None;
		else
			return toolType[index];
	}

	public int getBorderWidth(int index){
		if (width == null || width.length <= index)
			return 0;
		else
			return width[index];
	}

	public Color getBorderClor(int index){
		if (ibordercolor == null || ibordercolor.length <= index)
			return null;
		else
			return new Color(ibordercolor[index]);
	}
	
	public Color getFillClor(int index){
		if (ifillcolor == null || ifillcolor.length <= index)
			return null;
		else
			return new Color(ifillcolor[index]);
	}
			
	public Color getForeColor(int index){
		if (ifontcolor == null || ifontcolor.length <= index)
			return null;
		else
			return new Color(ifontcolor[index]);
	}
	
	public String getText(int index) {
		if (texts == null || texts.length <= index)
			return null;
		else
			return texts[index];
	}

	public double[] getRectangle(int index) {
		if (parameter == null || parameter.length <= index)
			return null;
		String[] value = parameter[index].split(",");
		double[] rects = new double[4];
		rects[0] = Double.valueOf(value[0]);
		rects[1] = Double.valueOf(value[1]);
		rects[2] = Double.valueOf(value[2]);
		rects[3] = Double.valueOf(value[3]);
		return rects;
	}

	public PointF[] getPolygon(int index) {
		if (parameter == null || parameter.length <= index)
			return null;
		String[] param = parameter[index].split("`");
		PointF[] points = new PointF[param.length];
		for (int i = 0; i < param.length; i++) {
			String[] point = param[i].split(",");
			points[i] = new PointF(Float.valueOf(point[0]),
					Float.valueOf(point[1]));
		}
		return points;
	}

	public double[] getCircle(int index) {
		if (parameter == null || parameter.length <= index)
			return null;
		String[] value = parameter[index].split(",");
		double[] rects = new double[4];
		rects[0] = Double.valueOf(value[0]);
		rects[1] = Double.valueOf(value[1]);
		rects[2] = Double.valueOf(value[2]);
		rects[3] = Double.valueOf(value[3]);
		return rects;
	}

	public Font getFont(int index) {
		if (fontvalue == null || fontvalue.length <= index)
			return null;
		String[] values = fontvalue[index].split(",");
		String fontname = values[0];
		int ifontstyle = 0;
		switch(values[2].toLowerCase()){
		case "bold":
			ifontstyle = Font.BOLD;
			break;
		case "regular":
			ifontstyle = Font.PLAIN;
			break;
		case "italic":
			ifontstyle = Font.ITALIC;
			break;
		case "italicbold":
		case "bolditalic":
			ifontstyle = 3;
			break;
		}
		
		int fontsize = Float.valueOf(values[1]).intValue();		
		return new Font(fontname, ifontstyle, fontsize);
	}
	
	private void reParamBinding(){
		int icnt = (parameter == null ? 0 : parameter.length) + 1;
		ToolType[] utoolType = new ToolType[icnt];
		 String[] uparameter = new String[icnt];
		 String[] utexts = new String[icnt];
		 int[] uwidths = new int[icnt];
		 int[] ushapestyle = new int[icnt];
		 int[] ubordercolor = new int[icnt];
		 int[] ufillcolor = new int[icnt];
		 int[] ufontcolor = new int[icnt];
		 String[] ufonts = new String[icnt];
		
		 if(icnt > 1){
		 for(int i=0;i<icnt -1;i++){
			 utoolType[i] = this.toolType[i];
			 uparameter[i] = this.parameter[i];
			 utexts[i] = this.texts[i];
			 uwidths[i] = this.width[i];
			 ushapestyle[i] = this.shapestyle[i];
			 ubordercolor[i] = this.ibordercolor[i];
			 ufillcolor[i] = this.ifillcolor[i];
			 ufontcolor[i] = this.ifontcolor[i];
			 ufonts[i] = this.fontvalue[i];
		 }
		 }
		 
		 this.toolType = utoolType;
		 this.parameter = uparameter;
		 this.texts = utexts;
		 this.width = uwidths;
		 this.shapestyle = ushapestyle;
		 this.ibordercolor = ubordercolor;
		 this.ifillcolor = ufillcolor;
		 this.ifontcolor = ufontcolor;
		 this.fontvalue = ufonts;
	}
	
	public void addLine(double x, double y, double x2, double y2, int width, int bordercolor){
		reParamBinding();
		
		 int index = this.toolType.length -1;
		 this.toolType[index] = ToolType.Line;
		 this.parameter[index] = String.format("%s,%s|%s,%s",x,y,x2,y2);
		 this.texts[index] = "";
		 this.width[index] = width;
		 this.shapestyle[index] = 0;
		 this.ibordercolor[index] = bordercolor;
		 this.ifillcolor[index]  = Color.white.getRGB();
		 this.ifontcolor[index] = Color.white.getRGB();
		 this.fontvalue[index] = "";
	}
	
	public void addCircle(double x, double y, double radius, int width, int shapestyle, int bordercolor, int fillcolor){
		reParamBinding();
		
		 int index = this.toolType.length -1;
		 this.toolType[index] = ToolType.Circle;
		 this.parameter[index] = String.format("%s,%s|%s,%s",x,y,radius);
		 this.texts[index] = "";
		 this.width[index] = width;
		 this.shapestyle[index] =shapestyle;
		 this.ibordercolor[index] = bordercolor;
		 this.ifillcolor[index]  = fillcolor;
		 this.ifontcolor[index] = Color.white.getRGB();
		 this.fontvalue[index] = "";
	}
	
	public void addPolygon(double[] x, double[] y, int width, int shapestyle, int bordercolor, int fillcolor){
		reParamBinding();
		
		 int index = this.toolType.length -1;
		 this.toolType[index] = ToolType.Polygon;
		 String[] values = new String[x.length];
		 for(int i=0;i<x.length;i++){
			 values[i] = String.format("%s,%s",x[i],y[i]);
		 }
		 this.parameter[index] = String.join("|", values);
		 this.texts[index] = "";
		 this.width[index] = width;
		 this.shapestyle[index] = shapestyle;
		 this.ibordercolor[index] = bordercolor;
		 this.ifillcolor[index]  = fillcolor;
		 this.ifontcolor[index] = Color.white.getRGB();
		 this.fontvalue[index] = "";
	}
	
	public void addText(double x, double y, String text, String fontname, String fontstyle, int fontsize, int fontcolor){
		reParamBinding();
		
		 int index = this.toolType.length -1;
		 this.toolType[index] = ToolType.Text;
		 this.parameter[index] = String.format("%s,%s",x,y);
		 this.texts[index] = text;
		 this.width[index] = 0;
		 this.shapestyle[index] = 0;
		 this.ibordercolor[index] = Color.white.getRGB();
		 this.ifillcolor[index]  = Color.white.getRGB();
		 this.ifontcolor[index] = fontcolor;
		 this.fontvalue[index] = String.format("%s,%s,%s",fontname,fontstyle,fontsize);
	}
}
