package com.company.week_one.lego_block;

public class LegoBlocks {
    public static int legoBlocks(int n, int m, String s) {
        int wallWidth = m;
        int[] gapsOnCurrentLevel = new int[m];
        int countPermutations = 0;
        for(int height = 0; height < n; height++) {
            for(int width = 1; width <= 4; width++) {
                while (wallWidth > 0 && width > wallWidth) {
                    wallWidth -= width;
                    if (wallWidth >= 0) {
                        gapsOnCurrentLevel[wallWidth]++;
                    } else {
                        int diff = width - wallWidth;
                    }
                }
            }
        }
        return countPermutations;
    }


    /**
     * https://www.hackerrank.com/challenges/one-week-preparation-kit-lego-blocks/forum/comments/1098199
     *
     * This solution was extracted from the comment above
     *
     * @param n
     * @param m
     * @return
     */
    public static int legoBlocks1098199(int n, int m) {
        int validPermutations = 0;
        

        return validPermutations;
    }

}
