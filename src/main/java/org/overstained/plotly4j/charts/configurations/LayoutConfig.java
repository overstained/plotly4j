package org.overstained.plotly4j.charts.configurations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonInclude(Include.NON_NULL)
public final class LayoutConfig {
	@JsonProperty("font")
	private FontConfig font;
	@JsonProperty("title")
	private String title;
	@JsonProperty("titlefont")
	private FontConfig titleFont;
	@JsonProperty("autosize")
	private boolean autosize;
	@JsonProperty("width")
	private int width;
	@JsonProperty("height")
	private int height;
	@JsonProperty("margin")
	private MarginConfig margin;
	@JsonProperty("paper_bgcolor")
	private String paperBgColor;
	@JsonProperty("plot_bgcolor")
	private String plotBgColor;
	@JsonProperty("separators")
	private String separators;
	@JsonProperty("hidesources")
	private boolean hideSources;
	@JsonProperty("showlegend")
	private boolean showLegend;
	@JsonProperty("colorway")
	private List<String> colorway;
	
	private LayoutConfig() {
		this.title = "Plot";
		this.width = 700;
		this.height = 450;
	};
	
	public static final LayoutConfig define() {
		return new LayoutConfig();
	}
	
	/**
	 * Sets the global font. Note that fonts used in 
	 * traces and other layout components inherit from the global font.
	 * @param font
	 * @return LayoutConfig
	 */
	public LayoutConfig font(final FontConfig font) {
		this.font = font;
		return this;
	}
	
	/**
	 * Sets the plot's title.
	 * @param title
	 * @return LayoutConfig
	 */
	public LayoutConfig title(final String title) {
		this.title = title;
		return this;
	}
	
	/**
	 * Sets the title font.
	 * @param font
	 * @return LayoutConfig
	 */
	public LayoutConfig titleFont(final FontConfig titleFont) {
		this.titleFont = titleFont;
		return this;
	}
	
	/**
	 * Determines whether or not a layout width or height that has 
	 * been left undefined by the user is initialized on each relayout. 
	 * Note that, regardless of this attribute, an undefined layout width 
	 * or height is always initialized on the first call to plot.
	 * @param font
	 * @return LayoutConfig
	 */
	public LayoutConfig autosize(final boolean autosize) {
		this.autosize = autosize;
		return this;
	}
	
	/**
	 * Sets the plot's width (in px). default: 700
	 * @param width
	 * @return LayoutConfig
	 */
	public LayoutConfig width(final int width) {
		this.width = width;
		return this;
	}
	
	/**
	 * Sets the plot's height (in px). default: 450
	 * @param height
	 * @return LayoutConfig
	 */
	public LayoutConfig height(final int height) {
		this.height = height;
		return this;
	}
	
	/**
	 * Sets the plot's height (in px). default: 450
	 * @param height
	 * @return LayoutConfig
	 */
	public LayoutConfig marginconfig(final MarginConfig marginconfig) {
		this.margin = marginconfig;
		return this;
	}
}
