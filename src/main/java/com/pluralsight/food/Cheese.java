package com.pluralsight.food;

public class Cheese extends Topping {


    public Cheese(String name) {
        super(name);

    }

    @Override
    public double calculatePrice(String size) {
        double price = 0;
        switch (size) {
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
