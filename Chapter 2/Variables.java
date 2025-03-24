// Question 2.3

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        // a) Declare variables
        int c;
        int thisIsAVariable;
        int q76354;
        int number;

        // b) Prompt the user to enter an integer
        System.out.print("Please enter an integer: ");

        // c) Input an integer and assign the result to int variable value
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        // d) Print "This is a Java program"
        System.out.println("This is a Java program");

        // e) Print "This is a Java program" on two lines
        System.out.printf("%s %s%n", "This is a", "Java program");

        // f) Check if number is not equal to 7
		number = value;
        if (number != 7) {
            System.out.println("The variable number is not equal to 7");
        }

        input.close(); 
    }
}