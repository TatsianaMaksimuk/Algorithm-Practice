package Day04;

public class Person {


    public int age;


    public Person(int initialAge) {
        if (initialAge > 0){
            this.age = initialAge;
        } else {
            this.age = 0;
            System.out.print("Age is not valid, setting age to 0.");
        }

    }

    public void yearPasses() {
        this.age +=1;
    }

    public void amIOld(){
        if (this.age < 13){
            System.out.print("You are young.");
        }else if (this.age >= 13 && this.age<=18){
            System.out.print("You are a teenager.");
        }else {
            System.out.print("You are old.");
        }
    }


}
