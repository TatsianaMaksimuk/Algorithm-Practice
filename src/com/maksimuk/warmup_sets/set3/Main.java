package com.maksimuk.warmup_sets.set3;

public class Main {
    public static void main(String[] args) {

        //Return the Sum of Two Numbers
        System.out.println(SumOfTwoNumbers(3, 2));
        System.out.println(SumOfTwoNumbers(-3, -6));

        //Are the Numbers Equal?

        System.out.println(isSameNum(4, 8));
        System.out.println(isSameNum(2, 2));
        System.out.println(isSameNum(42, 32));


        //Convert Age to Days
        try {
            System.out.println(calcAge(65));
            System.out.println(calcAge(0));
            System.out.println(calcAge(-65));
        } catch (Exception e) { //
            System.out.println(e.getMessage());
        }

        //Name Greeting!
        System.out.println(helloName("Gerald"));
        System.out.println(helloName("Tiffany"));

        //Reverse the Order of a String
        System.out.println(reverse("The quick brown fox.") );

    }

    //Return the Sum of Two Numbers
    public static int SumOfTwoNumbers(int first, int second) {
        return first + second;
    }

    //Are the Numbers Equal?

    public static boolean isSameNum(int first, int second) {
        if (first == second) {
            return true;
        }
        return false;
    }

    public static int calcAge(int years) throws Exception {
        int days = years * 365;
        if (days < 0)
            throw new Exception("Error - years must not be negative");

        return days;
    }

    //Name Greeting!
    public static String helloName (String name){
        return "Hello, " + name;
    }

    //Reverse the Order of a String

    public static String reverse (String str) {
        String result = "";
        char[] try1 = str.toCharArray();
        for (int i = try1.length-1;i >= 0; i--) result += try1[i];

        return result;
    }

}
