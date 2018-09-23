package org.overstained.plotly4j.charts.configurations;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BasicChartConfiguration {
	@JsonIgnore
	private String title;
	@JsonIgnore
	private int width;
	@JsonIgnore
	private int height;
}
