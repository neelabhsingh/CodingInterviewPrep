package com.codinginterviewprep.designpatterns.solid.demo1.ocp;

public class FullTimeSalaryCalculator implements  SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        System.out.println("Calculate Full Time Salary.");
        return 5000;
    }
}
