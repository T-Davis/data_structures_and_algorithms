package com.tdavis.data_structures_and_algorithms;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NthSmallest {

    public int findNthSmallest(int m, int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int i : arr) {
            q.offer(i);

        }
        for (int i = 1; i < m; i++) {
            q.poll();
        }

        return q.peek();
    }
}

class NthSmallestTest {
    public static void main(String[] args) {
        NthSmallest testClass = new NthSmallest();
        Test[] inputs = new Test[]{
                new Test(3, new int[]{0, 1, 3, 4, 6}),
                new Test(3, new int[]{4, 6, 1, 0, 3}),
                new Test(1, new int[]{4, 6, 1, 0, 3, 10, -1}),
                new Test(2, new int[]{4, 6, 1, 0, 3, 10, -1, -1, -1, 1, 3, 1, 2, 1, 0, 0})

        };
        test(inputs, testClass);
    }

    private static void test(Test[] inputs, NthSmallest nthSmallest) {
        for (Test i : inputs) {
            System.out.println("input:\n" + i.getSmallest() + ", " + Arrays.toString(i.getArr()));
            System.out.println("output:\n" + nthSmallest.findNthSmallest(i.getSmallest(), i.getArr()) + "\n");
        }
    }

    static class Test {
        int smallest;
        int[] arr;

        public Test(int smallest, int[] arr) {
            this.smallest = smallest;
            this.arr = arr;
        }

        public int getSmallest() {
            return smallest;
        }

        public int[] getArr() {
            return arr;
        }
    }
}
