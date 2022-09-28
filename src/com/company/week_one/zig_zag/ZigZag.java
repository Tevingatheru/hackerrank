package com.company.week_one.zig_zag;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-zig-zag-sequence/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-three
 */
public class ZigZag {

    /**
     * Transform array to the lowest zigzag sequence where
     * first mid elements in the sequence are in increasing order and the last mid elements are in decreasing order
     * @param a array of integers where 1<= a[i] < 10^9
     * @param n number of array elements 1 <= n < 10000
     * @return
     */
    public int[] findZigZagSequence(int [] a, int n){
        validateInput(a, n);
        // sort array
        Arrays.sort(a);
        // swap the value of the middle and last index
        int mid = n/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 2;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed ];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }

        return a;
    }

    /**
     *
     * @param a
     * @param n is always an odd number.
     */
    private void validateInput(int[] a, int n) {

    }
}
