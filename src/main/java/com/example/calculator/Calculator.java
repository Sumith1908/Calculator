package com.example.calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        System.out.println("Calculator :-");
        while (!exit) {
            System.out.println("1. Add");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Factorial");
            System.out.println("6. Logarithm");
            System.out.println("7. Power");
            System.out.println("8. Square Root");
            System.out.println("9. Exit");

            System.out.print("Enter your choice (1-9): ");
            int choice = scanner.nextInt();

            if (choice == 9) {
                exit = true;
                System.out.println("Exiting the calculator. Bye!");
                continue;
            }
            if(choice > 9 || choice<1) {
                System.out.println("Enter a valid choice!!");
                continue;
            }

            double result = 0;

            switch (choice) {
                case 1:
                    result = performAddition(scanner);
                    break;
                case 2:
                    result = performSubtraction(scanner);
                    break;
                case 3:
                    result = performMultiplication(scanner);
                    break;
                case 4:
                    result = performDivision(scanner);
                    break;
                case 5:
                    result = performFactorial(scanner);
                    break;
                case 6:
                    result = performLogarithm(scanner);
                    break;
                case 7:
                    result = performPower(scanner);
                    break;
                case 8:
                    result = performSquareRoot(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 9.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
    }

    public static double performAddition(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return add(num1, num2);
    }

    public static double performSubtraction(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return subtract(num1, num2);
    }

    public static double performMultiplication(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        return multiply(num1, num2);
    }

    public static double performDivision(Scanner scanner) {
        double num1, num2;
        do {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter non-zero second number: ");
            num2 = scanner.nextDouble();
            if (num2 == 0) {
                System.out.println("Error: Division by zero is not allowed. Please enter a non-zero second number.");
            }
        } while (num2 == 0);
        return divide(num1, num2);
    }

    public static double performFactorial(Scanner scanner) {
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        return factorial(num);
    }

    public static double performLogarithm(Scanner scanner) {
        System.out.print("Enter a positive number: ");
        double num = scanner.nextDouble();
        return logarithm(num);
    }

    public static double performPower(Scanner scanner) {
        System.out.print("Enter base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = scanner.nextDouble();
        return power(base, exponent);
    }

    public static double performSquareRoot(Scanner scanner) {
        System.out.print("Enter a non-negative number: ");
        double num = scanner.nextDouble();
        return squareRoot(num);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static double logarithm(double n) {
        return Math.log(n);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double n) {
        return Math.sqrt(n);
    }
}

