package com.maksimuk.objectfactory.artworkfactory;

import com.maksimuk.objectfactory.FactoryUI;

import java.util.ArrayList;

public class MainArtwork {
    public static void main(String[] args) {


        ArrayList<Artwork> gallery = new ArrayList<>();

        System.out.println("Gallery Archive: ");

        while (true) {
            System.out.println("\nMenu\n" + "_".repeat(30));
            System.out.println("1) Input piece of Art");
            System.out.println("2) Show gallery");
            System.out.println("3) Exit program");

            byte menuChoice = FactoryUI.readByte("Choose option:", (byte) 1, (byte) 3);

            if (menuChoice == 3) {
                break;
            } else if (menuChoice == 2) {
                if (gallery.size() == 0) {
                    System.out.println("Gallery is empty");
                    continue;
                }
                System.out.println("-".repeat(30));
                System.out.println("\nGALLERY\n");
                for (int i = 0; i < gallery.size(); i++) {
                    System.out.println(i + 1 + ")" + gallery.get(i));
                }
                System.out.println("_".repeat(30));

            } else {
                //If the user gets to this point, they will add new artwork
                Artwork generatedArtwork = createArtwork();
                gallery.add(generatedArtwork);
                System.out.println("Added\n" + generatedArtwork);
            }
            System.out.println("Thank you for adding your art piece to the gallery");
        }

    }

    private static Artwork createArtwork() {
        String name = FactoryUI.readString("Name: ");
        String author = FactoryUI.readString("Author: ");
        Short year = FactoryUI.readShort("Year ", (short) 0, (short) 2022);
        String medium = FactoryUI.readString("Medium: ");
        float widthInCm = FactoryUI.readFloat("Width in cm ", 0, 1000000);
        float heightInCm = FactoryUI.readFloat("Height in cm ", 0, 1000000);

        return new Artwork(name, author, year, medium, widthInCm, heightInCm);

    }
}

