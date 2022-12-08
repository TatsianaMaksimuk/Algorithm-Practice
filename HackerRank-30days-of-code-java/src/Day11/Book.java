package Day11;

public class Book {
    //properties,fields,global variables;
    String title;
    int pageCount;
    int ISBN;
    boolean isCheckedOut;
    int dayCheckedOut = -1;


    public Book(String bookTitle, int bookPageCount, int bookIsbn ){
        this.title = bookTitle;
        this.pageCount = bookPageCount;
        this.ISBN=bookIsbn;
        isCheckedOut=false;
    }

//getters, instance methods, allows us to get certain properties whithin the instance, to know their value;
    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public int getISBN() {
        return ISBN;
    }
    public boolean getIsCheckedOut(){
      return this.isCheckedOut;
    };

    public int getDayCheckedOut() {
        return dayCheckedOut;
    }

//setters - used to set the value of properties in class

    public void setIsCheckedOut(boolean newIsCheckedOut, int currentDayCheckedOut){
        this.isCheckedOut = newIsCheckedOut;
        setDayCheckedOut(currentDayCheckedOut);
    }

    private void setDayCheckedOut(int day){
        this.dayCheckedOut = day;
    }
}
