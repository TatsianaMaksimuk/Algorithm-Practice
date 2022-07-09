package com.maksimuk.objectfactory_example;

import java.util.Scanner;

public class UI {
    //one method for each type of data
    //all static method
    //take a ? and return a piece of data of the specific type requested

    private static Scanner scanner = new Scanner(System.in); //private method will utilise private string

//recursion - method calls itself
   /* public static String readString (String question){
        System.out.println(question);
        String input = scanner.nextLine();
        if (input.trim().equals("")) {
            return readString(question);}
            else {
                return input;
            }
        } */


    public static String readString(String question) {
        while (true) {
            System.out.println(question);
            String input = scanner.nextLine();
            if (!input.trim().equals((""))) {
                return input;
            }
        }
    }


    public static boolean readBoolean(String question) {
        while (true) {
            try {
                System.out.println(question + "\n(true/false): ");
                boolean input = scanner.nextBoolean();
                scanner.nextLine();
                return input;
            } catch (Exception exception) { // exception == error
                System.out.println("Input must be true or false");
                scanner.nextLine();
            }

        }
    }

    public static short readShort(String question, short min, short max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                short input = scanner.nextShort();
                scanner.nextLine();
                return input;
            } catch (Exception exception) { // exception == error
                System.out.println("Input must between" + min + "-" + max);
                scanner.nextLine();
            }

        }
    }
    public static double readDouble(String question, int min, int max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                double input = scanner.nextDouble();
                scanner.nextLine();
                return input;
            } catch (Exception exception) { // exception == error
                System.out.println("Input must between" + min + "-" + max);
                scanner.nextLine();
            }

        }
    }

    public static int readInt(String question, int min, int max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                int input = scanner.nextInt();
                scanner.nextLine();
                return input;
            } catch (Exception exception) { // exception == error
                System.out.println("Input must between" + min + "-" + max);
                scanner.nextLine();
            }

        }
    }


}



