package com.deloitte.lab9.ex1;

import java.util.function.BiFunction;

public class Lab9Ex1 {

    public static void main(String[] args) {
        // Lambda expression to calculate x^y
        BiFunction<Integer, Integer, Double> powerFunction = (x, y) -> Math.pow(x, y);

        // Test the lambda expression
        int x = 2;
        int y = 3;
        double result = powerFunction.apply(x, y);

        // Print the result
        System.out.println(x + " raised to the power of " + y + " is: " + result);
    }
}

