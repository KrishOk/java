import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare variables
        int size;

        // Input size with validation
        System.out.print("Enter array size: ");
        size = input.nextInt();

        if (size <= 0) {
            System.err.println("Invalid size! Must be greater than 0.");
            System.exit(0);
        }

        // Create array
        int[] numbers = new int[size];

        // Input elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Print elements
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}