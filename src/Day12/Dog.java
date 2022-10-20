package Day12;

public class Dog extends Animal {

    public Dog(){
        super(1); // whenever we create something that extends something else, we call super()
        System.out.println("A dog has been created");
    }

    public void ruff(){
        System.out.println("The dog says 'ruff'");
    }

    public void run(){
        System.out.println("The dog is running");
    }
}
