package com.pluralsight.proccessing;

import com.pluralsight.food.PremiumTopping;
import com.pluralsight.food.StandardTopping;


import java.util.ArrayList;
import java.util.List;

public class ShopFileManager {

    public static void displayPremiumList(List<PremiumTopping> toppings){
        for (PremiumTopping topping : toppings){
            System.out.println(topping);
        }
    }
    public static void displayLStandardList(List<StandardTopping> toppings){
        for (StandardTopping topping : toppings){
            System.out.println(topping);
        }
    }
    public static List<StandardTopping> listSauces(){
        List<StandardTopping> sauces = new ArrayList<>();

        sauces.add(new StandardTopping("Mayo"));
        sauces.add(new StandardTopping("Mustard"));
        sauces.add(new StandardTopping("Ketchup"));
        sauces.add(new StandardTopping("Thousand Island"));
        sauces.add(new StandardTopping("Vinaigrette"));
        sauces.add(new StandardTopping("Ranch"));

        return sauces;
    }
    public static List<StandardTopping> listToppings(){
        List<StandardTopping> toppings = new ArrayList<>();

        toppings.add(new StandardTopping("Lettuce"));
        toppings.add(new StandardTopping("Peppers"));
        toppings.add(new StandardTopping("Onions"));
        toppings.add(new StandardTopping("Tomatoes"));
        toppings.add(new StandardTopping("Jalapenos"));
        toppings.add(new StandardTopping("Cucumber"));
        toppings.add(new StandardTopping("Pickles"));
        toppings.add(new StandardTopping("Guacamole"));
        toppings.add(new StandardTopping("Mushrooms"));

        return toppings;
    }
    public static List<PremiumTopping> listCheese(){
        List<PremiumTopping> cheeses = new ArrayList<>();

        cheeses.add(new PremiumTopping("American"));
        cheeses.add(new PremiumTopping("Provolone"));
        cheeses.add(new PremiumTopping("Cheddar"));
        cheeses.add(new PremiumTopping("Swiss"));

        return cheeses;
    }

    public static List<PremiumTopping> listMeat(){
        List<PremiumTopping> meats = new ArrayList<>();

        meats.add(new PremiumTopping("Steak"));
        meats.add(new PremiumTopping("Ham"));
        meats.add(new PremiumTopping("Salami"));
        meats.add(new PremiumTopping("Roast Beef"));
        meats.add(new PremiumTopping("Chicken"));
        meats.add(new PremiumTopping("Bacon"));

        return meats;
    }
}
