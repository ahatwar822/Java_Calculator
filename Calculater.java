import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculating = true;

        // Welcome message
        System.out.println("Welcome to the Simple Calculator!");

        while (continueCalculating) {
            // Prompt user for input
            System.out.println("Enter the first number:");
            int a = sc.nextInt();

            System.out.println("Enter the second number:");
            int b = sc.nextInt();

            System.out.println("Press Button:");
            System.out.println("1 for Sum");
            System.out.println("2 for Subtraction");
            System.out.println("3 for Multiplication");
            System.out.println("4 for Division");
            System.out.println("5 for Modulus");
            System.out.println("6 to Exit");

            int operator = sc.nextInt();

            // Perform the selected operation
            switch (operator) {
                case 1:
                    System.out.println("Result: " + (a + b));
                    break;
                case 2:
                    System.out.println("Result: " + (a - b));
                    break;
                case 3:
                    System.out.println("Result: " + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + ((double) a / b));
                    }
                    break;
                case 5:
                    if (b == 0) {
                        System.out.println("Error: Modulus by zero is not allowed.");
                    } else {
                        System.out.println("Result: " + (a % b));
                    }
                    break;
                case 6:
                    System.out.println("Exiting the calculator. Goodbye!");
                    continueCalculating = false;
                    break;
                default:
                    System.out.println("Error: Invalid operator. Please choose a number between 1 and 6.");
                    break;
            }
        }

        sc.close();
    }
}
