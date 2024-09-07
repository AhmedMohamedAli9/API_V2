package com.myfatoorah.api.testcases.payment;

import com.myfatoorah.api.apis.payment.InitiatePaymentApi;
import com.myfatoorah.api.models.payment.InitiatePayment;
//import com.myfatoorah.api.*;
import com.myfatoorah.api.steps.payment.InitiatePaymentSteps;
import io.restassured.response.Response;
import org.testng.annotations.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class InitiatePaymentTest {
    @Test
    public void shouldReturnEnabledPaymentMethods(){
        InitiatePayment initiatePayment = InitiatePaymentSteps.initiatePaymentWithData();
        Response response = InitiatePaymentApi.InitiatePaymentAPIs(initiatePayment);
        assertThat(response.statusCode(), equalTo(200));
    }

}
