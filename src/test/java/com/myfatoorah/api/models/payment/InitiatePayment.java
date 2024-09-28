package com.myfatoorah.api.models.payment;

import com.myfatoorah.api.models.*;

public class InitiatePayment {
    private int InvoiceAmount;
    private String CurrencyIso;

    // Constructor with parameters
    public InitiatePayment(int InvoiceAmount, String CurrencyIso) {
        this.InvoiceAmount = InvoiceAmount;
        this.CurrencyIso = CurrencyIso;
    }
    public InitiatePayment(){}



    // Getters and setters
    public int getInvoiceAmount() {
        return InvoiceAmount;
    }

    public void setInvoiceAmount(int invoiceAmount) {
        InvoiceAmount = invoiceAmount;
    }

    public String getCurrencyIso() {
        return CurrencyIso;
    }

    public void setCurrencyIso(String currencyIso) {
        CurrencyIso = currencyIso;
    }


}
