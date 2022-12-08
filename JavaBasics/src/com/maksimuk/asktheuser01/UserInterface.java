package com.maksimuk.asktheuser01;

import java.util.Scanner;

public class UserInterface {
    private static final Scanner scanner = new Scanner(System.in);
    private static byte age;
    private static short salary;
    private static int familyBudget;
    private static float creditScore;
    private static long propertyPrice;
    private static double propertyArea;
    private static boolean hasChildren;
    private static String fullName;

    public static void main(String[] args) {
        age();
        salary();
        familyBudget();
        creditScore ();
        propertyPrice ();
        propertyArea ();
        children ();
        fullName();

        User generatedUser1 = new User(age, salary, familyBudget, creditScore, propertyPrice, propertyArea,hasChildren,fullName);

        System.out.println(generatedUser1);
    }

    private static void age() {
        System.out.println("State your age: ");
        age = scanner.nextByte();
        System.out.println("Age: " + age);
    }

    private static void salary() {
        System.out.println("State your monthly salary: ");
        salary = scanner.nextShort();
        System.out.println("Monthly salary: " + salary + "$");
    }

    private static void familyBudget() {
        System.out.println("State your family budget: ?");
        familyBudget = scanner.nextInt();
        System.out.println("Monthly family budget: " + familyBudget);
    }

    private static void creditScore () {
        System.out.println("State your credit Score: ");
        creditScore = scanner.nextFloat();
        System.out.println("Credit Score: " + creditScore);
    }

    private static void propertyPrice () {
        System.out.println("State your property cost: ");
        propertyPrice = scanner.nextLong();
        System.out.println("Property Price: " + propertyPrice + "$");
    }

    private static void propertyArea () {
        System.out.println("State your property area: ");
        propertyArea = scanner.nextDouble();
        System.out.println("Property Area: " + propertyArea);
    }

    private static void children () {
        System.out.println("Do you have children? True/False");
        hasChildren = scanner.nextBoolean();
        System.out.println("has children: " + hasChildren);
    }

    private static void fullName(){
        System.out.println("What is your First Name?");
        scanner.nextLine(); // clears \n new line character from input Stream (system.in)
        String firstName = scanner.nextLine();

        System.out.println("What is your Last Name?");
        String lastName = scanner.nextLine();
        fullName = firstName + " " + lastName;
        System.out.println("Name: " + fullName);
    }
}
