package Java.StdinStdout2;

import java.util.Scanner;

public class StdinStdout2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        scanner.nextLine();
        double d = scanner.nextDouble();

        scanner.nextLine(); //empty nextline symbol will give us empty line, so we need to clean it for string input


        String s = scanner.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: "+ n);
    }
}
