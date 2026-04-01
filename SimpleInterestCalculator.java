import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double principalAmount, rateOfInterest, timeInYears, simpleInterest;

        System.out.print("Enter Principal Amount: ");
        principalAmount = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        rateOfInterest = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        timeInYears = input.nextDouble();

        simpleInterest = (principalAmount * rateOfInterest * timeInYears) / 100;

        System.out.println("Simple Interest = " + simpleInterest);
    }
}