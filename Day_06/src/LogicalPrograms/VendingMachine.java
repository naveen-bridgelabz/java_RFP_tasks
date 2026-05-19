package JUnitPrograms;

import java.util.Scanner;

public class VendingMachine {

    static int[] notes = {1000, 500, 100, 50, 10, 5, 2, 1};

    public static void calculateNotes(int amount) {

        int count = 0;

        for (int note : notes) {

            if (amount >= note) {

                int numberOfNotes = amount / note;

                amount = amount % note;

                count += numberOfNotes;

                System.out.println(note + " : "
                        + numberOfNotes);
            }
        }

        System.out.println("Minimum Notes: " + count);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount: ");

        int amount = scanner.nextInt();

        calculateNotes(amount);
    }
}