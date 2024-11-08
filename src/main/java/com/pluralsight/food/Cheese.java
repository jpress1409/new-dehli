package com.pluralsight.food;

public class Cheese extends PremiumTopping {
    private static double price = 1;
    private static double quantity;
    private String name;

    public Cheese(String name) {
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

    public static double getQuantity() {
        return quantity;
    }

    public static void setQuantity(double quantity) {
        Cheese.quantity = quantity;
    }

}
