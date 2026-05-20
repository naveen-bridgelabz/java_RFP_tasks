package EmployeeWageSystem;

public interface IEmpWageBuilder {

    void addCompanyEmpWage(
            String companyName,
            int wagePerHour,
            int workingDaysPerMonth,
            int maxHoursPerMonth
    );

    void computeEmpWage();
}