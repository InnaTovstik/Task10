package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> company = new ArrayList<>();
        company.add(new Employee("Ivan", "Ivanov", 1000));
        company.add(new Employee("Petro", "Ivanov", 1000));
        company.add(new Employee("Alex", "Ivanov", 1000));
        company.add(new Employee("Stepan", "Stepanov", 500));
        company.add(new Employee("Oksana", "Petrenko", 2000));
        company.add(new Employee("Alex", "Zirov", 1500));
        company.add(new Employee("Alla", "Minova", 800));
        Collections.sort(company);
        System.out.println("Список сотрудников");
        printEmployee(company);
        Comparator<Employee> ecomp = new EmployeeSalaryComparator();
        Collections.sort(company, ecomp);
        System.out.println("Список сотрудников, отсортированных по возрастанию зарплаты");
        printEmployee(company);
        Comparator<Employee> ecomp1 = new EmployeeAllComparator();
        Collections.sort(company, ecomp1);
        System.out.println("Список сотрудников, отсортированных по зарплате, " +
                "если она одинаковая - то по фамилии, если фамилии одинаковы - " +
                "то по имени ");
        printEmployee(company);
    }

    public static void printEmployee(ArrayList<Employee> e) {

        for (Employee employee : e) {
            System.out.println(employee);
        }

    }

}