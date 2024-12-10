package com.codinginterviewprep.designpatterns.solid.demo1.ocp;

public class PayrollCalculator {
    SalaryCalculator salaryCalculator;
    public  PayrollCalculator(SalaryCalculator salaryCalculator){
        this.salaryCalculator = salaryCalculator;
    }
    public double calculateSalary(Employee employee){
        return salaryCalculator.calculateSalary(employee);
    }
}
