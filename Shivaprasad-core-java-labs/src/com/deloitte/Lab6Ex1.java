package com.deloitte.lab6.ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Ex1 {

    // Method to get values from HashMap and return them in sorted order
    public static List<Integer> getValues(HashMap<Integer, Integer> map) {
        // Extract values from the map
        List<Integer> valuesList = new ArrayList<>(map.values());

        // Sort the values
        Collections.sort(valuesList);

        // Return the sorted list
        return valuesList;
    }

    // Main method to test getValues
    public static void main(String[] args) {
        // Create a HashMap with some test data
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 50);
        map.put(2, 10);
        map.put(3, 40);
        map.put(4, 20);
        map.put(5, 30);

        // Call the getValues method
        List<Integer> sortedValues = getValues(map);

        // Print the sorted values
        System.out.println("Sorted values: " + sortedValues);
    }
}

