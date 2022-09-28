package com.company.big_decimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class BigDecimalSolutionTest {

    private BigDecimalSolution bigDecimalSolution = new BigDecimalSolution();

    private static Stream<Arguments> argumentsStream(){
        final String[] testCase0 = {"9", "-100", "50", "0", "56.6", "90" , "0.12", ".12", "02.34", "000.000"};
        final String[] expectedSolutionForTestCase0 = {"90", "56.6", "50", "9", "02.34", "0.12", ".12" , "0" , "000.000" , "-100"};

        final String[] testCase1 = {"10" , "123" , "45" , "766" , "324324" , ".324" , "0.325" , "-234" , "4546", "100", "0"};
        final String[] expectedSolutionForTestCase1 = {"324324" , "4546" , "766" , "123" , "100" , "45" , "10" , "0.325" , ".324" , "0" , "-234"};
        return Stream.of(
                Arguments.of(testCase0, expectedSolutionForTestCase0),
                Arguments.of(testCase1, expectedSolutionForTestCase1)
        );
    }

    @BeforeEach
    void setUp() {
    }

    @ParameterizedTest
    @MethodSource("argumentsStream")
    void solution(String[] stringArray, String[] expectedSolution) {
        var actualSolution = bigDecimalSolution.solution(stringArray);

        assertThat(actualSolution)
                .isEqualTo(expectedSolution);
    }
}