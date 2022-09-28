package com.company.substring_comparisons;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SubstringComparisonsTest {

    @Test
    void getSmallestAndLargest() {
        String response = SubstringComparisons.getSmallestAndLargest("welcometojava", 3);
        assertThat(response).isEqualTo("ava\n" +
                "wel");
    }
}