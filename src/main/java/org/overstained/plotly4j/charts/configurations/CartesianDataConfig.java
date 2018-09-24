package org.overstained.plotly4j.charts.configurations;

import java.util.List;

import org.overstained.plotly4j.enums.ChartType;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@JsonInclude(Include.NON_NULL)
public class CartesianDataConfig<T extends CartesianDataConfig<T>> extends BasicDataConfig<T> {
	@JsonProperty("x")
	private List<Integer> x;

	@JsonProperty("y")
	private List<Integer> y;

	protected CartesianDataConfig(ChartType type) {
		super(type);
	}

	/**
	 * Sets the x coordinates.
	 * 
	 * @param x
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T x(final List<Integer> x) {
		if (this.x == null) {
			this.x = x;
		} else {
			this.x.addAll(x);
		}
		return (T) this;
	}

	/**
	 * Sets the y coordinates.
	 * 
	 * @param y
	 * @return T
	 */
	@SuppressWarnings("unchecked")
	public T y(final List<Integer> y) {
		if (this.y == null) {
			this.y = y;
		} else {
			this.y.addAll(y);
		}
		return (T) this;
	}

}
