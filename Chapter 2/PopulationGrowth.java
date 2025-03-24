// question 2.34



import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for current population and growth rate
        System.out.print("Enter the current world population: ");
        long currentPopulation = input.nextLong();

        System.out.print("Enter the annual population growth rate (in percent): ");
        double growthRate = input.nextDouble();

        // Convert growth rate to a decimal
        double rate = growthRate / 100;

        // Display population estimates for the next 5 years
        System.out.println("\nYear\tEstimated Population");
        for (int year = 1; year <= 5; year++) {
            long populationNextYear = (long) (currentPopulation + (currentPopulation * rate));
            System.out.printf("%d\t%,d%n", year, populationNextYear);
            currentPopulation = populationNextYear; // update for next year's calculation
        }

        input.close();
    }
}

