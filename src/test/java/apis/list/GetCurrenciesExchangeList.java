package apis.list;

import data.Route;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testcases.auth.TokenTest;

import static io.restassured.RestAssured.given;

public class GetCurrenciesExchangeList {
    //test
    public static Response getCurrencies(){
        return             given()
                .baseUri(Route.DEMO_V2_URL)
                .contentType(ContentType.JSON)
                .log().all()
                .auth().oauth2(Route.token)
                .when()
                .get("GetCurrenciesExchangeList")
                .then()
                .log().all()
                .extract().response();
    }
}
