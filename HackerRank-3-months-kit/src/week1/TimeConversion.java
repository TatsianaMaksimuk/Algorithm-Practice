package week1;

import java.text.DateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class TimeConversion {
    public static void timeConversionFunction (String time){

        System.out.println( LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm:ssa", Locale.US)).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
