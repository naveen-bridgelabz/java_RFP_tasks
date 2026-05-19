package JUnitPrograms;

import java.util.Scanner;

public class Binary {

    public static int swapNibbles(int x) {

        return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
    }

    public static boolean isPowerOfTwo(int number) {

        return (number & (number - 1)) == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");

        int number = scanner.nextInt();

        String binary = String.format("%8s",
                        Integer.toBinaryString(number))
                .replace(' ', '0');

        System.out.println("Binary: " + binary);

        int swapped = swapNibbles(number);

        System.out.println("After Swapping Nibbles: "
                + swapped);

        if (isPowerOfTwo(swapped)) {

            System.out.println(swapped
                    + " is Power of 2");

        } else {

            System.out.println(swapped
                    + " is NOT Power of 2");
        }
    }
}