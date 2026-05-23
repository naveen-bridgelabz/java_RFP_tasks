package SortingAlgorithms;

import java.util.Arrays;

public class CountingSort {

    public static void countingSort(
            int[] ages
    ) {

        int max = ages[0];

        for (int age : ages) {

            if (age > max) {

                max = age;
            }
        }

        int[] count = new int[max + 1];

        for (int age : ages) {

            count[age]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {

                ages[index++] = i;

                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] studentAges = {
                15, 12, 18, 10, 14, 12
        };

        countingSort(studentAges);

        System.out.println(
                Arrays.toString(studentAges)
        );
    }
}