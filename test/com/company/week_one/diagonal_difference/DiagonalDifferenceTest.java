package com.company.week_one.diagonal_difference;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class DiagonalDifferenceTest {
    DiagonalDifference diagonalDifference = new DiagonalDifference();

    @Test
    void testCase0() {
        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(List.of(1,2,3)));
        input.add(new ArrayList<>(List.of(4,5,6)));
        input.add(new ArrayList<>(List.of(9,8,9)));
//        List<List<Integer>> input2 = initializeArray(3);
        var response = diagonalDifference.diagonalDifference(input);
        assertThat(response).isEqualTo(2);
    }


    private List<List<Integer>>  initializeArray(int rows) {
        List<List<Integer>>  list = new ArrayList<>(rows); // assuming rows is the number or rows
        for(int i = 0; i < rows; ++i) {
            list.add(generateArray(rows, i+1));
        }
        return list;
    }

    private List<Integer> generateArray(int n, int loopNumber) {
        List array = new ArrayList<>(n);
        final int startIndex = (loopNumber -1) * n ;
        final int maxRange = n * loopNumber;
        for(int i = startIndex; i < maxRange; i++) {
            array.add( i + 1 );
        }
        return array;
    }

}