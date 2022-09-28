package com.company.duplicate_words;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/duplicate-word/problem
 */
public class DuplicateWords {
    String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";

    public String replaceDuplicateWords(int numSentences, String input) {
        Pattern p = Pattern.compile(this.regex, Pattern.CASE_INSENSITIVE);
        while (numSentences-- > 0) {
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
        }
        return input;
    }
}
