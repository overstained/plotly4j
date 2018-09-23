package org.overstained.plotly4j.charts.configurations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class ChartConfig<T extends BasicDataConfig<T>> {
	@JsonIgnore
	private String title;
	@JsonIgnore
	private int width;
	@JsonIgnore
	private int height;
	
	private List<T> data;
	private LayoutConfig layout;
	
	private ChartConfig() {};
	
	public static final <T extends BasicDataConfig<T>> ChartConfig<T> define() {
		return new ChartConfig<T>();
	}
	
	@SuppressWarnings("unchecked")
	public ChartConfig<T> data(final T... dataConfig) {
		if(this.data == null) {
			this.data = new LinkedList<>();
		}
		Collections.addAll(this.data, dataConfig);
		return this;
	}
	
}
