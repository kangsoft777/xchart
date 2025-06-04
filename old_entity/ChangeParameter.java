package com.hbee.honeybee.entity;

public class ChangeParameter {
	public boolean isChange = false;
    private String _guid = "";
    private ChangeMinMax _changeMinMax = new ChangeMinMax();
    public String changeColorColumn = "";
    public ChangeColor[] changeColors = null;
    public String changeShapeColumn = "";
    public ChangeShape[] changeShapes = null;
    public ChangeVisible[] changeVisibles = null;
	public boolean isChange() {
		return isChange;
	}
	public void setChange(boolean isChange) {
		this.isChange = isChange;
	}
	public String get_guid() {
		return _guid;
	}
	public void set_guid(String _guid) {
		this._guid = _guid;
	}
	public ChangeMinMax get_changeMinMax() {
		return _changeMinMax;
	}
	public void set_changeMinMax(ChangeMinMax _changeMinMax) {
		this._changeMinMax = _changeMinMax;
	}
	public String getChangeColorColumn() {
		return changeColorColumn;
	}
	public void setChangeColorColumn(String changeColorColumn) {
		this.changeColorColumn = changeColorColumn;
	}
	public ChangeColor[] getChangeColors() {
		return changeColors;
	}
	public void setChangeColors(ChangeColor[] changeColors) {
		this.changeColors = changeColors;
	}
	public String getChangeShapeColumn() {
		return changeShapeColumn;
	}
	public void setChangeShapeColumn(String changeShapeColumn) {
		this.changeShapeColumn = changeShapeColumn;
	}
	public ChangeShape[] getChangeShapes() {
		return changeShapes;
	}
	public void setChangeShapes(ChangeShape[] changeShapes) {
		this.changeShapes = changeShapes;
	}
	public ChangeVisible[] getChangeVisibles() {
		return changeVisibles;
	}
	public void setChangeVisibles(ChangeVisible[] changeVisibles) {
		this.changeVisibles = changeVisibles;
	}
    
}
