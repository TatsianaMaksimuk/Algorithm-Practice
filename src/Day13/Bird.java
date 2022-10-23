package Day13;

public abstract class Bird {
    private int age;
    public Bird(int age){
        this.age = age;
        System.out.println("An bird has been created");
    }

    public void sleep(){
        System.out.println("A bird is sleeping");
    }
    public abstract void eat();

    public int getAge(){
        return age;
    }


    //day14 practice
    //HAPPY =10
    //f(x) = x+5+happy

    public void doSomething(String thing){
        System.out.println("Doing "+thing);
    }

}
