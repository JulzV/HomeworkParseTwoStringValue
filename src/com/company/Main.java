package com.company;

public class Main {

    public static void main(String[] args) {
// TASK 2. Write a program that adds the value two strings using the wrapper classes to parse the strings. e.g "5" + "8" = 13

//  Initialise variables and operator
        String number1 = "10";
        String number2 = "7";
        String operator = "*";
        double answer = 0;

//  Print out results
        System.out.println("Answer: " + number1 + " " + operator + " " + number2 + " = " + calculate(number1, number2, operator));
    }

//  Methode 1: calculation
        public static double calculate(String number1, String number2, String operator){
            double answer = 0;

            switch (operator) {
                case "+":
                    answer = Double.parseDouble(number1) + Double.parseDouble(number2);
                    return answer;
                case "-":
                    answer = Double.parseDouble(number1) - Double.parseDouble(number2);
                    return answer;
                case "*":
                    answer = Double.parseDouble(number1) * Double.parseDouble(number2);
                    return answer;
                case "/":
                    answer = Double.parseDouble(number1) / Double.parseDouble(number2);
                    return answer;
                // if none of the cases worked
                default:
                    System.out.println("Enter a valid operator");
                    break;
            }
            return answer;

        }
    }


