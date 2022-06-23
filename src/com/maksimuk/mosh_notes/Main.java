package com.maksimuk.mosh_notes;

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
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date; //in order to use the class from other packages, we need to import them
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        String message = " Hello World " + "!!!"; // String class is used often that is why instead of new String you can write shorter
        System.out.println(message);
        System.out.println(message.endsWith("!!")); //because string is a class, it has members we can access with . operator. Ends with returns a boolean value
        System.out.println(message.startsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("p"));
        System.out.println(message.replace("!", "7")); //this method does not modify the string, it returns a new string
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
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2; // - initialising ann array like this is old syntax
        System.out.println(Arrays.toString(numbers)); // if we print an array by default Java will return a string that  based on the address of the object in memory (we got [I@6f539caf). Use class array
        System.out.println((Arrays.toString(numbers))); // we got [1, 2, 0, 0, 0], the last tree elements are set to 0 by default, if boolean, to false, if strung - empty string
        //To initialize an array more effectively:
        int[] newNumbers = {2, 3, 5, 1, 4};
        System.out.println(newNumbers.length); //length is a field, the type of the field is integer
        //In Java arrays have fixed size/length. Once we create an array, we cannot add or remove additional items.
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));
        //Multi-dimensional arrays
        int[][] moreNumbers = new int[2][3]; // also old syntax.
        moreNumbers[0][0] = 1;
        System.out.println(Arrays.toString(moreNumbers)); //will return a place in a memory because we're dealing with multidimensional array
        System.out.println(Arrays.deepToString(moreNumbers)); // deepToString is used for printing multidimensional array. We will get [[1, 0, 0], [0, 0, 0]]
        int[][][] mDArray = new int[2][3][5];
        int[][] mDArray2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(Arrays.deepToString(mDArray2));

        //Constants
        final float PI = 3.14F; // if we type final, Java will treat this as constant, so after initializing, we won't be able to change it later.Pi is a final variable or a constant.
        //Constants are always capital letters.
//Arithmetic Expressions. An expression is a piece of code that produces a value.
        int addResult = 10 + 3; //addition
        System.out.println(addResult);
        int subResult = 10 - 3; // subtraction
        int multipleResult = 10 * 3; //multiplication
        int divResult = 10 / 3;
        System.out.println(divResult); //the result will be 3, because in Java the division of two whole numbers is a whole number, to get a floating number, whole numbers have to be converted
        //into floating numbers:
        double divResult2 = (double) 10 / (double) 3;
        System.out.println(divResult2);
        // +-*/ are arithmetic operators, 10 and 3 are operants
        //Increment and decrement operators:
        /*int x =1;
        //x++; x--;
        int y = x++;// increment operator is applied as postfix, meaning first the value of x will be copied to y, y=1; and then the value of x will be incremented(x will be 2, y will be 1)
        int z = ++x; // increment operator is applied as prefix. First x will be incremented by 1, and then it will be copied to z. X and Z will be equal 2.
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);*/

        //Augmented (or compound) assignment operator (+=; -=; *=; /=)
        int x = 1;
        x += 5; // Equivalent to x = x + 5
        System.out.println(x); //we'll get 6
        //multiplication and division operators have higher priority, they're executed first.
        int multiFirst = 10 + 3 * 2;// answer is 16
        System.out.println(multiFirst);
        // () have the highest priority
        int parFirst = (10 + 3) * 2;
        System.out.println(parFirst); //answer is 26

        //Casting and Type conversion
        //Implicit casting == automatic casting == automatic conversion
        //adding a short to an integer, 2 diff types of values, Implicit casting happens because we try to store a short value (2 bytes) in an int (4 bytes).
        short m = 1; //two bytes
        //implicit casting happens automatically when we store a value in a larger or more precise data type.
        //byte>short>int>long
        //When value can be converted into a bigger type conversion happens implicitly.
        int l = m + 2;
        System.out.println(l);
        double m2 = 1.1;
        double l2 = m2 + 2; // here is double and integer. integer less precise than double. int is casted to 2.0
        System.out.println(l2);
        //Implicit casting happens when there's no chance of data loss
        //If we want l2 to be an integer and we don't care about the digits after decimal point and want to see 3 as an answer, we should EXPLICITLY cast the result.
        int l3 = (int) m2 + 2;//we convert m2 to an int, Explicit: we do it manually.
        System.out.println(l3);
        //Explicit casting can only happen between compatible types, these types are compatible because they're numbers.
        //String to a number:
        String str = "1";
        int parsedStr = Integer.parseInt(str) + 3; //integer is a wrapper class for int primitive type.
        System.out.println(parsedStr);
        /*
        To convert a string to a number, we use one of the following methods:
• Byte.parseByte(“1”)
• Short.parseShort(“1”)
• Integer.parseInt(“1”)
• Long.parseLong(“1”)
• Float.parseFloat(“1.1”)
• Double.parseDouble(“1.1”)
         */
