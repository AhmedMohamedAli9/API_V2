package testcases.list;
import apis.list.GetBanksApi;
import io.restassured.response.Response;
import models.Auth;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class GetBankListTest extends Auth {

    @Test
    public void shouldReturnBanks(){
        Response response = GetBanksApi.getBanks();
        assertThat(response.statusCode(), equalTo(200));
    }
}