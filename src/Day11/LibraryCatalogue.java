package Day11;

import java.util.HashMap;
import java.util.Map;

public class LibraryCatalogue {

    //properties/fields/global variables
    Map<String,Book> bookCollection = new HashMap<String,Book>();
    int currentDay=0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee =0.50;
    double feePerLateDay = 1.00;

    public LibraryCatalogue(Map<String,Book> collection){
        this.bookCollection = collection;
    }




    //constructor will help us create new instance of library catalogue
    public LibraryCatalogue(Map<String,Book> collection, int lengthOfCheckoutPeriod, double initialLateFee, double feePerLateDay){
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee=initialLateFee;
        this.feePerLateDay=feePerLateDay;
    }

    //getters

    public Map<String, Book> getBookCollection() {
        return bookCollection;
    }
    public Book getBook(String bookTitle){
        return getBookCollection().get(bookTitle);
    }

    public int getCurrentDay() {
        return currentDay;
    }

    public int getLengthOfCheckoutPeriod() {
        return lengthOfCheckoutPeriod;
    }

    public double getInitialLateFee() {
        return initialLateFee;
    }

    public double getFeePerLateDay() {
        return feePerLateDay;
    }

    //setters
    public void nextDay(){
            currentDay++;
    }

    public void setDay (int day){
        currentDay = day;
    }

    //InstANCE METHODS THAT DON'T HAVE STATIC; STATIC METHODS ARE CLASS METHODS
    public void checkOutBook(String title){
        Book book = getBook(title);
        if(book.getIsCheckedOut()){
            sorryBookIsCheckedOut(book);
        }else {
            book.setIsCheckedOut(true,currentDay);
            System.out.println("You checked out "+ title+". It is due on "+ (getCurrentDay()+getLengthOfCheckoutPeriod())+";");
        }
    }

    public void returnBook(String title){
        Book book = getBook(title);
        int daysLate = currentDay -(book.getDayCheckedOut()+getLengthOfCheckoutPeriod());
        if (daysLate>0){
            System.out.println("You owe the library $ "+ (getInitialLateFee()+daysLate+getInitialLateFee())+ " because your book is " + daysLate + " overdue.");
        }else{
            System.out.println("Book returned");
        }
        book.setIsCheckedOut(false,-1);
    }

    public void sorryBookIsCheckedOut(Book book){
        System.out.println("Sorry, "+book.getTitle() + "is already checked out. It should be back on day "+ (book.getDayCheckedOut() + getLengthOfCheckoutPeriod())+".");
    }



}
