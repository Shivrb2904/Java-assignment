package com.deloitte.lab6.ex5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lab6Ex5 {

    // Method to get the second smallest element in the array
    public static int getSecondSmallest(int[] arr) {
        // Convert the array to an ArrayList
        List<Integer> arrayList = new ArrayList<>();
        
        // Add array elements to the ArrayList
        for (int num : arr) {
            arrayList.add(num);
        }

        // Sort the ArrayList
        Collections.sort(arrayList);

        // Return the second smallest element (element at index 1)
        return arrayList.get(1);
    }

    // Main method to test getSecondSmallest method
    public static void main(String[] args) {
        // Define an array of integers
        int[] numbers = {12, 5, 7, 89, 34, 2};

        // Call the getSecondSmallest method and print the result
        int secondSmallest = getSecondSmallest(numbers);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
