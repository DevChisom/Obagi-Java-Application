//question 2.26





import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for two integers
        System.out.print("Enter the first integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = input.nextInt();

        // Check if the first number is a multiple of the second
        if (number1 % number2 == 0) {
            System.out.printf("%d is a multiple of %d.%n", number1, number2);
        } else {
            System.out.printf("%d is not a multiple of %d.%n", number1, number2);
        }

        input.close();
    }
}
