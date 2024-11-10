package com.pluralsight.food;

public class Cheese extends Topping {
    private static double price = 1;
    private static double quantity;
    private String name;

    public Cheese(String name) {
        super(name);

    }

    public static double calcPrice(){
        return price * getQuantity();
    }

    public static double getQuantity() {
        return quantity;
    }

    public static void setQuantity(double quantity) {
        Cheese.quantity = quantity;
    }

}
