package com.myfatoorah.api.apis.payment;

import com.myfatoorah.api.base.Specs;
import com.myfatoorah.api.models.payment.InitiatePayment;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class InitiatePaymentApi {
    public static Response InitiatePaymentAPIs(InitiatePayment initiatePayment){
        return  given().spec(Specs.getRequestSpec())
                .body(initiatePayment)
                .when()
                .post("InitiatePayment")
                .then()
                .log().all()
                .extract().response();
    }
}
