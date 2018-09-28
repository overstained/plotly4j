package org.overstained.plotly4j.charts.configurations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonInclude(Include.NON_NULL)
public final class ChartConfig {
	@JsonProperty("data")
	private List<BasicDataConfig<?>> data;
	@JsonProperty("layout")
	private LayoutConfig layout;
	
	private ChartConfig() {
		this.layout = LayoutConfig.define();
	};
	
	public static final ChartConfig define() {
		return new ChartConfig();
	}
	
	public ChartConfig data(final BasicDataConfig<?>... dataConfig) {
		if(this.data == null) {
			this.data = new LinkedList<>();
		}
		Collections.addAll(this.data, dataConfig);
		return this;
	}
	
	public ChartConfig layout(final LayoutConfig layoutConfig) {
		this.layout = layoutConfig;
		return this;
	}
	
}
