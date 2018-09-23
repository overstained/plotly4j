package org.overstained.plotly4j.charts.configurations;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ScatterChartConfiguration extends BasicChartConfiguration {
	/**
	 * Sets the x coordinates.
	 */
	private double[] x;

	/**
	 * Sets the y coordinates.
	 */
	private double[] y;
}
