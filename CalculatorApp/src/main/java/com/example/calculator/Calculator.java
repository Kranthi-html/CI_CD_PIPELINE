package com.example.calculator;

public class Calculator {

    public int add(int a, int b) {
        int result = a + b;
        System.out.println("Adding " + a + " + " + b + " = " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtracting " + a + " - " + b + " = " + result);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplying " + a + " * " + b + " = " + result);
        return result;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Attempted to divide " + a + " by zero");
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        int result = a / b;
        System.out.println("Dividing " + a + " / " + b + " = " + result);
        return result;
    }
}
