// question 2.35




import java.util.Scanner;

public class CarPoolSavings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Collect user input
        System.out.print("Enter total miles driven per day: ");
        double milesPerDay = input.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = input.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = input.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = input.nextDouble();

        System.out.print("Enter tolls per day: ");
        double tolls = input.nextDouble();

        // Calculate cost of gas used per day
        double dailyGasCost = (milesPerDay / milesPerGallon) * costPerGallon;

        // Total daily driving cost
        double totalDailyCost = dailyGasCost + parkingFees + tolls;

        // Display the result
        System.out.printf("%nYour daily driving cost is: $%.2f%n", totalDailyCost);

        input.close();
    }
}

