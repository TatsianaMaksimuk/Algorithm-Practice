package com.maksimuk.challenge1;

public class Main {
    public static void main(String[] args) {
        String firstName = "Tanya";
        String lastName = "Maksimuk";
        String fullName = firstName + " " +lastName;
        System.out.println(fullName);

        NameGenerator nameGen = new NameGenerator();

        String generatedFullName = NameGenerator.generateFullName("John", "Doe");



        System.out.println(createFullName("First", "Last"));
        System.out.println(createFullName("b", "Lab"));
    }

    private static String createFullName (String firstName, String lastName){
        return firstName +" "+ lastName;
    }
}
