package com.myfatoorah.api.models.payment.paymentModels;

public class CustomerAddress {
    private String Block;
    private String Street;
    private String HouseBuildingNo;
    private String AddressInstructions;

    public String getBlock() {
        return Block;
    }

    public void setBlock(String block) {
        Block = block;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getHouseBuildingNo() {
        return HouseBuildingNo;
    }

    public void setHouseBuildingNo(String houseBuildingNo) {
        HouseBuildingNo = houseBuildingNo;
    }

    public String getAddressInstructions() {
        return AddressInstructions;
    }

    public void setAddressInstructions(String addressInstructions) {
        AddressInstructions = addressInstructions;
    }

    public CustomerAddress(String block, String street, String houseBuildingNo, String addressInstructions) {
        Block = block;
        Street = street;
        HouseBuildingNo = houseBuildingNo;
        AddressInstructions = addressInstructions;
    }
}
