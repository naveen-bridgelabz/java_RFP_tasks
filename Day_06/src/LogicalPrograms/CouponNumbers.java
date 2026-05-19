package LogicalPrograms;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class CouponNumbers {

    public static int generateCoupon(int n) {

        Random random = new Random();

        return random.nextInt(n);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of distinct coupons: ");

        int n = scanner.nextInt();

        HashSet<Integer> coupons = new HashSet<>();

        int totalRandomNumbers = 0;

        while (coupons.size() < n) {

            int coupon = generateCoupon(n);

            coupons.add(coupon);

            totalRandomNumbers++;
        }

        System.out.println("Total random numbers generated: "
                + totalRandomNumbers);

        System.out.println("Distinct Coupons: " + coupons);
    }
}