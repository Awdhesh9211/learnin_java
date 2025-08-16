package com.learn.javacore._08Array;

import java.util.Arrays; // Import for array utility methods

public class ArrayTest {

    public static void main(String[] args) {

        // -------------------------------
        // 1. One-Dimensional Array
        // -------------------------------
        int[] arr = {5, 2, 9, 1, 7};

        System.out.println("=== 1D Array (Original) ===");
        System.out.println(Arrays.toString(arr)); // [5, 2, 9, 1, 7]

        // Sort Array
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr)); // [1, 2, 5, 7, 9]

        // Binary Search (works only on sorted arrays)
        int index = Arrays.binarySearch(arr, 7);
        System.out.println("Index of 7: " + index);

        // Copy Array
        int[] copy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copy: " + Arrays.toString(copy));

        // Fill Array with a value
        int[] filled = new int[5];
        Arrays.fill(filled, 42);
        System.out.println("Filled: " + Arrays.toString(filled));

        // Compare Arrays
        System.out.println("arr equals copy? " + Arrays.equals(arr, copy));

        // -------------------------------
        // 2. Two-Dimensional Array
        // -------------------------------
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("\n=== 2D Array ===");
        System.out.println(Arrays.deepToString(matrix));

        // -------------------------------
        // 3. Jagged Array
        // -------------------------------
        int[][] jagged = {
                {10, 20},
                {30, 40, 50}
        };

        System.out.println("\n=== Jagged Array ===");
        System.out.println(Arrays.deepToString(jagged));
    }
}
