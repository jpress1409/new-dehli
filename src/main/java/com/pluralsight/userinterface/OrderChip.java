package com.pluralsight.userinterface;

import com.pluralsight.food.Chip;
import com.pluralsight.proccessing.ShopFileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderChip {
    private static Scanner scan = new Scanner(System.in);

    public static void chipSelect(int chipNum, List<Chip> selectedChips){
                for(int i = 0; i < chipNum; i++){
                    System.out.println("Flavor for bag " + (i + 1));
                    String flavor = scan.nextLine();
                    Chip chip = new Chip(flavor);
                    selectedChips.add(chip);
                }

    }

}
