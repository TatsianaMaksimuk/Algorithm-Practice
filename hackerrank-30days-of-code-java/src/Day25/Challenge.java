package Day25;

public class Challenge {

    public static void main(String[] args) {
        primality01(1);
        primality01(4);
        primality01(9);
        primality01(16);
        primality01(25);
        primality01(36);
        primality01(49);
        primality01(64);
        primality01(81);
        primality01(100);
        primality01(121);
        primality01(144);
        primality01(169);
        primality01(196);
        primality01(225);
        primality01(256);
        primality01(289);
        primality01(324);
        primality01(361);
        primality01(400);
        primality01(441);
        primality01(484);
        primality01(529);
        primality01(576);
        primality01(625);
        primality01(676);
        primality01(729);
        primality01(784);
        primality01(841);
        primality01(907);
    }

    //way 1
    public static void primality(int n) {

        int divisors = 2;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0) {
                divisors += 1;
            }
        }
        if (divisors == 2 && n!=1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    //way 2
    public static void primality01(int n) {
        int divisors = 2;
        for (int i = 2; i <= Math.pow(n, 0.5); i++) {
            if (n % i == 0) {
                divisors += 1;
            }
        }
        if (divisors == 2 && n!=1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

