package org.overstained.plotly4j.enums;

public enum Orientation implements ChartEnum {
	VERTICAL("v"), HORIZONTAL("h");

	private String value;

	Orientation(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}
