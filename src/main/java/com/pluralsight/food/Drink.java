package com.pluralsight.food;

public class Drink {
    private String flavor;
    private double price;
    private String size;
    private static int quantity;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.price = price;
        this.size = this.size;
        this.quantity = 0;
    }

    public Drink(String flavor) {
        this.flavor = flavor;
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
    public double calcPrice(){
        switch(getSize()){
            case "SMALL" -> price = 1;
            case "MEDIUM" -> price = 2;
            case "LARGE" -> price = 3;
        }

        return price * getQuantity();
    }

    public static int getQuantity() {
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Drink.quantity = quantity;
    }
}
