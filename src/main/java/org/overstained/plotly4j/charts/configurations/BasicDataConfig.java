package org.overstained.plotly4j.charts.configurations;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.overstained.plotly4j.enums.ChartType;
import org.overstained.plotly4j.enums.Mode;
import org.overstained.plotly4j.enums.Visibility;
import org.overstained.plotly4j.jackson.EnumCompositionSerializer;
import org.overstained.plotly4j.jackson.EnumSerializer;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonInclude(Include.NON_NULL)
public class BasicDataConfig<T extends BasicDataConfig<T>> {
	@JsonProperty("type")
	@JsonSerialize(using = EnumSerializer.class)
	private ChartType type;

	@JsonProperty("mode")
	@JsonSerialize(using = EnumCompositionSerializer.class)
	private List<Mode> mode;

	@JsonProperty("visible")
	@JsonSerialize(using = EnumSerializer.class)
	private Visibility visible;

	@JsonProperty("showlegend")
	private boolean showLegend;

	@JsonProperty("opacity")
	private double opacity;

	@JsonProperty("name")
	private String name;

	@JsonProperty("legendgroup")
	private String legendGroup;

	protected BasicDataConfig(ChartType type) {
		this.type = type;
		this.visible = Visibility.TRUE;
		this.showLegend = true;
		this.opacity = 1;
		this.legendGroup = "";
	}

	/**
	 * Any combination of "lines", "markers", "text" joined with a "+" OR "none".
	 * examples: "lines", "markers", "lines+markers", "lines+markers+text", "none"
	 * Determines the drawing mode for this scatter trace. If the provided `mode`
	 * includes "text" then the `text` elements appear at the coordinates.
	 * Otherwise, the `text` elements appear on hover. If there are less than 20
	 * points, then the default is "lines+markers". Otherwise, "lines".
	 * 
	 * @param modes - Enumeration of modes.
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T modes(Mode... modes) {
		this.mode = new LinkedList<>();
		Collections.addAll(this.mode, modes);
		return (T) this;
	}

	/**
	 * Determines whether or not this trace is visible. If "legendonly", the trace
	 * is not drawn, but can appear as a legend item (provided that the legend
	 * itself is visible).
	 * 
	 * @param visible
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T visibility(Visibility visible) {
		this.visible = visible;
		return (T) this;
	}

	/**
	 * Determines whether or not an item corresponding to this trace is shown in the
	 * legend.
	 * 
	 * @param showLegend
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T showLegend(boolean showLegend) {
		this.showLegend = showLegend;
		return (T) this;
	}

	/**
	 * Sets the opacity of the surface.
	 * 
	 * @param opacity - Value between 0 and 1 inclusive. default: 1
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T opacity(double opacity) {
		this.opacity = opacity;
		return (T) this;
	}

	/**
	 * Sets the trace name. The trace name appear as the legend item and on hover.
	 * 
	 * @param name
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T name(String name) {
		this.name = name;
		return (T) this;
	}

	/**
	 * Sets the legend group for this trace. Traces part of the same legend group
	 * hide/show at the same time when toggling legend items.
	 * 
	 * @param legendGroup - Default: ""
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T legendGroup(String legendGroup) {
		this.legendGroup = legendGroup;
		return (T) this;
	}
}
