package com.maksimuk.objectfactory.animalfactory;

import com.maksimuk.objectfactory.FactoryUI;

public class AnimalMain {
    public static void main(String[] args) {
        String species = FactoryUI.readString("Species: ");
        short legs = FactoryUI.readShort("How many legs?", (short) 2, (short) 8);
        boolean isTerrestrial = FactoryUI.readBoolean("Is terrestrial? (true/false?)");

        Animal cat = new Animal(species, legs, isTerrestrial);
        System.out.println(cat);
    }
}
