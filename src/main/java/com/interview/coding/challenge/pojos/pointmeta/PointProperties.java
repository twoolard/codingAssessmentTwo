package com.interview.coding.challenge.pojos.pointmeta;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PointProperties {

	@JsonProperty("radarStation")
	private String radarStation;

	@JsonProperty("fireWeatherZone")
	private String fireWeatherZone;

	@JsonProperty("@type")
	private String type;

	@JsonProperty("forecastZone")
	private String forecastZone;

	@JsonProperty("county")
	private String county;

	@JsonProperty("timeZone")
	private String timeZone;

	@JsonProperty("forecast")
	private String forecast;

	@JsonProperty("cwa")
	private String cwa;

	@JsonProperty("relativeLocation")
	private RelativeLocation relativeLocation;

	@JsonProperty("forecastHourly")
	private String forecastHourly;

	@JsonProperty("observationStations")
	private String observationStations;

	@JsonProperty("gridX")
	private String gridX;

	@JsonProperty("forecastGridData")
	private String forecastGridData;

	@JsonProperty("gridY")
	private String gridY;

	@JsonProperty("forecastOffice")
	private String forecastOffice;

	@JsonProperty("@id")
	private String id;

	@JsonProperty("gridId")
	private String gridId;

	@JsonProperty("distance")
	private Distance distance;

	@JsonProperty("city")
	private String city;

	@JsonProperty("bearing")
	private Bearing bearing;

	@JsonProperty("state")
	private String state;
}