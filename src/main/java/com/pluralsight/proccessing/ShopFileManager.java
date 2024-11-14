package com.pluralsight.proccessing;

import com.pluralsight.food.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopFileManager {

    public static void saveReceipt(){
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy_HH:mm:ss");
        String pathName = "\\new-deli\\reciepts\\";
        String fileName = dateTime.format(format);

        System.out.println(pathName+fileName);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(pathName + fileName));){

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}