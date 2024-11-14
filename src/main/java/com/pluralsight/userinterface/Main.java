package com.pluralsight.userinterface;


import com.pluralsight.food.Chips;
import com.pluralsight.food.Drink;
import com.pluralsight.food.Sandwich;
import com.pluralsight.proccessing.Order;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Sandwich> sandwiches = new ArrayList<>();
    public static List<Drink> drinks = new ArrayList<>();
    public static List<Chips> chips = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        UserInterface ui = new UserInterface();

        OrderChip oc = new OrderChip();
        OrderDrink od = new OrderDrink();
        String addAnother = "yes";
        double totalPrice = 0;

        // Main loop for sandwich creation
        while (addAnother.equalsIgnoreCase("yes")) {
            Sandwich sandwich = ui.createSandwich(scan); // Create a new sandwich
            sandwiches.add(sandwich); // Add to the list of sandwiches

            // Display sandwich details to the user
            System.out.println("Sandwich created: ");
            System.out.println(sandwich);

            // Ask if the user wants to add another sandwich
            System.out.println("Would you like to add another sandwich? (yes/no)");
            addAnother = scan.nextLine();

            // Handle invalid input for continuing
            while (!addAnother.equalsIgnoreCase("yes") && !addAnother.equalsIgnoreCase("no")) {
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                addAnother = scan.nextLine();
            }
        }

        for (Sandwich sandwich : sandwiches) {
            totalPrice += sandwich.getPrice();
        }

        System.out.println("Would you like to add a drink?");
        String addDrink = scan.nextLine();

        while(addDrink.equalsIgnoreCase("YES")){

            drinks.add(od.returnDrinks(od.drinkSizeSelect(), od.flavorSelect()));

            System.out.println("Would you like to add another?");
            addDrink = scan.nextLine();
        }

        for (Drink drink : drinks) {
            totalPrice += drink.calcPrice();
        }

        System.out.println("Would You like to add chips?");
        String addChips = scan.nextLine();

        while(addChips.equalsIgnoreCase("yes")){

            chips.add(oc.returnChips(oc.chipSelect()));

            System.out.println("Would you like to add another?");
            addChips = scan.nextLine();
        }

        for(Chips chips : chips){
            totalPrice += chips.getPrice();
        }

        System.out.println("Total Price: $" + totalPrice);
        
        ShopFileManager.saveReceipt(sandwiches, chips, drinks);
    }
}