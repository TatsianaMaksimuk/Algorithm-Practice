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
            Airplane generatedAirplane = createAirplane();
            hanger.add(generatedAirplane);
            System.out.println("Created airplane\n" + generatedAirplane);

        }

        System.out.println("Thank you for using the program...");

    }

    private static Airplane createAirplane() {
        String modelName = UI.readString("What is the model name?");
        String tailNumber = "AAA";//UI.readString("What is the tail number?");
        short passengerCap = 100;//UI.readShort("What is the plane passenger capacity?",(short)0,(short) 300);
        int marketValue = 100_00_00;//UI.readInt("What's the plane market value?", 0, 10000000);
        double gasTank = .5; //UI.readDouble ("Current gas tank as decimal?", 0,1);
        boolean isFlying = false; // UI.readBoolean("Is airplane flying?");
        return new Airplane(modelName, tailNumber, passengerCap, marketValue, gasTank, isFlying);

    }
}
