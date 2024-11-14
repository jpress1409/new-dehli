package com.pluralsight.food;

public class Chips {
    private String type;
    private String price;

    public Chips(String type) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return 1.50;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "type='" + type + '\'' +
                '}';
    }
}
