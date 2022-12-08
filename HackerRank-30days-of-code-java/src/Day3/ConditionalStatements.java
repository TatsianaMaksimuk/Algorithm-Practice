package Day3;

public class ConditionalStatements {
    public static void caseCheck(int n){

        if (n%2==1){
            System.out.print("Weird");
        }
        if (n%2==0&&n>=2&&n<=5){
            System.out.print("Not Weird");
        }
        if (n%2==0&&n<=20&&n>=6){
            System.out.print("Weird");
        }
        if (n%2==0&&n>20){
            System.out.print("Not Weird");
        }


    }
}
