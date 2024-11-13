package com.pluralsight.food;

public class Chip {
    private String type;
    private double price;
    private int quantity;

    public Chip(String type) {
        this.type = type;
        this.price = price;
        this.quantity = 0;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return 0.75;
    }


    @Override
    public String toString() {
        return "Chip{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
