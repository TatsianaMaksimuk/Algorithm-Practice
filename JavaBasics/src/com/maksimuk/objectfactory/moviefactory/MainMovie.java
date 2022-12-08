package com.maksimuk.objectfactory.moviefactory;

import com.maksimuk.objectfactory.FactoryUI;

public class MainMovie {
    public static void main(String[] args) {

        String title  = FactoryUI.readString("Movie title: ");
        String director = FactoryUI.readString("Director: ");
        float runtimeInMin = FactoryUI.readFloat("Runtime in minutes: ", 1, 1000000);
        boolean hasBeenReleased = FactoryUI.readBoolean("Does movie have been released?");
        short yearOfRelease = FactoryUI.readShort("Year of Release: ", (short) 0, (short) 3000 );

        Movie movie001 = new Movie(title, director, runtimeInMin, hasBeenReleased, yearOfRelease);
        System.out.println(movie001);
    }
}
