package com.company.week_one.min_max_sum;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class MinAndMaxSumTest {
    MinAndMaxSum minAndMaxSum = new MinAndMaxSum();

    private static Stream<Arguments> provider() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(1,2,3,4,5)),"10 14", "0"),
                Arguments.of(new ArrayList<>(List.of(256741038, 623958417, 467905213, 714532089, 938071625)),"2063136757 2744467344", "1"), // test case 1
                Arguments.of(new ArrayList<>(List.of(396285104, 573261094, 759641832, 819230764, 364801279)),"2093989309 2548418794", "2"), // test case 2
                Arguments.of(new ArrayList<>(List.of(140638725, 436257910, 953274816, 734065819, 362748590)),"1673711044 2486347135", "3"), // test case 3
                Arguments.of(new ArrayList<>(List.of(769082435, 210437958, 673982045, 375809214, 380564127)),"1640793344 2199437821", "4"), // test case 4
                Arguments.of(new ArrayList<>(List.of(156873294, 719583602, 581240736, 605827319, 895647130)),"2063524951 2802298787", "5"), // test case 5
                Arguments.of(new ArrayList<>(List.of(5, 5, 5, 5, 5)),"20 20", "13"), // test case 13
                Arguments.of(new ArrayList<>(List.of(7, 69, 2, 221, 8974)),"299 9271", "14") // test case 14
        );
    }

    @ParameterizedTest(name = "test case: {2}")
    @MethodSource("provider")
    void miniMaxSum(List<Integer> input, String expectedOutput, String testCaseNumber) {
        String actualOutput = minAndMaxSum.miniMaxSum(input);
        assertThat(actualOutput).isEqualTo(expectedOutput);
    }

    @Test
    void shouldTestLimit() {
        var result = minAndMaxSum.test();
        assertThat(result).isPositive();
        assertThat(result).isEqualTo(2093989309);
    }
}