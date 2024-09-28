package com.myfatoorah.api.models.payment;
import java.util.*;
import com.myfatoorah.api.models.payment.ExecutePaymentHelper.*;

public class ExecutePayment {

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
}
