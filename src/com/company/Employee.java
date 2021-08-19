package com.company;

public class Employee implements Comparable<Employee> {

    private final int id;
    private static int ID;
    String first_name;
    String last_name;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String first_name, String last_name, double salary) {
        this.id = ID++;
        this.first_name = first_name;
        this.last_name = last_name;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getFirst_name() {
        return first_name;
    }

    void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    String getLast_name() {
        return last_name;
    }

    void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }

}