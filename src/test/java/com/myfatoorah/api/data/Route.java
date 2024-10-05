package com.myfatoorah.api.data;

import com.myfatoorah.api.steps.CreateToken;

public class Route {
    public static final String DEMO_V2_URL = "https://apitest.myfatoorah.com/v2/";
    public static final String DEMO_VENDOR_EMAIL = "hohifek482@trackden.com";
    public static final String DEMO_VENDOR_PASSWORD = "A@qw1234";

    //public static String token = CreateToken.createToken();
    public static String token = "L-b8VedSS2E_SvvC47geW6T9lkBixB98PJ3f4jpVfkQljF0vdNHOBuVMhG24n1GdteMQJmkqscyOwFTdIUGbZ30fyXSF008kb0-JW6TKgIQx7Qa2R6AklbhSxSagPbzZmvSDDoe9GJwt8HXtvfmtgQnfkYu0rOFCPLuzl3wEJd0XNwAXOw0UTK7z4IxwxNs8H7jwhR-HtYoHYPNj2DVAwjs_AyBWOWxnmuNR9bQcU3oCBVLQ2E8oJtE4AoHzmuuCzF3k8vovpMb4f3CgArSDglapUZDO4JH6yp50ncLDtv-eBAkIhOh6o8_4IGhL4PcqSiaalj4fLNe_87X9BJHRCwh1MAgmBoXdUTWiRPqessNFJ7L2bDE9b9MxBYEONTlfcEBLBOXflaaB07gTAbu8HKo5P6jFtOF07f3mJoEnTFYqNKxgBSp2MEXRZwsBX7reOO03xRJRlMCDMYIvYm0e1EdZwn3lrHtp56giTDtqqz5wK5P_viHG317G3chuG6i_AOL-NrqlMnPoKRSzIphN7G0ZofgX-DWXhNq2bB83q6-TMZeKbmt4470X1XQQuCh0xxGOY1h-g_actI79BJOLc4TODMnVb74R1mB8Jt1gD9II4-6du8unCPrFmfu1Hwx_menJ2PHmUsncq2x8jvpnI4ft_IOWi0imU7Ofo573s0rRxCOkRUm_g3f1DFApdsf8Sj7bGg";
    //I created this enum to use it later in the language parameter in ExecutePayment and SendPayment, - Not yet used-
    public enum Language{
        AR,
        EN
    }
}
