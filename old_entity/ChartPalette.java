package com.hbee.honeybee.entity;

import java.awt.Color;

public class ChartPalette {
	private int defaultColor = new Color(33, 162, 239).getRGB();
	private int defaultColor2 = new Color(54,162,235).getRGB();
	private int alpha = 0;
	private int paletteindex = -1;
	private int[] colors = null;
	private int[] gradationcolor = null;
	private Color[] colorvalues = null;
	private int[] colorinteger = null;
	private String[] images = null;
	private boolean isgradation = false;
	private boolean ismiddleColor = false;
	private boolean isreverse = false;
	private boolean isimagemode = false;
	private int markerColor = Color.green.getRGB();
	private int startcolor = Color.blue.getRGB();
	private int middlecolor = Color.yellow.getRGB();
	private int endcolor = Color.red.getRGB();
    private int gradecount = 10;
    private int transparency = 0;
	private boolean iscolordrivenmode = true;

	public int getDefaultColor() {
		return defaultColor;
	}

	public void setDefaultColor(int defaultColor) {
		this.defaultColor = defaultColor;
	}
	
	public int getDefaultColor2() {
		return defaultColor2;
	}

	public void setDefaultColor2(int defaultColor2) {
		this.defaultColor2 = defaultColor2;
	}

	public int getPaletteindex() {
		return paletteindex;
	}

	public void setPaletteindex(int paletteindex) {
		this.paletteindex = paletteindex;
	}

	public int getTransparency() {
		//return transparency;
		return 97;
	}

	public void setTransparency(int transparency) {
		this.transparency = transparency;
	}

	public int getColorCount() {
		if (colorvalues == null || colorvalues.length == 0) {
			int[] icolors = colorinteger;
			if(isgradation)
				icolors = gradationcolor;
			if(icolors != null && icolors.length != 0){
				colorvalues = new Color[icolors.length];
				for(int i=0;i<icolors.length;i++){
					Color color = new Color(icolors[i]);
					colorvalues[i] = color;
				}
			}
			else
				colorvalues = ChartUserDefineOpt.getColors();
		}
		if (colorvalues != null){
			if(colorinteger == null || colorinteger.length == 0){
				colorinteger = new int[colorvalues.length];
				for(int i=0;i<colorinteger.length;i++){
					colorinteger[i] = colorvalues[i].getRGB();
				}	
			}
			return colorvalues.length;
		}
		else
			return 0;
	}

	public int[] getColorinteger() {
		return colorinteger;
	}

	public void setColorinteger(int[] colorinteger) {
		this.colorinteger = colorinteger;
	}

	public int[] getColors() {
		return colors;
	}

	public void setColors(int[] colors) {
		this.colors = colors;
		colorvalues = new Color[colors.length];
		for (int i = 0; i < colors.length; i++)
			colorvalues[i] = new Color(colors[i]);
	}

	public String[] getImages() {
		return images;
	}

	public void setImages(String[] images) {
		this.images = images;
	}

	public int getMarkerColor() {
		return markerColor;
	}

	public void setMarkerColor(int markerColor) {
		this.markerColor = markerColor;
	}

	public Color[] getColorvalues() {
		if (colorvalues == null)
			colorvalues = ChartUserDefineOpt.getColors();
		return colorvalues;
	}

	public void setColorvalues(Color[] colorvalues) {
		this.colorvalues = colorvalues;
	}

	public boolean isIsgradation() {
		return isgradation;
	}

	public void setIsgradation(boolean isgradation) {
		this.isgradation = isgradation;
	}

	public int getStartcolor() {
		return startcolor;
	}

	public void setStartcolor(int startcolor) {
		this.startcolor = startcolor;
	}

	public int getMiddlecolor() {
		return middlecolor;
	}

	public void setMiddlecolor(int middlecolor) {
		this.middlecolor = middlecolor;
	}

	public int getEndcolor() {
		return endcolor;
	}

	public void setEndcolor(int endcolor) {
		this.endcolor = endcolor;
	}

	public boolean isIsmiddleColor() {
		return ismiddleColor;
	}

	public void setIsmiddleColor(boolean ismiddleColor) {
		this.ismiddleColor = ismiddleColor;
	}

	public boolean isIsreverse() {
		return isreverse;
	}

	public void setIsreverse(boolean isreverse) {
		this.isreverse = isreverse;
	}

	public int getGradecount() {
		return gradecount;
	}

	public void setGradecount(int gradecount) {
		this.gradecount = gradecount;
	}

	public boolean isIscolordrivenmode() {
		return iscolordrivenmode;
	}

	public void setIscolordrivenmode(boolean iscolordrivenmode) {
		this.iscolordrivenmode = iscolordrivenmode;
	}

	public void clone(ChartPalette pallete){
		this.paletteindex = pallete.getPaletteindex();
		this.colors = pallete.getColors();
		this.images = pallete.getImages();
		this.markerColor = pallete.getMarkerColor();
		this.startcolor = pallete.startcolor;
		this.middlecolor = pallete.middlecolor;
		this.endcolor = pallete.endcolor;
		this.gradationcolor = pallete.gradationcolor;
		this.gradecount = pallete.gradecount;
	}
}
