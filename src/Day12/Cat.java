package Day12;


public class Cat extends Animal{

    public Cat (){
        super(1);
        System.out.println("A cat has been created");
    }

    public void meow(){
        System.out.println("Cat is meowing");
    }

    public void purr(){
        System.out.println("Cat is purring");
    }

}
