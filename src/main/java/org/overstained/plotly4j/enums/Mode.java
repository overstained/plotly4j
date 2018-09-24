package org.overstained.plotly4j.enums;

public enum Mode implements ChartEnum {
	LINES("lines"), MARKERS("markers"), TEXT("text"), NONE("none");

	private String value;

	Mode(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}
