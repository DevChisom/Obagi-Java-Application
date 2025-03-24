//question 2.32

import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        // Prompt and read five numbers
        System.out.println("Enter five numbers:");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Number %d: ", i);
            int number = input.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        // Display the results
        System.out.printf("%nPositive numbers: %d%n", positiveCount);
        System.out.printf("Negative numbers: %d%n", negativeCount);
        System.out.printf("Zeros: %d%n", zeroCount);

        input.close();
    }
}

