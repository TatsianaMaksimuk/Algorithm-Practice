package Day9;

public class Recursion {
    public static int factorial(int n) {

        if (n>1){
            return n*factorial(n-1);
        }else{
            return 1; //factorial is only for positive numbers; this is why it cannot be 0;
        }

    }

    //3+2+1
    public static int summation(int n){
        //base case; we're at the end:
        if (n<=0){
            return 0; //additive identity property
        }
        //recursive case; keep going:
        else {
            //3 + summation(2)
            //3+2+summation(n-1)
            //3+2+1+summation(1-1 = 0)
            //3+2+1+0
            //response 6
            return n+summation(n-1);
        }
    }


    //5'3 = 5*5*5;
    //5'3 = 5*5'2 = 5*5*5'1 = 5*5*5*5'0 = 5*5*5*1
    public static int exponentiation(int n, int p){
        //base case
        if (p<=0){
            return 1; //mult identity;
        } else{
            //recursive case
            return n*exponentiation(n, p-1);
        }
    }
}
