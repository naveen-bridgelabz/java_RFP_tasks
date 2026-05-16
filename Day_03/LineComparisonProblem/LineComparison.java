public class LineComparison {

    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        int x1 = 2;
        int y1 = 4;
        int x2 = 6;
        int y2 = 8;

        double length = Math.sqrt(
                Math.pow((x2 - x1), 2) +
                        Math.pow((y2 - y1), 2)
        );

        System.out.println("Length of Line: " + length);
    }
}