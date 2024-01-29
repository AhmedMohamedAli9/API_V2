package apis.list;
import base.Specs;
import data.Route;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testcases.auth.TokenTest;

import static io.restassured.RestAssured.given;
public class ListAPIs {
    public static Response getBanks(){
        return given().spec(Specs.getRequestSpec())
                .when()
                .get("GetBanks")
                .then()
                .log().all()
                .extract().response();
    }
    public static Response getCurrencies(){
        return             given()
                .baseUri(Route.DEMO_V2_URL)
                .contentType(ContentType.JSON)
                .log().all()
                .auth().oauth2(TokenTest.Token)
                .when()
                .get("GetCurrenciesExchangeList")
                .then()
                .log().all()
                .extract().response();
    }
}
