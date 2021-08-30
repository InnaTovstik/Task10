package com.company;

public class Employee implements Comparable<Employee> {

    private final int id;
    private static int ID;
    String firstName;
    String lastName;
    double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String firstName, String lastName, double salary) {
        this.id = ID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    int getId() {
        return id;
    }

    String getFirstName() {
        return firstName;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    double getSalary() {
        return salary;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.id - o.id;
    }

}