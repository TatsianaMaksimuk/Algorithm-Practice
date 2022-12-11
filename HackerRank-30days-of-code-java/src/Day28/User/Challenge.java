package Day28.User;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {


    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        Pattern p = Pattern.compile("[A-Z0-9._%+-]+@gmail\\.com$", Pattern.CASE_INSENSITIVE); //creating a pattern that I'm going to look for
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (scan.hasNext()) {
            String user = scan.nextLine();
            Matcher m = p.matcher(user);// creating matcher to compare a string user to a pattern
            if (m.find()) { //did I find this pattern in user, comparing
                String[] username = user.split(" ");
                names.add(username[0]);
            }
        }

        names.sort(new Comparator<String>() { //comparator - generic class that compares two objects
            //https://stackoverflow.com/questions/5815423/sorting-arraylist-in-alphabetical-order-case-insensitive
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
    }
}
