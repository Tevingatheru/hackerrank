package com.company;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class STDOUTnIN {



//    public class Solution {
        public static class Queue<T> {
            private Stack<T> queue;
            private Stack<T> tempQueue;

            public Queue() {
            }

            public void enqueue(T value) {
                if(queue.empty()) {
                    arrangeToQueue(tempQueue, queue);
                }
                queue.push(value);
            }

            public T dequeue() {
                if(queue.empty()) {
                    arrangeToQueue(tempQueue, queue);
                }
                arrangeToQueue((Stack<T>) queue, (Stack<T>) tempQueue);
                T returnValue = tempQueue.pop();
                arrangeToQueue(tempQueue, queue);
                return returnValue;
            }

            public T peek() {
                arrangeToQueue((Stack<T>) queue, (Stack<T>) tempQueue);
                return tempQueue.peek();
            }

            private void arrangeToQueue(Stack<T> from, Stack<T> to) {
                while (!from.empty()) {

                    T value = from.pop();
                    to.push(value);
                }
            }
        }

        private static final Queue<String> queue = new Queue<>();

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            String input = in.next();
            List<String> stringArray = input.lines().collect(Collectors.toList());
            for (String st : stringArray) {
                if (st.startsWith("1 ")) {
                    enqueue(st.substring(st.indexOf(" ") + 1));
                } else if (st.contains("2")) {
                    dequeue();
                } else if (st.contains("3")) {
                    var print = peek();
                    System.out.println(print);
                }
            }
        }

        private static void enqueue(String input) {
            queue.enqueue(input);
        }

        private static void dequeue() {
            queue.dequeue();
        }

        private static String peek() {
            return queue.peek();
        }
//    }
}
