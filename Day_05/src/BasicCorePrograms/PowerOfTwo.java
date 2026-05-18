package BasicCorePrograms;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter power value: ");

        int n = scanner.nextInt();

        if (n >= 0 && n < 31) {

            for (int i = 0; i <= n; i++) {

                int power = (int) Math.pow(2, i);

                System.out.println("2 ^ " + i + " = " + power);
            }

        } else {

            System.out.println("Value should be between 0 and 30");
        }
    }
}