package com.maksimuk.mosh_fizzbuzz;



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //fizzbuzz - my solution
       Scanner fizzBuzzScanner = new Scanner(System.in);
        System.out.print("Your Number: ");

        int yourNum = fizzBuzzScanner.nextInt();
        if (yourNum%5==0 && yourNum%3==0)
            System.out.println("FizzBuzz");
        else if (yourNum%5 == 0)
            System.out.println("Fizz");
        else if (yourNum%3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(yourNum);
    }
}
