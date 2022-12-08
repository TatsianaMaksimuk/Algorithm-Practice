package Day13;

public class Cuckoo extends Bird{
    public Cuckoo  (){
        super(1);
        System.out.println("A cuckoo has been created");
    }

//sleep is inherited from bird class
    public void eat(){
        System.out.println("Cuckoo is eating");
    }
    //or public abstract eat if you want implement a husky class that is going to eat;
    public void cuckoo(){
        System.out.println("Cuckoo cuckoos");
    }
}
