package JUnitPrograms;

import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Celsius to Fahrenheit");

        System.out.println("2. Fahrenheit to Celsius");

        int choice = scanner.nextInt();

        if (choice == 1) {

            System.out.print("Enter Celsius: ");

            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.println("Fahrenheit: " + fahrenheit);

        } else {

            System.out.print("Enter Fahrenheit: ");

            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.println("Celsius: " + celsius);
        }
    }
}