package com.maksimuk.warmup_sets.set2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //ex.1
        System.out.println(ReverseB(true));
        //ex.2
        System.out.println(countWords("This is a test"));
        //ex.3
        System.out.println(existsHigher(new int[]{5, 3, 15, 22, 4}, 10));
        System.out.println(existsHigher(new int[]{1, 2, 3, 4, 5}, 8));
        System.out.println(existsHigher(new int[]{}, 5));

        System.out.println(countVowels("Celebration"));
        System.out.println(rev("1234"));

        System.out.println(minutesToSeconds("01:00"));
        System.out.println(minutesToSeconds("13:56"));
        System.out.println(minutesToSeconds("10:60"));

        System.out.println(differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println(differenceMaxMin(new int[]{44, 32, 86, 19}));

        System.out.println(doubleLetters("loop"));
        System.out.println(doubleLetters("yummy"));
        System.out.println(doubleLetters("orange"));
        System.out.println(doubleLetters("munchkin"));

        sortNumsAscending(new int[]{1, 2, 10, 50, 5});
        sortNumsAscending(new int[]{80, 29, 4, -95, -24, 85});
    }


    // Ex.1 Flip the Boolean
    public static boolean ReverseB(boolean yourBoolean) {
        return !yourBoolean;
    }

    // Ex.2 Get Word Count
    public static int countWords(String sentence) {
        String[] words = sentence.split(" ");
        return words.length;
    }

    //Ex.3 Exists a Number Higher?
    public static boolean existsHigher(int[] arr, int num) {

        if (arr.length == 0) {
            return false;
        } else for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                return true;
            }

        }
        return false;
    }

    //Ex.4 How Many Vowels?
    public static int countVowels(String arg) {
        int vowels = 0;
        for (int i = 0; i < arg.length(); i++) {
            char character = arg.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                vowels += 1;
            }
        }
        return vowels;
    }

    // Bonus - Reverse the Number
    public static StringBuffer rev(String str) {
        StringBuffer rev = new StringBuffer(str);
        return rev.reverse();
    }

    //Video Length in Seconds

    public static int minutesToSeconds(String minutes) {
        String[] splitTime = minutes.split(":");

        String min = splitTime[0];
        String seconds = splitTime[1];
        int mins = Integer.parseInt(min);
        int secs = Integer.parseInt(seconds);
        if (secs >= 60)
            return -1;
        else return mins * 60 + secs;

    }

    //Difference of Max and Min Numbers in Array
    public static int differenceMaxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0])
                min = arr[i];
            else if (arr[i] > max)
                max = arr[i];
        }
        return max - min;
    }

    //Double Letters
    public static boolean doubleLetters(String arg) {
        /*for (int i = 0; i < arg.length(); i++) {
            for (int j = 1; j < arg.length(); j++) {
                if (arg.charAt(i) == arg.charAt(j) && i!=j)
                    return true;
            } // solution for inconsecutive

        }
        return false;*/
        for (int i = 0; i < arg.length()-1; i++) {
            if (arg.charAt(i+1) == arg.charAt(i))
                return true;
        }
        return false;
    }


    //Sort Numbers in Ascending Order
    public static void sortNumsAscending (int[] arr){
        Arrays.sort(arr);
        for (int i = 0; i < arr.length -1; i++) {
            System.out.println(arr[i]);
        }
    }
}

