//questions 2.24

  


import java.util.Scanner;

public class LargestSmallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt for and read five integers
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        System.out.print("Enter fourth integer: ");
        int num4 = input.nextInt();

        System.out.print("Enter fifth integer: ");
        int num5 = input.nextInt();

        // Assume first number is both smallest and largest
        int largest = num1;
        int smallest = num1;

        // Compare with the rest
        if (num2 > largest) largest = num2;
        if (num3 > largest) largest = num3;
        if (num4 > largest) largest = num4;
        if (num5 > largest) largest = num5;

        if (num2 < smallest) smallest = num2;
        if (num3 < smallest) smallest = num3;
        if (num4 < smallest) smallest = num4;
        if (num5 < smallest) smallest = num5;

        // Display results
        System.out.printf("Largest: %d%n", largest);
        System.out.printf("Smallest: %d%n", smallest);

        input.close();
    }
}
