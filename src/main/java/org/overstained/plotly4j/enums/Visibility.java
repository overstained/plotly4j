package org.overstained.plotly4j.enums;

public enum Visibility implements ChartEnum {
	TRUE("true"), FALSE("false"), LEGEND("legendonly");

	private String value;

	private Visibility(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}
