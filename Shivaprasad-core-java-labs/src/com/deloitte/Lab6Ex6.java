package com.deloitte.lab6.ex6;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {

    // Method to generate the list of voters based on their age
    public static List<Integer> votersList(Map<Integer, LocalDate> people) {
        List<Integer> eligibleVoters = new ArrayList<>();
        LocalDate today = LocalDate.now();  // Get the current date

        // Iterate through the map and calculate age
        for (Map.Entry<Integer, LocalDate> entry : people.entrySet()) {
            int id = entry.getKey();
            LocalDate dob = entry.getValue();

            // Calculate the person's age
            int age = Period.between(dob, today).getYears();

            // Check if the person is eligible to vote (age >= 18)
            if (age >= 18) {
                eligibleVoters.add(id);  // Add ID to eligible voters list
            }
        }

        // Return the list of eligible voters' IDs
        return eligibleVoters;
    }

    // Main method to test votersList method
    public static void main(String[] args) {
        // Create a map of people with their ID and date of birth
        Map<Integer, LocalDate> people = new HashMap<>();
        people.put(101, LocalDate.of(1995, 5, 23));
        people.put(102, LocalDate.of(2005, 8, 19));
        people.put(103, LocalDate.of(1980, 12, 1));
        people.put(104, LocalDate.of(2010, 11, 15));

        // Call the votersList method
        List<Integer> eligibleVoters = votersList(people);

        // Print the eligible voters' IDs
        System.out.println("Eligible voters' IDs: " + eligibleVoters);
    }
}

