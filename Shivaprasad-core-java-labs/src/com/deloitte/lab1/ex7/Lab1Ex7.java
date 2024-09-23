package com.deloitte.lab1.ex7;

public class Lab1Ex7 {

    public boolean checkNumber(int number) {
        int previousDigit = 9;

        while (number > 0) {
            int currentDigit = number % 10; 
            
            if (currentDigit > previousDigit) {
                return false;
            }

            previousDigit = currentDigit;
            number /= 10;
        }

        return true;
    }

    public static void main(String[] args) {
    	Lab1Ex7 checker = new Lab1Ex7();

        int testNumber = 1569;
        boolean result = checker.checkNumber(testNumber);

        if (result) {
            System.out.println(testNumber + " is an increasing number.");
        } else {
            System.out.println(testNumber + " is not an increasing number.");
        }
    }
}

