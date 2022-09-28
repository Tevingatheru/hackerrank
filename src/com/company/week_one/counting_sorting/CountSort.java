package com.company.week_one.counting_sorting;

import java.util.ArrayList;
import java.util.List;

public class CountSort {

    /**
     *
     * Time Complexity: O(n+m)
     * where n is the length of input array
     * and m is the max range = 100
     *
     * @param arr
     * @return new int[100]
     */
    public List<Integer> countingSort(List<Integer> arr) {
        List<Integer> countedList = new ArrayList<>();
        int[] countingArray = new int[100];

        for (Integer integer : arr) {
            countingArray[integer]++;
        }

        for (int i = 0; i < 100; i++) {
            countedList.add(countingArray[i]);
        }

        return countedList;
    }
}
