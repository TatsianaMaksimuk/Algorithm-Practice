package Day13;

public class Raven extends Bird{
    public Raven  (){
        super(1);
        System.out.println("A raven has been created");
    }

    public void sleep(){
        System.out.println("A raven is sleeping"); // sleep method is overridden
    }
    public void eat(){
        System.out.println("Raven is eating");
    }
    public void croak(){
        System.out.println("Raven croaks");
    }


}
