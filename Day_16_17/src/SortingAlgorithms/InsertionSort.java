package SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] employeeIds) {

        for (int i = 1; i < employeeIds.length; i++) {

            int key = employeeIds[i];

            int j = i - 1;

            while (j >= 0
                    && employeeIds[j] > key) {

                employeeIds[j + 1] =
                        employeeIds[j];

                j--;
            }

            employeeIds[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] employeeIds = {
                105, 101, 109, 103
        };

        insertionSort(employeeIds);

        System.out.println(
                Arrays.toString(employeeIds)
        );
    }
}