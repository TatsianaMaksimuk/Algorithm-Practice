package com.maksimuk.mosh;

                                                            /*General*/
//Java was developed by James Gosling in 1995 at Sun Microsystems and later was acquired by Oracle.

// class is a container for related functions. We use it to organize our code
//Packages are containers where we group related classes
//Every program has Main class that contains the Main Function (Method)
// Methods are smallest building blocks in Java programs
//Java allows us to break down programs into small building blocks that are easy to understand and use and reuse.
//Methods have access modifiers (public - means accessible from other parts of the program. Also,private.
//Class naming PascalNaming, methods - camelCase

 /*
public  class Main {
   public static void main (String[] args) { //function Main is an entry point, the main function is called - code inside executes
//function inside a class is method
       System.out.println("Hello world!");
    }
}
*/

//We use JDK (Java Development Kit) to build apps. JDK has JRE (Java Runtime Environment),compiler and library of classes.
//The structure of JRE makes Java platform independent (can be written on one OS and executed on another)
//The Java compiler takes Java code and compiles it into Java Bytecode cross-platform format. When we run app, JVM (Java Virtual Machine) takes bytecode and translates it into OS native code.
//
//Java editions: Standard Edition (SE): the core; Enterprise Edition (EE): for large systems, Micro Edition (ME):for mobile devices; Java Card: used in smart cards

                                                          /*Fundamentals*/
// Variables are used for temporarily data storage. In Java, the variable should be specified at the time of declaration.

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Date; //in order to use the class from other packages, we need to import them
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        int age = 30; //Int - type of variable that stores only integers, whole numbers
        age = 35; //primitive type, not an onjects, doesn't have components
        byte myAge = 30;
        int herAge = myAge;
        System.out.println(age);
        System.out.println(herAge);
        int viewsCount = 123_456_789; //use underscore to make number more readable
        long viewsCount2 = 3_123_456_789L; //• The default integer type in Java is int. For a long value, add L to the end as a postfix.
        float price = 10.99F; // The default floating-point type in Java is double. To represent a float, add F to it as a postfix.
        char letter = 'A'; // single characters with single quotes. Multiple (strings) with double quotes.
        boolean isEligible = true;
        //reference types(read below):
        Date now = new Date();//we're importing the date class to this package. Declared variable now is an instance of a Date class. Class defines templates or blueprints for new objects (instances)
        //object is an instance of a class
        /* now.getTime() */ //- will return time component of the object now
        System.out.println(); //sout
        System.out.println(now);

       /* byte x = 1;
        byte y = x;
        x=2;
        System.out.println(y); // x and y are completely independent primitive types. They are in different memory locations.*/

        Point point1 = new Point(1, 1);
        Point point2 = point1; // we copy the value of a variable into another variable, that value is not an object but the address or reference to the point object in memory.
        // Reference variables don't store the actual value,the store a reference to an object somewhere in a memory. Point 1 and 2 are referencing the same object in a memory
        //we only have one point object, so these to variables are not independent of each other, so if the object will be updated through 1 variable, the changes will be visible to another
        point1.x = 2;
        System.out.println(point2);
//Types
//2 categories of types in Java
//Primitives: for storing simple values (numbers, strings and booleans), there are 8:
//For numbers: byte (1byte-[-128;127]); short(2 [-32K, 32K]); int(4 [-2B, 2B]); long (8) / for numbers with decimal point: float(4 bytes); double(8 bytes)/ For characters: char (2bytes, A,B,C); boolean (1, true/false)
//Reference types (non-primitive): for storing complex objects like data objects or email messages.

        //Strings and useful string methods
       // String message = new String("Hello World");
        String message = " Hello World "+"!!!"; // String class is used often that is why instead of new String you can write shorter
        System.out.println(message);
        System.out.println(message.endsWith("!!")); //because string is a class, it has members we can access with . operator. Ends with returns a boolean value
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("p"));
        System.out.println(message.replace("!","7")); //this method does not modify the string, it returns a new string
        System.out.println(message); //returns unchanged string. In Java strings are immutable, any method that modifies string returns new string
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());// trims blank spaces
        //Include special characters in String
        String greetings = "Hi, \"Tanya\"";
        System.out.println(greetings);
        String address = "c:\nWin\tdows\\...";// \n -new lane; \to add special symbols, \t to add a tab, these are called escape sequences.
        System.out.println(address);
//Arrays - we use arrays to store a list of objects (any type of objects, primitive or reference)
        int [] numbers = new int[5];
        numbers [0] =1;
        numbers [1] = 2; // - initialising ann array like this is old syntax
        System.out.println(numbers); // if we print an array by default Java will return a string that  based on the address of the object in memory (we got [I@6f539caf). Use class array
        System.out.println((Arrays.toString(numbers))); // we got [1, 2, 0, 0, 0], the last tree elements are set to 0 by default, if boolean, to false, if strung - empty string
        //To initialize an array more effectively:
        int[] newNumbers = {2,3,5,1,4};
        System.out.println(newNumbers.length); //length is a field, the type of the field is integer
        //In Java arrays have fixed size/length. Once we create an array, we cannot add or remove additional items.
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));
        //Multi-dimensional arrays

    }
}

