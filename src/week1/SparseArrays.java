package week1;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        int count = 0;
        List<Integer> timesMatched = new ArrayList<Integer>();

        for (int i = 0; i < queries.size(); i++) {
            for (int j = 0; j < strings.size(); j++) {
                if (strings.get(j).equals(queries.get(i))) {
                    count += 1;
                }
            }
            timesMatched.add(count);
            count = 0;
        }
        for (int i = 0; i < timesMatched.size(); i++) {
            System.out.println(timesMatched.get(i));



        }
        return timesMatched;
    }
}
