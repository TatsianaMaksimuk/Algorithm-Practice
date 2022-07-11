package com.maksimuk.objectfactory.artworkfactory;

public class Artwork {
    private String name;


    private String author;
    private short year;
    private String medium;
    private float widthInCm;
    private float heightInCm;



    public Artwork(String name, String author, short year, String medium, float widthInCm, float heightInCm) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.medium = medium;
        this.widthInCm = widthInCm;
        this.heightInCm = heightInCm;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public short getYear() {
        return year;
    }

    public String getMedium() {
        return medium;
    }

    public float getWidthInCm() {
        return widthInCm;
    }

    public float getHeightInCm() {
        return heightInCm;
    }



    @Override
    public String toString() {
        return "Artwork: " + "\n" +
                "name: " + name +
                ", author: " + author +
                ", year: " + year +
                ", medium: " + medium +
                ", dimensions: " + widthInCm + "cm * " + heightInCm + " cm";
    }

}
