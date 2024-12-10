package com.codinginterviewprep.designpatterns.solid.demo1.ocp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Full Time Salary Calculator.");
        Employee fullTimeEmployee = new Employee(EmployeeType.FULL_TIME);
        PayrollCalculator fullTimePayrollCalculator = new PayrollCalculator(new FullTimeSalaryCalculator());
        System.out.println("FullTime Employee Salary :"+ fullTimePayrollCalculator.calculateSalary(fullTimeEmployee));
        System.out.println("***********");
        System.out.println("Part Time Salary Calculator");
        Employee partTimeEmployee = new Employee(EmployeeType.PART_TIME);
        PayrollCalculator partTimePayrollCalculator = new PayrollCalculator(new PartTimeSalaryCalculator());
        System.out.println("Part Time Employee Salary :" + partTimePayrollCalculator.calculateSalary(partTimeEmployee
        ));
    }
}
