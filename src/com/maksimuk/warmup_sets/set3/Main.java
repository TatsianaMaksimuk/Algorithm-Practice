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
        System.out.println(reverse("The quick brown fox."));

        //Area of Triangle
        System.out.println(triArea(3, 2));
        System.out.println(triArea(3.5, 2.5));

        //Multiple of 100
        System.out.println(divisible(1));
        System.out.println(divisible(1000));
        System.out.println(divisible(100));

        //Capture the Rook
        System.out.println(canCapture(new String[]{"A8", "E8"}));
        System.out.println(canCapture(new String[]{"A1", "B2"}));
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
    public static String helloName(String name) {
        return "Hello, " + name;
    }

    //Reverse the Order of a String

    public static String reverse(String str) {
        String result = "";
        char[] try1 = str.toCharArray();
        for (int i = try1.length - 1; i >= 0; i--) result += try1[i];

        return result;
    }

    //Area of Triangle

    public static double triArea(double base, double height) {
        return (base * height) / 2;
    }

    //Multiple of 100
    public static boolean divisible(int num) {
        if (num % 100 == 0) return true;
        return false;
    }

    //Capture the Rook

    public static boolean canCapture(String[] args) {
        Character position1Letter = args[0].charAt(0);
        Character position1Num = args[0].charAt(1);
        Character position2Letter = args[1].charAt(0);
        Character position2Num = args[1].charAt(1);

        if (position1Letter.equals(position2Letter) || position1Num.equals(position2Num)) {
            return true;
        }
        return false;


    }

}
