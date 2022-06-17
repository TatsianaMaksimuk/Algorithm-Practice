package com.maksimuk.day2;


public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("mercedes", 40);

        myCar.printInfo();

        System.out.println( myCar.getCompany() );
        System.out.println( myCar.getSpeed() );
    }
}