import Day04.Person;
import Day11.Book;
import Day11.LibraryCatalogue;
import Day12.Animal;
import Day12.Cat;
import Day12.Dog;
import Day13.Bird;
import Day13.Cuckoo;
import Day13.MyBook;
import Day13.Raven;
import Day5.Loops;
import Day6.Review;
import Day7.Array;
import Day8.Maps;
import Day9.Factorial;
import Day9.Recursion;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//Day0
        //HelloWorld.helloMaker();
//Day1
        //DataTypes.dataTypes();
//Day2
        //Operators.solve(12.50, 20,5);
//Day3
        //ConditionalStatements.caseCheck(4);

//Day04
        //Person person = new Person(13);
        //person.amIOld();
//Day5
        //Loops.printLoop(4);
//Day6
        // Review.evensAndOdds("Hacker");
//Day7
        // Array.reverse("1 2 3 4");
//Day8
//        Maps m =new Maps();
//        m.dataInput("sam 99912222");
//        m.keyPrint();
//        m.search("sam");
//Day9
        //  System.out.println(Recursion.factorial(5));
        // System.out.println(Recursion.factorial(3));
        //System.out.println(Factorial.factorialPractice(5));
//Day10:
        //Look Day10 Binary Numbers
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
//Day11:
        //Look Day11 Two Dimentional Arrays
//Day 12 tutorial
//        Animal a = new Animal(5);
//        Dog d = new Dog(); // says that animal has been created because a do is a child of Animal class and we called animal constructor by saying super
//        //also says that the dog has been created
//        Cat c = new Cat();
//        d.ruff();
//        System.out.println(d.getAge());//as children we can access what parents have ex. age - if it has public access. If we don't want dog access animal age field, we make it private
//        //We can still access it by writing getter: d.getAge instead of d.age
//        c.meow();
//        //An animal is eating they're all animals and they all have access to the function eat. The can eat just like animals
//        a.eat();
//        d.eat();
//        c.eat();
//        //They both can eat, but only cat purrs and only dog ruffs
//        d.ruff();
//        c.purr();

        //What happens if...
        // Animal o = new Dog();  //Rhe compiler won't complain, because dog is an animal. However,  o won't have access to dog's methods because the compiler think that it's an animal.
        //But an animal can't be converted to dog, because dog is an animal, but animal is not a dog


//Day13 tutorial:
        Raven r = new Raven();
        r.croak();
        Cuckoo c = new Cuckoo();
        c.cuckoo();
        c.eat();
        r.eat();
        c.sleep();
        r.sleep();

        //Casting
        Object dog = new Dog();
        Dog realDog = (Dog) dog;//we're converting dataType Object to Dog, so we can access dog methods

        Object str = "boo";
        String realStr = (String) str;
        //What happens if...

        Raven raven = new Raven(); // even if we casted raven to bird, it still has raven essence - overridden methods
        if (raven instanceof Bird) {
            Bird bird = (Bird) raven; //we will have bird methods, but overridden methods are preserved with casting operation
            bird.sleep(); //A raven is sleeping, though it's bird
        }
        raven.sleep();
//Day13
        MyBook theWitcher = new MyBook("The Witcher", "Author", 15);
        theWitcher.display();
    }
}



