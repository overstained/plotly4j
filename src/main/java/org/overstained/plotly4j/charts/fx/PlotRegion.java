package org.overstained.plotly4j.charts.fx;

import java.util.function.Consumer;

import javafx.concurrent.Worker.State;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.layout.Region;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import netscape.javascript.JSObject;

class PlotRegion extends Region {
	private static final String WINDOW_OBJECT = "window";
	private final WebView browser = new WebView();
	private final WebEngine webEngine = browser.getEngine();

	public PlotRegion(Consumer<JSObject> callback) {
		getChildren().add(browser);
		loadWindow(callback);
	}

	public void loadWindow(Consumer<JSObject> callback) {
		String url = this.getClass().getResource("/plotly/index.html").toExternalForm();
		webEngine.load(url);
		webEngine.getLoadWorker().stateProperty().addListener((ov, oldState, newState) -> {
			if (newState == State.SUCCEEDED) {
				JSObject window = (JSObject) webEngine.executeScript(WINDOW_OBJECT);
				callback.accept(window);
			}
		});
	}

	@Override
	protected void layoutChildren() {
		double w = getWidth();
		double h = getHeight();
		layoutInArea(browser, 0, 0, w, h, 0, HPos.CENTER, VPos.CENTER);
	}
}
