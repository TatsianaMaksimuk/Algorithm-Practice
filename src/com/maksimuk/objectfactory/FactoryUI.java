package com.maksimuk.objectfactory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FactoryUI {
    private static Scanner scanner = new Scanner(System.in);

    public static String readString(String question) {
        while (true) {
            System.out.println(question);
            String input = scanner.nextLine();
            if (!input.trim().equals("")) {
                return input;
            }
        }
    }

    public static boolean readBoolean(String question) {
        while (true) {
            try {
                System.out.println(question + "\n (true or false): ");
                boolean input = scanner.nextBoolean();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be <<true>> or <<false>>");
                scanner.nextLine();
            }
        }
    }

    public static short readShort(String question, short min, short max) {
        while (true) {
            try {
                System.out.println(question + "\n (" + min + "-" + max + "): ");
                short input = scanner.nextShort();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be between" + min + "-" + max);
                scanner.nextLine();
            }
        }

    }

    public static double readDouble(String question, int min, int max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                double input = scanner.nextDouble();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be between" + min + "-" + max);
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
            } catch (Exception exception) {
                System.out.println("Input must be between" + min + "-" + max);
                scanner.nextLine();
            }
        }
    }

    public static long readLong(String question, int min, long max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                long input = scanner.nextLong();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be between" + min + "-" + max);
                scanner.nextLine();
            }
        }
    }

    public static float readFloat(String question, int min, long max) {
        while (true) {
            try {
                System.out.println(question + "\n(" + min + "-" + max + "): ");
                float input = scanner.nextFloat();
                scanner.nextLine();
                return input;
            } catch (Exception exception) {
                System.out.println("Input must be between" + min + "-" + max);
                scanner.nextLine();
            }
        }
    }
}

