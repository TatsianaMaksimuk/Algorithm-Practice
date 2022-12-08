package Day20;

public class Person {

    HairColor hairColor = HairColor.BLONDE;

    public Person() {
        int a = 5;
    }

    public static void main(String[] args) {

        //Aliases:
        Person peterParker = new Person();
        Person spiderMan = peterParker; //aliasing

        //peter parker and spiderMan point at the same object in memory
        System.out.println("Haircolor of P.Parker: " + peterParker.hairColor);
        System.out.println("Haircolor of Spider-Man: " + spiderMan.hairColor);

        peterParker.hairColor = HairColor.BROWN;
        System.out.println("Haircolor of P.Parker: " + peterParker.hairColor);
        System.out.println("Haircolor of Spider-Man: " + spiderMan.hairColor);

        spiderMan.hairColor = HairColor.ORANGE;
        System.out.println("Haircolor of P.Parker: " + peterParker.hairColor);
        System.out.println("Haircolor of Spider-Man: " + spiderMan.hairColor);


    }
}
