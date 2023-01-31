package Java.DateAndTime;

import java.util.Calendar;

public class DateAndTime {

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month-1, day);
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);



        switch (dayOfWeek) {
            case 2: {
                return "MONDAY";
            }
            case 3: {
                return "TUESDAY";
            }
            case 4: {
                return "WEDNESDAY";
            }
            case 5: {
                return "THURSDAY";
            }
            case 6: {
                return "FRIDAY";
            }
            case 7: {
                return "SATURDAY";
            }
            case 1: {
                return "SUNDAY";
            }
            default:{
                return "";
            }
        }
    }
}
