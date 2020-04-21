package com.tdavis.data_structures_and_algorithms;

/**
 * Given a String, return a String with the words in the opposite order
 * <p>
 * Parameters
 * Input: str {String}
 * Output: {String}
 * <p>
 * Constraints
 * Time: O(N)
 * Space: O(N)
 * <p>
 * Examples
 * "Everybody's working for the weekend" --> "weekend the for working Everybody's"
 * "Testing this class" --> "class this Testing"
 * "Is today a great day" --> "day great a today Is"
 */

public class SwapWords {

    public String reverseWordOrder(String str) {
        // String to char array
        char[] arr = str.toCharArray();
        // reverse the array
        reverseArr(arr, 0, arr.length - 1);
        // reverse each word in array
        reverseWords(arr);
        // return array as String
        return new String(arr);
    }

    private void reverseArr(char[] arr, int start, int end) {
        char temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private void reverseWords(char[] arr) {
        int start = 0;
        int end;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                end = i - 1;
                reverseArr(arr, start, end);
                start = end + 2;
            }
            if (i == arr.length - 1) {
                end = i;
                reverseArr(arr, start, end);
            }
        }
    }
}

class SwapWordsTest {
    public static void main(String[] args) {
        SwapWords swapWords = new SwapWords();
        SwapWordsTest swapWordsTest = new SwapWordsTest();
        String[] inputs = new String[]{
                "Everybody's working for the weekend",
                "Testing this class",
                "Is today a great day"
        };

        swapWordsTest.test(inputs, swapWords);
    }

    private void test(String[] inputs, SwapWords swapWords) {
        for (String str : inputs) {
            System.out.println("input:\n" + str);
            System.out.println("output:\n" + swapWords.reverseWordOrder(str) + "\n");
        }
    }
}
