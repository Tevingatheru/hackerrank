package com.company.week_one;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
 */
public class PlusMinus {
    public static List<Double> plusMinus(List<Integer> arr) {
        List<Double> expectedOutput = new ArrayList<>();
        int n = arr.size();
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        for (int number : arr) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        double positiveRatio = convertToDouble(positiveCount) / convertToDouble(n);
        double negativeRatio = convertToDouble(negativeCount) / convertToDouble(n);
        double zeroRatio = convertToDouble(zeroCount) / convertToDouble(n);

        expectedOutput.add(positiveRatio);
        expectedOutput.add(negativeRatio);
        expectedOutput.add(zeroRatio);

        return expectedOutput;

    }

    private static double convertToDouble(int number) {
        double sixDecimalPlace = 100000;
        DecimalFormat f = new DecimalFormat("#.######");
        double doubleValue = number;
//        var result = Math.round(doubleValue * sixDecimalPlace) / sixDecimalPlace;
        f.format(doubleValue);
        return  doubleValue;
    }
}
