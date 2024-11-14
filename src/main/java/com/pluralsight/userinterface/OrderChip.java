package com.pluralsight.userinterface;

import com.pluralsight.food.Chips;

import java.util.List;
import java.util.Scanner;

public class OrderChip {
    private static Scanner scan = new Scanner(System.in);

    public String chipSelect(){

        for(Chips chips : Lists.listChips()){
            System.out.println(chips.getType());
        }

        System.out.println("What flavor would you like?");
        return scan.nextLine();
    }
    public Chips returnChips(String type){
        return new Chips(type);
    }

}
