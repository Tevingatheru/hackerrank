package com.company.find_day;

import java.time.LocalDate;

import java.util.Calendar;
import java.util.Date;

public class FindDay {
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }


}
