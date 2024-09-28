package com.myfatoorah.api.models.payment;
import java.util.*;
import com.myfatoorah.api.models.payment.ExecutePaymentHelper.*;

public class ExecutePayment {
    /**
     * In this section we are adding all the parameters/objects that we need in
     * ExecutePayment
     */
    private int PaymentMethodId;
    private String SessionId;
    private RecurringModel RecurringModel;
    private String CustomerName;
    private String DisplayCurrencyIso;
    private String MobileCountryCode;
    private String CustomerMobile;
    private String CustomerEmail;
    private double InvoiceValue;
    private String Language;
    private String CustomerReference;
    private String CustomerCivilId;
    private String UserDefinedField;
    private String CallBackUrl;
    private String ErrorUrl;
    private CustomerAddress CustomerAddress;
    private String ExpiryDate;
    private List<InvoiceItem> InvoiceItems;
    private int ShippingMethod;
    private ShippingConsignee ShippingConsignee;
    private List<Supplier> Suppliers;
    private ProcessingDetails ProcessingDetails;

    /**
     * These are the groups of setters and getters for each parameter/object
     */
    public int getPaymentMethodId() {
        return PaymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        PaymentMethodId = paymentMethodId;
    }

    public String getSessionId() {
        return SessionId;
    }

    public void setSessionId(String sessionId) {
        SessionId = sessionId;
    }

    public com.myfatoorah.api.models.payment.ExecutePaymentHelper.RecurringModel getRecurringModel() {
        return RecurringModel;
    }

    public void setRecurringModel(com.myfatoorah.api.models.payment.ExecutePaymentHelper.RecurringModel recurringModel) {
        RecurringModel = recurringModel;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getDisplayCurrencyIso() {
        return DisplayCurrencyIso;
    }

    public void setDisplayCurrencyIso(String displayCurrencyIso) {
        DisplayCurrencyIso = displayCurrencyIso;
    }

    public String getMobileCountryCode() {
        return MobileCountryCode;
    }

    public void setMobileCountryCode(String mobileCountryCode) {
        MobileCountryCode = mobileCountryCode;
    }

    public String getCustomerMobile() {
        return CustomerMobile;
    }

    public void setCustomerMobile(String customerMobile) {
        CustomerMobile = customerMobile;
    }

    public String getCustomerEmail() {
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        CustomerEmail = customerEmail;
    }

    public double getInvoiceValue() {
        return InvoiceValue;
    }

    public void setInvoiceValue(double invoiceValue) {
        InvoiceValue = invoiceValue;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String language) {
        Language = language;
    }

    public String getCustomerReference() {
        return CustomerReference;
    }

    public void setCustomerReference(String customerReference) {
        CustomerReference = customerReference;
    }

    public String getCustomerCivilId() {
        return CustomerCivilId;
    }

    public void setCustomerCivilId(String customerCivilId) {
        CustomerCivilId = customerCivilId;
    }

    public String getUserDefinedField() {
        return UserDefinedField;
    }

    public void setUserDefinedField(String userDefinedField) {
        UserDefinedField = userDefinedField;
    }

    public String getCallBackUrl() {
        return CallBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        CallBackUrl = callBackUrl;
    }

    public String getErrorUrl() {
        return ErrorUrl;
    }

    public void setErrorUrl(String errorUrl) {
        ErrorUrl = errorUrl;
    }

    public com.myfatoorah.api.models.payment.ExecutePaymentHelper.CustomerAddress getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(com.myfatoorah.api.models.payment.ExecutePaymentHelper.CustomerAddress customerAddress) {
        CustomerAddress = customerAddress;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public List<InvoiceItem> getInvoiceItems() {
        return InvoiceItems;
    }

    public void setInvoiceItems(List<InvoiceItem> invoiceItems) {
        InvoiceItems = invoiceItems;
    }

    public int getShippingMethod() {
        return ShippingMethod;
    }

    public void setShippingMethod(int shippingMethod) {
        ShippingMethod = shippingMethod;
    }

    public com.myfatoorah.api.models.payment.ExecutePaymentHelper.ShippingConsignee getShippingConsignee() {
        return ShippingConsignee;
    }

    public void setShippingConsignee(com.myfatoorah.api.models.payment.ExecutePaymentHelper.ShippingConsignee shippingConsignee) {
        ShippingConsignee = shippingConsignee;
    }

    public List<Supplier> getSuppliers() {
        return Suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        Suppliers = suppliers;
    }

    public com.myfatoorah.api.models.payment.ExecutePaymentHelper.ProcessingDetails getProcessingDetails() {
        return ProcessingDetails;
    }

    public void setProcessingDetails(com.myfatoorah.api.models.payment.ExecutePaymentHelper.ProcessingDetails processingDetails) {
        ProcessingDetails = processingDetails;
    }
    /**
     * Here we will add constructors based on our choices for testing the ExecutePayment based on the flow that we will need to do.
     * There will probably be a lot of constructors here
     */
    public ExecutePayment(int paymentMethodId, double invoiceValue) {
        PaymentMethodId = paymentMethodId;
        InvoiceValue = invoiceValue;
    }
}
