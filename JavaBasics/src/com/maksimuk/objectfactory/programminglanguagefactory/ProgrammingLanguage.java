package com.maksimuk.objectfactory.programminglanguagefactory;

public class ProgrammingLanguage {


    private  String name;
    private boolean isObjectOriented;
    private String fileExtension;


    public ProgrammingLanguage(String name, boolean isObjectOriented, String fileExtension) {
        this.name = name;
        this.isObjectOriented = isObjectOriented;
        this.fileExtension = fileExtension;
    }


    public String getName() {
        return name;
    }

    public boolean isObjectOriented() {
        return isObjectOriented;
    }

    public String getFileExtension() {
        return fileExtension;
    }


    @Override
    public String toString() {
        return "Programming Language: " + "\n" +
                "name: " + name +
                ", is Object Oriented: " + isObjectOriented +
                ", fileExtension: " + fileExtension;
    }

}
