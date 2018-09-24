package org.overstained.plotly4j.charts.configurations;

import org.overstained.plotly4j.enums.ChartType;

public final class ScatterDataConfig extends CartesianDataConfig<ScatterDataConfig> {

	private ScatterDataConfig() {
		super(ChartType.SCATTER);
	}

	public static final ScatterDataConfig define() {
		return new ScatterDataConfig();
	}

}
