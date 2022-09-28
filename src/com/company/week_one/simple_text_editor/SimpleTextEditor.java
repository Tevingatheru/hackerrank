package com.company.week_one.simple_text_editor;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    public static void simpleTextEditor(List<String> input) {
        Stack<String> stack = new Stack<>();

//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        scan.nextLine();

        int n = Integer.valueOf(input.get(0));
//        char[] charArray = input.toCharArray();
        input.remove(0);

        for (int i = 0; i < n ; i++) {
//            s = scan.nextLine();
//            char letter = s.charAt(0);
//            String word = s.substring(1);

            String command = input.get(i);
            char letter = command.charAt(0);
            String word = command.substring(1);
            word = word.replaceAll("\\s", "");
            switch(letter) {
                case '1': // append
                    String top = stack.empty() ? "" : stack.peek();
                    stack.push(top+word);
                    break;
                case '2': // delete
                    String edited = stack.empty() ? "" : stack.peek();
                    edited = edited.substring(0,( edited.length() - Integer.parseInt(word) ));
                    stack.push(edited);
                    break;
                case '3': // print
                    String print = stack.peek();
                    System.out.println(print.charAt(Integer.parseInt(word) - 1));
                    break;
                case '4': // undo
                    stack.pop();
                    break;
            }
        }

//        scan.close();
    }


    public static String concat(String s, int k) {
        return s.substring(0, s.length() -k);
    }
}
