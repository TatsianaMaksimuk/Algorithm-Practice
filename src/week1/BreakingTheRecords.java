package week1;

import java.util.ArrayList;
import java.util.List;

public class BreakingTheRecords {

    public static void returnRecords(List<Integer> scores) {
        List<Integer> recordsInfo = new ArrayList<Integer>();
        recordsInfo.add(0);
        recordsInfo.add(0);
        int timesHighestBroken = 0;
        int timesLowestBroken = 0;

        int highest = scores.get(0);
        int lowest = scores.get(0);

        for (int i = 1; i < scores.size(); i++) {
            if (highest < scores.get(i)) {
                timesHighestBroken+=1;
                highest = scores.get(i);
            } else if (lowest > scores.get(i)) {
                timesLowestBroken+=1;
                lowest = scores.get(i);
            }
        }
        recordsInfo.set(0,timesHighestBroken);
        recordsInfo.set(1,timesLowestBroken);
        System.out.println(timesHighestBroken);
        System.out.println(timesLowestBroken);
        System.out.println(recordsInfo);



    }





}
