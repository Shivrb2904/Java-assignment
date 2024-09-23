package com.deloitte.lab2.ex3;
import java.util.Arrays;

public class Lab2Ex3 {

    
    public static int[] getSorted(int[] arr) {
        int[] reversedArray = new int[arr.length];
        
       
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = reverseNumber(arr[i]);
        }
        
       
        Arrays.sort(reversedArray);
        
        
        return reversedArray;
    }

    public static int reverseNumber(int num) {
        StringBuilder reversedString = new StringBuilder(String.valueOf(num)).reverse();
        return Integer.parseInt(reversedString.toString());
    }

    public static void main(String[] args) {
        
        int[] arr = {476, 253, 132, 867, 674};
        
     
        int[] sortedArr = getSorted(arr);
        
        
        System.out.println("Reversed and sorted array: " + Arrays.toString(sortedArr));
    }
}

