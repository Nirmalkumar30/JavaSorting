package com.javalearnings;

public class BubbleSorting {
    public static void main(String[] args) {
        // write your code here
        int[] arr = {1, 5, 2, 56, 11, 23, 0, -15};
        bubbleSort(arr);
    }

    static void bubbleSort(int[] arr) {
        /*
        Step 1: Create a Temporary variable outside Outer loop.
        Step 2: Create an outer loop with iterate till array length
        Step 3: Create an inner loop j = outer loop+1with iterate till array length
        Step 4: Write a condition to check the arr[i] >arr[j]
        Step 5: If condition is true then swap the values as below
            Step 5.1: Assign Temp = arr[i]
            Step 5.2: Assign arr[i] = arr[j]
            Step 5.3: Assign arr[j] = temp

        Step 6: Print the value outside the inner loop
         */
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}
