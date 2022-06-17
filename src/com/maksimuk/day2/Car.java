package com.maksimuk.day2;

public class Car {
    private String company;
    private int speed;

    public Car(String company, int speed){
        this.company= company;
        this.speed =speed;

    }

    public String getCompany () {
        return company;
    }

    public int getSpeed () {
        return  speed;
    }

    public void printInfo() {
        System.out.println(company + " car's speed is " + speed + "Km/hr");
    }
}