package com.assignment3;

// Q 6  Create a class named 'StudentRecord' with String variable 'sname' and integer variable 'roll_no'.
// Assign the value of roll_no as '2' and that of name as "John" while creating an object of the class Student.
// and using display method show all values on console
import java.util.Scanner;

class StudentRecord {

    Scanner s = new Scanner(System.in);
    String sname;
    int roll_no;

    void setData() {
        System.out.print("Enter Student name: ");
        sname = s.next();
        System.out.print("Enter roll_no: ");
        roll_no = s.nextInt();
    }

    void display() {
        System.out.println("Student name: " + sname);

        System.out.println("roll_no: " + roll_no);

    }
}

public class Que6 {

    public static void main(String[] args) {
        StudentRecord s1 = new StudentRecord();
        s1.setData();
        s1.display();

    }

}
