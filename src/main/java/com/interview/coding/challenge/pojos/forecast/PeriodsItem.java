package com.interview.coding.challenge.pojos.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PeriodsItem{

	@JsonProperty("detailedForecast")
	private String detailedForecast;

	@JsonProperty("temperatureTrend")
	private Object temperatureTrend;

	@JsonProperty("shortForecast")
	private String shortForecast;

	@JsonProperty("icon")
	private String icon;

	@JsonProperty("number")
	private int number;

	@JsonProperty("temperatureUnit")
	private String temperatureUnit;

	@JsonProperty("name")
	private String name;

	@JsonProperty("temperature")
	private int temperature;

	@JsonProperty("startTime")
	private String startTime;

	@JsonProperty("isDaytime")
	private boolean isDaytime;

	@JsonProperty("endTime")
	private String endTime;

	@JsonProperty("windDirection")
	private String windDirection;

	@JsonProperty("windSpeed")
	private String windSpeed;
}