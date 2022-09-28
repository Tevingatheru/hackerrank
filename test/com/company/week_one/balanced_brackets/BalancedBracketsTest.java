package com.company.week_one.balanced_brackets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void isBalanced() {
        String response = BalancedBrackets.isBalanced("{[(])}");
        assertThat(response).isEqualTo("NO");
    }

    @Test
    void eliminationMethod() {
        String response = BalancedBrackets.eliminationMethod("{[(])}");
        assertThat(response).isEqualTo("NO");
    }
}