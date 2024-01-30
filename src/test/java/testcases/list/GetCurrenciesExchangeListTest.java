package testcases.list;

import apis.list.GetBanksApi;
import apis.list.GetCurrenciesExchangeListApi;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;

public class GetCurrenciesExchangeListTest {

    @Test
    public void shouldReturnExchangeList(){
        Response response = GetCurrenciesExchangeListApi.getCurrencies();
        assertThat(response.statusCode(), equalTo(200));
    }
}
