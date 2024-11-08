package com.pluralsight.proccessing;

import com.pluralsight.food.standard.toppings.Topping;

import java.util.ArrayList;
import java.util.List;

public class ShopFileManager {

    public static void displayList(List<Topping> toppings){
        for (Topping topping : toppings){
            System.out.println(topping);
        }
    }
    public static List<Topping> listSauces(){
        List<Topping> sauces = new ArrayList<>();

        sauces.add(new Topping("Mayo"));
        sauces.add(new Topping("Mustard"));
        sauces.add(new Topping("Ketchup"));
        sauces.add(new Topping("Thousand Island"));
        sauces.add(new Topping("Vinaigrette"));
        sauces.add(new Topping("Ranch"));

        return sauces;
    }
    public static List<Topping> listToppings(){
        List<Topping> toppings = new ArrayList<>();

        toppings.add(new Topping("Lettuce"));
        toppings.add(new Topping("Peppers"));
        toppings.add(new Topping("Onions"));
        toppings.add(new Topping("Tomatoes"));
        toppings.add(new Topping("Jalapenos"));
        toppings.add(new Topping("Cucumber"));
        toppings.add(new Topping("Pickles"));
        toppings.add(new Topping("Guacamole"));
        toppings.add(new Topping("Mushrooms"));

        return toppings;
    }
    public static List<Topping> listCheese(){
        List<Topping> cheeses = new ArrayList<>();

        cheeses.add(new Topping("American"));
        cheeses.add(new Topping("Provolone"));
        cheeses.add(new Topping("Cheddar"));
        cheeses.add(new Topping("Swiss"));

        return cheeses;
    }

    public static List<Topping> listMeat(){
        List<Topping> meats = new ArrayList<>();

        meats.add(new Topping("Steak"));
        meats.add(new Topping("Ham"));
        meats.add(new Topping("Salami"));
        meats.add(new Topping("Roast Beef"));
        meats.add(new Topping("Chicken"));
        meats.add(new Topping("Bacon"));

        return meats;
    }
}
