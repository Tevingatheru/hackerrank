package com.company.week_one.lonely_integer;

import java.util.List;

public class LonelyInteger {
    public int lonelyInteger(List<Integer> a) {
        int[] arr = new int[101];
        for (int number: a) {
            arr[number]++;
        }
        int result = 0;
        for(int i = 0; i < 101; i ++) {
            if (arr[i] == 1) {
                result = i;
            }
        }

        return result;
    }
}
