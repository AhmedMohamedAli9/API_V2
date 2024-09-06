package com.myfatoorah.api.apis.list;
import com.myfatoorah.api.base.Specs;
import com.myfatoorah.api.data.Route;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import com.myfatoorah.api.testcases.auth.TokenTest;

import static io.restassured.RestAssured.given;
public class ListAPIs {
    public static Response getBanks(){
        return  given().spec(Specs.getRequestSpec())
                .when()
                .get("GetBanks")
                .then()
                .log().all()
                .extract().response();
    }
    public static Response getCurrencyList(){
        return  given().spec(Specs.getRequestSpec())
                .when()
                .get("GetCurrenciesExchangeList")
                .then()
                .log().all()
                .extract().response();
    }
}
