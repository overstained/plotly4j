package org.overstained.plotly4j.charts.configurations;

import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public final class LayoutConfig {
	private FontConfig font;
	private String title;
	private FontConfig titlefont;
	private boolean autosize;
	private int width;
	private int height;
	private MarginConfig margin;
	private String paper_bgcolor;
	private String plot_bgcolor;
	private String separators;
	private boolean hidesources;
	private boolean showlegend;
	private List<String> colorway;
	
	private LayoutConfig() {};
	
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
}
