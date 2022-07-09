package com.maksimuk.objectfactory_example.airplanefactory;

import com.maksimuk.objectfactory_example.UI;

public class MainAirplane {
    public static void main(String[] args) {
       String modelName = UI.readString("What is the model name?");
        String tailNumber = UI.readString("What is the tail number?");
        short passengerCap = UI.readShort("What is the plane passenger capacity?",(short)0,(short) 300);
        int marketValue = UI.readInt("What's the plane market value?", 0, 10000000);
        double gasTank = UI.readDouble ("Current gas tank as decimal?", 0,1);

    }
}
