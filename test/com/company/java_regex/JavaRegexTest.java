package com.company.java_regex;

import org.assertj.core.api.SoftAssertionError;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.regex.Pattern;
import java.util.stream.Stream;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class JavaRegexTest {
    private static Stream<Arguments> argumentProvider() {
        return Stream.of(
                // testcase 0
                Arguments.of("0", "000.12.12.034", "true"),
                Arguments.of("0", "121.234.12.12", "true"),
                Arguments.of("0", "23.45.12.56", "true"),
                Arguments.of("0", "00.12.123.123123.123", "false"),
                Arguments.of("0", "122.23", "false"),
                Arguments.of("0", "Hello.IP", "false"),
                //testcase 1
                Arguments.of("1", "12.12.12.12", "true"),
                Arguments.of("1", "13.13.13.112", "true"),
                Arguments.of("1", "VUUT.12.12", "false"),
                Arguments.of("1", "111.111.11.111", "true"),
                Arguments.of("1", "1.1.1.1.1.1.1", "false"),
                Arguments.of("1", ".....", "false"),
                Arguments.of("1", "1...1..1..1", "false"),
                Arguments.of("1", "0.0.0.0", "true"),
                Arguments.of("1", "255.0.255.0", "true"),
                Arguments.of("1", "266.266.266.266", "false"),
                Arguments.of("1", "00000.000000.0000000.00001", "false"),
                Arguments.of("1", "0023.0012.0012.0034", "false"),
                // test case 2
                Arguments.of("2", "259.259.259.259", "false"),
                Arguments.of("2", "266.266.266.266", "false"),
                Arguments.of("2", "255.255.255.255", "true"),
                Arguments.of("2", "555.555.555.555", "false"),
                Arguments.of("2", "666.666.666.666", "false"),
                Arguments.of("2", "249.249.249.249", "true"),
                Arguments.of("2", "249.249.249.256", "false")
        );
    }


    JavaRegex javaRegex;


    @ParameterizedTest(name = "Test case: {0} \n test no. [{index}]. Is {1} valid, the result is {2}.")
    @MethodSource("argumentProvider")
    void validIpAddress(String testCase, String ip, boolean expectedResult) {
        javaRegex = new JavaRegex(ip);
        var response = javaRegex.validIpAddress();
        assertThat(response)
                .isEqualTo(expectedResult);
    }

    @Test
    void flags () {
        SoftAssertions.assertSoftly(softAssertions -> {
                    softAssertions.assertThat(Pattern.UNIX_LINES)
                            .isEqualTo(1);
                    softAssertions.assertThat(Pattern.CASE_INSENSITIVE)
                            .isEqualTo(2);
                    softAssertions.assertThat(Pattern.COMMENTS)
                            .isEqualTo(4);
                    softAssertions.assertThat(Pattern.MULTILINE)
                            .isEqualTo(8);
                    softAssertions.assertThat(Pattern.CANON_EQ)
                            .isEqualTo("");
                    softAssertions.assertThat(Pattern.UNICODE_CHARACTER_CLASS)
                            .isEqualTo("");

                }
        );

    }
}