package com.myfatoorah.api.models.payment.ExecutePaymentHelper;

public class InvoiceItem {
    private String ItemName;
    private int Quantity;
    private double UnitPrice;
    private double Weight;
    private double Width;
    private double Height;
    private double Depth;

    public String getItemName() {
        return ItemName;
    }

    public void setItemName(String itemName) {
        ItemName = itemName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double height) {
        Height = height;
    }

    public double getDepth() {
        return Depth;
    }

    public void setDepth(double depth) {
        Depth = depth;
    }

    public InvoiceItem(String itemName, int quantity, double unitPrice, double weight, double width, double height, double depth) {
        ItemName = itemName;
        Quantity = quantity;
        UnitPrice = unitPrice;
        Weight = weight;
        Width = width;
        Height = height;
        Depth = depth;
    }
}
