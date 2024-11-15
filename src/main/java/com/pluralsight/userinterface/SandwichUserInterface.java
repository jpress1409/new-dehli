package com.pluralsight.userinterface;

import com.pluralsight.food.*;
import com.pluralsight.order.Lists;
import com.pluralsight.toppings.*;

import java.util.List;
import java.util.Scanner;
import static com.pluralsight.order.Lists.listBread;


public class SandwichUserInterface {

    Scanner scan = new Scanner(System.in);

    public void sandwichLoop(List<Sandwich> sandwiches, String addAnother){
        Sandwich sandwich = createSandwich(scan); // Create a new sandwich
        sandwiches.add(sandwich); // Add to the list of sandwiches


        // Handle invalid input for continuing
        while (!addAnother.equalsIgnoreCase("yes") && !addAnother.equalsIgnoreCase("no")) {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            addAnother = scan.nextLine();
        }
    }

    // Method to create a new sandwich
    public Sandwich createSandwich(Scanner scan) {
        Sandwich sandwich = new Sandwich();

        // Get bread type
        System.out.println("Select bread type:");
        for (String bread : listBread()) {
            System.out.println(bread);
        }
        sandwich.setBread(scan.nextLine());

        // Get sandwich size
        System.out.println("Select size (S, M, L):");
        sandwich.setSize(scan.nextLine().toUpperCase());

        // Get if the sandwich should be toasted
        System.out.println("Do you want your sandwich toasted? (yes/no):");
        sandwich.setToasted(scan.nextLine().equalsIgnoreCase("yes"));

        // Add toppings (Meat, Cheese, Sauce)
        getMeat(scan, sandwich);
        getCheese(scan, sandwich);
        getStandardTopping(scan, sandwich);
        getSauce(scan, sandwich);

        return sandwich;
    }

    // Method to add Meat toppings
    private void getMeat(Scanner scan, Sandwich sandwich) {
        String name = "";
        while (!name.equalsIgnoreCase("x")) {
            System.out.println("Select meat or (X) to finish:");
            Lists.listMeat().forEach(meat -> System.out.println(meat.getName()));
            name = scan.nextLine();
            if (!name.equalsIgnoreCase("x")) {
                sandwich.addTopping(new Meat(name));  // Add meat to the sandwich
                System.out.println(name + " added!");
            }
        }
    }

    // Method to add Cheese toppings
    private void getCheese(Scanner scan, Sandwich sandwich) {
        String name = "";
        while (!name.equalsIgnoreCase("x")) {
            System.out.println("Select cheese or (X) to finish:");
            Lists.listCheese().forEach(cheese -> System.out.println(cheese.getName()));
            name = scan.nextLine();
            if (!name.equalsIgnoreCase("x")) {
                sandwich.addTopping(new Cheese(name));  // Add cheese to the sandwich
                System.out.println(name + " added!");
            }
        }
    }

    // Method to add Sauce toppings
    private void getSauce(Scanner scan, Sandwich sandwich) {
        String name = "";
        while (!name.equalsIgnoreCase("x")) {
            System.out.println("Select sauce or (X) to finish:");
            Lists.listSauces().forEach(sauce -> System.out.println(sauce.getName()));
            name = scan.nextLine();
            if (!name.equalsIgnoreCase("x")) {
                sandwich.addTopping(new Sauce(name));  // Add sauce to the sandwich
                System.out.println(name + " added!");
            }
        }
    }

    private void getStandardTopping(Scanner scan, Sandwich sandwich) {
        String name = "";
        while (!name.equalsIgnoreCase("x")) {
            System.out.println("Select topping or (X) to finish:");
            Lists.listToppings().forEach(topping -> System.out.println(topping.getName()));
            name = scan.nextLine();
            if (!name.equalsIgnoreCase("x")) {
                sandwich.addTopping(new StandardTopping(name));
                System.out.println(name + " added!");
            }
        }
    }
}

