package Day12;


//Object - superclass, animal - subclass(child)
public class Animal  {
    private int age;
    public Animal(int age){
        this.age = age;
        System.out.println("An animal has been created");
    }

    public void eat(){
        System.out.println("An animal is eating");
    }

    public int getAge(){
        return age;
    }

}
