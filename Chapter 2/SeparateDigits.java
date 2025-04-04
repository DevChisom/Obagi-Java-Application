//question 2.30

import java.util.Scanner;

public class SeparateDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit integer: ");
        int number = input.nextInt();

        // Input validation
        if (number < 10000 || number > 99999) {
            System.out.println("Error: Please enter exactly a five-digit number.");
        } else {
            // Pick off each digit
            int digit1 = number / 10000;
            int digit2 = (number % 10000) / 1000;
            int digit3 = (number % 1000) / 100;
            int digit4 = (number % 100) / 10;
            int digit5 = number % 10;

            // Print digits separated by 3 spaces
            System.out.printf("%d   %d   %d   %d   %d%n", digit1, digit2, digit3, digit4, digit5);
        }

        input.close();
    }
}
