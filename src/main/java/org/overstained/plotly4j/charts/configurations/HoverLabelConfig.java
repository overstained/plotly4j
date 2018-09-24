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
public final class HoverLabelConfig {
	@JsonProperty("bgcolor")
	private String bgColor;
	
	@JsonProperty("borderColor")
	private String borderColor;
	
	@JsonProperty("font")
	private FontConfig font;
	
	@JsonProperty("namelength")
	private List<Integer> nameLengths;
	
	private HoverLabelConfig() {};
	
	public static final HoverLabelConfig define() {
		return new HoverLabelConfig();
	}
	
	/**
	 * Sets the background color of the hover labels for this trace
	 * @param bgColor
	 * @return HoverLabelConfig
	 */
	public HoverLabelConfig bgcolor(final String bgColor) {
		this.bgColor = bgColor;
		return this;
	}
	
	/**
	 * Sets the border color of the hover labels for this trace.
	 * @param borderColor
	 * @return HoverLabelConfig
	 */
	public HoverLabelConfig borderColor(final String borderColor) {
		this.borderColor = borderColor;
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
