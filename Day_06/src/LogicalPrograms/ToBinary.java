package JUnitPrograms;

import java.util.Scanner;

public class ToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter decimal number: ");

        int number = scanner.nextInt();

        String binary = Integer.toBinaryString(number);

        System.out.println("Binary Representation: " + binary);
    }
}