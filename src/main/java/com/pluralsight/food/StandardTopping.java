package com.pluralsight.food;

public class StandardTopping extends Topping {

    public StandardTopping(String name) {
        super(name);
    }

    @Override
    public double calculatePrice(String size) {
        return 0;
    }

    @Override
    public String toString() {
        return "StandardTopping{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
