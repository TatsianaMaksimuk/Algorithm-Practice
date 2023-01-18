package Java.ifelse;

public class IfElse {
    public static void main(String[] args) {
        int n = 25;
        processN(n);

    }

    public static void processN(int n){
        if (n%2!=0){
            System.out.println("Weird");
        } else if (n>=2 && n<= 5)
            System.out.println("Not Weird");
        else if (n>=6 && n<= 20)
            System.out.println("Weird");
        else if (n>20)
            System.out.println("Not Weird");
    }
}
