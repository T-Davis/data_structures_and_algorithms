package com.tdavis.data_structures_and_algorithms;

public class SwapWords {

    public String reverseWordOrder(String str) {
        char[] arr = str.toCharArray();
        reverseArr(arr, 0, arr.length - 1);
        reverseWords(arr);
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
        String input = "everybody's working for the weekend";
        SwapWords testClass = new SwapWords();

        test(input, testClass);
    }

    private static void test(String input, SwapWords swapWords) {
        System.out.println("input:\n" + input);
        System.out.println("output:\n" + swapWords.reverseWordOrder(input));
    }
}