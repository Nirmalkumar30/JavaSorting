package com.javalearnings;

import java.util.Arrays;

public class SimpleSorting {

    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 5, 2, 56, 11, 23, 0, -15};
        sort(arr);
    }

    static void sort(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
