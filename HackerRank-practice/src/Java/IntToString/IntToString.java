package Java.IntToString;

import java.util.Scanner;

public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        processInt(n);
    }

    public static void processInt(int n){
        String s = Integer.toString(n);
        if (s instanceof String){
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }
    }


    public static void processInt2(int n){
        String s = Integer.toString(n);
            System.out.println("Wrong answer");
    }
}
