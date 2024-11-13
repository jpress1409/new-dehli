package com.pluralsight.proccessing;

import com.pluralsight.food.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ShopFileManager {

    public static List<Sauce> listSauces() {
        return Stream.of(
                new Sauce("Mayo"),
                new Sauce("Mustard"),
                new Sauce("Ketchup"),
                new Sauce("Thousand Island"),
                new Sauce("Vinaigrette"),
                new Sauce("Ranch")
        ).collect(Collectors.toList());
    }

    public static List<StandardTopping> listToppings() {
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

    public static List<Cheese> listCheese() {
        return Stream.of(
                new Cheese("American"),
                new Cheese("Provolone"),
                new Cheese("Cheddar"),
                new Cheese("Swiss")
        ).collect(Collectors.toList());
    }

    public static List<Meat> listMeat() {
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
                new Drink("Coke"),
                new Drink("Diet Coke"),
                new Drink("Dr. Pepper"),
                new Drink("Ginger Ale"),
                new Drink("Root Beer")
        ).collect(Collectors.toList());
    }

    public static List<Chip> listChips() {
        return Stream.of(
                new Chip("BBQ"),
                new Chip("Salt & Vinegar"),
                new Chip("Original"),
                new Chip("Sour Cream & Onion")
        ).collect(Collectors.toList());
    }
}
