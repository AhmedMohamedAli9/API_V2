package com.myfatoorah.api.models.payment;

public class InitiatePayment {
    private int InvoiceAmount;
    private String CurrencyIso;


    public InitiatePayment(int InvoiceAmount, String CurrencyIso)
    {
        this.InvoiceAmount = InvoiceAmount;
        this.CurrencyIso = CurrencyIso;
    }

    public InitiatePayment() {
    }

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
