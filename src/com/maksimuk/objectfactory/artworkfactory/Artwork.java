package com.maksimuk.objectfactory.artworkfactory;

public class Artwork {
    private String name;
    private String author;
    private short year;
    private String medium;



    public Artwork(String name, String author, short year, String medium) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.medium = medium;
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


    @Override
    public String toString() {
        return "Artwork:" +"\n" +
                "name: " + name +
                ", author: " + author +
                ", year: " + year +
                ", medium: " + medium;
    }
}
