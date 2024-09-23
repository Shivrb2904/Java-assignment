package com.deloitte.lab3.ex3;

public class Lab3Ex3 {

    
    public static String alterString(String str) {
        StringBuilder result = new StringBuilder();  

        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);  
            
            
            if (isConsonant(ch)) {
                
                ch = (char) (ch + 1);
            }
            
            result.append(ch);
        }
        
        
        return result.toString();
    }

    
    public static boolean isConsonant(char ch) {
        
        ch = Character.toLowerCase(ch);
        
        return ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        
        String input = "SUNSET";
        
        
        String result = alterString(input);
        System.out.println("Modified string: " + result);
    }
}

