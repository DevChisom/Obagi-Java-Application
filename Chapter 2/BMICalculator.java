//question 2.33


import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter weight and height
        System.out.print("Enter your weight in pounds: ");
        int weight = input.nextInt();

        System.out.print("Enter your height in inches: ");
        int height = input.nextInt();

        // Calculate BMI using integer math (as per Chapter 2)
        int bmi = (weight * 703) / (height * height);

        // Display BMI result
        System.out.printf("Your BMI is: %d%n", bmi);

        // Display BMI categories
        System.out.println("\nBMI VALUES");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");

        input.close();
    }
}

