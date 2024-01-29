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

    //    @Test
//    public void userIsAutherized() {
//
//        Auth auth=new Auth();
//      /*  Auth auth = new Auth();
//        auth.userName.put("username","a.h.medmohamedali99@gmail.com");
//        auth.grant_type.put("grant_type","password");
//        auth.password.put("Password","A@qw1234");
//        auth.countryCodeIso.put("countryCodeIso","KWT");*/
//      Response respone=  given()
//        .baseUri("").contentType("application/x-www-form-urlencoded")
//       // .body(auth)
//        //.body()
//        //.contentType("application/x-www-form-urlencoded")
//                .formParam("grant_type", "password")
//                .formParam("username", "a.h.medmohamedali99@gmail.com")
//                .formParam("password", "A@qw1234")
//                .formParam("countryIsoCode", "KWT")
//                .when().post("/token").then().log().all()
//                .extract().response();
//      //Auth returnAuth= respone.body().as(Auth.class);
//      assertThat(respone.statusCode(),equalTo(200));
//      //assertThat(returnAuth.getAccessToken(),not(equalTo(null)));
    @Test
    public void shouldCreateToken(){
        Response response = TokenApi.getToken();
        String Token = response.body().path("access_token");

        assertThat(response.statusCode(), equalTo(200));
        assertThat(response.body().path("token_type"), equalTo("bearer"));
    }

}