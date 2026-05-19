package JUnitPrograms;

import java.util.Scanner;

public class MonthlyPayment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");

        double P = scanner.nextDouble();

        System.out.print("Enter years: ");

        double Y = scanner.nextDouble();

        System.out.print("Enter interest rate: ");

        double R = scanner.nextDouble();

        double n = 12 * Y;

        double r = R / (12 * 100);

        double payment = (P * r)
                / (1 - Math.pow(1 + r, -n));

        System.out.println("Monthly Payment: " + payment);
    }
}