package com.pluralsight.userinterface;

import com.pluralsight.food.Chips;

import java.util.List;
import java.util.Scanner;

public class OrderChip {
    private static Scanner scan = new Scanner(System.in);

    public static void chipSelect(int chipNum, List<Chips> selectedChips){
                for(int i = 0; i < chipNum; i++){
                    System.out.println("Flavor for bag " + (i + 1));
                    String flavor = scan.nextLine();
                    Chips chip = new Chips(flavor);
                    selectedChips.add(chip);
                }

    }

}
