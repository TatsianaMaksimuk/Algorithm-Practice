package Day16;

import org.w3c.dom.ls.LSOutput;

public class ExceptionPractice {

    public static void main(String[] args) {

//    int[] intArray = new int[10];
//        System.out.println(intArray[10]);//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
//

        try {
            int[] c = new int[5];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e);
        } finally {
            System.out.println("Finally clause");
        }
//            System.out.println("Finally finished try-catch");

        System.out.println("-------------------------------------");

        try {
            int[] c = new int[6];
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown " + e);
        } finally {
            System.out.println("Finally finished try-catch");
        }

    }


}
