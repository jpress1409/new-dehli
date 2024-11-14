package com.pluralsight.userinterface;

import com.pluralsight.food.Drink;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.pluralsight.food.Drink;

public class OrderDrink {

    private List<Drink> drinks = Lists.listDrinks();
    private Scanner scan = new Scanner(System.in);

    public String drinkSizeSelect(){
        String size = "";
            System.out.println("(S)mall");
            System.out.println("(M)edium");
            System.out.println("(L)arge");
            size = scan.nextLine().toUpperCase();

    return size;
    }
    public  String flavorSelect(){
        String flavor = "";

        while (true) {
            for(Drink drink : drinks){
                System.out.println(drink.getFlavor());
            }
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
    public Drink returnDrinks(String size, String flavor){
        return new Drink(size, flavor);
    }
}
