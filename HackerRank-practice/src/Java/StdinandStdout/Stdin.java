package Java.StdinandStdout;

import java.util.Scanner;

public class Stdin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(n);
        }
}
