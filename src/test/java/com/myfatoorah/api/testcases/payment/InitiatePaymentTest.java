package com.myfatoorah.api.testcases.payment;

import com.myfatoorah.api.apis.payment.InitiatePaymentApi;
import com.myfatoorah.api.models.payment.InitiatePayment;
//import com.myfatoorah.api.*;
import com.myfatoorah.api.steps.payment.InitiatePaymentSteps;
import io.restassured.response.Response;
import org.testng.annotations.*;

import java.util.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class InitiatePaymentTest {
    @Test
    public void returnSuccessfulResponseWhenDataIsSent() {
        InitiatePayment initiatePayment = InitiatePaymentSteps.initiatePaymentWithData();
        Response response = InitiatePaymentApi.InitiatePaymentAPIs(initiatePayment);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(response.jsonPath().getBoolean("IsSuccess"), equalTo(true));
        assertThat(response.jsonPath().getString("Message"), equalTo("Initiated Successfully!"));
        assertThat(response.jsonPath().get("ValidationErrors"), nullValue());
        assertThat(response.jsonPath().get("Data"), notNullValue());
    }

    @Test
    public void returnSuccessfulResponseWhenNoDataIsSent() {
        InitiatePayment initiatePayment = InitiatePaymentSteps.initiatePaymentWithoutData();
        Response response = InitiatePaymentApi.InitiatePaymentAPIs(initiatePayment);
        assertThat(response.statusCode(), equalTo(200));
        assertThat(response.jsonPath().getBoolean("IsSuccess"), equalTo(true));
        assertThat(response.jsonPath().getString("Message"), equalTo("Initiated Successfully!"));
        assertThat(response.jsonPath().get("ValidationErrors"), nullValue());
        assertThat(response.jsonPath().get("Data"), notNullValue());
    }

    @Test
    public void shouldReturnEnabledPaymentMethodsWithUniqueIds() {
        InitiatePayment initiatePayment = InitiatePaymentSteps.initiatePaymentWithData();
        Response response = InitiatePaymentApi.InitiatePaymentAPIs(initiatePayment);
        List<Map<String, Object>> paymentMethods = response.jsonPath().getList("Data.PaymentMethods");
        Set<Integer> paymentMethodIds = new HashSet<>();
        for (Map<String, Object> method : paymentMethods) {
            Integer paymentMethodId = (Integer) method.get("PaymentMethodId");
            paymentMethodIds.add(paymentMethodId);
        }
        assertThat(paymentMethodIds.size(), equalTo(paymentMethods.size()));
    }

    @Test
    public void shouldFailToSendInvalidCurrenciesWithAmount() {
        InitiatePayment initiatePayment = new InitiatePayment(10, "kwc");
        Response response = InitiatePaymentApi.InitiatePaymentAPIs(initiatePayment);
        assertThat(response.statusCode(),equalTo(400));
        assertThat(response.body().jsonPath().getString("Message"), equalTo("Invalid data"));
        List<Map<String, String>> validationErrors = response.jsonPath().getList("ValidationErrors");

        boolean ErrorFound = validationErrors.stream().anyMatch(error ->
                "CurrencyIso".equals(error.get("Name")) &&
                        "The currency is not supported".equals(error.get("Error"))
        );

        assertThat(ErrorFound, is(true));
    }



}
