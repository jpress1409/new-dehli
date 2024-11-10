package com.pluralsight.food;


public class Meat extends Topping {
    private static double price = 1;
    private static int quantity;
    private String name;

    public Meat(String name) {
        super(name);
    }

    public static double calcPrice(){
        return price * getQuantity();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
