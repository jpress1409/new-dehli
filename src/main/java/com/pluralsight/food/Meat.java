package com.pluralsight.food;


public class Meat extends Topping {
    private static double price;

    public Meat(String name) {
        super(name);
    }

    public static double getPrice(){
        switch(Sandwich.getSize()){
            case "Small" -> price = 1;
            case "Medium" -> price = 2;
            case "Large" -> price = 3;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Meat{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
