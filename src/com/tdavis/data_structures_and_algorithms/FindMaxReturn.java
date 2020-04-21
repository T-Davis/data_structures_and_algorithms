package com.tdavis.data_structures_and_algorithms;

import java.util.Arrays;

/**
 * Given an array of ints, return an int with the highest potential return on a single stock, even if it's negative
 * The lower the index the earlier the time
 * The first buy opportunity is index 0
 * The first sell opportunity is index 1
 * <p>
 * Parameters
 * Input: stockPrices {Array of ints}
 * Output: {int}
 * <p>
 * Constraints
 * Time: O(N)
 * Space: O(1)
 * <p>
 * Examples
 * [5, 4, 2, 7, 8, 5, 9, 1, 10, 8] --> 9
 * [5, 4, 2, 7, 8, 5, 9, 1, 7] --> 7
 * [5, 4, 2, 1, 0] --> -1
 * [5, 2, 1, 4, 0] --> -1
 * [0, 1, 2, 3, 4, 5] --> 5
 */

public class FindMaxReturn {

    public double findMaxReturn(int[] stockPrices) {
        double highestPrice = stockPrices[1];
        int hpIndex;
        double lowestPrice = stockPrices[0];
        int lpIndex = 0;
        double maxReturn = 0;
        // go through the array to find the next higher price
        for (int i = 1; i < stockPrices.length; i++) {
            if (stockPrices[i] > highestPrice) {
                highestPrice = stockPrices[i];
                hpIndex = i;
                // go through array to find the lowest price until index of current highest price
                for (int j = lpIndex; j <= hpIndex; j++) {
                    if (stockPrices[j] < lowestPrice) {
                        lowestPrice = stockPrices[j];
                        lpIndex = j;
                    }
                }
                maxReturn = highestPrice - lowestPrice;
            }
        }
        if (highestPrice <= stockPrices[0]) {
            maxReturn = highestPrice - stockPrices[0];
        }
        return maxReturn;
    }
}

class FindMaxReturnTest {

    public static void main(String[] args) {
        FindMaxReturn findMaxReturn = new FindMaxReturn();
        FindMaxReturnTest findMaxReturnTest = new FindMaxReturnTest();
        int[][] inputs = new int[][]{
                {5, 4, 2, 7, 8, 5, 9, 1, 10, 8},
                {5, 4, 2, 7, 8, 5, 9, 1, 7},
                {5, 4, 2, 1, 0},
                {5, 2, 1, 4, 0},
                {0, 1, 2, 3, 4, 5}
        };

        findMaxReturnTest.test(inputs, findMaxReturn);
    }

    private void test(int[][] inputs, FindMaxReturn findMaxReturn) {
        for (int[] arr : inputs) {
            System.out.println("input:\n" + Arrays.toString(arr));
            System.out.println("output:\n" + findMaxReturn.findMaxReturn(arr) + "\n");
        }
    }
}
