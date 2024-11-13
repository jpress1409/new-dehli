package com.pluralsight.food;


public class Meat extends Topping {

    public Meat(String name) {
        super(name);
    }

    @Override
    public double calculatePrice(String size) {
        double price = 0;
        switch (size) {
            case "Small" -> price = 1.00;
            case "Medium" -> price = 2.00;
            case "Large" -> price = 3.00;
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
