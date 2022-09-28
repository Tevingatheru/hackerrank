package com.company.week_one.super_digit;


public class SuperDigit {
    public int superDigit(String n, int k) {
//        String p = n.repeat(Math.max(0, k));

        String p = new String(new char[k]).replace("\0", n.trim());
        // validate length is > 1
        while (p.length() > 1) {
            final char [] arrChar = p.toCharArray();
            long sum = 0;
            for (char letter: arrChar) {
                sum += Character.getNumericValue(letter);
            }
            p = String.valueOf(sum);
        }

        return Integer.parseInt(p);
    }

    public int superDigit2(String n, int k) {
        final String p = new String(new char[k]).replace("\0", n);
        final char [] arrChar = p.toCharArray();
        return check(arrChar);
    }

    public int superDigit3(String n, int k) {
        final String p = n.trim();
        final char [] arrChar = p.toCharArray();
        int response = check(arrChar);
        response *= k;

        return check(("" + response).toCharArray());
    }

    private int check(char[] arrChar) {
        long sum = 0;
        for (char letter: arrChar) {
            sum += Character.getNumericValue(letter);
        }
        final char [] newArrayChar = ("" + sum).toCharArray();
        return newArrayChar.length == 1 ? Integer.parseInt(String.valueOf(newArrayChar)): check(newArrayChar);
    }
}
