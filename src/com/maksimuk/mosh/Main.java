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

import java.util.Date; //in order to use the class from other packages, we need to import them

public class Main {
    public static void main(String[] args){
        int age = 30; //Int - type of variable that stores only integers, whole numbers
        age = 35;
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
        Date now = new Date();//we're importing the date class to this package. Declared variable now is an instance of a Date class.
        //object is an instance of a class
    }
}

//Types
//2 categories of types in Java
//Primitives: for storing simple values (numbers, strings and booleans), there are 8:
//For numbers: byte (1byte-[-128;127]); short(2 [-32K, 32K]); int(4 [-2B, 2B]); long (8) / for numbers with decimal point: float(4 bytes); double(8 bytes)/ For characters: char (2bytes, A,B,C); boolean (1, true/false)
//Reference types (non-primitive): for storing complex objects like data objects or email messages.