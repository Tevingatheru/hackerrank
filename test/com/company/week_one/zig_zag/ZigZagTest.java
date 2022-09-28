package com.company.week_one.zig_zag;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ZigZagTest {

    ZigZag zigZag = new ZigZag();

    @Test
    void testCase0() {
        int[] inputArray = {1,2,3,4,5,6,7};

        var result = zigZag.findZigZagSequence(inputArray, inputArray.length);

        assertThat(result).isEqualTo(new int[]{1,2,3,7,6,5,4});
    }
}