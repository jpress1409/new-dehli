package com.pluralsight.userinterface;

import com.pluralsight.food.Drink;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.pluralsight.food.Drink;

public class OrderDrink {

    private static List<Drink> drinks = ShopFileManager.listDrinks();
    private static Scanner scan = new Scanner(System.in);

    public static String drinkSizeSelect(){
        String size = "";
        while(!size.equals("S") || !size.equals("M") || !size.equals("L")) {
            System.out.println("(S)mall");
            System.out.println("(M)edium");
            System.out.println("(L)arge");
            size = scan.nextLine();
        }
    return size;
    }
    public static String flavorSelect(){
        String flavor = "";

        while (true) {
            System.out.println("What soda would you like?");
            flavor = scan.nextLine();

            boolean loop = false;
            for (Drink drink : drinks) {
                if (drink.getFlavor().equalsIgnoreCase(flavor)) {
                    loop = true;
                    break; 
                }
            }

            if (loop) {
                break;
            } else {
                System.out.println("Sorry, that flavor is not available. Please choose again.");
            }
        }
        return flavor;
    }
    public static Drink returnDrinks(String size, String flavor){
        return new Drink(size, flavor);
    }
}
