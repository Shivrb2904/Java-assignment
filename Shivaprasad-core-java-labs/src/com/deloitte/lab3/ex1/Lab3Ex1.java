package com.deloitte.lab3.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Lab3Ex1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a line of integers separated by spaces:");
        String inputLine = scanner.nextLine();
        
        
        StringTokenizer st = new StringTokenizer(inputLine, " ");
        
        int sum = 0;  
        
        
        System.out.println("The integers are:");
        while (st.hasMoreTokens()) {
            
            String token = st.nextToken();
            int num = Integer.parseInt(token);
            
            
            System.out.println(num);
            
            
            sum += num;
        }
        
        
        System.out.println("Sum of all integers: " + sum);
        
        
        scanner.close();
    }
}
