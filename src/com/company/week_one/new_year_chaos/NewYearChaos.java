package com.company.week_one.new_year_chaos;

import java.util.List;

public class NewYearChaos {
    public static String minimumBribes(List<Integer> q) {
        // Write your code here
        int count =0;
        String response = "";
        int numberOfBribePerPerson=0;
        int size = q.size();
        while(size > 0) {
            if ("Too chaotic".equals(response)) break;
            for (int index = size - 1; index >= 0; index--) { // loop through queue
                numberOfBribePerPerson = q.get(index) - (index + 1);

                if (q.get(index) != size) {
                    ++count;
                }  else if (numberOfBribePerPerson > 2) {
                    response = "Too chaotic";
                    break;
                } else {
                    q.remove(index);
                    break;
                }
                response = String.valueOf(count);
            }

            size = q.size();
        }
        return response;
    }

    private static String doRecursively(int count, List<Integer> arr, int index) {
        long size = arr.size();
        long value = arr.get(index);
        long difference = value - (index + 1) ;
        if (size-1 > index){
            if (difference > 0) {
                if (difference < 3) {
                    count += difference;

                } else {
                    return "Too chaotic";
                }
            }

        }

        int response = count;

        return String.valueOf(response);
    }
}
