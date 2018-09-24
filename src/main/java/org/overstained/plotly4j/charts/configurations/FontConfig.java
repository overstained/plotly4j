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
public final class FontConfig {
	@JsonProperty("family")
	private List<String> families;
	
	@JsonProperty("size")
	private List<Integer> sizes;
	
	@JsonProperty("color")
	private String color;
	
	private FontConfig() {
		this.families = new LinkedList<>();
		this.families.add("Arial, sans-serif");
		this.sizes = new LinkedList<>();
		this.sizes.add(13);
	};
	
	public static final FontConfig define() {
		return new FontConfig();
	}
	
	/**
	 * Default entry: "Arial, sans-serif" 
	 * HTML font family - the typeface that will be applied by the web browser. 
	 * The web browser will only be able to apply a font if it is available on 
	 * the system which it operates. Provide multiple font families, separated 
	 * by commas, to indicate the preference in which to apply fonts if they aren't 
	 * available on the system. The plotly service (at https://plot.ly or on-premise) 
	 * generates images on a server, where only a select number of fonts are installed and supported. 
	 * These include "Arial", "Balto", "Courier New", "Droid Sans",, "Droid Serif", "Droid Sans Mono", 
	 * "Gravitas One", "Old Standard TT", "Open Sans", "Overpass", "PT Sans Narrow", "Raleway", 
	 * "Times New Roman".
	 * @param families - Enumeration of font families.
	 * @return FontConfig
	 */
	public FontConfig families(final String... families) {
		this.families = new LinkedList<>();
		Collections.addAll(this.families, families);
		return this;
	}
	
	/**
	 * Default entry: 13
	 * @param sizes - Numbers greater than or equal to 1.
	 * @return FontConfig
	 */
	public FontConfig size(final Integer... sizes) {
		this.sizes = new LinkedList<>();
		Collections.addAll(this.sizes, sizes);
		return this;
	}
	
	/**
	 * 
	 * @param color
	 * @return FontConfig
	 */
	public FontConfig color(final String color) {
		this.color = color;
		return this;
	}
}
