import Day04.Person;
import Day11.Book;
import Day11.LibraryCatalogue;
import Day12.Animal;
import Day12.Cat;
import Day12.Dog;
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
//        Map<String, Book> bookCollection=new HashMap<String,Book>();
//        Book theWitcher = new Book("The Witcher",500,000001);
//        bookCollection.put("The Witcher", theWitcher);
//        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
//        lib.checkOutBook("The Witcher");
//        lib.nextDay();
//        lib.nextDay();
//        lib.checkOutBook("The Witcher");
//        lib.setDay(17);
//        lib.returnBook("The Witcher");
//        lib.checkOutBook("The Witcher");

//Day 12 tutorial
        Animal a = new Animal(5);
        Dog d = new Dog(); // says that animal has been created because a do is a child of Animal class and we called animal constructor by saying super
        //also says that the dog has been created
        Cat c = new Cat();
        d.ruff();
        System.out.println(d.getAge());//as children we can access what parents have ex. age - if it has public access. If we don't want dog access animal age field, we make it private
        //We can still access it by writing getter: d.getAge instead of d.age
        c.meow();
        //An animal is eating they're all animals and they all have access to the function eat. The can eat just like animals
        a.eat();
        d.eat();
        c.eat();
        //They both can eat, but only cat purrs and only dog ruffs
        d.ruff();
        c.purr();

        //What happens if...
       // Animal o = new Dog();  //Rhe compiler won't complain, because dog is an animal. However,  o won't have access to dog's methods because the compiler think that it's an animal.
        //But an animal can't be converted to dog, because dog is an animal, but animal is not a dog
    }
}