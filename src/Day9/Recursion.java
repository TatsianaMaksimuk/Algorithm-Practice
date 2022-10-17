package Day9;

public class Recursion {
    public static int factorial(int n) {

        if (n>1){
            return n*factorial(n-1);
        }else{
            return 1; //factorial is only for positive numbers; this is why it cannot be 0;
        }

    }
}
