package com.company.java_initializer_block;

public class Block {
    public static void block() throws Exception {
        int height = Integer.parseInt("1");
        int width = Integer.parseInt("3");
        if(height <0 || width <0) {
            int area = height * width;
            System.out.println(area);
        } else {
            throw new Exception("Breadth and height must be positive");
        }
    }
}
