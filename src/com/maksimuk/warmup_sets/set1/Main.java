package com.maksimuk.warmup_sets.set1;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Ex.1
        System.out.println(firstElement(new int[]{1, 2, 3}));

        //Ex.2
        System.out.println(nextNumber(0));
        System.out.println(nextNumber(-2));
    }

    //Ex.1 return first element of the array
    public static int firstElement(int[] par) {
        return par[0];
    }


    //Ex.2 Return the Next Number from the Integer Passed
    public static int nextNumber(int par) {
        return par + 1;
    }
    //Ex.3 Find the Index

    public static int findIndex(int[] arr, int num) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {

        }

        return index;

    }
}
