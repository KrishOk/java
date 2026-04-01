import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3, total, average;

        System.out.print("Enter 3 numbers: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        num3 = input.nextDouble();

        total = num1 + num2 + num3;
        average = total / 3;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
    }
}