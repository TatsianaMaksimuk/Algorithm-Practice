package Java.SubstringComparaison;

import java.util.Scanner;

public class SubstringComparaison {
    public static String getSmallestAndLargest(String s, int k) {
        String currentSubstring = s.substring(0,k);
        String smallest = currentSubstring;
        String largest = currentSubstring;

        for (int i = 1; i < s.length()-k +1; i++) {
            currentSubstring = s.substring(i,i+k); //because beginindex and endindex
            if (currentSubstring.compareTo(smallest)<0) {
                smallest=currentSubstring;
            } else if (currentSubstring.compareTo(largest)>0){
                largest=currentSubstring;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
