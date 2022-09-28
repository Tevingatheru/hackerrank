package com.company.week_one;

import com.company.week_one.lonely_integer.LonelyInteger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LonelyIntegerTest {
    LonelyInteger lonelyInteger = new LonelyInteger();

    @Test
    void testCase0() {
        var result = lonelyInteger.lonelyInteger(new ArrayList<>(List.of(1,2,3,4,3,2,1)));

        assertThat(result).isEqualTo(4);
    }

}