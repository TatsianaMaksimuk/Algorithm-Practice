package Day29;

//& Bitwise AND. This binary operation evaluates to 1 (true) if both operands are true, otherwise  (false). In other words:
//
//1 & 1 = 1
//1 & 0 = 0
//0 & 1 = 0
//0 & 0 = 0

//| Bitwise Inclusive OR. This binary operation evaluates to  if either operand is true, otherwise  (false) if both operands are false. In other words:
//
//1 | 1 = 1
//1 | 0 = 1
//0 | 1 = 1
//0 | 0 = 0

//^ Bitwise Exclusive OR or XOR. This binary operation evaluates to  (true) if and only if exactly one of the two operands is ; if both operands are  or , it evaluates to  (false). In other words:
//
//1 ^ 1 = 0
//1 ^ 0 = 1
//0 ^ 1 = 1
//0 ^ 0 = 0

//~ The unary Bitwise Complement operator flips every bit; for example, the bitwise-inverted 8-bit binary number 01111001 becomes 10000110,
// and the bitwise-inverted signed decimal  integer 8 becomes -9.
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
