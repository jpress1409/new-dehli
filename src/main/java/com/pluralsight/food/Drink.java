package com.pluralsight.food;

public class Drink {
    private String flavor;
    private String size;

    public Drink(String flavor, String size) {
        this.flavor = flavor;
        this.size = size;
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
    }


    public double calcPrice() {
        double price = 0;
        switch (getSize()) {
            case "S" -> price = 2.00;
            case "M" -> price = 2.50;
            case "L" -> price = 3.00;
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
