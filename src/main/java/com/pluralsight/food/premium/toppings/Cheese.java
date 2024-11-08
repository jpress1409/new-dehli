package com.pluralsight.food.premium.toppings;

import com.pluralsight.food.standard.toppings.Topping;

public class Cheese extends Topping {
    private static double price = 1;
    private static double quantity;
    private String name;

    public Cheese() {
        super();

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
