package Day14;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import.java.util.*;

public class CalendarPractice {
    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 0);
        System.out.println(cal.getTime());
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        String formatted = format1.format(cal.getTime());
        System.out.println(formatted);
    }
}
