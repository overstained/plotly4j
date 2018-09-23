package org.overstained.plotly4j.enums;

public enum Orientation {
	VERTICAL("v"),
	HORIZONTAL("h");
	
	private String value;
	
	Orientation(String value) {
		this.value =  value;
	}
	
	String getValue() {
		return this.value;
	}
}
