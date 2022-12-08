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
    private Airplane() {};

   /* private Airplane(String modelName, String tailNumber, short passengerCap, long marketValue, double gasTank, boolean isFlying) {
        this.modelName = modelName;
        this.tailNumber = tailNumber;
        this.passengerCap = passengerCap;
        this.marketValue = marketValue;
        this.gasTank = gasTank;
        this.isFlying = isFlying;
    }*/

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


    public static Airplane createAirplane() {

        Airplane newAirplane = new Airplane();

        newAirplane.modelName = UI.readString("What is the model name?");
        newAirplane.tailNumber = "AAA";//UI.readString("What is the tail number?");
        newAirplane.passengerCap = 100;//UI.readShort("What is the plane passenger capacity?",(short)0,(short) 300);
        newAirplane.marketValue = 100_00_00;//UI.readInt("What's the plane market value?", 0, 10000000);
        newAirplane.gasTank = .5; //UI.readDouble ("Current gas tank as decimal?", 0,1);
        newAirplane.isFlying = false; // UI.readBoolean("Is airplane flying?");

        return newAirplane;

    }
}

