package com.deloitte.lab9.ex2;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Lab9Ex2{

    // Method that uses lambda to format the string with spaces between each character
    public static String formatString(String input) {
        // Lambda expression to add spaces between characters
        Function<String, String> addSpaces = str -> str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining(" "));

        // Apply the lambda function to the input string
        return addSpaces.apply(input);
    }

    // Main method to test the formatString method
    public static void main(String[] args) {
        // Test input string
        String input = "CG";

        // Call the formatString method
        String formattedString = formatString(input);

        // Print the result
        System.out.println("Formatted string: " + formattedString);
    }
}
