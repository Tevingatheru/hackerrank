package com.company.big_decimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem?isFullScreen=true
 */
public final class BigDecimalSolution {

    /**
     * This method is where the solution has been implemented
     * @field n the length of array
     */
    public String[] solution(String []stringArray) {
        int n = stringArray.length;
        // solution
        Arrays.sort(stringArray, Collections.reverseOrder(new Comparator<String>() {
            @Override
            public int compare(String a1, String a2) {
                BigDecimal a = new BigDecimal(a1);
                BigDecimal b = new BigDecimal(a2);
                return a.compareTo(b);
            }
        }));

        // print solution
        this.printResult(n, stringArray);
        return stringArray;
    }



    /**
     *  This method will print the result of the implemented solution
     * @param n length of string array
     * @param s string array
     */
    private void printResult(int n, String[] s) {
        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}
