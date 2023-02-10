package Java.Anagrams;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        HashMap<Character, Integer> mapA = new HashMap<Character, Integer>(); //character and how many times it appears in the String
        HashMap<Character, Integer> mapB = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length(); i++) {
            Character achar = a.charAt(i);
            if (mapA.containsKey(achar)) {
                Integer howmanytimeswesawacharalready = mapA.get(achar);
                mapA.put(achar, howmanytimeswesawacharalready + 1);
            } else {
                mapA.put(achar, 1);
            }

        }

        for (int i = 0; i < b.length(); i++) {
            Character bchar = b.charAt(i);
            if (mapB.containsKey(bchar)) {
                Integer howmanytimeswesawbcharalready = mapB.get(bchar);
                mapB.put(bchar, howmanytimeswesawbcharalready + 1);
            } else {
                mapB.put(bchar, 1);
            }

        }


        if (mapA.equals(mapB)){
            return true;
        }
        return false;
    }
}
