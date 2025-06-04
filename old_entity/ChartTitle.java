package com.hbee.honeybee.entity;

import com.hbee.honeybee.enumeration.AlignType;

public class ChartTitle {
	private boolean isVisible = false;
	private String title = "";
	private String galleryTitle = "";
	private ChartFont font = new ChartFont();
	private int angle = 0;
	private AlignType align = AlignType.center;

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	
	public boolean titleisNull(){
		return title == null || title.equals("");
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGalleryTitle() {
		return galleryTitle;
	}

	public void setGalleryTitle(String galleryTitle) {
		this.galleryTitle = galleryTitle;
	}

	public ChartFont getFont() {
		return font;
	}

	public void setFont(ChartFont font) {
		this.font = font;
	}

	public int getAngle() {
		return angle;
	}

	public void setAngle(int angle) {
		this.angle = angle;
	}
	
	public AlignType getAlign() {
		return align;
	}

	public void setAlign(AlignType align) {
		this.align = align;
	}

	public void clone(ChartTitle title){
		this.isVisible = title.isVisible();
		this.title = title.getTitle();
		this.galleryTitle = title.getGalleryTitle();
		this.font.clone(title.getFont());
		this.angle = title.getAngle();
		this.align = title.getAlign();
	}
}
