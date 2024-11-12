package com.pluralsight.userinterface;

import com.pluralsight.food.*;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderSandwich {

    private static Scanner scan = new Scanner(System.in);

    public static String breadSelect(){
        Sandwich.displayBread(Sandwich.listBread());

        System.out.println("What bread would you like? ");

        String bread = scan.nextLine();

        return bread;
    }
    public static String sizeSelect(){
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
    public static Meat meatSelect(){

        Meat meat = new Meat("");
        ShopFileManager.displayList(ShopFileManager.listMeat());
        System.out.println("Choose Meat: ");
        String meatName = scan.nextLine();

        meat.setName(meatName);

        return meat;
    }
    public static Cheese cheeseSelect(){
        Cheese cheese = new Cheese("");

        ShopFileManager.displayList(ShopFileManager.listCheese());
        System.out.println("Choose cheese");
        String cheeseName = scan.nextLine();

        cheese.setName(cheeseName);

        return cheese;
    }
    public static List<StandardTopping> toppingSelect(){
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
    public static List<Sauce> sauceSelect(){
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
    public static boolean sandwichToasted(){
        int choice = scan.nextInt();

        if(choice == 1){
            return true;
        }

        return false;
    }
    public static List<Sandwich> sandwiches(){
        List<Sandwich> sandwiches = new ArrayList<>();

        for(Sandwich sandwich : sandwiches){
            sandwiches.add(new Sandwich(sizeSelect(), breadSelect(), meatSelect(), cheeseSelect(), sauceSelect(), toppingSelect(), sandwichToasted()));
        }

        return sandwiches;
    }
}
