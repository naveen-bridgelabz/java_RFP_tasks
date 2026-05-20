package GenericsMaximum;

public class MaxInteger {

    public static Integer testMaximum(
            Integer firstNumber,
            Integer secondNumber,
            Integer thirdNumber
    ) {

        Integer max = firstNumber;

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
                "Maximum Integer : "
                        + testMaximum(
                        30,
                        20,
                        10
                )
        );

        System.out.println(
                "Maximum Integer : "
                        + testMaximum(
                        10,
                        40,
                        20
                )
        );

        System.out.println(
                "Maximum Integer : "
                        + testMaximum(
                        10,
                        20,
                        50
                )
        );
    }
}