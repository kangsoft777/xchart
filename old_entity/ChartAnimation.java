package com.hbee.honeybee.entity;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class ChartAnimation {
    private int animationtime = 1000;
	private int frame = 0;
	private boolean frameanimation = false;
	private int framelinewidth = 1;
	private int frameboardercolor = Color.white.getRGB();
	private int framefillcolor = Color.white.getRGB();
	
	public int getAnimationtime() {
		return animationtime;
	}
	public void setAnimationtime(int animationtime) {
		this.animationtime = animationtime;
	}
	public int getFrame() {
		return frame;
	}
	public void setFrame(int frame) {
		this.frame = frame;
	}	
	public boolean isFrameanimation() {
		return frameanimation;
	}
	public void setFrameanimation(boolean frameanimation) {
		this.frameanimation = frameanimation;
	}
	public int getFramelinewidth() {
		return framelinewidth;
	}
	public void setFramelinewidth(int framelinewidth) {
		this.framelinewidth = framelinewidth;
	}
	public int getFrameboardercolor() {
		return frameboardercolor;
	}
	public void setFrameboardercolor(int frameboardercolor) {
		this.frameboardercolor = frameboardercolor;
	}
	public int getFramefillcolor() {
		return framefillcolor;
	}
	public void setFramefillcolor(int framefillcolor) {
		this.framefillcolor = framefillcolor;
	}		
}
