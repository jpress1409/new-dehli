package com.pluralsight.food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sandwich {
    private String bread;
    private String size;
    private boolean toasted;
    private List<Topping> toppings;
    private double price;

    public Sandwich() {
        this.bread = bread;
        this.size = size;
        this.toasted = toasted;
        this.toppings = new ArrayList<>();
        this.price = price;
    }


    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public double getPrice() {

        double price = 0;
        switch (size) {
            case "S" -> price = 5.5;
            case "M" -> price = 7;
            case "L" -> price = 8.5;
            default -> System.out.println("Invalid size, defaulting to size 'M'");
        }

        // Add the price of each topping
        for (Topping topping : toppings) {
            price += topping.calculatePrice(size);
        }

        return price;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", size='" + size + '\'' +
                ", toasted=" + toasted +
                ", toppings=" + toppings +
                '}';
    }
}
