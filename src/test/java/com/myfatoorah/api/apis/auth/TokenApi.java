package com.myfatoorah.api.apis.auth;

import com.myfatoorah.api.data.Route;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TokenApi {
    public static Response getToken(){
        return
        given().baseUri("https://apitest.myfatoorah.com/")
                .contentType(ContentType.URLENC)
                .formParam("grant_type", "password")
                .formParam("username", Route.DEMO_VENDOR_EMAIL)
                .formParam("password", Route.DEMO_VENDOR_PASSWORD)
                .formParam("countryIsoCode", "KWT")
        .when()
                .post("Token")
        .then()
                .log().all()
                .extract().response();
    }
}
