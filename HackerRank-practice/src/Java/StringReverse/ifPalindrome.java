package Java.StringReverse;

import java.util.Scanner;

public class ifPalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        isPalindrome(A);
    }

    public static void isPalindrome(String A){
        //Creating empty string to store a reversed A string

        String reversed = "";

        //loop through A from back to beginning, storing each letter in reversed

        for (int i = A.length()-1; i >=0 ; i--) {
            reversed+=A.charAt(i);
        }

        if (A.equals(reversed)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }


}
