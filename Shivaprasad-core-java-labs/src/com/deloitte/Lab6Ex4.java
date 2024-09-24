package com.deloitte.lab6.ex4;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {

    // Method to get the list of students eligible for medals
    public static Map<Integer, String> getStudents(HashMap<Integer, Integer> studentMarks) {
        // Create a new HashMap to store registration numbers and medal types
        Map<Integer, String> studentMedals = new HashMap<>();

        // Iterate through the input HashMap
        for (Map.Entry<Integer, Integer> entry : studentMarks.entrySet()) {
            int regNo = entry.getKey();
            int marks = entry.getValue();

            // Determine the medal type based on marks
            if (marks >= 90) {
                studentMedals.put(regNo, "Gold");
            } else if (marks >= 80 && marks < 90) {
                studentMedals.put(regNo, "Silver");
            } else if (marks >= 70 && marks < 80) {
                studentMedals.put(regNo, "Bronze");
            }
        }

        // Return the HashMap containing students and their medals
        return studentMedals;
    }

    // Main method to test getStudents method
    public static void main(String[] args) {
        // Create a HashMap with student registration numbers and their marks
        HashMap<Integer, Integer> studentMarks = new HashMap<>();
        studentMarks.put(101, 95);
        studentMarks.put(102, 85);
        studentMarks.put(103, 75);
        studentMarks.put(104, 65);  // This student doesn't qualify for a medal
        studentMarks.put(105, 90);

        // Call the getStudents method and store the result
        Map<Integer, String> result = getStudents(studentMarks);

        // Print the result
        System.out.println("Student registration numbers and their medals: " + result);
    }
}
