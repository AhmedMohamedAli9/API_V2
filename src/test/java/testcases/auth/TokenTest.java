package testcases.auth;

import apis.auth.TokenApi;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Auth;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TokenTest {

    public static String Token;


    @Test
    public void shouldCreateToken(){
        Response response = TokenApi.getToken();
        String Token = response.body().path("access_token");

        assertThat(response.statusCode(), equalTo(200));
        assertThat(response.body().path("token_type"), equalTo("bearer"));
    }

}