import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principle amount: ");
        double P = input.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        double r = input.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year: ");
        int n = input.nextInt();

        System.out.print("Enter the # of years: ");
        int t = input.nextInt();

        double amount = P * (Math.pow((1 + (r / n)), (n * t)));

        System.out.printf("The amount after %d years is R%.2f", t, amount);

        input.close();
    }
}
