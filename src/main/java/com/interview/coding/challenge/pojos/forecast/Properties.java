package com.interview.coding.challenge.pojos.forecast;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Properties{

	@JsonProperty("elevation")
	private Elevation elevation;

	@JsonProperty("validTimes")
	private String validTimes;

	@JsonProperty("forecastGenerator")
	private String forecastGenerator;

	@JsonProperty("generatedAt")
	private String generatedAt;

	@JsonProperty("periods")
	private List<PeriodsItem> periods;

	@JsonProperty("updateTime")
	private String updateTime;

	@JsonProperty("units")
	private String units;

	@JsonProperty("updated")
	private String updated;
}