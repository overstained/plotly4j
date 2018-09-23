package org.overstained.plotly4j.enums;

public enum Visibility {
	TRUE("true"),
	FALSE("false"),
	LEGEND("legendonly");
	
	private String value;
	
	private Visibility(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return this.value;
	}
}
