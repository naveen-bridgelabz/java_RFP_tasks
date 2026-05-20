package EmployeeWageSystem;

public class EmployeeWageMain {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Employee Wage Computation Program"
        );

        EmpWageBuilder empWageBuilder =
                new EmpWageBuilder();

        /*
         * UC8 onwards
         */
        empWageBuilder.addCompanyEmpWage(
                "TCS",
                20,
                20,
                100
        );

        empWageBuilder.addCompanyEmpWage(
                "Infosys",
                25,
                22,
                120
        );

        empWageBuilder.addCompanyEmpWage(
                "Wipro",
                30,
                25,
                140
        );

        empWageBuilder.computeEmpWage();

        /*
         * UC14
         */
        empWageBuilder.getTotalWageByCompany(
                "Infosys"
        );
    }
}