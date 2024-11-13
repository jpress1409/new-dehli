package com.pluralsight.food;

public class Sauce extends Topping {
    public Sauce(String name) {
        super(name);

    }

    @Override
    public double calculatePrice(String size) {
        return 0;
    }

    @Override
    public String toString() {
        return "Sauce{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
