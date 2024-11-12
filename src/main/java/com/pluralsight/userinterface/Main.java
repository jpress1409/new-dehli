package com.pluralsight.userinterface;

import com.pluralsight.food.*;
import com.pluralsight.proccessing.Order;
import com.pluralsight.proccessing.ShopFileManager;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Thank you for choosing New Deli.");
        System.out.println("Let's start by choosing your sandwich.");

        String choice = "yes";
        while(choice.equalsIgnoreCase("yes")) {
            OrderSandwich.sandwiches();

            System.out.println("Would you like to order another?");
            choice = scan.nextLine();
        }



    }

}
