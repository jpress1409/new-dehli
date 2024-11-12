package com.pluralsight.food;

public class Drink {
    private String flavor;
    private double price;
    private String size;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.price = price;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public double getPrice() {
        if(getSize().equalsIgnoreCase("Small")){
        return 2;}
        if(getSize().equalsIgnoreCase("Medium")){
            return 2.5;
        }
        return 3;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
