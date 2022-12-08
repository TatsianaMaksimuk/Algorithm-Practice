package Day21;

public class Generics {

    public static <T extends Comparable <T>> T findMax(T a, T b){ //T is some kind of data that extends Comparable
        //meaning it has a compare to function, so we csn compare instance a and instance b and return max
        int n = a.compareTo(b);
        if (n<0){
            return b;
        } else return a;
    }

    public static void main(String[] args) {
        System.out.println(findMax(2,3));
        System.out.println(findMax(3,3));

        System.out.println(findMax(3.5,3.6));

        System.out.println(findMax("Hi","There"));


//        Generics k = new Generics();
//        System.out.println(findMax(k, k)); // -add implements Comparible to generics class signature
    }
}
