package com.company.week_one.queue_using_two_stacks;

import java.util.Stack;

/**
 * https://www.hackerrank.com/challenges/one-week-preparation-kit-queue-using-two-stacks/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=preparation-kits&playlist_slugs%5B%5D=one-week-preparation-kit&playlist_slugs%5B%5D=one-week-day-five
 */
public class QueueUsingTwoStacks {

    class Solution {

        public static class QueueStack<T> {
            private final Stack<T> queue = new Stack<>();
            private final Stack<T> tempQueue = new Stack<>();

            public QueueStack() {
            }

            public void enqueue(T value) {
                if (queue.empty()) {
                    arrangeToQueue(tempQueue, queue);
                }
                queue.push(value);
            }

            public T dequeue() {
                if (queue.empty()) {
                    arrangeToQueue(tempQueue, queue);
                }
                arrangeToQueue((Stack<T>) queue, (Stack<T>) tempQueue);
                var returnValue = tempQueue.pop();
                arrangeToQueue(tempQueue, queue);
                return returnValue;
            }

            public T peek() {
                arrangeToQueue((Stack<T>) queue, (Stack<T>) tempQueue);
                return tempQueue.peek();
            }

            private void arrangeToQueue(Stack<T> from, Stack<T> to) {
                while (!from.empty()) {

                    var value = from.pop();
                    to.push(value);
                }
            }
        }

        private static final QueueStack<String> QUEUE_STACK = new QueueStack<>();

        public static QueueStack<String> solution(String input) {
            var stringArray = input.lines().toList();
            for (String st : stringArray) {
                if (st.startsWith("1 ")) {
                    enqueue(st.substring(st.indexOf(" ") + 1));
                } else if (st.contains("2")) {
                    dequeue();
                } else if (st.contains("3")) {
                    String print = peek();
                    System.out.println(print);
                }
            }
            return QUEUE_STACK;
        }

        private static void enqueue(String input) {
            QUEUE_STACK.enqueue(input);
        }

        private static void dequeue() {
            QUEUE_STACK.dequeue();
        }

        private static String peek() {
            return QUEUE_STACK.peek();
        }
    }

    class Solution2 {
        
    }
}
