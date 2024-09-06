package com.myfatoorah.api.base;

import com.myfatoorah.api.data.Route;
import io.restassured.http.*;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Specs {
    public static String getEnvironment(){
        String env = System.getProperty("env", "DEMO");
        String baseUrl = switch (env) {
            case "DEMO" -> "https://apitest.myfatoorah.com/v2/";
            case "KUWAIT" -> "https://api.myfatoorah.com/v2/";
            case "KSA" -> "https://api-sa.myfatoorah.com/v2/";
            case "QATAR" -> "https://api-qa.myfatoorah.com/v2/";
            case "EGYPT" -> "https://api-eg.myfatoorah.com/v2/";
            default -> throw new RuntimeException("Env not supported");
        };
        return baseUrl;
    }
    public static RequestSpecification getRequestSpec(){
        return given().
                baseUri(Specs.getEnvironment())
                .contentType(ContentType.JSON).
                log().all()
                .auth().oauth2(Route.token);
    }
}
