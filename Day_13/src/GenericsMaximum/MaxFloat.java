package GenericsMaximum;

public class MaxFloat {

    public static Float testMaximum(
            Float firstNumber,
            Float secondNumber,
            Float thirdNumber
    ) {

        Float max = firstNumber;

        if (secondNumber.compareTo(max) > 0) {

            max = secondNumber;
        }

        if (thirdNumber.compareTo(max) > 0) {

            max = thirdNumber;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(
                "Maximum Float : "
                        + testMaximum(
                        12.5f,
                        10.3f,
                        9.8f
                )
        );

        System.out.println(
                "Maximum Float : "
                        + testMaximum(
                        5.5f,
                        25.5f,
                        10.2f
                )
        );

        System.out.println(
                "Maximum Float : "
                        + testMaximum(
                        1.1f,
                        2.2f,
                        30.3f
                )
        );
    }
}