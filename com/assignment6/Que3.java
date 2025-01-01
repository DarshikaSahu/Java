package com.assignment6;

// Q 3 Create MainClass and define 5 objects of student class  and store them in TreeSet or Priority Queue
import java.util.Comparator;
import java.util.TreeSet;
// import java.util.ArrayList;

class Student4 {

    int rollno;
    String name;

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }

    public Student4(int rollno, String name) {
//	super();
        this.rollno = rollno;
        this.name = name;
    }

}

class Comp2 implements Comparator<Student4> {

    @Override
    public int compare(Student4 o1, Student4 o2) {

        return Integer.compare(o1.rollno, o2.rollno);
    }

}

public class Que3 {

    public static void main(String[] args) {

        Student4 s = new Student4(12, "neha");
        Student4 s1 = new Student4(2, "ashu");
        Student4 s2 = new Student4(22, "priya");
        Student4 s3 = new Student4(20, "gagan");

        TreeSet<Student4> l = new TreeSet<>(new Comp2());
        l.add(s);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        for (Student4 r : l) {
            System.out.println(r);
        }
    }

}
