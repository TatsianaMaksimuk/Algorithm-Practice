package com.maksimuk.warmup_algorithms;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Return the First Element in an Array
        System.out.println(getFirstValue(new int[]{4, 5, 13}));

        System.out.println(firstValueArrayList("Buenos Aires", "Córdoba", "La Plata"));


//Getting the next number:
        System.out.println(nextNumber(7));
    }


//Return the First Element in an Array

    public static int getFirstValue(int[] arr) {
        return arr[0];
    }

    public static String firstValueArrayList(String... arrList) {
        return new ArrayList<>(Arrays.asList(arrList)).get(0);
    }


    public static int nextNumber(int par) {
        return par + 1;
    }


    public static int findIndex(int[] arr, int num) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) index = i;
        }

        return index;

    }


}
