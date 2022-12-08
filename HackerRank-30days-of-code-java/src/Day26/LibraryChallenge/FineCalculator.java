package Day26.LibraryChallenge;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FineCalculator {

    public static int feesOwned(int dayOfReturn, int monthOfReturn, int yearOfReturn, int dueDateDay, int dueDateMonth, int dueDateYear) {
        int fine = 0;
        int yearDifference = 0;
        int monthDifference = 0;
        int daysDifference = 0;

        if (yearOfReturn>dueDateYear){
            yearDifference = yearOfReturn - dueDateYear;
            fine = 10000;
            System.out.println(fine);
            return fine;

        } else if (monthOfReturn>dueDateMonth && yearOfReturn>=dueDateYear) {
            monthDifference = monthOfReturn - dueDateMonth;
            fine = 500 * monthDifference;
            System.out.println(fine);
            return fine;
        } else if(dayOfReturn>dueDateDay && monthOfReturn>=dueDateMonth &&  yearOfReturn>=dueDateYear){
            daysDifference = dayOfReturn-dueDateDay;
            fine =  15 * daysDifference;
            System.out.println(fine);
        }
        System.out.println(fine);
        return fine;

    }


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String dateOfReturnInput = scanner.nextLine();
//        String dueDateInput = scanner.nextLine();
//
//        String[] dateOfReturnArr = dateOfReturnInput.split(" ");
//        String[] dueDateArr = dueDateInput.split(" ");
        int dayOfReturn = 31;
        int monthOfReturn =12;
        int yearOfReturn = 2009;


        int dueDateDay = 1;
        int dueDateMonth =1;
        int dueDateYear = 2010;

//        int dayOfReturn = Integer.parseInt(dateOfReturnArr[0]);
//        int monthOfReturn = Integer.parseInt(dateOfReturnArr[1]);
//        int yearOfReturn = Integer.parseInt(dateOfReturnArr[2]);
//
//
//        int dueDateDay = Integer.parseInt(dueDateArr[0]);
//        int dueDateMonth = Integer.parseInt(dueDateArr[1]);
//        int dueDateYear = Integer.parseInt(dueDateArr[2]);
        feesOwned(dayOfReturn, monthOfReturn,yearOfReturn,dueDateDay,dueDateMonth,dueDateYear);
    }

}