//The Math class
        int roundResult = Math.round(1.1F);
        System.out.println(roundResult);
//ceiling -returns a smallest integer that is greater than or equal to this number
        int ceilResult = (int) Math.ceil(1.1F);
        System.out.println(ceilResult);
        //floor
        int floorResult = (int) Math.floor(1.1F);//returns largest integer that is greater than or equal to this number
//max
        int maxResult = (int) Math.max(1, 2); // returns the greater of two values
        System.out.println(maxResult);
//min
        int minResult = (int) Math.min(1, 2); // returns the smallest of two values
        System.out.println(minResult);
//random
        double randomResult = Math.random(); //generating random value between 0 and 1
        System.out.println(randomResult);
        System.out.println(randomResult * 100);
        //double roundedRandomResult = Math.round(randomResult *100); we will have num.0 at the end, because it's double. We have to do explicit casting:
        int roundedRandomResult = (int) Math.round(randomResult * 100);
        System.out.println(roundedRandomResult);
        int roundedRandomResultNoRound = (int) (Math.random() * 100); // use () so it would apply to entire expression, not just Math.random(), that generates a value from 0 to 1,
        // because integer we loose numbers after decimal point.
        System.out.println(roundedRandomResultNoRound);
//Formatting Numbers
        //  NumberFormat currency = new NumberFormat() we cannot create an instance of a NumberFormat class, because it's ABSTRACT
        NumberFormat currency = NumberFormat.getCurrencyInstance();// this method creates an instance of a number format class. This is a factory method.
        currency.format(1234567.891);
        String currencyResult = currency.format(1234567.891);
        System.out.println(currencyResult);

       /* NumberFormat percent = NumberFormat.getPercentInstance();
        percent.format(0.1);
        String percentResult =  percent.format(0.1);
        System.out.println(percentResult);*/
        NumberFormat.getPercentInstance().format(0.1); //instead of writing code like up in a comment, we use method chaining
        String percentResult = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(percentResult);

//Reading input - how to read input from a user
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte userAge = scanner.nextByte();//nextFloat or nextDouble for decimals*/
      /*  Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
       // String userName = scanner.next(); // -Will print only first word entered.
       //  System.out.println("You are "+ userName); // Words we enter named tokens. next method reads only one token.
        // that is wgy is better to use nextLine() method:
        String userName = scanner.nextLine().trim(); //chaining methods.
        System.out.println("U are " + userName);*/




