package org.overstained.plotly4j;

import org.overstained.plotly4j.charts.configurations.ChartConfig;
import org.overstained.plotly4j.charts.fx.PlotApp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import netscape.javascript.JSException;

public interface Chart {
	String JS_PLOT_FUNCTION_NAME = "plotConfig";
	ObjectMapper MAPPER = new ObjectMapper();
	
	static void show(ChartConfig chartConfig) {
		PlotApp.show(chartConfig, window -> {
			try {
				window.call(JS_PLOT_FUNCTION_NAME, MAPPER.writeValueAsString(chartConfig));
			} catch (JSException e) {
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
	}
}
