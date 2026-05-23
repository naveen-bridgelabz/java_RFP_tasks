package SearchingAlgorithms;

public class BinarySearchProblems {

    /*
     * Problem 1
     */
    public static int findRotationPoint(
            int[] arr
    ) {

        int left = 0;

        int right = arr.length - 1;

        while (left < right) {

            int mid =
                    left + (right - left) / 2;

            if (arr[mid] > arr[right]) {

                left = mid + 1;

            } else {

                right = mid;
            }
        }

        return left;
    }

    /*
     * Problem 2
     */
    public static int findPeakElement(
            int[] arr
    ) {

        int left = 0;

        int right = arr.length - 1;

        while (left < right) {

            int mid =
                    left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {

                left = mid + 1;

            } else {

                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] rotated = {
                15, 18, 2, 3, 6, 12
        };

        System.out.println(
                "Rotation Point Index : "
                        + findRotationPoint(rotated)
        );

        int[] peakArray = {
                1, 3, 20, 4, 1
        };

        System.out.println(
                "Peak Element Index : "
                        + findPeakElement(peakArray)
        );
    }
}