package com.interview.coding.challenge.pojos.pointmeta;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonIgnoreProperties("context")
public class Point {

	@JsonProperty("geometry")
	private PointGeometry geometry;

	@JsonProperty("id")
	private String id;

	@JsonProperty("type")
	private String type;

	@JsonProperty("@context")
	private List<?> context;

	@JsonProperty("properties")
	private PointProperties properties;
}