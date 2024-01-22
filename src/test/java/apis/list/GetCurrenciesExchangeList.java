package apis.list;

import data.Route;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class GetCurrenciesExchangeList {
    public static Response getCurrencies(){
        return             given()
                .baseUri(Route.DEMO_V2_URL)
                .contentType(ContentType.JSON)
                .log().all()
                .auth().oauth2(Route.DEMO_TOKEN)
                .when()
                .get("GetCurrenciesExchangeList")
                .then()
                .log().all()
                .extract().response();
    }
}
