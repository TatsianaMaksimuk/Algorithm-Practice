package Java.Loops;

import java.util.Scanner;

public class LoopsTwo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
processQ(a,b,n);
        }
    }

    public static void processInts(int a, int b, int n){

        for (int i = 0; i <= n-1; i++) {
            int innerLoopResult = 0;
            for (int j = 0; j <= i; j++) {
                innerLoopResult += b* Math.pow(2, j);
            }
            System.out.print(a+innerLoopResult+ " ");

        }
        System.out.println();
    }

    public static void processQ(int a, int b, int n){
        int innerLoopResult = a;
        for (int i = 0; i <= n-1; i++) {
            innerLoopResult+= b* Math.pow(2, i);
            System.out.print(innerLoopResult+ " ");
        }
        System.out.println();
    }
}
