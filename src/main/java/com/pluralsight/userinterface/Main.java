package com.pluralsight.userinterface;


import com.pluralsight.food.Chips;
import com.pluralsight.food.Drink;
import com.pluralsight.food.Sandwich;
import com.pluralsight.order.OrderChip;
import com.pluralsight.order.OrderDrink;
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
        SandwichUserInterface ui = new SandwichUserInterface();

        OrderChip oc = new OrderChip();
        OrderDrink od = new OrderDrink();
        String addAnother = "yes";
        double totalPrice = 0;

        // Main loop for sandwich creation
        while (addAnother.equalsIgnoreCase("yes")) {
            ui.sandwichLoop(sandwiches, addAnother);
        }

        totalPrice = sandwiches.stream().mapToDouble(Sandwich::getPrice).sum();

        System.out.println("Would you like to add a drink?");
        String addDrink = scan.nextLine();

        while(addDrink.equalsIgnoreCase("YES")){

            drinks.add(od.returnDrinks(od.drinkSizeSelect(), od.flavorSelect()));

            System.out.println("Would you like to add another?");
            addDrink = scan.nextLine();
        }

        totalPrice = drinks.stream().mapToDouble(Drink::calcPrice).sum();

        System.out.println("Would You like to add chips?");
        String addChips = scan.nextLine();

        while(addChips.equalsIgnoreCase("yes")){

            chips.add(oc.returnChips(oc.chipSelect()));

            System.out.println("Would you like to add another?");
            addChips = scan.nextLine();
        }

        totalPrice = chips.stream().mapToDouble(Chips::getPrice).sum();

        System.out.println("Total Price: $" + totalPrice);
        Order newOrder = new Order(sandwiches, chips, drinks);

        ShopFileManager.saveReceipt(sandwiches, chips, drinks, newOrder.calcPrice());
    }
}