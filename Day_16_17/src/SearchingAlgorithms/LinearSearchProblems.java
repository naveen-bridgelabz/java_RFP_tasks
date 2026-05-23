package SearchingAlgorithms;

public class LinearSearchProblems {

    /*
     * Problem 1
     */
    public static int firstNegative(
            int[] arr
    ) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {

                return i;
            }
        }

        return -1;
    }

    /*
     * Problem 2
     */
    public static String findSentence(
            String[] sentences,
            String word
    ) {

        for (String sentence : sentences) {

            if (sentence.contains(word)) {

                return sentence;
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        int[] numbers = {
                5, 9, -4, 7
        };

        System.out.println(
                "First Negative Index : "
                        + firstNegative(numbers)
        );

        String[] sentences = {
                "Java is powerful",
                "DSA improves logic",
                "Spring Boot is backend"
        };

        System.out.println(
                findSentence(
                        sentences,
                        "Boot"
                )
        );
    }
}