package com.pluralsight.food;

import java.util.Arrays;
import java.util.List;

public class Sandwich {
    private String bread;
    private static String size;
    private static boolean toasted;
    private static double price;

    public Sandwich(String size, String bread, Meat meat, Cheese cheese, List<Sauce> sauces, List<StandardTopping> toppings, boolean toasted) {
        toasted = false;
    }
    public static double calcPrice(){
        double price = 0;
        if(getSize().equalsIgnoreCase("Small")){
            price = Meat.getPrice() + Cheese.getPrice() + 5.5;
        } if(getSize().equalsIgnoreCase("Medium")){
            price = Meat.getPrice() + Cheese.getPrice() + 7;
        }
        if(getSize().equalsIgnoreCase("Large")){
            price = Meat.getPrice() + Cheese.getPrice() + 8.5;
        }
        return price;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public static String getSize() {
        return size;
    }

    public void setSize(String size) {
        Sandwich.size = size;
    }

    public static boolean isToasted() {
        return toasted;
    }

    public static void setToasted(boolean toasted) {
        Sandwich.toasted = toasted;
    }
    public static String[] listBread(){
        String[] breads = new String[4];
        breads[0] = "White";
        breads[1] = "Wheat";
        breads[2] = "Rye";
        breads[3] = "Wrap";

        return breads;
    }
    public static void displayBread(String [] breads){
        for(String bread : breads){
            System.out.println(bread);
        }
    }
}
