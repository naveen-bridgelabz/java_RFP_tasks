package FunctionalPrograms;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x value: ");
        int x = scanner.nextInt();

        System.out.print("Enter y value: ");
        int y = scanner.nextInt();

        double distance = Math.sqrt(
                Math.pow(x, 2) + Math.pow(y, 2)
        );

        System.out.println("Euclidean Distance: " + distance);
    }
}