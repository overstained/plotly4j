package org.overstained.plotly4j.jackson;

import java.io.IOException;

import org.overstained.plotly4j.enums.ChartEnum;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class EnumSerializer extends JsonSerializer<ChartEnum> {

	@Override
	public void serialize(ChartEnum chartEnum, JsonGenerator jsonGenerator, SerializerProvider serializerProvider)
			throws IOException, JsonProcessingException {
		jsonGenerator.writeObject(chartEnum.getValue());
	}
}