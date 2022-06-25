package com.maksimuk.car;

public class Car {
    private String make;
    private String model;
    private int mileage;
    private float gasTankPercent;

    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }
public String getMake () {return make;}
    public String getModel () {return model;}
    public int getMileage () {return mileage;}
    public float getGasTankPercent () {return gasTankPercent;}

    public void printInfo() {
        System.out.println(make  + model);
    }
}
