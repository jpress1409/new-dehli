package com.pluralsight.userinterface;

import com.pluralsight.food.*;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderSandwich {

    private static Scanner scan = new Scanner(System.in);
    private static String size;
    private static String bread;
    private static Topping meat;
    private static Topping cheese;
    private static List<Topping> sauces;
    private static List<Topping> toppings;
    private static boolean toasted;

    public static String breadSelect(){
        Sandwich.displayBread(Sandwich.listBread());
        return scan.nextLine();
    }
    public static String sizeSelect(){
        System.out.println("What size sandwich?");
        System.out.println("(1) 8");
        System.out.println("(2) 11");
        System.out.println("(3) 14");
        int choice = scan.nextInt();
        scan.nextLine();

        switch(choice){
            case 1 -> size = "Small";
            case 2 -> size = "Medium";
            case 3 -> size = "Large";
            default -> System.out.println("Invalid");
        }

        return size;
    }
    public static Meat meatSelect(){

        ShopFileManager.displayList(ShopFileManager.listMeat());
        System.out.println("Choose Meat: ");
        String meatName = scan.nextLine();

        return new Meat(meatName);
    }
    public static Topping cheeseSelect(){
        ShopFileManager.displayList(ShopFileManager.listCheese());
        System.out.println("Choose cheese");
        String cheeseName = scan.nextLine();

        return new Cheese(cheeseName);
    }
    public static List<Topping> toppingsSelect(){
        List<Topping> toppings = new ArrayList<>();
        String toppingName = "";
        ShopFileManager.displayList(ShopFileManager.listToppings());

        while(!toppingName.equalsIgnoreCase("x")){
            System.out.println("Choose Suace:");
            System.out.println("(x) when finished");
            toppingName = scan.nextLine();
            StandardTopping topping = new StandardTopping(toppingName);

            toppings.add(topping);


        }


        return toppings;
    }
    public static List<Topping> saucesSelect(){
        List<Topping> sauces = new ArrayList<>();
        String sauceName = "";
        ShopFileManager.displayList(ShopFileManager.listSauces());

        while(!sauceName.equalsIgnoreCase("x")){
            System.out.println("Choose Suace:");
            System.out.println("(x) when finished");
            sauceName = scan.nextLine();
            Sauce sauce = new Sauce(sauceName);

            sauces.add(sauce);


        }

        return sauces;
    }
    public static boolean sandwichToasted(){
        System.out.println("Would you like the sandwich to be toasted?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");

        int choice = scan.nextInt();

        if(choice == 1){
            return true;
        }

        return false;
    }
    public static List<Sandwich> sandwiches(){
        List<Sandwich> sandwiches = new ArrayList<>();

        Sandwich sandwich = new Sandwich(
                sizeSelect(),
                breadSelect(),
                meatSelect(),
                cheeseSelect(),
                saucesSelect(),
                toppingsSelect(),
                sandwichToasted()
                );

        sandwiches.add(sandwich);

        return sandwiches;
    }
    public static void sandwichDisplay(List<Sandwich> sandwiches){
        for(Sandwich sandwich : sandwiches){
            System.out.println(sandwich);
        }
    }
}
