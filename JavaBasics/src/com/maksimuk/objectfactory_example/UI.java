package com.maksimuk.objectfactory_example;

import java.util.ArrayList;
import java.util.Locale;
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
            String input = scanner.nextLine().trim();
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
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println(" Input must be between " + min + " and " + max);
                }
            } catch (Exception exception) { // exception == error
                System.out.println("Input must between" + min + "-" + max);
                scanner.nextLine();
            }

        }
    }

    public static long readLong(String question, long min, long max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                long input = scanner.nextLong();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println(" Input must be between " + min + " and " + max);
                }
                return input;
            } catch (Exception exception) { // exception == error
                System.out.println("Input must between" + min + "-" + max);
                scanner.nextLine();
            }

        }
    }

    public static byte readByte(String question, byte min, byte max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                byte input = scanner.nextByte();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println(" Input must be between " + min + " and " + max);
                }
                return input;
            } catch (Exception exception) { // exception == error
                System.out.println("Input must between" + min + "-" + max);
                scanner.nextLine();
            }

        }
    }

    public static float readFloat(String question, byte min, byte max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                float input = scanner.nextFloat();
                scanner.nextLine();
                if (input <= max && input >= min) {
                    return input;
                } else {
                    System.out.println(" Input must be between " + min + " and " + max);
                }
                return input;
            } catch (Exception exception) { // exception == error
                System.out.println("Input must between" + min + "-" + max);
                scanner.nextLine();
            }

        }
    }

    public static char readChar(String question) {
        while (true) {
            System.out.println(question);
            String input = scanner.nextLine().trim(); //we dont want charAt to grab a space
            if (input.length() == 1) {
                return input.charAt(0); //String is an array of characters, CharAt for grabbing a character in a string in special location
            } else if (input.equals("")) {
                System.out.println("\nYou cannot leave the input blank");
            }
        }
    }

    public static ArrayList<String> readListOfStrings(String question, byte min, byte max) {
        ArrayList<String> responses = new ArrayList<>();
        System.out.println(question);
        System.out.println("Please, enter at least " + min + " inputs and at most " + max + " inputs.");
        for (int i = 0; i < max; i++) {
            String userInput = readString("(" + (i + 1) + "/" + max + ")");
            responses.add(userInput);
            if (responses.size() == max){
                System.out.println("Max number of inputs has been entered");
            } else if (responses.size() >= min && !readYesOrNo("Would you like to add more inputs?")) break;
        }
        System.out.println("Your responses have been recorded.");
        return responses;
    }

    public static boolean readYesOrNo(String question) {
        while (true) {
            String userInput = readString(question + "\n(y/n): ");
            char selection = userInput.toLowerCase().charAt(0);
            if (selection == 'y') return true;
            if (selection == 'n') return false;
            System.out.println("Input must be y or n");
        }
    }

    public static void main(String[] args) {
        ArrayList<String> responses = readListOfStrings("test", (byte) 2, (byte) 4);
        System.out.println(responses);
    }

}


//to do public static ArrayList<String> readListOfStrings (question,min,max)
// public static String selectFromListOfStrings (question, min, max)


