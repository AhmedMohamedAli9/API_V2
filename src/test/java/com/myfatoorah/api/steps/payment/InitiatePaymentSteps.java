package com.myfatoorah.api.steps.payment;

import com.myfatoorah.api.models.payment.InitiatePayment;

public class InitiatePaymentSteps {
    public static InitiatePayment initiatePaymentWithData() {
        int InvoiceAmount = 10;
        String CurrencyIso = "KWD";
        return new InitiatePayment(InvoiceAmount, CurrencyIso);
    }
    public static InitiatePayment initiatePaymentWithoutData() {
        return new InitiatePayment();
    }
}
