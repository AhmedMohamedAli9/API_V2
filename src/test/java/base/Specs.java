package base;

import data.Route;
import io.restassured.http.*;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class Specs {
    public static RequestSpecification getRequestSpec(){
        return given().
                baseUri(Route.DEMO_V2_URL)
                .contentType(ContentType.JSON).
                log().all()
                .auth().oauth2(Route.DEMO_TOKEN);
    }
}
