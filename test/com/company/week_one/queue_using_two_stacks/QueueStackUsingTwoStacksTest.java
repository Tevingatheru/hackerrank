package com.company.week_one.queue_using_two_stacks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueStackUsingTwoStacksTest {

    @Test
    void solution() {
        String input = """
                10
                1 42
                2
                1 14
                3
                1 28
                3
                1 60
                1 78
                2
                2""";
        QueueUsingTwoStacks.Solution.solution(input);
    }
}