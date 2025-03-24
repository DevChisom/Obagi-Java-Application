// Question 2.13

public class Evaluation {
    public static void main(String[] args) {
        int x;

        // a) x = 7 + 3 * 6 / 2 - 1
        x = 7 + 3 * 6 / 2 - 1;
        System.out.println("a) x = " + x); // Expected: 15

        // b) x = 2 % 2 + 2 * 2 - 2 / 2
        x = 2 % 2 + 2 * 2 - 2 / 2;
        System.out.println("b) x = " + x); // Expected: 3

        // c) x = (3 * 9 * (3 + (9 * 3 / (3))))
        x = (3 * 9 * (3 + (9 * 3 / (3))));
        System.out.println("c) x = " + x); // Expected: 324
    }
}





