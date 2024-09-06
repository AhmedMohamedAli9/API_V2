package com.myfatoorah.api.models.payment;

import java.util.*;

public class InitiatePaymentResponse {
    private boolean isSuccess;
    private String message;
    private List<ValidationError> validationErrors;
    private Data data;

    public class ValidationError {
        private String name;
        private String error;

        // Getters and setters if needed
    }

    public class Data {
        private List<PaymentMethod> paymentMethods;

        public class PaymentMethod {
            private int paymentMethodId;
            private String paymentMethodAr;
            private String paymentMethodEn;
            private String paymentMethodCode;
            private boolean isDirectPayment;
            private double serviceCharge;
            private double totalAmount;
            private String currencyIso;
            private String imageUrl;
            private boolean isEmbeddedSupported;
            private String paymentCurrencyIso;

            // Getters and setters if needed
        }
    }

    public List<ValidationError> getValidationErrors() {
        return validationErrors;
    }

    public void setValidationErrors(List<ValidationError> validationErrors) {
        this.validationErrors = validationErrors;
    }
}
