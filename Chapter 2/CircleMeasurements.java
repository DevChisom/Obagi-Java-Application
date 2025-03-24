//question 2.28

import java.util.Scanner;

public class CircleMeasurements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for the radius
        System.out.print("Enter the radius of the circle: ");
        int radius = input.nextInt();

        // Perform and print calculations directly inside printf
        System.out.printf("Diameter: %d%n", 2 * radius);
        System.out.printf("Circumference: %.5f%n", 2 * 3.14159 * radius);
        System.out.printf("Area: %.5f%n", 3.14159 * radius * radius);

        input.close();
    }
}
