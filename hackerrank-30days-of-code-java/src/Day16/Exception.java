package Day16;

public class Exception {
    String s = "";

    public static void convert(String s){
        try{
            System.out.println(Integer.parseInt(s));

        }catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}
