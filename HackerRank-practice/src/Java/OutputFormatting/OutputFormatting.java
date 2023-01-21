package Java.OutputFormatting;

import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        System.out.println("================================");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            processStr(str);
        }

        System.out.println("================================");
    }

    public static void processStr(String str) {
        String[] split = str.split(" ");
        while (split[0].length() != 15) {
            split[0] += " ";
        }
        while (split[1].length() < 3) {
            split[1] = "0" + split[1];
        }

        System.out.println(split[0] + split[1]);
    }

}
