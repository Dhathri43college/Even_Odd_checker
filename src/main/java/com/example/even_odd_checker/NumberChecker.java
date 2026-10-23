package com.example.even_odd_checker;


public class NumberChecker {
    public static String check(int number) {
        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int num = Integer.parseInt(args[0]);
                System.out.println(num + " is " + check(num));
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
            }
        } else {
            System.out.println("No input provided. Defaulting to 0: " + check(0));
        }
    }
}
