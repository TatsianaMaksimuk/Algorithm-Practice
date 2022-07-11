package com.maksimuk.objectfactory.artworkfactory;

import com.maksimuk.objectfactory.FactoryUI;

public class MainArtwork {
    public static void main(String[] args) {

        String name = FactoryUI.readString("Name: ");
        String author = FactoryUI.readString("Author: ");
        Short year = FactoryUI.readShort("Year: ", (short) 0, (short) 2022);
        String medium = FactoryUI.readString("Medium: ");

        Artwork artwork01 = new Artwork(name, author,year,medium);
        System.out.println(artwork01);
    }
}
