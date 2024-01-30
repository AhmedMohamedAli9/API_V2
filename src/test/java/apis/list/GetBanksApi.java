package apis.list;
import base.Specs;
import data.Route;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import testcases.auth.TokenTest;

import static io.restassured.RestAssured.given;
public class GetBanksApi {
    public static Response getBanks(){
        return given().spec(Specs.getRequestSpec())
                .when()
                .get("GetBanks")
                .then()
                .log().all()
                .extract().response();
    }


}
