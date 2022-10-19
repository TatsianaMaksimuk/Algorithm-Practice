import Day04.Person;
import Day11.Book;
import Day11.LibraryCatalogue;
import Day5.Loops;
import Day6.Review;
import Day7.Array;
import Day8.Maps;
import Day9.Recursion;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //HelloWorld.helloMaker();

        //DataTypes.dataTypes();

        //Operators.solve(12.50, 20,5);

        //ConditionalStatements.caseCheck(4);
        //Person person = new Person(13);
        //person.amIOld();

        //Loops.printLoop(4);

        // Review.evensAndOdds("Hacker");

        // Array.reverse("1 2 3 4");

//        Maps m =new Maps();
//        m.dataInput("sam 99912222");
//        m.keyPrint();
//        m.search("sam");

      //  System.out.println(Recursion.factorial(5));
       // System.out.println(Recursion.factorial(3));
        //Day11 tutorial:
        Map<String, Book> bookCollection=new HashMap<String,Book>();
        Book theWitcher = new Book("The Witcher",500,000001);
        bookCollection.put("The Witcher", theWitcher);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("The Witcher");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("The Witcher");
        lib.setDay(17);
        lib.returnBook("The Witcher");
        lib.checkOutBook("The Witcher");
    }
}