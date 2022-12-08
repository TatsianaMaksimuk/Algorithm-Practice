package week1;

import java.util.List;

public class MiniMaxSum {
    public static void findMiniNaxSum(List<Integer> arr) {
        int lowest = arr.get(0);
        int highest = arr.get(0);
        int sum = 0;
        int minSum;
        int maxSum;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
            if (lowest > arr.get(i)) {
                lowest = arr.get(i);
            } else if (highest< arr.get(i)) {
                highest = arr.get(i);

            }
        }
        System.out.println(lowest);
        System.out.println(highest);
        System.out.println(sum);

        minSum = sum - highest;
        maxSum = sum - lowest;

        System.out.println("Minimal sum: " + minSum);
        System.out.println("Maximum sum: "+ maxSum);
    }
}
