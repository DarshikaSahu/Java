package com.assignment8;

// Q2 write a program to demonstrate one to many association using Employee class and Department class 
// hint  class Employee { .....}
// class Department {
// List<Employee> l;
// .....
import java.util.ArrayList;
import java.util.List;

class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {

    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

public class Que2 {

    public static void main(String[] args) {
        Department dept = new Department("IT");

        dept.addEmployee(new Employee("John Doe"));
        dept.addEmployee(new Employee("Jane Smith"));

        System.out.println("Department: " + dept.getName());
        for (Employee employee : dept.getEmployees()) {
            System.out.println("Employee: " + employee.getName());
        }
    }
}
