package com.maksimuk.objectfactory_example.airplanefactory;

import com.maksimuk.objectfactory_example.UI;

public class Airplane {


    //ModelName; tailNumber; passengerCap; marketValue; gasTankCap; isFlying
    //always make your fields private
    private String modelName;
    private String tailNumber;
    private short passengerCap;
    private long marketValue;
    private double gasTank;
    private boolean isFlying;


    public Airplane(String modelName, String tailNumber, short passengerCap, long marketValue, double gasTank, boolean isFlying) {
        this.modelName = modelName;
        this.tailNumber = tailNumber;
        this.passengerCap = passengerCap;
        this.marketValue = marketValue;
        this.gasTank = gasTank;
        this.isFlying = isFlying;
    }

    public String getModelName() {
        return modelName;
    }

    public String getTailNumber() {
        return tailNumber;
    }

    public short getPassengerCap() {
        return passengerCap;
    }

    public long getMarketValue() {
        return marketValue;
    }

    public double getGasTank() {
        return gasTank;
    }

    public boolean isFlying() {
        return isFlying;
    }



    @Override
    public String toString() {
        return "Airplane:\n" +
                "Model: " + modelName + '\n' +
                ", Tail Number: " + tailNumber + '\n' +
                ", Passenger Cap: " + passengerCap +'\n' +
                ", Price: " + marketValue + '\n' +
                ", Gas Tank %" + gasTank + '\n' +
                ", Airborne: " + (isFlying? "The plane is in the air":"The plane is on the ground");
    }

}

