package com.pluralsight.food;

public class Cheese extends Topping {
    private static double price;

    public Cheese(String name) {
        super(name);

    }

   public static double getPrice(){
        switch(Sandwich.getSize()){
            case "Small" -> price = 0.75;
            case "Medium" -> price = 1.5;
            case "Large" -> price = 2.25;
        }
        return price;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
