package com.company;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {

        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}