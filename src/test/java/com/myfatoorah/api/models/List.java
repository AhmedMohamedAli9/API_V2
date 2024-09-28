package com.myfatoorah.api.models;

public class List {
    private int Value;
    private String Text;

    public List(int value, String text) {
        Value = value;
        Text = text;
    }

    public int getValue() {
        return Value;
    }

    public void setValue(int value) {
        Value = value;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
