package com.maksimuk.objectfactory.fruitfactory;

import com.maksimuk.objectfactory.FactoryUI;

public class MainFruit {
    public static void main(String[] args) {
        String name = FactoryUI.readString("Fruit: ");
        String color = FactoryUI.readString("Fruit color: ");
        Boolean hasSeeds = FactoryUI.readBoolean("Does fruit have seeds?");

        Fruit apple = new Fruit(name, color, hasSeeds);
        System.out.println(apple);
    }
}
