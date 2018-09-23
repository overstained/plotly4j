package org.overstained.plotly4j.charts.configurations;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonInclude(Include.NON_NULL)
public final class HoverLabelConfig {
	private String bgcolor;
	private String bordercolor;
	private FontConfig font;
	private List<Integer> namelength;
	
	private HoverLabelConfig() {};
	
	public static final HoverLabelConfig define() {
		return new HoverLabelConfig();
	}
	
	/**
	 * Sets the background color of the hover labels for this trace
	 * @param bgcolor
	 * @return HoverLabelConfig
	 */
	public HoverLabelConfig bgcolor(final String bgcolor) {
		this.bgcolor = bgcolor;
		return this;
	}
	
	/**
	 * Sets the border color of the hover labels for this trace.
	 * @param bordercolor
	 * @return HoverLabelConfig
	 */
	public HoverLabelConfig bordercolor(final String bordercolor) {
		this.bordercolor = bordercolor;
		return this;
	}
	
	/**
	 * Sets the font used in hover labels.
	 * @param font
	 * @return HoverLabelConfig
	 */
	public HoverLabelConfig font(final FontConfig font) {
		this.font = font;
		return this;
	}
}
