package EmployeeWageOOP;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        int IS_PRESENT = 1;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_HOUR = 8;

        int empHrs = 0;
        int empWage = 0;

        double randomCheck = Math.floor(Math.random() * 10) % 2;

        if (randomCheck == IS_PRESENT) {
            empHrs = FULL_DAY_HOUR;
        } else {
            empHrs = 0;
        }

        empWage = empHrs * EMP_RATE_PER_HOUR;

        System.out.println("Employee Wage: " + empWage);
    }
}