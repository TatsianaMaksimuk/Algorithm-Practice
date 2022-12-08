package com.maksimuk.objectfactory.plantfactory;

import com.maksimuk.objectfactory.FactoryUI;

public class MainPlant {
    public static void main(String[] args) {
      String commonName = FactoryUI.readString("Plant Common Name:");
      String scientificName = FactoryUI.readString("Plant Scientific name:");
      Boolean doesBloom = FactoryUI.readBoolean("Does bloom?");
      Boolean hasFruits = FactoryUI.readBoolean("HasFruits?");

      Plant plant001 = new Plant(commonName, scientificName, doesBloom, hasFruits);
        System.out.println(plant001);


    }
}
