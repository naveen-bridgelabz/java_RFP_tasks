package GenericsMaximum;

public class MaxString {

    public static String testMaximum(
            String firstString,
            String secondString,
            String thirdString
    ) {

        String max = firstString;

        if (secondString.compareTo(max) > 0) {

            max = secondString;
        }

        if (thirdString.compareTo(max) > 0) {

            max = thirdString;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println(
                "Maximum String : "
                        + testMaximum(
                        "Apple",
                        "Peach",
                        "Banana"
                )
        );

        System.out.println(
                "Maximum String : "
                        + testMaximum(
                        "Dog",
                        "Zebra",
                        "Cat"
                )
        );

        System.out.println(
                "Maximum String : "
                        + testMaximum(
                        "Ant",
                        "Bee",
                        "Tiger"
                )
        );
    }
}