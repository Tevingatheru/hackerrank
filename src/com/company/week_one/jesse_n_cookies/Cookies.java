package com.company.week_one.jesse_n_cookies;

import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Cookies {
    class BruteForceSolution {
        public static int cookies(int k, List<Integer> A) {
            int it = 0;
            it = countIt(it, k, A);
            return it;
        }

        private static int countIt(int it, int k, List<Integer> a) {
            Collections.sort(a);
            int least = a.get(0);
            int least2 = a.get(1);
            a.remove(0);
            a.remove(0);
            if (least >= k) {
                return it;
            }
            it++;
            int combine = least + (2 * least2);
            a.add(combine);
            least = a.get(0);
            if (least >= k) {
                return it;
            }
            return countIt(it, k, a);
        }
    }

    class DynamicProgrammingSolution {
        public static int cookies(int k, List<Integer> A) {
            PriorityQueue<Integer> heap = new PriorityQueue<>(A);
            if (heap.size() <= 1) return 0;
            int it = 0;
            while(heap.size() >= 2) {
                int least = heap.remove();
                int least2 = heap.remove();
                if (least >= k) {
                    return it;
                }
                it++;
                int combine = least + (2 * least2);
                heap.add(combine);
            }
            if (heap.peek() >= k) {
                return it;
            }else {
                return -1;
            }
        }
    }
}
