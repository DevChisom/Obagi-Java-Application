
//question 2.15

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first integer
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        // Prompt user to enter the second integer
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        // Perform arithmetic operations
        int sum = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;

        // Check for division by zero
        if (num2 != 0) {
            int quotient = num1 / num2;
            System.out.printf("Sum: %d%nProduct: %d%nDifference: %d%nQuotient: %d%n",
                    sum, product, difference, quotient);
        } else {
            System.out.printf("Sum: %d%nProduct: %d%nDifference: %d%n", sum, product, difference);
            System.out.println("Quotient: Cannot divide by zero.");
        }

        input.close();
    }
}





