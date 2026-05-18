package BasicCorePrograms;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        System.out.println("Prime Factors:");

        for (int i = 2; i * i <= number; i++) {

            while (number % i == 0) {

                System.out.println(i);

                number = number / i;
            }
        }

        if (number > 2) {

            System.out.println(number);
        }
    }
}