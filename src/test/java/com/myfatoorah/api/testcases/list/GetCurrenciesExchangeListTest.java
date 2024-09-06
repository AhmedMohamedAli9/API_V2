package com.myfatoorah.api.testcases.list;

import com.myfatoorah.api.apis.list.ListAPIs;
import io.restassured.response.Response;
import com.myfatoorah.api.models.Auth;


import java.util.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetCurrenciesExchangeListTest {
    @Test
    public void shouldReturnStatusCode200() {
        Response response = ListAPIs.getCurrencyList();
        assertThat(response.statusCode(), equalTo(200));
    }

    @Test
    public void shouldContainKeysValueAndText() {
        Response response = ListAPIs.getCurrencyList();
        List<Map<String, Object>> responseList = response.getBody().jsonPath().getList("");
        for (Map<String, Object> item : responseList) {
            assertThat(item, hasKey("Value"));
            assertThat(item, hasKey("Text"));
        }
    }

    @Test
    public void shouldContainNonEmptyText() {
        Response response = ListAPIs.getCurrencyList();
        List<Map<String, Object>> responseList = response.getBody().jsonPath().getList("");
        for (Map<String, Object> item : responseList) {
            String text = (String) item.get("Text");
            assertThat(text, not(emptyOrNullString()));
        }
    }

    @Test
    public void shouldContainUniqueCurrencyCodes() {
        Response response = ListAPIs.getCurrencyList();
        List<Map<String, Object>> responseList = response.getBody().jsonPath().getList("");
        Set<String> currencyCodes = new HashSet<>();
        for (Map<String, Object> item : responseList) {
            String text = (String) item.get("Text");
            assertThat(currencyCodes, not(hasItem(text))); // Ensure the currency code is unique
            currencyCodes.add(text);
        }
    }

    @Test
    public void shouldHaveFirstItemValueOfOneAsFloat() {
        Response response = ListAPIs.getCurrencyList();
        List<Map<String, Object>> responseList = response.getBody().jsonPath().getList("");

        // Ensure the list is not empty
        assertThat(responseList, not(empty()));

        // Get the first item
        Map<String, Object> firstItem = responseList.get(0);

        // Check if the first item has a 'Value' key
        assertThat(firstItem, hasKey("Value"));

        // Parse the 'Value' as a float
        float value = Float.parseFloat(firstItem.get("Value").toString());

        // Assert that the 'Value' is 1.0f
        assertThat(value, equalTo(1.0f));
    }


}
