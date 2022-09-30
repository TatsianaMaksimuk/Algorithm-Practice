import week1.BreakingTheRecords;
import week1.MiniMaxSum;
import week1.PlusMinus;
import week1.TimeConversion;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //week 1
        System.out.println("week 1:\n");
        System.out.println("Ex. 1: \n");
        PlusMinus.plusMinusFunction(List.of(1, 2, -1 , -3, 0));

        System.out.println("Ex.2: \n");
        MiniMaxSum.findMiniNaxSum(List.of(396285104, 573261094, 759641832, 819230764, 364801279));

        TimeConversion.timeConversionFunction("08:00:15PM");


        BreakingTheRecords.returnRecords(List.of(10,22,9,25,5,30));

    }

}