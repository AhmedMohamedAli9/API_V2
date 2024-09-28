package com.myfatoorah.api.apis.payment;

import com.myfatoorah.api.base.Specs;
import com.myfatoorah.api.models.payment.ExecutePayment;
import com.myfatoorah.api.models.payment.InitiatePayment;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ExecutePaymentApi {
    public static Response ExecutePaymentAPIs(ExecutePayment executePayment){
        return  given().spec(Specs.getRequestSpec())
                .body(executePayment)
                .when()
                .post("ExecutePayment")
                .then()
                .log().all()
                .extract().response();
    }
}
