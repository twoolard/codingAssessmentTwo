package com.interview.coding.challenge.test;

import com.interview.coding.challenge.pojos.forecast.HourlyForecast;
import com.interview.coding.challenge.pojos.forecast.PeriodsItem;
import com.interview.coding.challenge.pojos.forecast.Properties;
import com.interview.coding.challenge.pojos.pointmeta.Point;
import com.interview.coding.challenge.pojos.pointmeta.PointProperties;
import com.interview.coding.challenge.response.AssertableResponse;
import com.interview.coding.challenge.service.NationalWeatherService;
import com.interview.coding.challenge.utils.properties.TestConstant;
import com.interview.coding.challenge.utils.properties.TestProperties;
import io.restassured.RestAssured;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import static com.interview.coding.challenge.utils.LogUtil.info;

public class NationalWeatherTests {

    private NationalWeatherService nationalWeatherService = new NationalWeatherService();
    private String location = TestProperties.getProperty(TestConstant.LOCATION);

    @BeforeClass
    static void setUp(){
        RestAssured.baseURI = TestProperties.getProperty(TestConstant.BACKEND_URL);
    }

    @Test
    public void testGetHourlyForecast(){
        AssertableResponse response = nationalWeatherService.getGridPointByPoint(location);
        response.assertStatus(HttpStatus.SC_OK);
        Point point = response.getResponseBody(Point.class);
        PointProperties properties = point.getProperties();

        String gridId = properties.getGridId();
        String gridX = properties.getGridX();
        String gridY = properties.getGridY();

        AssertableResponse forecastResponse = nationalWeatherService.getHourlyForecast(gridId, gridX, gridY);
        forecastResponse.assertStatus(HttpStatus.SC_OK);
        HourlyForecast hourlyForecast = forecastResponse.getResponseBody(HourlyForecast.class);
        Properties forecast = hourlyForecast.getProperties();
        List<PeriodsItem> periodsItems = forecast.getPeriods();

        for (PeriodsItem period:periodsItems) {
            String time = period.getStartTime();
            String shortForecast = period.getShortForecast();
            int temp = period.getTemperature();
            String windSpeed = period.getWindSpeed();

            info("The weather @ "+time+" will be "+shortForecast+" with temperatures at "+temp+" degrees fahrenheit and wind speeds of "+windSpeed);
        }


    }



}
