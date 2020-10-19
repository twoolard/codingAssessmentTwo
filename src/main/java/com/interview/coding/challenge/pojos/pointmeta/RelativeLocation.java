package com.interview.coding.challenge.pojos.pointmeta;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RelativeLocation{

	@JsonProperty("geometry")
	private PointGeometry geometry;

	@JsonProperty("type")
	private String type;

	@JsonProperty("properties")
	private PointProperties properties;
}