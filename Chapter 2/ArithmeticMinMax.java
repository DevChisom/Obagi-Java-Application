//question 2.17




import java.util.Scanner;

public class ArithmeticMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        // Perform calculations
        int sum = num1 + num2 + num3;
        int average = sum / 3; // Integer division
        int product = num1 * num2 * num3;

        // Find smallest
        int smallest = num1;
        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;

        // Find largest
        int largest = num1;
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;

        // Display results
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        input.close();
    }
}

