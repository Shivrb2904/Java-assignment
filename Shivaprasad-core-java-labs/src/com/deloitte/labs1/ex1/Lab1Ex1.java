package com.deloitte.labs1.ex1;

public class Lab1Ex1 {

    public static int sumOfCubesOfDigitsString(int number) {
        String numberStr = Integer.toString(number);
        int sum = 0;
        
        
        for (char digitChar : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(digitChar); 
            sum += Math.pow(digit, 3); 
        }
        
        return sum;
    }

    public static void main(String[] args) {
        int number = 143; 
        int result = sumOfCubesOfDigitsString(number);
        System.out.println("The sum of cubes of digits of " + number + " is: " + result);
    }
}
