package com.maksimuk.mosh_loops;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date; //in order to use the class from other packages, we need to import them
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //For loops
      for (int i = 0; i<=5; i++) { //{} for multiple statements
            System.out.println("hello world " + i);
        }

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
        do {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while(!input.equals("quit"));


//For..Each loop - For-each loops are useful for iterating over an array or a collection.

        String[] fruits = {"mango", "apple", "orange"};
          for (int k =0; k<fruits.length; k++)
          System.out.println(fruits [k]);

        for (String fruit: fruits) //  for each is forward only/ we don't have access indexes of items
            System.out.println(fruit);

    }
}
