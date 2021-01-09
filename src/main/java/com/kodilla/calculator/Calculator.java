package com.kodilla.calculator;

public class Calculator {

    public void printSt() {
        System.out.println("cos");
    }
    public double addMethod(double a ,double b ){
        System.out.println("It works! we will add");
        double c = a + b;
        System.out.println("result is: " + c);
        return c;
    }
    public double minusMethod(double a, double b){
        System.out.println("It works! - minus");
        double c = a - b;
        System.out.println("result is: " + c);
        return c;
    }

    public static void main(String[] args) {
        Calculator kalk = new Calculator();
        kalk.printSt();
        kalk.addMethod(5.3, 6.0);
        kalk.minusMethod(4.0, 8.5);


    }
}
