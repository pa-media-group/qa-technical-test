package com.metaweather.location;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

public class locationTest {

    @Test
    public void getVarietyOfAPILocations() {
        RestAssured.baseURI = "https://www.metaweather.com";

        RequestSpecification request = RestAssured.given();
        request.header("Content-Type", "application/json");
        Response response = request.get("https://www.metaweather.com/api/location/search/?query=london");

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.body());
        Assert.assertEquals(response.asString(), "[{\"title\":\"London\",\"location_type\":\"City\",\"woeid\":44418,\"latt_long\":\"51.506321,-0.12714\"}]");

        RequestSpecification request2 = RestAssured.given();
        Response response2 = request2.get("https://www.metaweather.com/api/location/search/?query=madeup");

        Assert.assertEquals(response2.getStatusCode(), 200);
        Assert.assertEquals(response2.asString(), "[]");

    }

}
