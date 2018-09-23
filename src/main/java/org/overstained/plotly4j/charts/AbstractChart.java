package org.overstained.plotly4j.charts;

import java.util.function.Consumer;

import org.overstained.plotly4j.charts.configurations.ChartConfig;
import org.overstained.plotly4j.charts.fx.PlotApp;

import netscape.javascript.JSObject;

public abstract class AbstractChart<T extends AbstractChart<T>> implements Chart<T>{
	private ChartConfig configuration;

	@SuppressWarnings("unchecked")
	@Override
	public T withTitle(String title) {
		this.configuration.setTitle(title);
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T withSize(int width, int height) {
		this.configuration.setWidth(width);
		this.configuration.setHeight(height);
		return (T) this;
	}
	
	protected void show(Consumer<JSObject> callback) {
		PlotApp.show(configuration, callback);
	}
	
	protected void setConfiguration(ChartConfig configuration) {
		this.configuration = configuration;
	}
	
}
