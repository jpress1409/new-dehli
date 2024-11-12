package com.pluralsight.food;


public class Meat extends Topping {
    private static double price;
    private static int quantity;
    private String name;

    public Meat(String name) {
        super(name);
    }

   public static double getPrice(){
        if(Sandwich.getSize().equalsIgnoreCase("Small")){
        return 1 * getQuantity();}
        if(Sandwich.getSize().equalsIgnoreCase("Medium")){
            return 2 * getQuantity();
        }
        return 3 * getQuantity();
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
