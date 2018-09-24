package org.overstained.plotly4j.enums;

public enum HoverInfo implements ChartEnum {
	X("x"), Y("y"), Z("z"), TEXT("text"), NAME("name"), SKIP("skip"), NONE("none"), ALL("all");

	private String value;

	HoverInfo(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}