//Control Flow
        //Comparison operators, we use these operators to compare primitive values
        int j = 1;
        int k = 2;
      /*  j == k; // equality operator
        j != k; // in-equality operator
        j > k;
        j >= k;
        j < k;
        j <= k;*/
        //System.out.println(j == k); //boolean expression (block of code that produces boolean value)

        //Logical operators - We use logical operators to combine multiple boolean values/expressions.
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; // x && y (AND): if both x and y are true, the result will be true.
        // System.out.println(isWarm);
        boolean haveLemon = false;
        boolean shouldBuyLemons = !haveLemon;

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligibleForCredit = !hasCriminalRecord;
        System.out.println(hasCriminalRecord);
        System.out.println(isEligibleForCredit);


        boolean isEligible02 = (hasHighIncome || hasGoodCredit && !hasCriminalRecord); /////////////??? We're using a variable value as a base
//!x (NOT): reverses a boolean value. True becomes false.
        System.out.println(isEligible02);


//If statements
        int temp = 32;
        if (temp > 30) { // {} are for multiple statements
            System.out.println("It's hot");
            System.out.println("Drink water");
        } else if (temp > 20)
            System.out.println("Beautiful day");
        else {
            System.out.println("Cold day");
        }

//Simplifying if statements
       /* boolean hasHighSalary;   - initial code
        int income = 120_000;
        if (income > 100_000)
             hasHighSalary = true;
        else
            hasHighSalary = false;*/

        //simplified code:

        int income = 120_000;
        boolean hasHighSalary = (income > 100_000);


//The Ternary Operator
        /*int income02 = 120_00;
        String className;
        if (income>100_000)
            className = "First";
        else
            className = "Economy";*/// - long version

        //shorter version
        int income02 = 120_00;
        String className = income > 100_000 ? "First" : "Economy"; //Ternary operator. We have a condition. If condition is true the 1st value will be returned and assigned to a className,
        //otherwise other value will be returned

//Switch statements - We use switch statements to execute different parts of the code depending on the value of a variable/expression
         /*    String role = "admin";
                if (role == "admin")
                    System.out.println("U're admin");
                else if (role=="operator")
                    System.out.println("U're operator");
                else
                    System.out.println("U're guest");   */   // initial code with if else

        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("U're admin");
                break;
            case "operator":
                System.out.println("U're operator");
                break;  //After each case clause, we use the break statements to jump out of the switch block
            default:
                System.out.println("U're guest");
        }



//For loops
        /*for (int i = 0; i<=5; i++) { //{} for multiple statements
            System.out.println("hello world " + i);
        }*/

//While loops - useful when we don’t know how many times we want to repeat something. This may be dependent on the values at run-time (eg what the user enters).

        int i = 5;
        while (i > 0) {
            System.out.println("hello world " + i);
            i--;
        }

        String input = "";
        //while ( input != "quit") - wont work because string is a reference type, and we cannot use comparison operators between reference types (operators will compare addresses of string, not value)
        Scanner scanner = new Scanner(System.in);
        while /*(!input.equals("quit")*/ (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input == "pass")
                continue; // Java will move control at the beginning of the loop
            if (input.equals("quit"))
                break; //terminates the loop
                System.out.println(input);
        }
// Do..While Loops ... are very similar to while loops but they executed at least once. In contrast, a while loop may never get executed if the condition is initially false.
       /* do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));*/


//For..Each loop - For-each loops are useful for iterating over an array or a collection.

        String[] fruits = {"mango", "apple", "orange"};
          /*for (int i =0; i<fruits.length; i++)
          System.out.println(fruits [i]);
           */
        for (String fruit: fruits) //  for each is forward only/ we don't have access indexes of items
            System.out.println(fruit);

//Mortgage calculator updated

        final byte MONTHS_IN_YEAR =12;
        final byte PERCENT =100;

        Scanner m_scanner = new Scanner(System.in);
        System.out.print("Principal ($1K - $1M): ");
        int principal = scanner.nextInt();
        while (principal>1000 && principal<1000000)
            System.out.println(principal);


        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
        System.out.print("Period (years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period*MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest* Math.pow(1+monthlyInterest, numberOfPayments))
                /Math.pow(1+monthlyInterest, numberOfPayments) -1;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);

    }
}

