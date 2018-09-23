package org.overstained.plotly4j.charts;

public interface Chart<T extends BasicChart<T>> extends BasicChart<T> {
	static ScatterChart scatter() {
		return new ScatterChart();
	}
	
}
