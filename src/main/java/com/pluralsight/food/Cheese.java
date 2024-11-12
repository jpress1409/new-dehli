package com.pluralsight.food;

public class Cheese extends Topping {
    private static double price = 1;
    private static double quantity;
    private String name;

    public Cheese(String name) {
        super(name);

    }

    public static double getPrice(){
        if(Sandwich.getSize().equalsIgnoreCase("Small")) {
            return .75 * getQuantity();
        }
        if(Sandwich.getSize().equalsIgnoreCase("Medium")){
            return 1.5 * getQuantity();
        }
        return 2.25 * getQuantity();
    }

    public static double getQuantity() {
        return quantity;
    }

    public static void setQuantity(double quantity) {
        Cheese.quantity = quantity;
    }

}
