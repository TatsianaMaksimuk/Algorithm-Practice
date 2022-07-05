package com.maksimuk.warmup_sets.set2;

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
                vowels +=1;
            }
        }
        return vowels;
    }
}

