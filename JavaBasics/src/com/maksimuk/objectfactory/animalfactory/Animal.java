package com.maksimuk.objectfactory.animalfactory;

public class Animal {



    private String species;
    private short legs;
    private boolean isTerrestrial;


    public Animal(String species, short legs, boolean isTerrestrial) {
        this.species = species;
        this.legs = legs;
        this.isTerrestrial = isTerrestrial;
    }


    public String getSpecies() {
        return species;
    }

    public short getLegs() {
        return legs;
    }

    public boolean isTerrestrial() {
        return isTerrestrial;
    }


    @Override
    public String toString() {
        return "Animal:" +
                " species: " + species +
                ", legs: " + legs +
                ", isTerrestrial: " + isTerrestrial;
    }

}
