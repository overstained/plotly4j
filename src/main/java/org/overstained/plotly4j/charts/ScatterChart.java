package org.overstained.plotly4j.charts;

import org.overstained.plotly4j.charts.configurations.ScatterChartConfig;
import org.overstained.plotly4j.charts.utils.ChartUtils;

public class ScatterChart extends AbstractChart<ScatterChart>{
	private ScatterChartConfig configuration;
	
	ScatterChart() {
		this.configuration =  new ScatterChartConfig();
		super.setConfiguration(this.configuration);
	}
	
	public ScatterChart withX(double[] x) {
		this.configuration.setX(x);
		return this;
	}
	
	public ScatterChart withY(double[] y) {
		this.configuration.setY(y);
		return this;
	}


	@Override
	public void show() {
		System.out.println(ChartUtils.convertToJson(configuration));
		super.show(window -> {
			window.call("scatterPlot", ChartUtils.convertToJson(configuration));
		});
	}
}
