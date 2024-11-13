package com.pluralsight.food;

public class Drink {
    private String flavor;
    private double price;
    private String size;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.price = price;
        this.size = size;
    }

    public Drink(String flavor) {
        this.flavor = flavor;
        this.price = price;
        this.size = "M";
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }


    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
        this.price = calcPrice();
    }
    public double calcPrice() {
        switch (getSize()) {
            case "S" -> price = 1;
            case "M" -> price = 2;
            case "L" -> price = 3;
        }

        return price;
    }



    @Override
    public String toString() {
        return "Drink{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
