package com.company.week_one.jesse_n_cookies;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CookiesTest {

    private static Stream<Arguments> provider() {
        return Stream.<Arguments>builder()
//                .add(Arguments.of(9, new ArrayList<>(List.of(2, 7, 3, 6, 4, 60)), 4))
                .add(Arguments.of(10, new ArrayList<>(List.of(1,1,1)), -1)).build();
    }

    @ParameterizedTest
    @MethodSource("provider")
    void cookie(int k, List<Integer> a, int output) {
        int result = Cookies.BruteForceSolution.cookies(k, a);
        assertThat(result).isEqualTo(output);
    }

    @ParameterizedTest
    @MethodSource("provider")
    void cookie2(int k, List<Integer> a, int output) {
        int result = Cookies.DynamicProgrammingSolution.cookies(k, a);
        assertThat(result).isEqualTo(output);
    }

}