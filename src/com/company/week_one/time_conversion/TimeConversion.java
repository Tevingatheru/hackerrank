package com.company.week_one.time_conversion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public String timeConversion(String s) {
        String regex = "(?<=[A-Za-z])(?=[0-9])|(?<=[0-9])(?=[A-Za-z])";
        String convertedString = s.replaceAll(regex, " ");

        DateFormat parseFormat = new SimpleDateFormat( "hh:mm:ss aa");
        DateFormat writeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = parseFormat.parse(convertedString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return writeFormat.format(date);
    }
}
