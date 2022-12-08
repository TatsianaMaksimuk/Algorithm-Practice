package Day9;

public class Factorial {


    public static int factorialPractice(int n){
        if (n>1){
            return n*factorialPractice(n-1);
        }
            return 1;

    }
}
