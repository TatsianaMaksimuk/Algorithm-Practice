package week1;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class PlusMinus {
    public static void plusMinusFunction(List<Integer> arr) {

        float zeros = 0;
        float positives = 0;
        float negatives = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                positives += 1;
            } else if (arr.get(i) < 0) {
                negatives += 1;
            } else zeros += 1;
        }

        System.out.println(negatives);
        System.out.println(positives);
        System.out.println(zeros);

        float positivesRatio = positives / arr.size();
        float negativeRatio = negatives / arr.size();
        float zerosRatio = zeros / arr.size();

        DecimalFormat numberFormat = new DecimalFormat("0.000000");


        System.out.println(numberFormat.format(positivesRatio));
        System.out.println(numberFormat.format(negativeRatio));
        System.out.println(numberFormat.format(zerosRatio));


    }

}
