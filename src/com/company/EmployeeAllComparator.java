package com.company;

import java.util.Comparator;


public class EmployeeAllComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        int c = (int) (e1.getSalary() - e2.getSalary());
        if (c == 0) {
            c = e1.lastName.compareTo(e2.lastName);
            if (c == 0) {
                c = e1.firstName.compareTo(e2.firstName);
            }
        }
        return c;
    }
}