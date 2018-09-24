package org.overstained.plotly4j.charts.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface ChartUtils {
	Logger LOGGER = LogManager.getLogger(ChartUtils.class);
	ObjectMapper MAPPER = new ObjectMapper();

	static String convertToJson(Object object) {
		try {
			return MAPPER.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			LOGGER.error(e);
		}
		return "{}";
	}
}
