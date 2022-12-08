package com.maksimuk.objectfactory.countryfactory;

import com.maksimuk.objectfactory.FactoryUI;

public class MainCountry {
    public static void main(String[] args) {
        String name = FactoryUI.readString("Country name: ");
        long population = FactoryUI.readLong("Country population:", 1, 9223372036854775807L);
        String capital = FactoryUI.readString("Country capital: ");

        Country country001 = new Country(name, population, capital);
        System.out.println(country001);
    }
}
