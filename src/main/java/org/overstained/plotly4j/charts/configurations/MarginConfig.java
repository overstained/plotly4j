package org.overstained.plotly4j.charts.configurations;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class MarginConfig {
	@JsonProperty("l")
	private int left;
	
	@JsonProperty("r")
	private int right;
	
	@JsonProperty("t")
	private int top;
	
	@JsonProperty("b")
	private int bottom;
	
	@JsonProperty("pad")
	private int pad;

	@JsonProperty("autoexpand")
	private boolean autoexpand;

	private MarginConfig() {
		this.left = 80;
		this.right = 80;
		this.top = 100;
		this.bottom = 80;
		this.pad = 0;
		this.autoexpand = true;
	};

	public static final MarginConfig define() {
		return new MarginConfig();
	}

	/**
	 * Sets the margins (in px).
	 * 
	 * @param left - Left margin(in px). default: 80
	 * @param right - Right margin(in px). default: 80
	 * @param top - Top margin(in px). default: 100
	 * @param bottom - Bottom margin(in px). default: 80
	 * @return MarginConfig
	 */
	public MarginConfig margins(final int left, final int right, final int top, final int bottom) {
		this.left = left;
		this.right = right;
		this.top = top;
		this.bottom = bottom;
		return this;
	}

	/**
	 * Sets the amount of padding (in px) between the plotting area and the axis
	 * lines
	 * 
	 * @param pad - Padding (in px). default: 0
	 * @return MarginConfig
	 */
	public MarginConfig padding(final int pad) {
		this.pad = pad;
		return this;
	}

	/**
	 * 
	 * @param autoexpand - default: true
	 * @return MarginConfig
	 */
	public MarginConfig autoexpand(final boolean autoexpand) {
		this.autoexpand = autoexpand;
		return this;
	}

}
