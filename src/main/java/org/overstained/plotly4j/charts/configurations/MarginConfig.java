package org.overstained.plotly4j.charts.configurations;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class MarginConfig {
	private int l;
	private int r;
	private int t;
	private int b;
	private int pad;
	private boolean autoexpand;
	
	private MarginConfig() {
		this.l = 80;
		this.r = 80;
		this.t = 100;
		this.b = 80;
		this.pad = 0;
		this.autoexpand = true;
	};
	
	public static final MarginConfig define() {
		return new MarginConfig();
	}
	
	/**
	 * Sets the margins (in px).
	 * @param l - Left margin(in px). default: 80 
	 * @param r - Right margin(in px). default: 80 
	 * @param t - Top margin(in px). default: 100
	 * @param b - Bottom margin(in px). default: 80
	 * @return MarginConfig
	 */
	public MarginConfig margins(final int l, final int r, final int t, final int b) {
		this.l = l;
		this.r = r;
		this.t = t;
		this.b = b;
		return this;
	}
	
	/**
	 * Sets the amount of padding (in px) between the plotting area and the axis lines
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
