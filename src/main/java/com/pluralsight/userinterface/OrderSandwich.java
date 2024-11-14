package com.pluralsight.userinterface;

import com.pluralsight.food.*;

import java.util.List;
import java.util.Scanner;

public class OrderSandwich {
    private Sandwich sandwich = new Sandwich();
    private Scanner scan = new Scanner(System.in);

    // Helper method to handle adding toppings generically
    private void addToppingFromList(List<Topping> toppingList, String toppingType) {
        String name = "";
        while (!name.equalsIgnoreCase("x")) {
            System.out.println("Select " + toppingType + " (X to finish):");
            for (Topping topping : toppingList) {
                System.out.println(topping);
            }

            name = scan.nextLine();
            if (name.equalsIgnoreCase("x")) break;

            // Find the topping by name and add it to the sandwich
            Topping selectedTopping = null;
            for (Topping topping : toppingList) {
                if (topping.getName().equalsIgnoreCase(name)) {
                    selectedTopping = topping;
                    break;
                }
            }

            if (selectedTopping != null) {
                sandwich.addTopping(selectedTopping);
                System.out.println(selectedTopping.getName() + " added!");
            } else {
                System.out.println("Invalid selection. Try again.");
            }
        }
    }

    // Get Meat toppings
    public void getMeat() {
        addToppingFromList(Lists.listMeat(), "Meat");
    }

    // Get Cheese toppings
    public void getCheese() {
        addToppingFromList(Lists.listCheese(), "Cheese");
    }

    // Get Sauce toppings
    public void getSauce() {
        addToppingFromList(Lists.listSauces(), "Sauce");
    }

    // Get other standard toppings (e.g., Lettuce, Tomato, etc.)
    public void getToppings() {
        addToppingFromList(Lists.listToppings(), "Topping");
    }
}
