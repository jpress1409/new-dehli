package com.pluralsight.food;

public class Chips {
    private String type;
    private double price;

    public Chips(String type, double price) {
        this.type = type;
        this.price = 0.75;
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

    public void setPrice(double price) {
        this.price = price;
    }
}
