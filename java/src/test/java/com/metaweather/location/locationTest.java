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
        Response response = request.get("https://www.metaweather.com/api/location/search/?query=san");

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.body());
        Assert.assertTrue(response.body().asString().contains("{\"title\":\"San Francisco\",\"location_type\":\"City\",\"woeid\":2487956,\"latt_long\":\"37.777119, -122.41964\""));

        request = RestAssured.given();
        request.header("Content-Type", "application/json");
        response = request.get("https://www.metaweather.com/api/location/search/?query=london");

        Assert.assertEquals(response.getStatusCode(), 200);
        Assert.assertNotNull(response.body());
        Assert.assertEquals(response.asString(), "[{\"title\":\"London\",\"location_type\":\"City\",\"woeid\":44418,\"latt_long\":\"51.506321,-0.12714\"}]");

        RequestSpecification request2 = RestAssured.given();
        Response response2 = request2.get("https://www.metaweather.com/api/location/search/?query=madeup");

        Assert.assertEquals(response2.getStatusCode(), 200);
        Assert.assertEquals(response2.asString(), "[]");

        RequestSpecification request3 = RestAssured.given();
        request3.header("Accept", "application/json");
        Response response3 = request3.get("https://www.metaweather.com/api/location/search/?lattlong=36.96,-122.02");

        Assert.assertEquals(response3.getStatusCode(), 200);
        Assert.assertNotNull(response3.body());
        Assert.assertEquals(response3.body().asString(), "[{\"distance\":1836,\"title\":\"Santa Cruz\",\"location_type\":\"City\",\"woeid\":2488853,\"latt_long\":\"36.974018,-122.030952\"},{\"distance\":43722,\"title\":\"San Jose\",\"location_type\":\"City\",\"woeid\":2488042,\"latt_long\":\"37.338581,-121.885567\"},{\"distance\":49177,\"title\":\"Mountain View\",\"location_type\":\"City\",\"woeid\":2455920,\"latt_long\":\"37.39999,-122.079552\"},{\"distance\":96531,\"title\":\"Oakland\",\"location_type\":\"City\",\"woeid\":2463583,\"latt_long\":\"37.80508,-122.273071\"},{\"distance\":97420,\"title\":\"San Francisco\",\"location_type\":\"City\",\"woeid\":2487956,\"latt_long\":\"37.777119, -122.41964\"},{\"distance\":185820,\"title\":\"Sacramento\",\"location_type\":\"City\",\"woeid\":2486340,\"latt_long\":\"38.579060,-121.491013\"},{\"distance\":200162,\"title\":\"Fresno\",\"location_type\":\"City\",\"woeid\":2407517,\"latt_long\":\"36.740681,-119.785728\"},{\"distance\":287032,\"title\":\"Lake Tahoe\",\"location_type\":\"City\",\"woeid\":23511744,\"latt_long\":\"39.021400,-120.044823\"},{\"distance\":322803,\"title\":\"Bakersfield\",\"location_type\":\"City\",\"woeid\":2358492,\"latt_long\":\"35.351189,-119.024063\"},{\"distance\":469934,\"title\":\"Los Angeles\",\"location_type\":\"City\",\"woeid\":2442047,\"latt_long\":\"34.053490,-118.245323\"}]");
    }

}
