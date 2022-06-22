package com.maksimuk.mosh_mortgage_calculator_basic;
import java.util.Scanner;
import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    //Mortgage calculator (my solution):
    public static void main(String[] args) {
        Scanner mortgageScanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = mortgageScanner.nextInt();
        System.out.println("Principal: " + principal);
        System.out.print("Annual Interest Rate: ");
        float annualInterest = mortgageScanner.nextFloat();
        System.out.println("Annual Interest Rate: " + annualInterest + "%");
        System.out.print("Period (years): ");
        byte period = mortgageScanner.nextByte();
        System.out.println("Period (years): " + period);
        float monthlyInterest = (annualInterest / 100 / 12);
        System.out.println(monthlyInterest);
        int numOfPayments = period * 12;
        double top = Math.pow(1 + monthlyInterest, numOfPayments) * monthlyInterest;
        double bottom = Math.pow(1 + monthlyInterest, numOfPayments) - 1;
        double mortgage = principal * (top / bottom);
        String mortgagePayment = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgagePayment);

//Mosh solution
        /*
        final byte MONTHS_IN_YEAR =12; //good practice instead using numbers like 12 or 100

        final byte PERCENT =100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = mortgageScanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        monthlyInterest = annualInterest/PERCENT/MONTHS_IN_YEAR;
        System.out.print("Period (years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period*MONTHS_IN_YEAR;
        double mortgage = principal
                * (monthlyInterest* Math.pow(1+monthlyInterest, numOfPayments))
                /Math.pow(1+monthlyInterest, numOfPayments) -1;
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(mortgageFormatted);
        */
    }
}
