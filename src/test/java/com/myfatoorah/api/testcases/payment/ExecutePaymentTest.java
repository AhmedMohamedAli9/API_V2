package com.myfatoorah.api.testcases.payment;

import com.myfatoorah.api.apis.payment.ExecutePaymentApi;
import com.myfatoorah.api.models.payment.ExecutePayment;
import com.myfatoorah.api.steps.payment.ExecutePaymentSteps;
import io.restassured.response.*;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ExecutePaymentTest {
    @Test
    public void ExecutePaymentWithOnlyMandatoryFields() {
        ExecutePayment body = ExecutePaymentSteps.executePaymentWithOnlyMandatoryFields();
        Response response = ExecutePaymentApi.ExecutePaymentAPIs(body);

        assertThat(response.statusCode(), equalTo(200));
        assertThat(response.jsonPath().getBoolean("IsSuccess"), equalTo(true));
        assertThat(response.jsonPath().getString("Message"), equalTo("Invoice Created Successfully!"));
        assertThat(response.jsonPath().get("ValidationErrors"), nullValue());
        assertThat(response.jsonPath().get("Data.InvoiceId"), notNullValue());
        assertThat(response.jsonPath().get("Data"), notNullValue());
        assertThat(response.jsonPath().get("Data.PaymentURL"), notNullValue());
    }

    @Test
    public void FailToCreateWithAnInvalidPaymentMethodId() {
        ExecutePayment body = new ExecutePayment(55, 100);
        Response response = ExecutePaymentApi.ExecutePaymentAPIs(body);

        assertThat(response.statusCode(), equalTo(400));
        assertThat(response.jsonPath().getBoolean("IsSuccess"), equalTo(false));
        assertThat(response.jsonPath().getString("Message"), equalTo("Invalid data"));
        assertThat(response.jsonPath().get("ValidationErrors"), notNullValue());
        assertThat(response.jsonPath().get("Data"), nullValue());
        assertThat(response.jsonPath().getString("ValidationErrors[0].Error"), equalTo("This payment method is not available"));
        assertThat(response.jsonPath().getString("ValidationErrors[0].Name"), equalTo("PaymentMethodId"));
    }

    @Test
    public void FailToCreateWithAnInvalidAmount() {
        ExecutePayment body = new ExecutePayment(2, 0);
        Response response = ExecutePaymentApi.ExecutePaymentAPIs(body);

        assertThat(response.statusCode(), equalTo(400));
        assertThat(response.jsonPath().getBoolean("IsSuccess"), equalTo(false));
        assertThat(response.jsonPath().getString("Message"), equalTo("Invalid data"));
        assertThat(response.jsonPath().get("ValidationErrors"), notNullValue());
        assertThat(response.jsonPath().get("Data"), nullValue());
        assertThat(response.jsonPath().getString("ValidationErrors[0].Error"), equalTo("Invoice value must be more than 0"));
        assertThat(response.jsonPath().getString("ValidationErrors[0].Name"), equalTo("InvoiceValue"));
    }

    @Test
    public void ExecutePaymentWithRecurring(){
        ExecutePayment body = ExecutePaymentSteps.executeRecurringPayment(2,25,"Daily", 0,20,4);
        Response response = ExecutePaymentApi.ExecutePaymentAPIs(body);

        assertThat(response.statusCode(), equalTo(200));
        assertThat(response.jsonPath().getBoolean("IsSuccess"), equalTo(true));
        assertThat(response.jsonPath().getString("Message"), equalTo("Invoice Created Successfully!"));
        assertThat(response.jsonPath().get("ValidationErrors"), nullValue());
        assertThat(response.jsonPath().get("Data.InvoiceId"), notNullValue());
        assertThat(response.jsonPath().get("Data"), notNullValue());
        assertThat(response.jsonPath().get("Data.PaymentURL"), notNullValue());
        assertThat(response.jsonPath().get("Data.RecurringId"), notNullValue());
        assertThat(response.jsonPath().get("Data.RecurringId"), startsWith("RECUR"));
    }

    @Test
    public void FailToExecutePaymentWithRecurringIntervalWithType(){
        ExecutePayment body = ExecutePaymentSteps.executeRecurringPayment(2,25,"Daily", null,20,4);
        Response response = ExecutePaymentApi.ExecutePaymentAPIs(body);

        assertThat(response.statusCode(), equalTo(400));
        assertThat(response.jsonPath().getBoolean("IsSuccess"), equalTo(false));
        assertThat(response.jsonPath().getString("Message"), equalTo("Invalid data"));
        assertThat(response.jsonPath().get("ValidationErrors"), notNullValue());
        assertThat(response.jsonPath().get("Data"), nullValue());
        assertThat(response.jsonPath().getString("ValidationErrors[0].Error"), equalTo("Interval days can be set on custom recurring type only."));
        assertThat(response.jsonPath().getString("ValidationErrors[0].Name"), equalTo("RecurringModel.IntervalDays"));
    }
}
