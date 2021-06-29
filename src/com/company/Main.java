package com.company;

public class Main {

    public static void main(String[] args) {
	// TASK 2. Write a program that adds the value two strings using the wrapper classes to parse the strings. e.g "5" + "8" = 13

        String number1 = "13";
        String number2 = "7";
        int result = Integer.parseInt(number1) + Integer.parseInt(number2);
        System.out.println(number1 + " + " + number2 + " = " + result);
    }
}
