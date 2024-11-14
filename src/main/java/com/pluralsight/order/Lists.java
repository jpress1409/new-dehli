package com.pluralsight.order;

import com.pluralsight.food.*;
import com.pluralsight.toppings.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lists {
    public static List<Topping> listAllToppings() {
        return Stream.of(listSauces(), listToppings(), listCheese(), listMeat())
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
    public static List<Topping> listSauces() {
        return Stream.of(
                new Sauce("Mayo"),
                new Sauce("Mustard"),
                new Sauce("Ketchup"),
                new Sauce("Thousand Island"),
                new Sauce("Vinaigrette"),
                new Sauce("Ranch")
        ).collect(Collectors.toList());
    }

    public static List<Topping> listToppings() {
        return Stream.of(
                new StandardTopping("Lettuce"),
                new StandardTopping("Peppers"),
                new StandardTopping("Onions"),
                new StandardTopping("Tomatoes"),
                new StandardTopping("Jalapenos"),
                new StandardTopping("Cucumber"),
                new StandardTopping("Pickles"),
                new StandardTopping("Guacamole"),
                new StandardTopping("Mushrooms")
        ).collect(Collectors.toList());
    }

    public static List<Topping> listCheese() {
        return Stream.of(
                new Cheese("American"),
                new Cheese("Provolone"),
                new Cheese("Cheddar"),
                new Cheese("Swiss")
        ).collect(Collectors.toList());
    }

    public static List<Topping> listMeat() {
        return Stream.of(
                new Meat("Steak"),
                new Meat("Ham"),
                new Meat("Salami"),
                new Meat("Roast Beef"),
                new Meat("Chicken"),
                new Meat("Bacon")
        ).collect(Collectors.toList());
    }

    public static List<Drink> listDrinks() {
        return Stream.of(
                new Drink("Coke", null),
                new Drink("Diet Coke", null),
                new Drink("Dr. Pepper", null),
                new Drink("Ginger Ale", null),
                new Drink("Root Beer", null)
        ).collect(Collectors.toList());
    }

    public static List<Chips> listChips() {
        return Stream.of(
                new Chips("BBQ"),
                new Chips("Salt & Vinegar"),
                new Chips("Original"),
                new Chips("Sour Cream & Onion")
        ).collect(Collectors.toList());
    }
    public static String[] listBread(){
        String[] breads = new String[4];
        breads[0] = "White";
        breads[1] = "Wheat";
        breads[2] = "Rye";
        breads[3] = "Wrap";

        return breads;
    }
}
