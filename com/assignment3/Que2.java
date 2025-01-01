package com.assignment3;

import java.util.Scanner;

class Employee {

    float salary;
    int hours;
    Scanner s = new Scanner(System.in);//System.in takes input from the user

    void getinfo() {
        System.out.println("Enter Salary of an Employee: ");
        salary = s.nextFloat();
        System.out.println("Enter number of working hours: ");
        hours = s.nextInt();
    }

    void AddSal() {
        if (salary < 50000) {
            System.out.println("which adds 10000 to salary of the employee if it is less than 50000.");
            salary = salary + 10000;
            System.out.println("new Salary: " + salary);
        }
    }

    void AddWork() {
        if (hours > 6) {
            System.out.println("which adds 5000 to salary of employee if the number of hours of work per day is more than 6 hours.");
            salary = salary + 5000;
            System.out.println("new Salary: " + salary);
        }
    }

}

public class Que2 {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.getinfo();
        e.AddSal();
        e.AddWork();
    }

}
