package EmployeeWageSystem;

public class CompanyEmpWage {

    public final String companyName;

    public final int wagePerHour;

    public final int workingDaysPerMonth;

    public final int maxHoursPerMonth;

    public int totalEmpWage;

    public CompanyEmpWage(
            String companyName,
            int wagePerHour,
            int workingDaysPerMonth,
            int maxHoursPerMonth
    ) {

        this.companyName = companyName;

        this.wagePerHour = wagePerHour;

        this.workingDaysPerMonth = workingDaysPerMonth;

        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void setTotalEmpWage(int totalEmpWage) {

        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {

        return "Total Employee Wage for "
                + companyName
                + " is : "
                + totalEmpWage;
    }
}