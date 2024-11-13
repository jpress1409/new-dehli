package com.pluralsight.userinterface;

import com.pluralsight.food.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderDrink {

    private static Scanner scan = new Scanner(System.in);

    public static String drinkSizeSelect(){
        String size;
        System.out.println("Small, Medium or Large?");
        size = scan.nextLine();
    return size;
    }
    public static String flavorSelect(){
        System.out.println("What soda would you like?");
        String flavor = scan.nextLine();
        return flavor;
    }
    public static List<Drink> returnDrinks(String size, String flavor){
        List<Drink> drinks = new ArrayList<>();

        Drink drink = new Drink(flavor, size);
        drink.setSize(size);

        drinks.add(drink);

        return drinks;
    }
}
