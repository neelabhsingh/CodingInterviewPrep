package com.codinginterviewprep.designpatterns.solid.demo1.ocp;

public class Employee {
    private EmployeeType employeeType;
    public Employee(EmployeeType employeeType){
        this.employeeType = employeeType;
    }
    public EmployeeType getEmployeeType(){
        return employeeType;
    }
}
