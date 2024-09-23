package com.deloitte.lab2.ex1;

import java.util.Arrays;

public class Lab2Ex1 {

    public static int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        
        
        Arrays.sort(arr);
        
        return arr[1];
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 2, 4, 7};
        
        int secondSmallest = getSecondSmallest(arr);
        System.out.println("The second smallest element is: " + secondSmallest);
    }
}
