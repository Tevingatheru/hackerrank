package com.company.week_one.time_conversion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TimeConversionTest {

    TimeConversion timeConversion = new TimeConversion();
    @Test
    void timeConversion() {
        String actualResult = timeConversion.timeConversion("12:40:22AM");
        assertThat(actualResult).isEqualTo("19:05:45");
    }
}