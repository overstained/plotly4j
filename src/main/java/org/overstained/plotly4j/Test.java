package org.overstained.plotly4j;

import org.overstained.plotly4j.charts.Chart;

public class Test {
	public static final void main(String[] args) {
		Chart.scatter()
		.withTitle("test")
		.withSize(600, 300)
		.withX(new double[] {1,2,3,4})
		.withY(new double[] {1,4,9,16})
		.show();
	}
}
