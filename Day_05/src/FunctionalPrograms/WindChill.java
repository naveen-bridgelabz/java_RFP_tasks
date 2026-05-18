package FunctionalPrograms;

import java.util.Scanner;

public class WindChill {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double t = scanner.nextDouble();

        System.out.print("Enter wind speed: ");
        double v = scanner.nextDouble();

        double windChill = 35.74
                + (0.6215 * t)
                + ((0.4275 * t - 35.75)
                * Math.pow(v, 0.16));

        System.out.println("Wind Chill: " + windChill);
    }
}