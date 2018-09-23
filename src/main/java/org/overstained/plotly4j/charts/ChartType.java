package org.overstained.plotly4j.charts;

public enum ChartType {
	SCATTER("scatter"),
	SCATTER_MAP("scattergeo"),
	HISTOGRAM("histogram"),
	HISTOGRAM2D("histogram2d"),
	BOX("box");
	
	private String plotlyType;
	
	ChartType(String plotlyType) {
		this.plotlyType =  plotlyType;
	}
	
	String getPlotlyType() {
		return this.plotlyType;
	}
}
