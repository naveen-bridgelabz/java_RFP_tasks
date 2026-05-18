package BasicCorePrograms;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number ");
        System.out.print("Enter number of times to flip coin: ");
        int number = scanner.nextInt();

        int heads = 0;
        int tails = 0;

        for (int i = 1; i <= number; i++) {

            double random = Math.random();

            if (random < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }

        double headPercentage = (heads * 100.0) / number;
        double tailPercentage = (tails * 100.0) / number;

        System.out.println("Heads Percentage: " + headPercentage);
        System.out.println("Tails Percentage: " + tailPercentage);
    }
}