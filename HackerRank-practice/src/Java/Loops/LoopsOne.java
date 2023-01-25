package Java.Loops;

import java.util.Scanner;

public class LoopsOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
    processInt(N);
    }

    public static void processInt(int N){
        for (int i = 1; i <=10; i++) {
            System.out.println(N + " x " + i + " = "+ N*i);

        }
    }
}
