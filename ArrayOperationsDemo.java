package com.udemy.oca;

import java.util.Arrays;

public class ArrayOperationsDemo {

    // Method to reverse an array in-place
    public static int[] reverseArray(int[] arr) {
        int[] reversedArr = Arrays.copyOf(arr, arr.length); // Create a copy to avoid modifying the original
        int left = 0;
        int right = reversedArr.length - 1;
        while (left < right) {
            int temp = reversedArr[left];
            reversedArr[left] = reversedArr[right];
            reversedArr[right] = temp;
            left++;
            right--;
        }
        return reversedArr;
    }

    public static void main(String[] args) {
        // Initial array
        int[] numbers = { 5, 2, 8, 1, 9, 4 };
        System.out.println("Original array: " + Arrays.toString(numbers));
        System.out.println("--------------------");

        // Sorting
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length); // Sort a copy
        Arrays.sort(sortedNumbers);
        System.out.println("Sorted array: " + Arrays.toString(sortedNumbers));
        System.out.println("--------------------");

        // Binary Search (on the sorted array)
        int elementToFind = 8;
        int index = Arrays.binarySearch(sortedNumbers, elementToFind);
        if (index >= 0) {
            System.out.println("Found " + elementToFind + " at index (in sorted array): " + index);
        } else {
            System.out.println(elementToFind + " not found in the sorted array.");
        }
        System.out.println("--------------------");

        // Filling an array
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));
        System.out.println("--------------------");

        // Comparing arrays
        int[] anotherArray = { 1, 2, 4, 5, 8, 9 };
        boolean areEqual = Arrays.equals(sortedNumbers, anotherArray);
        System.out.println("Is the sorted original array equal to {1, 2, 4, 5, 8, 9}? " + areEqual);
        System.out.println("--------------------");

        // Reversing the original array
        int[] reversedNumbers = reverseArray(numbers);
        System.out.println("Reversed original array: " + Arrays.toString(reversedNumbers));
        System.out.println("--------------------");
    }
}