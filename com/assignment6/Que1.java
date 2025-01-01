package com.assignment6;

// Q 1  Wap to define Student class havinf fields like   Rollno , name and marks
//       --define    - constructor  |getter Setter
class Student2 {

    int Rollno;
    String name;
    double marks;

    public int getRollno() {
        return Rollno;
    }

    public void setRollno(int rollno) {
        Rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}

public class Que1 {

    public static void main(String[] args) {
        Student2 s = new Student2();
        s.setRollno(10);
        System.out.println("Roll no is: " + s.getRollno());
        s.setName("Dishi");
        System.out.println("Name is: " + s.getName());
        s.setMarks(100);
        System.out.println("Marks : " + s.getMarks());
    }

}
