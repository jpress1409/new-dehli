package com.pluralsight.userinterface;

import com.pluralsight.food.Chip;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderChip {
    private static Scanner scan = new Scanner(System.in);

    public static String typeSelect(){
        System.out.println("What flavor chip would you like?");
        System.out.println("(1) BBQ");
        System.out.println("(2) Salt & Vinegar");
        System.out.println("(3) Original");
        int choice = scan.nextInt();

        if(choice == 1){
            return "BBQ";
        }
        if(choice == 2){
            return "Salt & Vinegar";
        }
        return "Original";
    }
    public static List<Chip> chipList(String type){
        type = typeSelect();
        List<Chip> chips = new ArrayList<>();

        for(Chip chip : chips){
            chips.add(new Chip(type));
        }

        return chips;
    }
}
