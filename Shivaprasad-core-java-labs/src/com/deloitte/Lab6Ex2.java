package com.deloitte.lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {

    // Method to count occurrences of each character in the array
    public static Map<Character, Integer> countChars(char[] arr) {
        // Create a HashMap to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Iterate through the character array
        for (char c : arr) {
            // If the character is already in the map, increment its count
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If the character is not in the map, add it with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Return the map containing the character counts
        return charCountMap;
    }

    // Main method to test the countChars method
    public static void main(String[] args) {
        // Define a character array
        char[] arr = {'a', 'b', 'c', 'a', 'b', 'a', 'd', 'c', 'b', 'e'};

        // Call the countChars method
        Map<Character, Integer> charCount = countChars(arr);

        // Print the result
        System.out.println("Character counts: " + charCount);
    }
}
