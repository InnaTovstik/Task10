package com.company;

import java.util.Comparator;

public class EmployeeAllComparator implements Comparator<Employee> {

    public int compare(Employee e1, Employee e2) {
        int c = (int) (e1.getSalary() - e2.getSalary());
        if (c == 0) {
            c = e1.last_name.compareTo(e2.last_name);
            if (c == 0) {
                c = e1.first_name.compareTo(e2.first_name);
            }
        }
        return c;
    }
}