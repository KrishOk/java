import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number;
        int sum = 0;

        // Loop until user enters 0
        while (true) {
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();

            // Break condition
            if (number == 0) {
                break;
            }

            // Add to sum
            sum = sum + number;
        }

        // Output result
        System.out.println("Total Sum = " + sum);
    }
}