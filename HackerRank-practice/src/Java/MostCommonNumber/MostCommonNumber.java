package Java.MostCommonNumber;

import java.util.HashMap;
import java.util.Scanner;

public class MostCommonNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int length = s.nextInt();
        s.nextLine();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = s.nextInt();
            s.nextLine();
        }
        System.out.println(findMostCommon(arr));
    }

    public static int findMostCommon(int[] arr) {
        Integer highestCount = 0;
        Integer result = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer n = arr[i];
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
            if (map.get(n) > highestCount) {
                result = n;
                highestCount = map.get(n);
            }
        }

        return result;
    }
}
