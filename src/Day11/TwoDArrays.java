package Day11;

import java.util.ArrayList;
import java.util.List;

public class TwoDArrays {
   // int rowSize = 6;
   // int colSize = 6;
    //int [][] multiDimensionalArr = new int[rowSize][colSize];
   List<List<Integer>> arr = new ArrayList<>();


    public static void summation (List<List<Integer>> arr , int rowSize,int colSize){
        int hourglassSum=Integer.MIN_VALUE;
        for (int i = 1; i < rowSize-1; i++) {
            for (int j = 1; j <colSize-1; j++) {

                int sum = arr.get(i-1).get(j-1) +arr.get(i-1).get(j)  + arr.get(i-1).get(j+1)  +
                        arr.get(i).get(j)  +
                        arr.get(i+1).get(j-1) +arr.get(i+1).get(j)  + arr.get(i+1).get(j+1) ;
                if(sum>hourglassSum){
                    hourglassSum=sum;
                }
            }

        }
        System.out.println(hourglassSum);
    }
}
