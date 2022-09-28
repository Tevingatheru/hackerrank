package com.company.week_one.grid_challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GridChallenge {


    public String gridChallenge(List<String> grid) {
        // Write your code here
        List<String> result = new ArrayList<>();
        int n = grid.size();
        String response = "YES";
        if (n == 1) {
            return response;
        }

        for (String s : grid) {
            // conver to char []
            char[] charArray = s.toCharArray();
            // sort array
            Arrays.sort(charArray);
            result.add(String.valueOf(charArray));
        }

        // check if column is in ascending order
        for (int row = 1; row< n; row++) {
            if("NO".equals(response)) {
                break;
            }
            for (int column = 1; column <= n; column++) {
                char a = result.get(row - 1).toCharArray()[column - 1];
                char b = result.get(row).toCharArray()[column - 1];
                if (a <= b) {
                    response = "YES";
                } else {
                    response = "NO";
                    break;
                }
            }
        }

        return response ;
    }
}
