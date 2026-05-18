package BasicCorePrograms;

import java.util.Scanner;

public class HarmonicNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of N: ");

        int n = scanner.nextInt();

        double harmonic = 0.0;

        if (n != 0) {

            for (int i = 1; i <= n; i++) {

                harmonic += (double) 1 / i;
            }

            System.out.println("Harmonic Value: " + harmonic);

        } else {

            System.out.println("N should not be zero");
        }
    }
}