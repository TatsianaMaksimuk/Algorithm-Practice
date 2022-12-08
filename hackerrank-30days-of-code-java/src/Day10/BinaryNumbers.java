package Day10;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumbers {

    List binaryNumber = new ArrayList<>();

    public static void convert(int n, List<Integer> binaryNumber){
        while(n>0){
            int remainder = n%2;
            n=n/2;

            binaryNumber.add(0,remainder);

        }

    }

    public static void counter(List<Integer> binaryNumber){
        int times = 0;
        int maxCount = 0;

        for(int i=0; i<binaryNumber.size(); i++ ){

            if(binaryNumber.get(i)==1){
                times++;
            }else {
                if(maxCount <times){
                    maxCount=times;

                }

                times = 0;
            }
        }
        if(times>maxCount){
            System.out.print(times);
        } else {
            System.out.print(maxCount);
        }
    }
}
