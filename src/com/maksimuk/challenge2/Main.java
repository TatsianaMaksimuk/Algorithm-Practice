package com.maksimuk.challenge2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Camaro 2SS", "Chevy", 100000,0.10F);
        Car car2 = new Car("Mustang GT", "Ford", 300000,0.50F);
        Car car3 = new Car("Hellcat", "Dodge", 100,0.90F);




        Car [] carsArray = {car1, car2, car3};
        for (int i =0; i <carsArray.length; i++){
            System.out.println(carsArray[i].getMake() + " " + carsArray[i].getModel());
        }


        System.out.println("///////////////////////////////");



        for (int i = 0; i < carsArray.length; i++){
            System.out.println(carsArray[i]);
        }
    }
}

