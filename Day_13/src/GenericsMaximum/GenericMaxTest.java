package GenericsMaximum;

public class GenericMaxTest {

    public static void main(String[] args) {

        /*
         * Integer Test Cases
         */
        GenericMax<Integer> integerTest1 =
                new GenericMax<>(
                        30,
                        20,
                        10
                );

        integerTest1.testMaximum();

        GenericMax<Integer> integerTest2 =
                new GenericMax<>(
                        10,
                        50,
                        20
                );

        integerTest2.testMaximum();

        GenericMax<Integer> integerTest3 =
                new GenericMax<>(
                        10,
                        20,
                        70
                );

        integerTest3.testMaximum();

        /*
         * Float Test Cases
         */
        GenericMax<Float> floatTest =
                new GenericMax<>(
                        10.5f,
                        20.8f,
                        15.2f
                );

        floatTest.testMaximum();

        /*
         * String Test Cases
         */
        GenericMax<String> stringTest =
                new GenericMax<>(
                        "Apple",
                        "Peach",
                        "Banana"
                );

        stringTest.testMaximum();

        /*
         * UC4
         */
        GenericMax.testMaximum(
                10,
                20,
                30,
                90,
                50
        );

        GenericMax.testMaximum(
                "Apple",
                "Mango",
                "Banana",
                "Zebra"
        );
    }
}