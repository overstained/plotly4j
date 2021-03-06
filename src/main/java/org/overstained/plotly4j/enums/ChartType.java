package org.overstained.plotly4j.enums;

public enum ChartType implements ChartEnum {
	SCATTER("scatter"), SCATTER_MAP("scattergeo"), HISTOGRAM("histogram"), HISTOGRAM2D("histogram2d"), BOX("box");

	private String value;

	ChartType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}
}
