package com.maksimuk.warmup_sets.set4;

public class set4 {
    public static void main(String[] args) {
        //Two Makes Ten

        System.out.println(makesTen(9, 10));
        System.out.println(makesTen(9, 9));
        System.out.println(makesTen(1, 9));

        //Count Syllables
        System.out.println(numberSyllables("buf-fet"));
        System.out.println(numberSyllables("beau-ti-ful"));
        System.out.println(numberSyllables("on-o-mat-o-poe-ia"));

        //Case Insensitive Comparison

        System.out.println(match("hello", "hELLo"));
        System.out.println(match("motive", "emotive"));
        System.out.println(match("venom", "VENOM"));

        //H4ck3r Sp34k
        System.out.println(hackerSpeak("javascript is cool"));
        System.out.println(hackerSpeak("programming is fun"));
    }

    //Two Makes Ten
    public static boolean makesTen(int a, int b) {
        if (a == 10 || b == 10 || a + b == 10)
            return true;
        return false;
    }

    public static int numberSyllables(String word) {
        String[] syllabs = word.split("-");
        return syllabs.length;
    }

    //Case Insensitive Comparison
    public static boolean match(String str1, String str2) {
        if (str1.equalsIgnoreCase(str2)) return true;
        return false;
    }

    //H4ck3r Sp34k
    public static String hackerSpeak(String arg) {
        String hack = "";
        for (int i = 0; i < arg.length(); i++) {
            switch (arg.charAt(i)) {
                case 'a': {
                    hack += '4';
                    break;
                }
                case 'i': {
                    hack += '1';
                    break;
                }
                case 'o': {
                    hack += '0';
                    break;
                }
                case 'e': {
                    hack += '3';
                    break;
                }
                case 's': {
                    hack += '5';
                    break;
                }
                default:
                    hack += arg.charAt(i);
            }

        }
        return hack;

    }
}
