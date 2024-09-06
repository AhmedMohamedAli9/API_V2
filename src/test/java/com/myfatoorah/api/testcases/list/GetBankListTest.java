package com.myfatoorah.api.testcases.list;

import com.myfatoorah.api.apis.list.ListAPIs;
import io.restassured.response.Response;
import com.myfatoorah.api.models.Auth;

import java.util.*;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetBankListTest extends Auth {

    @Test
    public void shouldReturnBanks() {
        Response response = ListAPIs.getBanks();

        assertThat(response.statusCode(), equalTo(200));
        // Check if each bank has a 'Value' & 'Text' key and is not empty
        List<Map<String, Object>> responseList = response.getBody().jsonPath().getList("");
        for (Map<String, Object> item : responseList) {
            assertThat(item, hasKey("Value"));
            assertThat(item.get("Value").toString(), not(equalTo("")));
            assertThat(item.get("Value").toString(), not(equalTo(null)));
            // Optionally, check for the 'Text' key as well if needed
            assertThat(item, hasKey("Text"));
            assertThat(item.get("Text").toString(), not(equalTo("")));
            assertThat(item.get("Text").toString(), not(equalTo(null)));
        }
    }
}