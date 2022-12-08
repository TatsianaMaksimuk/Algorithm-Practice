package com.maksimuk.objectfactory.programminglanguagefactory;

import com.maksimuk.objectfactory.FactoryUI;
import com.maksimuk.objectfactory_example.UI;

public class MainProgrammingLanguage {
    public static void main(String[] args) {

        String name = FactoryUI.readString("Programming Language Name: ");
        boolean isObjectOriented = FactoryUI.readBoolean("Is language Object  Oriented?:");
        String fileExtension = FactoryUI.readString("File extension: ");

        ProgrammingLanguage Java = new ProgrammingLanguage(name,isObjectOriented, fileExtension);
        System.out.println(Java);

    }
}
