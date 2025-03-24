//Question 2.6

import java.util.Scanner;

public class ProductCalculatorPrints {
    public static void main(String[] args) {
        // This program calculates the product of three integers.

        // Create a Scanner called input to read from standard input
        Scanner input = new Scanner(System.in);

        // Declare the variables
        int x, y, z, result;

        // Prompt and read the first integer
        System.out.print("Enter first integer: ");
        x = input.nextInt();

        // Prompt and read the second integer
        System.out.print("Enter second integer: ");
        y = input.nextInt();

        // Prompt and read the third integer
        System.out.print("Enter third integer: ");
        z = input.nextInt();

        // Compute the product
        result = x * y * z;

        // Display the result
        System.out.printf("Product is %d%n", result);

        input.close();
    }
}
