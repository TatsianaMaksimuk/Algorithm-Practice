package Day1;

import java.util.Scanner;

public class DataTypes {
    public static void dataTypes() {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        int intVar;
        double doubleVar;
        String stringVar;
        Scanner scan = new Scanner(System.in);
        intVar = scan.nextInt();
        doubleVar = scan.nextDouble();
        scan.nextLine();
        stringVar = scan.nextLine();

        System.out.print(intVar + i);
        System.out.print("\n" +(d  + doubleVar));
        System.out.print("\n"+ s + stringVar);
    }
}
