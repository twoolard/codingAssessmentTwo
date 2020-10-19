package com.interview.coding.challenge.pojos.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Elevation{

	@JsonProperty("unitCode")
	private String unitCode;

	@JsonProperty("value")
	private double value;
}