package com.deloitte.lab3.ex8;

public class Lab3Ex8 {

    public static boolean isPositiveString(String input) {
       
        input = input.toUpperCase();
        
        
        for (int i = 0; i < input.length() - 1; i++) {
            
            if (input.charAt(i) > input.charAt(i + 1)) {
               
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
       
        System.out.println(isPositiveString("CVZ"));  
        System.out.println(isPositiveString("SAM"));  
        System.out.println(isPositiveString("CAN")); 
    }
}

