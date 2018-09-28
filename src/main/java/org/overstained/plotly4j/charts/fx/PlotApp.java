package org.overstained.plotly4j.charts.fx;

import java.util.function.Consumer;

import org.overstained.plotly4j.charts.configurations.ChartConfig;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import netscape.javascript.JSObject;

/**
 * Hello world!
 *
 */
public class PlotApp extends Application {
	private static Consumer<JSObject> callback;
	private static ChartConfig configuration;
	
	private Scene scene;

	@Override
	public void start(Stage stage) {
		stage.setTitle(configuration.getLayout().getTitle());
		scene = new Scene(new PlotRegion(callback), configuration.getLayout().getWidth()+50, configuration.getLayout().getHeight()+50);
		stage.setScene(scene);
		stage.show();
	}

	public static void show(ChartConfig configuration, Consumer<JSObject> callback) {
		PlotApp.callback = callback;
		PlotApp.configuration = configuration;
		launch(new String[] {});
	}
}