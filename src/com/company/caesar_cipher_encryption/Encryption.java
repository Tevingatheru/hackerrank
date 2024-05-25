package com.company.caesar_cipher_encryption;


import java.util.Scanner;

public class Encryption {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println(solution(n, s, k));
    }

    private static String solution(int n, String s, int k) {
        char[] messageArray = s.toCharArray();
        if(k % 26 == 0) {
            return new String(messageArray);
        } else if (k > 26) {
            k = k % 26;
        }

        return encrypt(n, messageArray, k);
    }

    private static String encrypt(int n, char[] messageArray, int k) {
        StringBuilder response = new StringBuilder();
        for (int i = 0; i < n; i++) {

            if(!isAlphabet(messageArray[i])) {
                response.append(messageArray[i]);
                continue;
            }

            int cipher = (messageArray[i] + k);
            if (!isAlphabet((char) cipher) || convertedFromCapitalToSmall(messageArray[i], cipher)) {
                cipher = wrapOutOfBoundChar(cipher);
            }

            response.append((char) cipher);

        }
        return response.toString();
    }

    private static boolean convertedFromCapitalToSmall(int originalChar, int encryptedChar) {

        return originalChar <= 90 && encryptedChar >= 97;
    }

    private static int wrapOutOfBoundChar(int intValue) {
        intValue = intValue - 26;

        return intValue;
    }

    private static boolean isAlphabet(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

}
