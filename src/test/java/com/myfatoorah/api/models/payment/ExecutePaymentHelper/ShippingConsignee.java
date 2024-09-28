package com.myfatoorah.api.models.payment.ExecutePaymentHelper;

public class ShippingConsignee {
    private String PersonName;
    private String Mobile;
    private String EmailAddress;
    private String LineAddress;
    private String CityName;
    private String PostalCode;
    private String CountryCode;

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String personName) {
        PersonName = personName;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getLineAddress() {
        return LineAddress;
    }

    public void setLineAddress(String lineAddress) {
        LineAddress = lineAddress;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public ShippingConsignee(String personName, String mobile, String emailAddress, String lineAddress, String cityName, String postalCode, String countryCode) {
        PersonName = personName;
        Mobile = mobile;
        EmailAddress = emailAddress;
        LineAddress = lineAddress;
        CityName = cityName;
        PostalCode = postalCode;
        CountryCode = countryCode;
    }
}
