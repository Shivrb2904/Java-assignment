package com.deloitte.lab6.ex3;
import java.util.HashMap;
import java.util.Map;

public class Lab6Ex3 {

    // Method to get the squares of numbers and store them in a HashMap
    public static Map<Integer, Integer> getSquares(int[] numbers) {
        // Create a HashMap to store numbers and their squares
        Map<Integer, Integer> squareMap = new HashMap<>();

        // Iterate through the array of numbers
        for (int num : numbers) {
            // Add the number as the key and its square as the value
            squareMap.put(num, num * num);
        }

        // Return the map containing the squares
        return squareMap;
    }

    // Main method to test getSquares method
    public static void main(String[] args) {
        // Define an array of numbers
        int[] numbers = {1, 2, 3, 4, 5};

        // Call the getSquares method
        Map<Integer, Integer> squares = getSquares(numbers);

        // Print the result
        System.out.println("Number and their squares: " + squares);
    }
}

