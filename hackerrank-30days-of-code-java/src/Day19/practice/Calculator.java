package Day19.practice;

import java.util.ArrayList;
import java.util.List;

public class Calculator  implements AdvancedArithmetic{
    public int divisorSum(int n) {
        List<Integer> divisors = new ArrayList<>();
        int divisorSum = 0;
        for (int i = 1; i <= n; i++) {
            if (n%i ==0){
                divisors.add(i);
            }
        }
        for (int i = 0; i < divisors.size(); i++) {
            divisorSum+=divisors.get(i);
        }
        return divisorSum;
    }
}

