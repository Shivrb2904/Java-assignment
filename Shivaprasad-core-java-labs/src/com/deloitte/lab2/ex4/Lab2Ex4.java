package com.deloitte.lab2.ex4;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Collections;

public class Lab2Ex4 {

    
    public static int[] modifyArray(int[] arr) {
        
        Set<Integer> uniqueSet = new LinkedHashSet<>();
        
        
        for (int num : arr) {
            uniqueSet.add(num);
        }
        
        
        Integer[] uniqueArray = uniqueSet.toArray(new Integer[0]);
        
        
        Arrays.sort(uniqueArray, Collections.reverseOrder());
        
        
        return Arrays.stream(uniqueArray).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
       
        int[] arr = {2, 6, 9, 4, 5, 3, 1, 2, 7};
        
        
        int[] modifiedArr = modifyArray(arr);
        
        
        System.out.println("Array after removing duplicates and sorting in descending order: " + Arrays.toString(modifiedArr));
    }
}


