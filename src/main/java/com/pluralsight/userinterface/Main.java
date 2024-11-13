package com.pluralsight.userinterface;


import com.pluralsight.food.Chips;
import com.pluralsight.food.Drink;
import com.pluralsight.food.Sandwich;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    private static List<Chips> chips = ShopFileManager.listChips();
    private static List<Drink> drinks = ShopFileManager.listDrinks();
    private static List<Drink> selectedDrinks = new ArrayList<>();
    private static List<Chips> selectedChips = new ArrayList<>();
    private static List<Sandwich> selectedSandwiches = new ArrayList<>();
    private static int numChips;
    private static int numDrinks;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for choosing New Deli.");
        System.out.println("Let's start by choosing your sandwich.");

        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {
            selectedSandwiches.add(OrderSandwich.createSandwich());

            System.out.println("Would you like to order another sandwich?");
            choice = scan.nextLine();
        }

        System.out.println("Would you like chips?");
        String option = scan.nextLine();
        if (option.equalsIgnoreCase("Yes")) {

            System.out.println("How many bags of chips would you like?");
            numChips = scan.nextInt();
            scan.nextLine();

            for(Chips chip : chips){
                System.out.println(chip.getType());
            }

            OrderChip.chipSelect(numChips, selectedChips);
        }

        System.out.println("Would you like drinks?");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("Yes")) {
            System.out.println("How many drinks would you like?");
            numDrinks = scan.nextInt();
            scan.nextLine();

            for(Drink drink : drinks){
                System.out.println(drink.getFlavor());
            }

            for (int i = 0; i < numDrinks; i++){
                String flavor = OrderDrink.flavorSelect();
                String size = OrderDrink.drinkSizeSelect().toUpperCase();

                selectedDrinks.add(OrderDrink.returnDrinks(size, flavor));
            }
        }
        System.out.println("Order:");
        OrderSandwich.sandwichDisplay(selectedSandwiches);

        System.out.println("Your total is: ");
        System.out.println(totalPrice(selectedChips, selectedDrinks, selectedSandwiches, numChips, numDrinks));

    }
    public static double totalPrice(List<Chips> chips, List<Drink> drinks, List<Sandwich> sandwiches, int chipQuant, int drinkQuant){
        double total = 0;

        for(Sandwich sandwich : sandwiches){
            total += sandwich.getPrice();
        }


        for(Chips chip : chips){
           total += (chip.getPrice() * chipQuant);
        }

        for(Drink drink : drinks){
            total += (drink.calcPrice() * drinkQuant);
        }

        return total;
    }

}
