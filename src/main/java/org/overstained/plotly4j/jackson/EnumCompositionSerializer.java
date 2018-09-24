package org.overstained.plotly4j.jackson;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

import org.overstained.plotly4j.enums.ChartEnum;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class EnumCompositionSerializer extends JsonSerializer<List<ChartEnum>> {

	@Override
	public void serialize(List<ChartEnum> chartEnums, JsonGenerator jsonGenerator,
			SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
		jsonGenerator.writeObject(chartEnums
				.stream()
				.map(ChartEnum::getValue)
				.collect(Collectors.joining("+")));
	}
}