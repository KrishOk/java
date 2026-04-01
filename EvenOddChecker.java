import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variable
        int number;
        boolean isEven;

        // Take input
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Boolean expression to check even
        isEven = (number % 2 == 0);

        // Conditional check
        if (isEven) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
    }
}