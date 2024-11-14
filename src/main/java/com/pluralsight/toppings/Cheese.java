package com.pluralsight.toppings;

public class Cheese extends Topping {


    public Cheese(String name) {
        super(name);

    }

    @Override
    public double calculatePrice(String size) {
        double price = 0;
        switch (size) {
            case "S" -> price = 0.75;
            case "M" -> price = 1.5;
            case "L" -> price = 2.25;
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
