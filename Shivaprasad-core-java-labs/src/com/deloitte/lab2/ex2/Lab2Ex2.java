package com.deloitte.lab2.ex2;

import java.util.Arrays;

public class Lab2Ex2 {

    
    public static String[] sortStrings(String[] arr) {
     
        Arrays.sort(arr);
        
        int n = arr.length;
        int middle = n / 2;  
        
        
        if (n % 2 != 0) {
            middle = (n / 2) + 1;
        }

        
        for (int i = 0; i < middle; i++) {
            arr[i] = arr[i].toUpperCase();
        }

      
        for (int i = middle; i < n; i++) {
            arr[i] = arr[i].toLowerCase();
        }

        
        return arr;
    }

    public static void main(String[] args) {
        
        String[] arr = {"sukoi30", "apache", "tejas", "mirage", "rafale"};
        
        
        String[] sortedArr = sortStrings(arr);
        
        System.out.println("Sorted and modified array: " + Arrays.toString(sortedArr));
    }
}
