package com.deloitte.lab6.ex7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab6Ex7 {

    // Method to reverse the numbers in the array and return the sorted array
    public static int[] getSorted(int[] arr) {
        List<Integer> reversedList = new ArrayList<>();

        // Iterate over each number in the array
        for (int num : arr) {
            // Convert the number to a String, reverse it, and convert it back to an integer
            String reversedStr = new StringBuilder(String.valueOf(num)).reverse().toString();
            int reversedNum = Integer.parseInt(reversedStr);
            // Add the reversed number to the list
            reversedList.add(reversedNum);
        }

        // Sort the list
        Collections.sort(reversedList);

        // Convert the sorted list back to an array
        int[] sortedArray = new int[reversedList.size()];
        for (int i = 0; i < reversedList.size(); i++) {
            sortedArray[i] = reversedList.get(i);
        }

        // Return the sorted array
        return sortedArray;
    }

    // Main method to test getSorted method
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {123, 456, 789, 101};

        // Call the getSorted method and get the sorted array
        int[] sortedArray = getSorted(numbers);

        // Print the sorted array
        System.out.print("Sorted array after reversing the numbers: ");
        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}
