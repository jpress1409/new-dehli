package com.pluralsight.userinterface;

import com.pluralsight.food.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderDrink {

    private static Scanner scan = new Scanner(System.in);

    public static String drinkSizeSelect(){
        System.out.println("(S)mall");
        System.out.println("(M)edium");
        System.out.println("(L)arge");
       String size = scan.nextLine();

    return size;
    }
    public static String flavorSelect(){
        System.out.println("What soda would you like?");
        String flavor = scan.nextLine();
        return flavor;
    }
    public static Drink returnDrinks(String size, String flavor){
        return new Drink(size, flavor);
    }
}
