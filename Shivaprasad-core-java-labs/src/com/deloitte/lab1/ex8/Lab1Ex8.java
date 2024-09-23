package com.deloitte.lab1.ex8;

public class Lab1Ex8 {

    
    public boolean checkNumber(int n) {
       
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
    	Lab1Ex8 checker = new Lab1Ex8();

        int testNumber = 32; 
        boolean result = checker.checkNumber(testNumber);

        if (result) {
            System.out.println(testNumber + " is a power of two.");
        } else {
            System.out.println(testNumber + " is not a power of two.");
        }
    }
}
