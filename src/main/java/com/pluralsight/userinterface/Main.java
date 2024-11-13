package com.pluralsight.userinterface;


import com.pluralsight.food.Chip;
import com.pluralsight.food.Drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

    private static List<Chip> chips = new ArrayList<>();
    private static List<Drink> drinks = new ArrayList<>();
    private static List<Drink> selectedDrinks = new ArrayList<>();
    private static List<Chip> selectedChips = new ArrayList<>();


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for choosing New Deli.");
        System.out.println("Let's start by choosing your sandwich.");

        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {

            OrderSandwich.sizeSelect();
            OrderSandwich.breadSelect();
            OrderSandwich.meatSelect();
            OrderSandwich.cheeseSelect();
            OrderSandwich.toppingsSelect();
            OrderSandwich.saucesSelect();
            OrderSandwich.sandwichToasted();

            OrderSandwich.createSandwich();

            System.out.println("Would you like to order another sandwich?");
            choice = scan.nextLine();
        }

        System.out.println("Would you like chips?");
        String option = scan.nextLine();
        if (option.equalsIgnoreCase("Yes")) {
            System.out.println("How many bags of chips would you like?");
            int numChips = scan.nextInt();
            scan.nextLine();

            OrderChip.chipSelect(numChips, selectedChips);
        }

        System.out.println("Would you like drinks?");
        String input = scan.nextLine();
        if (input.equalsIgnoreCase("Yes")) {
            System.out.println("How many drinks would you like?");
            int numDrinks = scan.nextInt();
            scan.nextLine();

            for(Drink drink : drinks){
                System.out.println(drink);
            }

            for (int i = 0; i < numDrinks; i++) {
                System.out.println("Flavor for drink " + (i + 1) + ":");
                String flavor = OrderDrink.flavorSelect();

                System.out.println("Size for drink " + (i + 1) + ":");
                String size = OrderDrink.drinkSizeSelect();
                size.toUpperCase();
                

                selectedDrinks.add(new Drink(flavor, size));
            }
        }

        System.out.println("Your total is: ");
        System.out.println(totalPrice(selectedChips, selectedDrinks));

    }
    public static double totalPrice(List<Chip> chips, List<Drink> drinks){
        double total = 0;

        OrderSandwich.totalPrice();

        for(Chip chip : chips){
           total += chip.calcPrice();
        }

        for(Drink drink : drinks){
            total += drink.getPrice();
        }

        return total;
    }

}
