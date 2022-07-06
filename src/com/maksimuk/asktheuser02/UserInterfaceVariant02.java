package com.maksimuk.asktheuser02;

import java.util.Scanner;

public class UserInterfaceVariant02 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        byte age = askUserAge();
        System.out.println("Age: " + age);
        if (!adult(age)) {
            System.out.println("Minor. Not eligible.");

            return;
        } else System.out.println("Adult");

        String fullName = askUserName();
        short salary = askUserSalary();
        int familyBudget = askUserFamilyBudget();
        float creditScore = askUserCreditScore();
        long propertyPrice = askUserPropertyPrice();
        double propertyArea = askUserPropertyArea();
        boolean hasChildren = askUserIfHasChildren();

        Customer customer01 = new Customer (fullName, age, salary, familyBudget, creditScore, propertyPrice, hasChildren, propertyArea);
        System.out.println(customer01);

    }

    private static byte askUserAge() {
        System.out.println("State your age: ");
        byte age = scanner.nextByte();
        boolean adult = true;
        return age;
    }

    private static boolean adult(byte age) {
        boolean adult = true;
        if (age < 18) {
            adult = false;
        }
        return adult;
    }

    private static short askUserSalary() {
        System.out.println("State your salary: ");
        short salary = scanner.nextShort();
        return salary;
    }

    private static int askUserFamilyBudget() {
        System.out.println("State your monthly family budget: ");
        int familyBudget = scanner.nextInt();
        return familyBudget;
    }

    private static float askUserCreditScore() {
        System.out.println("State your credit score: ");
        float creditScore = scanner.nextFloat();
        return creditScore;
    }

    private static long askUserPropertyPrice() {
        System.out.println("State your property price: ");
        long propertyPrice = scanner.nextLong();
        return propertyPrice;
    }

    private static double askUserPropertyArea() {
        System.out.println("State your property area: ");
        double propertyArea = scanner.nextDouble();
        return propertyArea;
    }

    private static boolean askUserIfHasChildren(){
        System.out.println("Do you have children (true/false): ");
        boolean hasChildren = scanner.hasNextBoolean();
        return hasChildren;
    }
    private static String askUserName() {
        System.out.println("State your first name: ");
        scanner.nextLine();
        String firstName = scanner.nextLine();
        System.out.println("State your last name: ");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + lastName;
        return fullName;
    }


}


