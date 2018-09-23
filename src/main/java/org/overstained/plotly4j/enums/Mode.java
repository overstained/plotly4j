package org.overstained.plotly4j.enums;

public enum Mode {
	LINES("lines"),
	MARKERS("markers"),
	TEXT("text"),
	NONE("none");
	
	private String value;
	
	Mode(String value) {
		this.value =  value;
	}
	
	String getValue() {
		return this.value;
	}
}
