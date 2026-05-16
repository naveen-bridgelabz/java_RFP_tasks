package LineComparisonProblem;

public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Program");

        int x1 = 2, y1 = 4;
        int x2 = 6, y2 = 8;

        int x3 = 1, y3 = 2;
        int x4 = 10, y4 = 12;

        Double line1Length = Math.sqrt(
                Math.pow((x2 - x1), 2) +
                        Math.pow((y2 - y1), 2)
        );

        Double line2Length = Math.sqrt(
                Math.pow((x4 - x3), 2) +
                        Math.pow((y4 - y3), 2)
        );

        System.out.println("Line 1 Length: " + line1Length);
        System.out.println("Line 2 Length: " + line2Length);

        int result = line1Length.compareTo(line2Length);

        if (result == 0) {
            System.out.println("Both lines are equal");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}