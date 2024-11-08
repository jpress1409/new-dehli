package com.pluralsight.food.standard.toppings;

import com.pluralsight.food.premium.toppings.Meat;
import com.pluralsight.food.premium.toppings.Cheese;

public class Topping {
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    public Topping() {

    }

    private static double calcPrice(){
        return Meat.calcPrice() + Cheese.calcPrice();
    }

}
