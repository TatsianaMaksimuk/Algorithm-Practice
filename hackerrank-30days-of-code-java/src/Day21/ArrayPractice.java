package Day21;

public class ArrayPractice {

    public static <E> void printArray(E[] array) { //<E> means any dataType, any type of input in a form of array (what's in array doesnt matter)
        for (E element : array) {
            System.out.println(element + " "); // - for each Element of the array of type E we're going to print it out
        }
//
//        for (int i = 0; i < array.length; i++) {
//           E item = array[i];
//            System.out.println(item);
//            if (i < array.length - 1) {
//                System.out.println(", ");
//            }
//        }

    }

//    public static void printArray(String[] array) {
//        System.out.println("[");
//        for (int i = 0; i < array.length; i++) {
//            String item = array[i];
//            System.out.println(item);
//            if (i < array.length - 1) {
//                System.out.println(", ");
//            }
//        }
//        System.out.println("]");
//    }


    public static void main(String[] args) {

        Integer[] intArr = {5,2,4,6};

        String[] shoppingList = {"banana", "apples", "salt"};

        Integer[] intArray3={5,2,9,1,3};

        printArray(intArray3);
        printArray(shoppingList);
    }
}
