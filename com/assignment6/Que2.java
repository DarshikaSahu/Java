package com.assignment6;

// Q 2 Create another class MyRollnoComparator  and override compare method
import java.util.Comparator;
import java.util.TreeSet;

class Student3 {

    int rollno;
    String name;

    @Override
    public String toString() {
        return "Student [rollno = " + rollno + ", name = " + name + "]";
    }

    public Student3(int rollno, String name) {
//	super();
        this.rollno = rollno;
        this.name = name;
    }

}

class Comp implements Comparator<Student3> {

    @Override
    public int compare(Student3 o1, Student3 o2) {

        return Integer.compare(o1.rollno, o2.rollno);
    }

}

public class Que2 {

    public static void main(String[] args) {

        Student3 s = new Student3(12, "neha");
        Student3 s1 = new Student3(2, "ashu");
        Student3 s2 = new Student3(22, "priya");
        Student3 s3 = new Student3(20, "gagan");

        TreeSet<Student3> l = new TreeSet<>(new Comp());
        l.add(s);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        for (Student3 r : l) {
            System.out.println(r);
        }
    }

}
