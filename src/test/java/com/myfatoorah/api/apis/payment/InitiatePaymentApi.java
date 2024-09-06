package com.myfatoorah.api.apis.payment;

import com.myfatoorah.api.base.Specs;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class InitiatePaymentApi {
    public static Response InitiatePaymentAPIs(){
        return  given().spec(Specs.getRequestSpec())
                .when()
                .get("InitiatePayment")
                .then()
                .log().all()
                .extract().response();
    }
}
