package com.interview.coding.challenge.service;

import com.interview.coding.challenge.response.AssertableResponse;
import io.qameta.allure.Step;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class NationalWeatherService {
    private static String BASE_POINTS_URL = "/points/";
    private static String BASE_GRIDPOINT_URL = "/gridpoints/";
    private static String BASE_HOURLY_URL = "/forecast/hourly";



    @Step("Fetching GridPoint by Point")
    public AssertableResponse getGridPointByPoint(String point) {
        String url = BASE_POINTS_URL + point ;

        Response response =
                RestAssured.given()
                        .contentType(ContentType.JSON)
                        .filters(new RequestLoggingFilter(),
                                new ResponseLoggingFilter(),
                                new AllureRestAssured())
                        .when().get(url)
                        .then().extract().response();

        return new AssertableResponse(response);
    }

    @Step("Retrieving hourly forecast")
    public AssertableResponse getHourlyForecast(String office, String gridX, String gridY) {
        String url = BASE_GRIDPOINT_URL + office + "/"+gridX+","+gridY + BASE_HOURLY_URL;

        Response response =
                RestAssured.given()
                        .contentType(ContentType.JSON)
                        .filters(new RequestLoggingFilter(),
                                new ResponseLoggingFilter(),
                                new AllureRestAssured())
                        .when().get(url)
                        .then().extract().response();

        return new AssertableResponse(response);
    }
}
