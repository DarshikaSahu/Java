package com.assignment8;

// Q3 write a program to demonstrate many to many association using Student and course class 
// class student
// {
// List<Course> l;
// ...}
// class Course 
// {
// List< Student> s;
// ....
// }
import java.util.ArrayList;
import java.util.List;

class Student {

    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}

class Course {

    private String name;
    private List<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}

public class Que3 {

    public static void main(String[] args) {
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        s1.addCourse(c1);
        s1.addCourse(c2);
        s2.addCourse(c1);

        c1.addStudent(s1);
        c1.addStudent(s2);
        c2.addStudent(s1);

        // Print student courses
        System.out.println("Alice's Courses:");
        for (Course course : s1.getCourses()) {
            System.out.println("- " + course.getName());
        }

        // Print course students
        System.out.println("Math Students:");
        for (Student student : c1.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}
