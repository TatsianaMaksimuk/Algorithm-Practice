package com.maksimuk.createcar;

import com.maksimuk.challenge2.Car;

import java.util.Scanner;

public class CarCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Welcome to the car creator!\n\n");
        System.out.println("Ypu will create a car, then the program will end");
        System.out.println("Enter a car make\nMake:");
        String userInputMake =scanner.nextLine();
        System.out.println("Enter a car make\nModel:");
        String userInputModel =scanner.nextLine();

        Car userCar = new Car(userInputMake, userInputModel,0,0);
        System.out.println("Your new car:\n\n" + userCar);
    }
}
