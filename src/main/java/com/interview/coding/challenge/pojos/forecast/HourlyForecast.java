package com.interview.coding.challenge.pojos.forecast;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class HourlyForecast{

	@JsonProperty("geometry")
	private Geometry geometry;

	@JsonProperty("type")
	private String type;

	@JsonProperty("@context")
	private List<?> context;

	@JsonProperty("properties")
	private Properties properties;
}