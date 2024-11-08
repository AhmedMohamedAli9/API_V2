package com.myfatoorah.api.models.payment.paymentModels;

public class ProcessingDetails {
    private boolean AutoCapture;
    private boolean Bypass3DS;

    public ProcessingDetails(boolean autoCapture, boolean bypass3DS) {
        AutoCapture = autoCapture;
        Bypass3DS = bypass3DS;
    }

    public boolean isAutoCapture() {
        return AutoCapture;
    }

    public void setAutoCapture(boolean autoCapture) {
        AutoCapture = autoCapture;
    }

    public boolean isBypass3DS() {
        return Bypass3DS;
    }

    public void setBypass3DS(boolean bypass3DS) {
        Bypass3DS = bypass3DS;
    }
}