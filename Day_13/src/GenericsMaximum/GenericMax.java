package GenericsMaximum;

import java.util.Arrays;

public class GenericMax<T extends Comparable<T>> {

    T firstValue;

    T secondValue;

    T thirdValue;

    public GenericMax(
            T firstValue,
            T secondValue,
            T thirdValue
    ) {

        this.firstValue = firstValue;

        this.secondValue = secondValue;

        this.thirdValue = thirdValue;
    }

    /*
     * Refactor 2
     */
    public T testMaximum() {

        return testMaximum(
                firstValue,
                secondValue,
                thirdValue
        );
    }

    /*
     * Refactor 1
     */
    public static <T extends Comparable<T>>
    T testMaximum(
            T firstValue,
            T secondValue,
            T thirdValue
    ) {

        T max = firstValue;

        if (secondValue.compareTo(max) > 0) {

            max = secondValue;
        }

        if (thirdValue.compareTo(max) > 0) {

            max = thirdValue;
        }

        printMax(max);

        return max;
    }

    /*
     * UC4
     */
    public static <T extends Comparable<T>>
    T testMaximum(T... values) {

        Arrays.sort(values);

        T max = values[values.length - 1];

        printMax(max);

        return max;
    }

    /*
     * UC5
     */
    public static <T>
    void printMax(T max) {

        System.out.println(
                "Maximum Value : "
                        + max
        );
    }
}