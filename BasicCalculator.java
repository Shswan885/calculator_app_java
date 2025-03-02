import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        return; // Exit the program
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Invalid operator. Please enter +, -, *, or /.");
                    return; // Exit the program
            }

            System.out.println("Result: " + result);

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter numbers.");
        } finally {
            scanner.close(); // Close the scanner to prevent resource leaks.
        }
    }
}
