package com.pluralsight.proccessing;

import com.pluralsight.food.Chips;
import com.pluralsight.food.Drink;
import com.pluralsight.food.Sandwich;
import java.util.List;

public class Order {

    private double price;
    private List<Sandwich> sandwiches;
    private List<Chips> chips;
    private List<Drink> drinks;

    public Order(List<Sandwich> sandwiches, List<Chips> chips, List<Drink> drinks){
        this.chips = chips;
        this.drinks = drinks;
        this.sandwiches = sandwiches;
        this.price = price;
    }

    public double calcPrice() {
        for(Sandwich sandwich : sandwiches){
            price += sandwich.getPrice();
        }
        for(Drink drink : drinks){
            price += drink.calcPrice();
        }
        for(Chips chips : chips){
            price += chips.getPrice();
        }
    return price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", sandwiches=" + sandwiches +
                ", chips=" + chips +
                ", drinks=" + drinks +
                '}';
    }
}
