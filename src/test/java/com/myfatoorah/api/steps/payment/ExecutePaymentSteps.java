package com.myfatoorah.api.steps.payment;

import com.myfatoorah.api.models.payment.ExecutePayment;
import com.myfatoorah.api.models.payment.paymentModels.RecurringModel;

public class ExecutePaymentSteps {


    public static ExecutePayment executePaymentWithOnlyMandatoryFields(){
        int paymentMethodId = 2;
        double invoiceValue = 20;
        return new ExecutePayment(paymentMethodId, invoiceValue);
    }

    public static ExecutePayment executeRecurringPayment(int paymentMethod, double amount, String type, Integer interval, int iterations, int retry){
        RecurringModel rec = new RecurringModel(type, interval, iterations, retry);
        return new ExecutePayment(paymentMethod, amount, rec);
    }
}
