package com.pluralsight.userinterface;

import com.pluralsight.food.Chips;
import com.pluralsight.food.Drink;
import com.pluralsight.food.Sandwich;

import java.util.List;
import java.util.Scanner;

public class Checkout {

    static Scanner scan = new Scanner(System.in);

    public static void displayOrder(double price, List<Sandwich> sandwiches, List<Chips> chips, List<Drink> drinks){
        System.out.println("Sandwich Toppings: ");
        sandwiches.forEach(sandwich -> System.out.println(sandwich.getToppings()));

        System.out.println("Chips: ");
        chips.forEach(c -> System.out.println(c.getType()));

        System.out.println("Drinks: ");
        drinks.forEach(drink -> System.out.println(drink.getFlavor()));

        System.out.println("Total: $" + price);
    }

    public static void checkoutDisplay(Scanner scan, double cost) {
        System.out.println("How would you like to pay today?");
        System.out.println("1.) Cash");
        System.out.println("2.) Card");
        int option = scan.nextInt();
            switch(option){
                case 1 -> cashPayment(scan, cost);
                case 2 -> cardPayment();
                default -> System.out.println("Invalid form of payment");
            }
    }
    public static void cashPayment(Scanner scan, double cost){
       double change = -1;
        while(change < 0) {
            System.out.println("Out of how much?");
            double money = scan.nextDouble();
            if (cost > money) {
                System.out.println("Insufficient funds.");
            }else{
                change = money - cost;
                System.out.println("Your change is $" + change);
            }
        }
    }
    public static void cardPayment() {
        System.out.println("Please insert card and press enter.");
        scan.nextLine();
        System.out.println("System Processing.");
        try {
            for (int i = 0; i < 4; i++) {
                System.out.println(".");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thank You.");
    }
}
