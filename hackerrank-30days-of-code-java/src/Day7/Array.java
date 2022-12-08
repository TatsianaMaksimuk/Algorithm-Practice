package Day7;

public class Array {

    public static void reverse(String string){
        String[] split= string.split(" ");
        String output = "";

        for (int i = split.length-1; i >= 0; i--){
            output+=split[i]+" ";
        }

        System.out.print(output);

    }
}
