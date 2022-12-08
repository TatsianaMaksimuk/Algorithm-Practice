package com.maksimuk.challenge2;

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

    @Override
    public String toString() {
        return "Car" +
                "make " + make +
                ", model " + model  +
                ", mileage " + mileage +
                ", Gas Tank Percent - " + gasTankPercent*100 + "%" ;
    }
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }

}


