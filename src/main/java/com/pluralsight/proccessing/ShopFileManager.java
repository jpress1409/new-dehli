package com.pluralsight.proccessing;

import com.pluralsight.food.*;


import java.util.ArrayList;
import java.util.List;

public class ShopFileManager {

    public static List<Sauce> listSauces(){
        List<Sauce> sauces = new ArrayList<>();

        sauces.add(new Sauce("Mayo"));
        sauces.add(new Sauce("Mustard"));
        sauces.add(new Sauce("Ketchup"));
        sauces.add(new Sauce("Thousand Island"));
        sauces.add(new Sauce("Vinaigrette"));
        sauces.add(new Sauce("Ranch"));

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
    public static List<Cheese> listCheese(){
        List<Cheese> cheeses = new ArrayList<>();

        cheeses.add(new Cheese("American"));
        cheeses.add(new Cheese("Provolone"));
        cheeses.add(new Cheese("Cheddar"));
        cheeses.add(new Cheese("Swiss"));

        return cheeses;
    }

    public static List<Meat> listMeat(){
        List<Meat> meats = new ArrayList<>();

        meats.add(new Meat("Steak"));
        meats.add(new Meat("Ham"));
        meats.add(new Meat("Salami"));
        meats.add(new Meat("Roast Beef"));
        meats.add(new Meat("Chicken"));
        meats.add(new Meat("Bacon"));

        return meats;
    }
    public static List<Drink> listDrinks(){
        List<Drink> drinks = new ArrayList<>();

        drinks.add(new Drink("Coke"));
        drinks.add(new Drink("Diet Coke"));
        drinks.add(new Drink("Dr. Pepper"));
        drinks.add(new Drink("Ginger Ale"));
        drinks.add(new Drink("Root Beer"));

        return drinks;
    }
    public static List<Chip> listChips(){
        List<Chip> chips = new ArrayList<>();

        chips.add(new Chip("BBQ"));
        chips.add(new Chip("Salt & Vinegar"));
        chips.add(new Chip("Original"));
        chips.add(new Chip("Sour Cream & Onion"));


        return chips;
    }
}
