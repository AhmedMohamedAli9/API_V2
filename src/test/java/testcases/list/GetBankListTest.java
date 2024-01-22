package testcases.list;
import apis.list.ListAPIs;
import io.restassured.response.Response;
import models.Auth;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
public class GetBankListTest extends Auth {

    @Test
    public void shouldReturnBanks(){
        Response response = ListAPIs.getBanks();

        assertThat(response.statusCode(), equalTo(200));
    }
}