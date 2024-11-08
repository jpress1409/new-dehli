package com.pluralsight.food.main;

import com.pluralsight.food.standard.toppings.Topping;

import java.util.List;

public class Sandwich {
    private String bread;
    private String size;
    private boolean toasted;
    List<Topping> toppings;

    public Sandwich() {
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
}
