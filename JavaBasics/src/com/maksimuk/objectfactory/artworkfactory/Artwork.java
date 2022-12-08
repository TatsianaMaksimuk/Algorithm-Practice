package com.maksimuk.objectfactory.artworkfactory;

import java.util.ArrayList;

public class Artwork {
    private String name;


    private String author;
    private short year;
    private String medium;
    private float widthInCm;
    private float heightInCm;


    private ArrayList<String> list;


    public Artwork(String name, String author, short year, String medium, float widthInCm, float heightInCm, ArrayList<String> list) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.medium = medium;
        this.widthInCm = widthInCm;
        this.heightInCm = heightInCm;
        this.list = list;
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

    public ArrayList<String> getList() {
        return list;
    }


    @Override
    public String toString() {
        return "Artwork: " + "\n" +
                "name: " + name +
                ", author: " + author +
                ", year: " + year +
                ", medium: " + medium +
                ", dimensions: " + widthInCm + "cm * " + heightInCm + " cm" +
                "list" + list;
    }

}
