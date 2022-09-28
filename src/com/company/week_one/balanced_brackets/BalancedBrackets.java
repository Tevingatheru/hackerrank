package com.company.week_one.balanced_brackets;

public class BalancedBrackets {
    // the does not satisfy the question
    //
    public static String isBalanced(String s) {
        // Write your code here
        char[] charArray = s.toCharArray();
        int[] balancedCheck = new int[3]; // [] = 0, {} = 1, () =2
        for (char bracket: charArray) {
            switch(bracket) {
                case '[':
                    balancedCheck[0] += 1;
                    break;
                case ']':
                    balancedCheck[0] -= 1;
                    break;
                case '{':
                    balancedCheck[1]++;
                    break;
                case '}':
                    balancedCheck[1]--;
                    break;
                case '(':
                    balancedCheck[2]++;
                    break;
                case ')':
                    balancedCheck[2]--;
                    break;
            }
            System.out.println(bracket);

        }

        for(int check: balancedCheck){
            System.out.println(check);
            if (Math.abs(check) > 0) {
                return "NO";
            }
        }

        return "YES";

    }

    public static String eliminationMethod(String s) {
        while (s.contains("[]") || s.contains("{}") || s.contains("()")) {
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }

        return s.length() > 0? "NO": "YES";
    }
}
