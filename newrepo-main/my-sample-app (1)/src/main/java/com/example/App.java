package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to maven123");
        Calculator calc = new Calculator();
        int result = calc.add(8, 15);
        System.out.println("8 + 15 = " + result);
    }
}
