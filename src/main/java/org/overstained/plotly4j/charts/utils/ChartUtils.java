package org.overstained.plotly4j.charts.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface ChartUtils {
	ObjectMapper MAPPER = new ObjectMapper();
	static String convertToJson(Object object) {
		try {
			return MAPPER.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "{}";
	}
}
