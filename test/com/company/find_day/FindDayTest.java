package com.company.find_day;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FindDayTest {

    @Test
    void findDay() {
        String day = FindDay.findDay(8 ,5, 2015);
        assertThat(day).isEqualTo("WEDNESDAY");
    }

}