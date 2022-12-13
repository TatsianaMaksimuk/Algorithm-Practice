package Day29;

public class BinaryString {

    //This code  converts a word and an integer to binary strings:
//    BinaryString(String string){
//        for( byte b : string.getBytes() ){
//            System.out.print(Integer.toBinaryString(b) + " ");
//        }
//        System.out.println();
//    }
//
//    BinaryString(Integer integer){
//        System.out.println(Integer.toBinaryString(integer));
//    }
//
//    public static void main(String[] args) {
//        new BinaryString("HackerRank");
//        new BinaryString(8675309);
//    }


    // find and print the OR of each character in the string with 8675309:
    BinaryString(String string, Integer integer){
        String binaryInteger = Integer.toBinaryString(integer);

        for( byte b : string.getBytes() ){
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
            int tmp = b | integer;
            System.out.println( Integer.toBinaryString(b) + " OR " + Integer.toBinaryString(integer)
                    + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
        }
    }

    public static void main(String[] args) {
        new BinaryString("HackerRank", 8675309);
    }
}
