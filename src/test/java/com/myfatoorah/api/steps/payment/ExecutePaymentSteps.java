package com.myfatoorah.api.steps.payment;

import com.myfatoorah.api.models.payment.ExecutePayment;

public class ExecutePaymentSteps {
    public static ExecutePayment executePaymentWithOnlyMandatoryFields(){
        int paymentMethodId = 2;
        double invoiceValue = 20;
        return new ExecutePayment(paymentMethodId, invoiceValue);
    }
}
