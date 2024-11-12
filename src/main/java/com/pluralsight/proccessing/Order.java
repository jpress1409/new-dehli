package com.pluralsight.proccessing;

import com.pluralsight.food.Chip;
import com.pluralsight.food.Drink;
import com.pluralsight.food.Sandwich;
import com.pluralsight.userinterface.OrderChip;
import com.pluralsight.userinterface.OrderDrink;
import com.pluralsight.userinterface.OrderSandwich;

import java.util.List;

public class Order {
    public static double sandwichPrice(){
        List<Sandwich> sandwiches = OrderSandwich.sandwiches();
        double sandwichPrice = 0;

        for(Sandwich sandwich : sandwiches){
            sandwichPrice += sandwich.calcPrice();
        }

        return sandwichPrice;
    }
    public static double drinkPrice(){
        String size = OrderDrink.drinkSizeSelect();
        String flavor = OrderDrink.flavorSelect();
        List<Drink> drinks = OrderDrink.returnDrink(size, flavor);

        double drinkPrice = 0;
        for(Drink drink : drinks){
           drinkPrice += drink.getPrice();
        }

        return drinkPrice;
    }
    public static double chipPrice(){
        String type = OrderChip.typeSelect();
        List<Chip> chips = OrderChip.chipList(type);
        double chipPrice = 0;

        for(Chip chip : chips){
            chipPrice += chip.getPrice();
        }
        return chipPrice;
    }
    public static double totalPrice(double sandwichPrice, double drinkPrice, double chipPrice){
        return sandwichPrice + drinkPrice + chipPrice;
    }
}
