package com.deloitte.lab3.ex2;

public class Lab3Ex2 {

    
    public static String getImage(String str) {
        
        StringBuffer sb = new StringBuffer(str);
        
        
        String reversedStr = sb.reverse().toString();
        
        
        return str + "|" + reversedStr;
    }

    public static void main(String[] args) {
        
        String input = "AIRCRAFT";
        
        
        String result = getImage(input);
        System.out.println("Output: " + result);
    }
}

