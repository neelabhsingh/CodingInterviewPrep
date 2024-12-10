package com.codinginterviewprep.designpatterns.solid.demo1.ocp;

public class PartTimeSalaryCalculator implements SalaryCalculator{
    @Override
    public double calculateSalary(Employee employee) {
        System.out.println("Calculate Part Time Salary.");
        return 2500;
    }
}
