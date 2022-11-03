package Day20;

import Day7.Array;

import java.util.List;

public class BubbleSort {
    public void bubbleSorting(List<Integer> a, int n) {
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {

            int numSwaps = 0;
            for (int j = 0; j < n-1; j++) {
                if (a.get(j)>a.get(j+1)){
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1,temp);
                    numSwaps++;
                    totalSwaps++;
                }
            }
            if (numSwaps==0)
                break;
        }
        System.out.println("Array is sorted in " + totalSwaps +" swaps");
        System.out.println("First Element: "+ a.get(0));
        System.out.println("Last Element: " + a.get(a.size()-1));
    }



}

