package com.maksimuk.objectfactory.fruitfactory;

public class Fruit {
    private String name;
    private String color;
    private boolean hasSeeds;


    public Fruit(String name, String color, boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isHasSeeds() {
        return hasSeeds;
    }

    @Override
    public String toString() {
        return "Fruit: " + "\n" +
                "name: " + name +
                ", color: " + color +
                ", hasSeeds: " + hasSeeds;
    }

}
