package org.overstained.plotly4j.charts.configurations;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonInclude(Include.NON_NULL)
public final class LayoutConfig {
	private FontConfig font;
	private String title;
	private FontConfig titlefont;
	private boolean autosize;
	private int width;
	private int height;
	private MarginConfig margin;/*
	private String paper_bgcolor;
	private String plot_bgcolor;
	private String separators;
	private boolean hidesources;
	private boolean showlegend;
	private List<String> colorway;*/
	
	private LayoutConfig() {
		this.width = 700;
		this.height = 450;
	};
	
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
	public LayoutConfig titlefont(final FontConfig titlefont) {
		this.titlefont = titlefont;
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
