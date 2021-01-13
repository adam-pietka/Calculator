package com.kodilla.calculator;

public class Calculator {
    public double addMethod(double a, double b) {
        double c = a + b;
        System.out.println("Result for add " + a + " + " + b + " = " + c);
        return c;
    }

    public double minusMethod(double a, double b) {
        double c = a - b;
        System.out.println("Result for subtraction " + a + " - " + b + " = " + c);
        return c;
    }

    public static void main(String[] args) {
        Calculator kalk = new Calculator();
        kalk.addMethod(5.3, 6.0);
        kalk.minusMethod(455.0, 8.56568);
    }
}
