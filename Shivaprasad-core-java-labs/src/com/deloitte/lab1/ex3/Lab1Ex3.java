package com.deloitte.lab1.ex3;

import java.util.Scanner;

public class Lab1Ex3 {

    // Recursive method 
    public static int fibonacciRecursive(int n) {
        if (n == 1 || n == 2) {
            return 1; 
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // Non-recursive (iterative) method 
    public static int fibonacciNonRecursive(int n) {
        if (n == 1 || n == 2) {
            return 1; 
        }

        int a = 1, b = 1, fib = 1;

        for (int i = 3; i <= n; i++) {
            fib = a + b; // F(n) = F(n-1) + F(n-2)
            a = b;
            b = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the position (n) of the Fibonacci sequence: ");
        int n = scanner.nextInt();
        System.out.println("Recursive approach: Fibonacci number at position " + n + " is " + fibonacciRecursive(n));
        System.out.println("Non-recursive approach: Fibonacci number at position " + n + " is " + fibonacciNonRecursive(n));

        scanner.close();
    }
}
