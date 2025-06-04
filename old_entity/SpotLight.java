/**
 * 
 */
package com.hbee.honeybee.entity;

/**
 * @author ceo
 *
 */
public class SpotLight {
	private SpotFocus focus = new SpotFocus();
	private SpotFocus[] multifocus = null;
	private SpotFilter filter = new SpotFilter();
	private SpotFilter[] multifilter = null;
	private SpotAlign align = new SpotAlign();
	private SpotReferenceLine[] referenceline = null;
	
	public SpotFocus getFocus() {
		return focus;
	}
	public void setFocus(SpotFocus focus) {
		this.focus = focus;
	}	
	public SpotFocus[] getMultifocus() {
		return multifocus;
	}
	public void setMultifocus(SpotFocus[] multifocus) {
		this.multifocus = multifocus;
	}
	public SpotFilter getFilter() {
		return filter;
	}
	public void setFilter(SpotFilter filter) {
		this.filter = filter;
	}	
	public SpotFilter[] getMultifilter() {
		return multifilter;
	}
	public void setMultifilter(SpotFilter[] multifilter) {
		this.multifilter = multifilter;
	}
	public SpotAlign getAlign() {
		return align;
	}
	public SpotReferenceLine[] getReferenceline() {
		return referenceline;
	}
	public void setReferenceline(SpotReferenceLine[] referenceline) {
		this.referenceline = referenceline;
	}
	public void setAlign(SpotAlign align) {
		this.align = align;
	}		
}
