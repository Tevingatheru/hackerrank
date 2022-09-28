package com.company.week_one.counting_sorting;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountSortTest {
    CountSort countSort = new CountSort();

    @Test
    void testcase0 () {

        List<Integer> arr = new ArrayList<>(
                List.of(1,1,3,2,1)
        );
        var result = countSort.countingSort(arr);
        assertThat(result).isEqualTo("");
    }

}