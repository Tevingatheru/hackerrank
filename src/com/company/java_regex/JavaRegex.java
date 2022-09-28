package com.company.java_regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Link to challenge
* https://www.hackerrank.com/challenges/java-regex/problem?isFullScreen=true
 */
public class JavaRegex {

    String zeroTo255 = "(\\d{0,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
    String pattern =zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
    String ip;

    public JavaRegex (String ip) {
        this.ip = ip;
    }

    boolean validIpAddress() {
        Pattern regexPatter = Pattern.compile(this.pattern );
        Matcher matcher = regexPatter.matcher(this.ip);
        return matcher.matches();
    }

}
