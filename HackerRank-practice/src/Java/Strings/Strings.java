package Java.Strings;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();
        stringSum(A,B);
        isBigger(A,B);
        capitalizedSum(A,B);
    }

    public static void stringSum(String A, String B){
        int aLength = A.length();
        int bLength = B.length();
        int sum = aLength +bLength;
        System.out.println(sum);
    }

    public static void isBigger(String A, String B){
        int result = A.compareTo(B);
        if (result<=0){
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public static void capitalizedSum(String A, String B){
        String Acapitalized = A.substring(0, 1).toUpperCase() + A.substring(1);
        String Bcapitalized = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(Acapitalized+" "+Bcapitalized);
    }
}
