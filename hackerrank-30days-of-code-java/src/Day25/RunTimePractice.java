package Day25;

import java.util.HashMap;

public class RunTimePractice {
    //repetition function
    public static int findNumsOfRepetitions(String s, char c) { //linear time; O(n) time
        int sum = 0;//1

        for (int i = 0; i < s.length(); i++) {// 1, n+1, n
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }

    public static int[] findNumsOfRepetitionsV1(String s, char[] c) { //quadratic O(
        int[] sums = new int[c.length]; //1(n*m)
        for (int i = 0; i < s.length(); i++) { // 1, n+1, n
            for (int j = 0; j < c.length; j++) { //n, n*m +1 , n*m
                if (s.charAt(i) == c[j]) { //n*m
                    sums[j] = sums[j] + 1;//n*m
                }
            }
        }
        return sums;
    }

    public static int[] findNumsOfRepetitionsV2(String s, char[] c) {
        //Optimal time is o(n+m)
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), 1);
            } else {
                int sum = map.get(s.charAt(i));
                map.put(s.charAt(i), sum + 1);
            }
        }
        for (int j = 0; j < c.length; j++) {
            int sum;
            if (!map.containsKey(c[j])) {
                sums[j] = 0;
            } else {
                sums[j] = map.get(c[j]);
            }
        }
        return sums;
    }


    public static void main(String[] args) {


        //setting timer
        long startTime = System.currentTimeMillis();
        findNumsOfRepetitions("abca", 'a'); //if s is long it can increase the running time
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + " ms.");

        startTime = System.currentTimeMillis();
        findNumsOfRepetitions("abca", 'a'); //if s is long it can increase the running time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms.");

        startTime = System.currentTimeMillis();
        findNumsOfRepetitions("abca", 'a'); //if s is long it can increase the running time
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test " + duration + " ms.");

    }
}
