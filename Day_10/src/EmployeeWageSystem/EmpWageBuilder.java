package EmployeeWageSystem;

import java.util.ArrayList;

public class EmpWageBuilder implements IEmpWageBuilder {

    static final int IS_PART_TIME = 1;

    static final int IS_FULL_TIME = 2;

    private final ArrayList<CompanyEmpWage> companyEmpWages;

    public EmpWageBuilder() {

        companyEmpWages = new ArrayList<>();
    }

    @Override
    public void addCompanyEmpWage(
            String companyName,
            int wagePerHour,
            int workingDaysPerMonth,
            int maxHoursPerMonth
    ) {

        CompanyEmpWage company =
                new CompanyEmpWage(
                        companyName,
                        wagePerHour,
                        workingDaysPerMonth,
                        maxHoursPerMonth
                );

        companyEmpWages.add(company);
    }

    @Override
    public void computeEmpWage() {

        for (CompanyEmpWage company : companyEmpWages) {

            computeCompanyWage(company);
        }
    }

    private void computeCompanyWage(
            CompanyEmpWage company
    ) {

        int totalWorkingHours = 0;

        int totalWorkingDays = 0;

        int totalEmpWage = 0;

        ArrayList<Integer> dailyWages = new ArrayList<>();

        while (totalWorkingHours <= company.maxHoursPerMonth
                && totalWorkingDays < company.workingDaysPerMonth) {

            totalWorkingDays++;

            int empHours = 0;

            int attendance =
                    (int) (Math.random() * 3);

            switch (attendance) {

                case IS_PART_TIME:

                    empHours = 4;

                    break;

                case IS_FULL_TIME:

                    empHours = 8;

                    break;

                default:

                    empHours = 0;
            }

            totalWorkingHours += empHours;

            int dailyWage =
                    empHours * company.wagePerHour;

            dailyWages.add(dailyWage);

            totalEmpWage += dailyWage;
        }

        company.setTotalEmpWage(totalEmpWage);

        System.out.println("\nCompany : "
                + company.companyName);

        System.out.println("Daily Wages : "
                + dailyWages);

        System.out.println(company);
    }

    /*
     * UC14
     */
    public void getTotalWageByCompany(
            String companyName
    ) {

        for (CompanyEmpWage company
                : companyEmpWages) {

            if (company.companyName
                    .equals(companyName)) {

                System.out.println(
                        "\nQueried Company Wage"
                );

                System.out.println(company);

                return;
            }
        }

        System.out.println(
                "Company Not Found"
        );
    }
}