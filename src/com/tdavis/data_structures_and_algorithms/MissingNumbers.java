package com.tdavis.data_structures_and_algorithms;

import java.util.*;

/**
 * Missing Numbers
 * <p>
 * Given range of 1 to N and an array of unique integers that are within that
 * range, return the missing integers not found in the array
 * <p>
 * Parameters
 * Input: n {Integer}
 * Input: arr {Array of Integers}
 * Output: {List of Integers}
 * <p>
 * Constraints
 * Time: O(N)
 * Space: O(N)
 * <p>
 * Examples
 * 4, [1, 4, 2] --> [3]
 * 8, [4, 7, 1, 6] --> [2, 3, 5, 8]
 * 6, [6, 4, 2, 1] --> [3, 5]
 */

public class MissingNumbers {

    public List<Integer> findMissingNumbers(int n, int[] arr) {
        Map<Integer, Boolean> seen = new HashMap<>();
        ArrayList<Integer> results = new ArrayList<>();
        for (int value : arr) {
            seen.put(value, true);
        }
        for (int i = 1; i <= n; i++) {
            if (!seen.containsKey(i)) {
                seen.put(i, false);
            }
        }
        for (Integer key : seen.keySet()) {
            if (!seen.get(key)) {
                results.add(key);
            }
        }
        return results;
    }
}

class MissingNumbersTest {
    public static void main(String[] args) {
        MissingNumbers missingNumbers = new MissingNumbers();
        Test[] inputs = new Test[]{
                new Test(4, new int[]{1, 4, 2}),
                new Test(8, new int[]{4, 7, 1, 6}),
                new Test(6, new int[]{6, 4, 2, 1})
        };

        test(inputs, missingNumbers);
    }

    private static void test(Test[] inputs, MissingNumbers missingNumbers) {
        for (Test i : inputs) {
            System.out.println("input:\n" + i.getRange() + ", " + Arrays.toString(i.getArr()));
            System.out.println("output:\n" + missingNumbers.findMissingNumbers(i.getRange(), i.getArr()) + "\n");
        }
    }

    static class Test {
        int range;
        int[] arr;

        public Test(int range, int[] arr) {
            this.range = range;
            this.arr = arr;
        }

        public int getRange() {
            return range;
        }

        public int[] getArr() {
            return arr;
        }
    }
}

