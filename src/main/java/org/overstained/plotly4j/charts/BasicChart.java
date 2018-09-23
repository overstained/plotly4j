package org.overstained.plotly4j.charts;

public interface BasicChart<T extends BasicChart<T>> {
	T withTitle(String title);
	T withSize(int width, int height);
	void show();
}
