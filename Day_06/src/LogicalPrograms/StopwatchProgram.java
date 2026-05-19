package LogicalPrograms;

import java.util.Scanner;

public class StopwatchProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press ENTER to Start");

        scanner.nextLine();

        long start = System.currentTimeMillis();

        System.out.println("Press ENTER to Stop");

        scanner.nextLine();

        long end = System.currentTimeMillis();

        long elapsed = end - start;

        System.out.println("Elapsed Time: "
                + elapsed + " milliseconds");
    }
}