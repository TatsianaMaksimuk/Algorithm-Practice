package com.maksimuk.objectfactory.countryfactory;

public class Country {


    @Override
    public String toString() {
        return "Country:" + "\n" +
                "name: " + name +
                ", population: " + population +
                ", capital: " + capital;
    }

    private String name;
    private long population;
    private String capital;

    public Country(String name, long population, String capital) {
        this.name = name;
        this.population = population;
        this.capital = capital;
    }


    public String getName() {
        return name;
    }

    public long getPopulation() {
        return population;
    }

    public String getCapital() {
        return capital;
    }
}
