import week1.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //week 1
        System.out.println("week 1:\n");
        System.out.println("Ex. 1: \n");
        PlusMinus.plusMinusFunction(List.of(1, 2, -1 , -3, 0));

        System.out.println("Ex.2: \n");
        MiniMaxSum.findMiniNaxSum(List.of(396285104, 573261094, 759641832, 819230764, 364801279));
        System.out.println("Ex. 3: \n");
        TimeConversion.timeConversionFunction("08:00:15PM");


        BreakingTheRecords.returnRecords(List.of(10,22,9,25,5,30));

        CamelCase.camelCaseMaker("S;C;LargeSoftwareBook");
        CamelCase.camelCaseMaker("S;V;pictureFrame");
        CamelCase.camelCaseMaker("S;M;plasticCup()");
        CamelCase.camelCaseMaker("C;M;white sheet of paper");
        CamelCase.camelCaseMaker("C;C;coffee machine");


        DivisibleSumPairs.divisibleSumPairs(6, 3, List.of(1, 3, 2, 6, 1, 2));


    }

}