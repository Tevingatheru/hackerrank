package com.company.week_one.diagonal_difference;

import java.util.List;

public class DiagonalDifference {

    public int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        int diagonalSum = 0;
        int leftRightDiagonal =0;
        int rightLeftDiagonal=0;
        for(int i = 0; i < n; i ++) {
            leftRightDiagonal += arr.get(i).get(i);
            rightLeftDiagonal += arr.get(i).get(n-(i+1));
        }
        diagonalSum = Math.abs(leftRightDiagonal - rightLeftDiagonal)   ;
        return diagonalSum;
    }
}
