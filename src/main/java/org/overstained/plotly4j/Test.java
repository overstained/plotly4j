package org.overstained.plotly4j;

import static java.util.Arrays.asList;

import java.io.IOException;

import org.overstained.plotly4j.charts.configurations.ChartConfig;
import org.overstained.plotly4j.charts.configurations.LayoutConfig;
import org.overstained.plotly4j.charts.configurations.ScatterDataConfig;
import org.overstained.plotly4j.enums.Mode;

public class Test {
	public static final void main(String[] args) throws IOException {
		Chart.show(ChartConfig
				.define()
				.data(ScatterDataConfig
						.define()
						.x(asList(1,2,3))
						.y(asList(1,2,4))
						.name("plot")
						.opacity(0.5)
						.modes(Mode.TEXT, Mode.LINES))
				.layout(LayoutConfig
					  .define()
					  .title("Line")
					  .width(800)
					  .height(600)));
	}
	
}
