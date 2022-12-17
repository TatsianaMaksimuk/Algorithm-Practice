package Day29;

public class BitwiseAnd {
    public static int bitwiseAnd(int N, int K) {
        // Write your code here
        int max = 0;
        for (int a = 1; a<N; a++) {
            for (int b = a+1; b<=N; b++) {
                int and = a&b;
                if (and > max && and < K) {
                    max = and;
                }
            }
        }
        return max;
    }

}
