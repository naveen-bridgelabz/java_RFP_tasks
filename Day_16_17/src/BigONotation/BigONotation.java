package BigONotation;

public class BigONotation {

    /*
     * O(1)
     */
    public static void constantTime() {

        int a = 10;

        int b = 20;

        System.out.println(a + b);
    }

    /*
     * O(N)
     */
    public static void linearTime(
            int[] arr
    ) {

        for (int num : arr) {

            System.out.print(num + " ");
        }

        System.out.println();
    }

    /*
     * O(N²)
     */
    public static void quadraticTime(
            int[] arr
    ) {

        for (int i : arr) {

            for (int j : arr) {

                System.out.print(
                        "(" + i + "," + j + ") "
                );
            }
        }

        System.out.println();
    }

    /*
     * O(log N)
     */
    public static int binarySearch(
            int[] arr,
            int target
    ) {

        int left = 0;

        int right = arr.length - 1;

        while (left <= right) {

            int mid =
                    left + (right - left) / 2;

            if (arr[mid] == target) {

                return mid;
            }

            if (arr[mid] < target) {

                left = mid + 1;

            } else {

                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {
                1, 2, 3, 4, 5
        };

        constantTime();

        linearTime(arr);

        quadraticTime(arr);

        System.out.println(
                "Binary Search Index : "
                        + binarySearch(arr, 4)
        );
    }
}