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
        String flavor;
        System.out.println("Coke, Sprite, Dr. Pepper or Ginger Ale");
        flavor = scan.nextLine();
        return flavor;
    }
    public static List<Drink> returnDrink(String size, String flavor){
        List<Drink> drinks = new ArrayList<>();

        drinks.add(new Drink(flavor, size));

        return drinks;
    }
}
