package week1;

import java.util.Scanner;

public class CamelCase {

    public static void camelCaseMaker(String string) {

        String[] processedString = string.split(";"); // separating the string from the task

        String result = "";
        if (processedString[0].equals("S")) {
            String[] split = processedString[2].split("(?=\\p{Upper})");//splitting the string by UpperCase letter
            if (processedString[1].equals("C") || processedString[1].equals("V")) {
                for (int i = 0; i < split.length; i++) {
                    result += " " + split[i].toLowerCase();
                }
            }
            if (processedString[1].equals("M")) {
                for (int i = 0; i < split.length; i++) {
                    result += " " + split[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
                }
            }
        }
        if (processedString[0].equals("C")) {
            result = "";
            String[] split = processedString[2].split(" "); //splitting the String by space
            if (processedString[1].equals("V")) {
                result = split[0];
                for (int i = 1; i < split.length; i++) {
                    //Inserting first character into the String, after capitalizing it
                    result += Character.toUpperCase(split[i].charAt(0));
                    //Iterating through the rest of the word
                    for (int j = 1; j < split[i].length(); j++) {
                        result += split[i].charAt(j);
                    }

                }

            }
            if (processedString[1].equals("M")) {
                result = split[0];
                for (int i = 1; i < split.length; i++) {
                    //Inserting first character into the String, after capitalizing it
                    result += Character.toUpperCase(split[i].charAt(0));
                    //Iterating through the rest of the word
                    for (int j = 1; j < split[i].length(); j++) {
                        result += split[i].charAt(j);
                    }
                }
                result += "()";
            }
            if (processedString[1].equals("C")) {
                for (int i = 0; i < split.length; i++) {
                    //Inserting first character into the String, after capitalizing it
                    result += Character.toUpperCase(split[i].charAt(0));
                    //Iterating through the rest of the word
                    for (int j = 1; j < split[i].length(); j++) {
                        result += split[i].charAt(j);
                    }
                }
            }
        }
        System.out.println(result.trim());
    }


}
