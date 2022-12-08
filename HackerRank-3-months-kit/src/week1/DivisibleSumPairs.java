package week1;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {
    public static void divisibleSumPairs (int n, int k, List<Integer> ar) {
       ArrayList<Integer> pairs = new ArrayList<Integer>();

        for (int i = 0; i < ar.size()-1; i++) {
            for (int j = 1; j < ar.size(); j++) {
                if(i<j && (ar.get(i)+ar.get(j))%k == 0 ){
                    pairs.add(ar.get(i));
                    pairs.add(ar.get(j));
                }

            }

        }
        System.out.println(pairs.size()/2);
    }
}
