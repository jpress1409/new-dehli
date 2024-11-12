package com.pluralsight.userinterface;

import com.pluralsight.food.*;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderSandwich {

    Scanner scan = new Scanner(System.in);

    public static String breadSelect(Scanner scan){
        Sandwich.displayBread(Sandwich.listBread());

        System.out.println("What bread would you like? ");

        String bread = scan.nextLine();

        return bread;
    }
    public static String sizeSelect(Scanner scan){
        System.out.println("What size sandwich?");
        System.out.println("(1) 8");
        System.out.println("(2) 11");
        System.out.println("(3) 14");
        int choice = scan.nextInt();

        switch(choice){
            case 1 -> {return "Small";}
            case 2 -> {return "Medium";}
            case 3 -> {return "Large";}

        }
        return "";
    }
    public static Meat meatSelect(Scanner scan){

        Meat meat = new Meat("");
        ShopFileManager.displayList(ShopFileManager.listMeat());
        System.out.println("Choose Meat: ");
        String meatName = scan.nextLine();

        meat.setName(meatName);

        return meat;
    }
    public static Cheese cheeseSelect(Scanner scan){
        Cheese cheese = new Cheese("");

        ShopFileManager.displayList(ShopFileManager.listCheese());
        System.out.println("Choose cheese");
        String cheeseName = scan.nextLine();

        cheese.setName(cheeseName);

        return cheese;
    }
    public static List<StandardTopping> toppingSelect(Scanner scan){
        List<StandardTopping> toppings = new ArrayList<>();
        String toppingName = "";
        ShopFileManager.displayList(ShopFileManager.listToppings());

        while(!toppingName.equalsIgnoreCase("x")) {
            System.out.println("Choose toppings: ");
            System.out.println("(x) when finished");
            toppingName = scan.nextLine();

            toppings.add(new StandardTopping(toppingName));
        }
        return toppings;
    }
    public static List<Sauce> sauceSelect(Scanner scan){
        List<Sauce> sauces = new ArrayList<>();
        String sauceName = "";
        ShopFileManager.displayList(ShopFileManager.listSauces());

        while(!sauceName.equalsIgnoreCase("x")){
            System.out.println("Choose Suace:");
            System.out.println("(x) when finished");
            sauceName = scan.nextLine();

            sauces.add(new Sauce(sauceName));
        }
        return sauces;
    }
}
