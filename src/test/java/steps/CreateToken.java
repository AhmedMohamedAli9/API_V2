package steps;

import apis.auth.TokenApi;
import io.restassured.response.Response;

public class CreateToken {
    public static String createToken(){
        Response response = TokenApi.getToken();
        return response.body().path("access_token");
    }
}
