package Day0;

import java.util.Scanner;

public class HelloWorld {
    public static void helloMaker(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.print("Hello, World.\n");
        System.out.print(input);
    }
}
