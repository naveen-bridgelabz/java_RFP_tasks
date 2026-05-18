package FunctionalPrograms;

public class SumOfThreeIntegers {

    public static void main(String[] args) {

        int[] numbers = {-1, 0, 1, 2, -1, -4};

        int count = 0;

        System.out.println("Triplets:");

        for (int i = 0; i < numbers.length - 2; i++) {

            for (int j = i + 1; j < numbers.length - 1; j++) {

                for (int k = j + 1; k < numbers.length; k++) {

                    if (numbers[i] + numbers[j] + numbers[k] == 0) {

                        count++;

                        System.out.println(
                                numbers[i] + " "
                                        + numbers[j] + " "
                                        + numbers[k]
                        );
                    }
                }
            }
        }

        System.out.println("Total Triplets: " + count);
    }
}