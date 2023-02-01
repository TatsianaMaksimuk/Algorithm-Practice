package Java.StaticInitializerBlock;

import java.util.Scanner;

public class StaticInitializerBlock {
    private static final String errorMessage = "java.lang.Exception: Breadth and height must be positive";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int B = scanner.nextInt();
        scanner.nextLine();
        int H = scanner.nextInt();
        processData(B,H);


    }

    public static void processData(int B, int H){
        if (B<=0 || H<=0){
            System.out.println(errorMessage);
        }else {
            System.out.println(B*H);
        }
    }
}
