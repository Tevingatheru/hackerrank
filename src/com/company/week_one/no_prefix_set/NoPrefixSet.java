package com.company.week_one.no_prefix_set;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NoPrefixSet {

    public static void noPrefix(List<String> words) {
        // Write your code here
        int n = words.size();
        String response = "GOOD SET";

        for(int i = 0; i < n; i++) {
            if(i+1 < n) {
                for(int j = i+1; j < n;j++) {
                    if (words.get(j).startsWith(words.get(i))) {
                        response = "BAD SET";
                        System.out.println(response);
                        System.out.println(words.get(j));
                        return;
                    }
                }
            }
        }

        if (!response.equals("BAD SET")) System.out.println(response);
    }

    public static void noPrefix2(List<String> words) {
        HashMap<Integer, String> map = new HashMap<>();
        String response = "GOOD SET";

        int n = words.size();
        for (int i =0; i<n; i++) {
            if (!map.isEmpty()) {
                String value  = words.get(i);
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    String s = entry.getValue();
                    if (value.startsWith(s) || value.length() <= 1) {
                        response = "BAD SET";
                        System.out.println(response);
                        System.out.println(value);
                        return;
                    }
                }
            }
            map.put(i, words.get(i));
        }
        System.out.println(response);
    }


}
