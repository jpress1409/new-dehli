package com.pluralsight.food;

public class StandardTopping extends Topping {

    public StandardTopping(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "StandardTopping{" +
                "name='" + getName() + '\'' +
                '}';
    }
}
