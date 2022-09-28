package com.company.week_one;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PlusMinusTest {

    private static Stream<Arguments> argumentsStream() {
        List<Integer> testCase0 = Arrays.asList(-4, 3, -9, 0, 4, 1);
        List<Double> expectedOutputTestCase0 = Arrays.asList(0.500000,
        0.333333,
        0.166667);
        return Stream.of(
                Arguments.of(testCase0,expectedOutputTestCase0 )
        );
    }

    PlusMinus plusMinus = new PlusMinus();

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void callPlusMinus(List<Integer> testCase, List<Double> expectedOutput) {
        var actualOutput = plusMinus.plusMinus(testCase);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }
}