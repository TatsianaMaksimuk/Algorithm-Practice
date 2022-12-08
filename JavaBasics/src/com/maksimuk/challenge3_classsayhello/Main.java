package com.maksimuk.challenge3_classsayhello;

import com.maksimuk.challenge1.NameGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whatISYourName();
    }

    public static void whatISYourName() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?\nName:");

        String userInput = scanner.nextLine().trim();

        System.out.println("User input: " + userInput);
        System.out.println("Hello, "+userInput+"! It is nice to meet you. Have a great day!");
    }

    public static void whatISYourFullName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your First Name\nName: ");
        String firstName = scanner.nextLine().trim();
        System.out.println("What is your Last Name\nName: ");
        String lastName = scanner.nextLine().trim();

        String fullName = new NameGenerator().generateFullName(firstName,lastName);

        System.out.println("It is so nice to formally meet you, "+fullName);

    };

}
