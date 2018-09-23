package org.overstained.plotly4j.charts.fx;

import java.util.function.Consumer;

import org.overstained.plotly4j.charts.configurations.BasicChartConfiguration;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

/**
 * Hello world!
 *
 */
public class PlotApp extends Application {
	private static Consumer<JSObject> callback;
	private static BasicChartConfiguration configuration;
	
	private Scene scene;

	@Override
	public void start(Stage stage) {
		stage.setTitle(configuration.getTitle());
		scene = new Scene(new PlotRegion(callback), configuration.getWidth(), configuration.getHeight(),
				Color.web("#666970"));
		stage.setScene(scene);
		stage.show();
	}

	public static void show(BasicChartConfiguration configuration, Consumer<JSObject> callback) {
		PlotApp.callback = callback;
		PlotApp.configuration = configuration;
		launch(new String[] {});
	}
}