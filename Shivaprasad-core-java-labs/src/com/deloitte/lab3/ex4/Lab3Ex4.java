package com.deloitte.lab3.ex4;

public class Lab3Ex4 {

    public static int modifyNumber(int number1) {
        
        String numStr = Integer.toString(number1);
        StringBuilder result = new StringBuilder();

        
        for (int i = 0; i < numStr.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(numStr.charAt(i));
            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));

            
            int difference = Math.abs(currentDigit - nextDigit);
            result.append(difference);
        }

        
        result.append(numStr.charAt(numStr.length() - 1));

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        int input = 98364;
        int output = modifyNumber(input);
        System.out.println("Modified number: " + output); 
    }
}
