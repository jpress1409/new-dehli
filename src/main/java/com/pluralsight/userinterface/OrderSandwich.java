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
    private static Meat meat;
    private static List<Meat> meats = ShopFileManager.listMeat();
    private static List<Cheese> cheeses = ShopFileManager.listCheese();
    private static Cheese cheese;
    private static List<Sauce> sauces = ShopFileManager.listSauces();
    private static List<StandardTopping> toppings = ShopFileManager.listToppings();
    private static boolean toasted;
    private static List<Sandwich> sandwiches = new ArrayList<>();

    public static String breadSelect(){
        Sandwich.displayBread(Sandwich.listBread());
        bread = scan.nextLine();

        return bread;
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
        for(Meat m : meats){
            System.out.println(m.getName());
        }

        System.out.println("Choose Meat: ");
        String meatName = scan.nextLine();

        meat = new Meat(meatName);
        return meat;
    }
    public static Cheese cheeseSelect(){
        for(Cheese c : cheeses){
            System.out.println(c.getName());
        }
        System.out.println("Choose cheese");
        String cheeseName = scan.nextLine();
        cheese = new Cheese(cheeseName);

        return cheese;
    }
    public static List<StandardTopping> toppingsSelect(){
        List<StandardTopping> selectedToppings = new ArrayList<>();

        for(StandardTopping t : toppings){
            System.out.println(t.getName());
        }

        String toppingName = "";
        while(!toppingName.equalsIgnoreCase("x")){

            System.out.println("Choose Topping:");
            System.out.println("(x) when finished");
            toppingName = scan.nextLine();

            if (!toppingName.equalsIgnoreCase("x") && !toppingName.trim().isEmpty()) {
                StandardTopping topping = new StandardTopping(toppingName);
                selectedToppings.add(topping);
            }

        }


        return selectedToppings;
    }
    public static List<Sauce> saucesSelect(){
        List<Sauce> selectedSauces = new ArrayList<>();

        for(Sauce s : sauces) {
            System.out.println(s.getName());
        }

        String sauceName = "";
        while(!sauceName.equalsIgnoreCase("x")){
            System.out.println("Choose Suace:");
            System.out.println("(x) when finished");
            sauceName = scan.nextLine();

            if (!sauceName.equalsIgnoreCase("x") && !sauceName.trim().isEmpty()) {
                Sauce sauce = new Sauce(sauceName);
                selectedSauces.add(sauce);
            }

        }

        return selectedSauces;
    }
    public static boolean sandwichToasted(){
        System.out.println("Would you like the sandwich to be toasted?");
        System.out.println("(1) Yes");
        System.out.println("(2) No");

        int choice = scan.nextInt();

        if(choice == 1){
            toasted = true;
        }else{
            toasted = false;
        }

        return toasted;
    }
    public static Sandwich createSandwich() {
        return new Sandwich(
                sizeSelect(),
                breadSelect(),
                meatSelect(),
                cheeseSelect(),
                toppingsSelect(),
                saucesSelect(),
                sandwichToasted());
    }
    public static void sandwichDisplay() {
        for (Sandwich sandwich : sandwiches) {
            System.out.println(sandwich);
            System.out.println("Price: " + sandwich.calcPrice());
        }
    }

}
