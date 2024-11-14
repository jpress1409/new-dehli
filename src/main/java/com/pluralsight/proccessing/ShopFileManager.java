package com.pluralsight.proccessing;

import com.pluralsight.food.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


public class ShopFileManager {

    public static void saveReceipt(List<Sandwich> sandwiches, List<Chips> chips, List<Drink> drinks){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy_HH-mm-ss");
        String pathName = "C:\\Users\\jpres\\OneDrive\\Desktop\\Pluralsight\\Capstones\\new-deli\\reciepts\\";
        String fileName = dateTime.format(format);

        System.out.println(pathName+fileName);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(pathName + fileName, true))){

            for (Sandwich sandwich : sandwiches) {
                StringBuilder builder = new StringBuilder();
                builder.append(sandwich.getBread()).append(" | ");
                builder.append(sandwich.getSize()).append(" | ");
                builder.append(sandwich.getToppings()).append(" | ");
                builder.append(sandwich.getPrice()).append(" | ");

                String result = builder.toString();
                writer.write(result);
                writer.newLine();
            }
            for (Chips chip : chips) {
                StringBuilder builder = new StringBuilder();
                builder.append(chip.getType()).append(" | ");
                builder.append(chip.getType()).append(" | ");
                builder.append(chip.getPrice()).append(" | ");

                String result = builder.toString();
                writer.write(result);
                writer.newLine();
            }
            for (Drink drink : drinks) {
                StringBuilder builder = new StringBuilder();
                builder.append(drink.getFlavor()).append(" | ");
                builder.append(drink.getSize()).append(" | ");
                builder.append(drink.calcPrice()).append(" | ");

                String result = builder.toString();
                writer.write(result);
                writer.newLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}