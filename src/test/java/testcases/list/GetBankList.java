package api.v2.list;
import api.v2.auth.Token;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.Auth;
import models.ErrorMessage;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class GetBankList extends Auth {

    @Test
    public void GetBankList() {

        String token = "HU-eAmmdsHHEni7TdgFkuYMU5WYhmIg6sFEtNd9I2HFyRO4MqFqYJ-3Icprc0Sp3Ca6BN0gwpIarR_c02QC6FcNxMU2u0nDLwJTSujcs6_TQ4vlj-_zkKhNqeHUxOw3CDWDAzRRCI0NgHarJbucJEsLAOCr1yaVxFZbwAJfxRwde4_eGtGmT54zfH_W42RLewgGxq6EoXe1hPPlgC2wNlfHkrQG5zvcmuLu6jZJ1pTzOPr_k0YR9-BlAtDUC6BTJ39jeZ8lF_nhyzmaULoj7nGiHoMGJ7Ym2OCfZGG5Wl8CIlSsZrkDaQLsuBHiWsIBNLwp7-DYNVJv0Go4sYvdOfBdrAT9houmaAzNTAO9bgY3H1XbkHQK7G3FCvdXhV5BNnrRWCWjKwckQi7UtHjKiNl2tT-vJ4qbBYxPSOVuPnocLNyvDVCqc34M8DaGPf6Gtjp9A58iwbRk51lA9kUCk8J8QizHcYQJsNM2s-M719iqaJQNnd7mY5OESGMRykDwP5HsToURzKskfWD5XHo2s6ocWtxuuZsqcdaP99kYYdofWjgJeX3DCe33AP_lNJO1z5t8Df040jp7JyN8qqTfPUF--Jfd5WixnF8LCX_k0yGBlpdtzhdz74Bwd_WyhJlE2y3xcJJxLbEbxI7BSoChbJlce7bvBR_VE0sKWJu8AfYZkZNZX";
       Response response= given()
                .baseUri("https://apitest.myfatoorah.com").contentType(ContentType.JSON)
                .auth().oauth2(token)
                .when().get("/v2/GetBanks").then().log().all().extract().response();
        ErrorMessage returnedError = response.body().as(ErrorMessage.class);
        assertThat(response.statusCode(),equalTo(200));
        assertThat(response.path("Text"),hasItems("Kuwait - NBK"));

    }
}