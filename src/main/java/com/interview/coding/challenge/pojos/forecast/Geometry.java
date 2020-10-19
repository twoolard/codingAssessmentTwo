package com.interview.coding.challenge.pojos.forecast;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Geometry{

	@JsonProperty("coordinates")
	private List<List<List<Double>>> coordinates;

	@JsonProperty("type")
	private String type;
}