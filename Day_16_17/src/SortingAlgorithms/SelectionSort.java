package SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(
            int[] scores
    ) {

        for (int i = 0; i < scores.length - 1; i++) {

            int minIndex = i;

            for (int j = i + 1;
                 j < scores.length;
                 j++) {

                if (scores[j]
                        < scores[minIndex]) {

                    minIndex = j;
                }
            }

            int temp = scores[minIndex];

            scores[minIndex] = scores[i];

            scores[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] examScores = {
                89, 45, 67, 23, 99
        };

        selectionSort(examScores);

        System.out.println(
                Arrays.toString(examScores)
        );
    }
}