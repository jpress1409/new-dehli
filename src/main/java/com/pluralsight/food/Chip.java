package com.pluralsight.food;

public class Chip {
    private String type;
    private double price;
    private int quantity;

    public Chip(String type) {
        this.type = type;
        this.price = 0.75;
        this.quantity = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double calcPrice() {
        return 0.75 * getQuantity();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
