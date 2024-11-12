package com.pluralsight.food;

import java.util.Arrays;
import java.util.List;

public class Sandwich {
    private String bread;
    private static String size;
    private boolean toasted;

    public Sandwich() {
        toasted = false;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public static String getSize() {
        return size;
    }

    public void setSize(String size) {
        Sandwich.size = size;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }
    public static String[] listBread(){
        String[] breads = new String[4];
        breads[0] = "White";
        breads[1] = "Wheat";
        breads[2] = "Rye";
        breads[3] = "Wrap";

        return breads;
    }
    public static void displayBread(String [] breads){
        for(String bread : breads){
            System.out.println(bread);
        }
    }
}
