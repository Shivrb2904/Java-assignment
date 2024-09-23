package com.deloitte.lab1.ex6;

public class Lab1Ex6 {

    
    public int calculateDifference(int n) {
        int sumOfSquares = 0;
        int sum = 0;

        
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i; 
            sum += i; 
        }

        int squareOfSum = sum * sum; 

       
        return sumOfSquares - squareOfSum;
    }

    public static void main(String[] args) {
    	Lab1Ex6 calculator = new Lab1Ex6();
        
        int n = 4; 
        int result = calculator.calculateDifference(n);
        
        System.out.println("The difference for the first " + n + " natural numbers is: " + result);
    }
}
