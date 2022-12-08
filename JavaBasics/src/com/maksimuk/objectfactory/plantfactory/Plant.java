package com.maksimuk.objectfactory.plantfactory;

public class Plant {


    private String commonName;
    private String scientificName;
    private boolean doesBloom;
    private boolean hasFruits;


    public Plant(String commonName, String scientificName, boolean doesBloom, boolean hasFruits) {
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.doesBloom = doesBloom;
        this.hasFruits = hasFruits;
    }


    public String getCommonName() {
        return commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public boolean doesBloom() {
        return doesBloom;
    }

    public boolean isHasFruits() {
        return hasFruits;
    }

    @Override
    public String toString() {
        return "Plant:" + '\n' +
                "Common Name: " + commonName + '\n' +
                "Scientific Name: " + scientificName +  '\n' +
                "Blooming: "  + doesBloom + '\n' +
                "Fruits: " + hasFruits;
    }
}
