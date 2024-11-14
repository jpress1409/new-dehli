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

    public double getPrice() {
    return 0;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(List<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public List<Chips> getChips() {
        return chips;
    }

    public void setChips(List<Chips> chips) {
        this.chips = chips;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
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
