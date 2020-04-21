package com.tdavis.data_structures_and_algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Homework 05 - Dynamic Programming: Tabulation/Memoization
 * <p>
 * <p>
 * Instructions: Dynammic programming takes a lot of practice to recognize as
 * well as develop algorithms. Thus we will be working on a few
 * different problems using dynammic programming.
 * <p>
 * As a reminder, here are the two dynamic programing approaches:
 * <p>
 * (1) Overlapping subproblems - Memoization
 * Recursion sometimes call subproblems repeatedly. These repeated
 * calls lead to inefficient computations and an exponential time
 * complexity.
 * <p>
 * (2) Optimal substructure - Tabulation
 * The solution of a larger problem can be solved using
 * solutions of its subproblems.
 */

public class CoinSum {

    /*
     *  1. Coin Sum
     *
     *          Given an array of coins and a target total, return how many
     *          unique ways there are to use the coins to make up that total.
     *
     *  Input:  coins {Integer Array}, total {Integer}
     *  Output: {Integer}
     *
     *
     * Example:
     *  Input:  [1,2,3], 4
     *  Output: 4
     *
     *          1+1+1+1
     *          1+3
     *          1+1+2
     *          2+2
     *
     *
     *  Input:  [2,5,3,6], 10
     *  Output: 5
     *
     *          2+3+5
     *          5+5
     *          2+3+2+3
     *          2+2+6
     *          2+2+2+2+2
     *
     *    Note: You have an unlimited number of each coin type. All coins in the
     *          coin array will be unique
     *          Order does not matter. Ex: One penny and one nickel to create six
     *          cents is equivalent to one nickel and one penny
     *
     */

    // Time Complexity:
    // Auxiliary Space Complexity:

    public static int coinSum(int[] coins, int total) {
        List<Integer> list = new ArrayList<>();
        return -1;
    }

}
