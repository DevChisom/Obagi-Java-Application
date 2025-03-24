 //question 2.10
public class StatementDisplay {
    public static void main(String[] args) {
        int x = 2;
        int y = 3;

        // a) Display the value of x
        System.out.printf("x = %d%n", x);

        // b) Display the value of x + x
        System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));

        // c) Display "x =" without a newline
        System.out.printf("x =");

        // d) Display (x + y) = (y + x)
        System.out.printf("%d = %d%n", (x + y), (y + x));
    }
}



