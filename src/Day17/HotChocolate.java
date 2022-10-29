package Day17;

import java.util.concurrent.TimeUnit;

public class HotChocolate {
    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drinkHotChocolate(double cocoaTemp) throws TooHotException,
            TooColdException {
        if (cocoaTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold) {
            throw new TooColdException();
        }

    }

    public static void main(String[] args) throws TooHotException, TooColdException,
    InterruptedException //for TimeUnit
    {
        double currentCocoaTemp = 145;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoaTemp);
                System.out.println("Cocoa is good");//this will not execute until the temp is right
                wrongTemp = false; //this will not execute until the temp is right
            } catch (TooColdException e1) {
                System.out.println("Cocoa is too cold");
                currentCocoaTemp = currentCocoaTemp + 5;
            } catch (TooHotException e2) {
                System.out.println("Cocoa is too hot");
                currentCocoaTemp = currentCocoaTemp - 5;
            }
            TimeUnit.SECONDS.sleep(2);// two seconds time pause
        }
        System.out.println("It's gone");
    }
}
