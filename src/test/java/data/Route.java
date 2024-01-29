package data;

import steps.CreateToken;

public class Route {
    public static final String DEMO_V2_URL = "https://apitest.myfatoorah.com/v2/";

    public static final String DEMO_VENDOR_EMAIL = "hohifek482@trackden.com";
    public static final String DEMO_VENDOR_PASSWORD = "A@qw1234";

    public static String token = CreateToken.createToken();
}
