package com.company.week_one.min_max_sum;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-one
 */
public class MinAndMaxSum {
    public String miniMaxSum(List<Integer> arr) {
        List<Integer> sortedList = arr.stream().sorted().collect(Collectors.toList());

        int n = sortedList.size();
        long min = 0;
        long max = 0;
        int maxBound = n - 1;
        int minBound = n - 5;

        for(int i = 0; i < n; i++) {
            if (i < maxBound) {
                min += sortedList.get(i);
            }
            if (i > minBound) {
                max += sortedList.get(i);
            }
        }

        return  min + " " + max;
    }

    public double test() {
        return 1348604668 + 714532089;
    }

}
