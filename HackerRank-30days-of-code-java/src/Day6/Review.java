package Day6;

public class Review {

    public static void evensAndOdds(String s){
        String evens ="";
        String odds="";
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (i%2 == 0) {
                evens+=charArray[i];
            } else{
                odds+=charArray[i];
            }

        }
        System.out.println(evens + " "+ odds);


    }
}
