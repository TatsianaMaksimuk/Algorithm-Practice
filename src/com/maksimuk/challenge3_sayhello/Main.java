package com.maksimuk.challenge3_sayhello;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        whatIsYourName();

    }


    public static void whatIsYourName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? " );
        String firstName = scanner.next();
        System.out.print("Hello, nice to meet you " + firstName + ". What is you Last Name? ");
        String lastName = scanner.next();
        whatIsYourFullName(firstName, lastName);
    }

    public static void whatIsYourFullName(String firstName, String lastName){
        System.out.println("It is so nice to formally meet you " + firstName +" "+ lastName);
    }
}
