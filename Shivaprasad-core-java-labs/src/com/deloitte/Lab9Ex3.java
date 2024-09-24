package com.deloitte.lab9.ex3;

import java.util.function.BiPredicate;

public class Lab9Ex3 {

    // Method to authenticate username and password using a lambda expression
    public static boolean authenticate(String username, String password) {
        // Predefined username and password
        String validUsername = "admin";
        String validPassword = "password123";

        // Lambda expression to check username and password
        BiPredicate<String, String> isAuthenticated = (user, pass) -> 
            user.equals(validUsername) && pass.equals(validPassword);

        // Apply the lambda expression
        return isAuthenticated.test(username, password);
    }

    // Main method to test the authenticate method
    public static void main(String[] args) {
        // Test cases
        String username1 = "admin";
        String password1 = "password123";

        String username2 = "user";
        String password2 = "pass123";

        // Authenticate the users
        boolean result1 = authenticate(username1, password1);
        boolean result2 = authenticate(username2, password2);

        // Print the results
        System.out.println("Authentication result for " + username1 + ": " + result1);
        System.out.println("Authentication result for " + username2 + ": " + result2);
    }
}

