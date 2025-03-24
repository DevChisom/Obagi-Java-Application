//question 2.27

public class CheckerboardPattern {
    public static void main(String[] args) {
        // Print 8 lines (rows)
        for (int row = 1; row <= 8; row++) {
            // Add a space at the beginning of every even-numbered row
            if (row % 2 == 0) {
                System.out.print(" ");
            }

            // Print 8 asterisks, each followed by a space
            for (int col = 1; col <= 8; col++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
