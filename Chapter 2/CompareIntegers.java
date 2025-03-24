
//question 2.16


import java.util.Scanner;

public class CompareIntegers {
    public static void main(String[] args) {
        // Create Scanner to read input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter the first integer
        System.out.print("Enter first integer: ");
        int number1 = input.nextInt();

        // Prompt user to enter the second integer
        System.out.print("Enter second integer: ");
        int number2 = input.nextInt();

        // Compare the two numbers
        if (number1 > number2) {
            System.out.printf("%d is larger%n", number1);
        } else if (number2 > number1) {
            System.out.printf("%d is larger%n", number2);
        } else {
            System.out.println("These numbers are equal");
        }

        input.close();
    }
}
