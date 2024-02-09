import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;

        System.out.println("Calculator :-");
        while (!exit) 
        {
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) 
            {
                exit = true;
                System.out.println("Exiting the calculator. Byeee!");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            double num2;
            do {
                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                if (choice == 4 && num2 == 0) 
                {
                    System.out.println("Error: Division by zero is not allowed. Please enter a non-zero second number.");
                }
            } while (choice == 4 && num2 == 0);

            double result = 0;

            switch (choice) 
            {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                    continue;
            }

            System.out.println("Result: " + result);
        }
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
}

