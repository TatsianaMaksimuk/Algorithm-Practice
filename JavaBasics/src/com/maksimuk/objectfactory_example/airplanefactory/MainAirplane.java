package com.maksimuk.objectfactory_example.airplanefactory;

import com.maksimuk.objectfactory_example.UI;

import java.util.ArrayList;

public class MainAirplane {
    public static void main(String[] args) {
        ArrayList<Airplane> hanger = new ArrayList<>();

        System.out.println("Airplane factory \n");

        while (true) {

            System.out.println("\nMENU\n" + "_".repeat(20));
            System.out.println("1) Create a Plane");
            System.out.println("2) Show Hanger");
            System.out.println("3) Exit the program");
            byte menuChoice = UI.readByte("Choose an option: ", (byte) 1, (byte) 3);
            if (menuChoice == 3) break;
            else if (menuChoice == 2) {
                if (hanger.size() == 0) {
                    System.out.println("\nNo Airplanes in Hanger\n");
                    continue; //skips to the next iteration of the loop
                }
                //Show hanger
                System.out.println("\nAirplane Hanger\n");
                for (int i = 0; i < hanger.size(); i++) {
                    System.out.println(i + 1 + ") " + hanger.get(i));
                }
                System.out.println("-".repeat(20));
                continue;
            }


            //If the code get to this pont, the user will create a plane
            Airplane generatedAirplane = Airplane.createAirplane();
            hanger.add(generatedAirplane);
            System.out.println("Created airplane\n" + generatedAirplane);

        }

        System.out.println("Thank you for using the program...");

    }


}
