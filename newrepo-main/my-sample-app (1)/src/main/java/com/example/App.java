package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to maven123");
        Calculator calc = new Calculator();
        int result = calc.add(5, 10);
        System.out.println("5 + 10 = " + result);
    }
}
