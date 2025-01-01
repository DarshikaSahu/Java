package com.assignment3;

// Q 1 WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and obj2
// passed two arguments so that this constructor gets invoked after creation of obj1 and obj2
import java.util.Scanner;

public class Que1 {

    int id;
    String name;
    Scanner s = new Scanner(System.in);

    Que1() {
        System.out.println("Enter Id: ");
        int id = s.nextInt();
        System.out.println("Enter name: ");
        String name = s.next();
        System.out.println("Id is: " + id + " and name is " + name);
    }

    Que1(int id, String name) {
        System.out.println("Id is: " + id + " and name is " + name);
    }

    public static void main(String[] args) {
        Que1 a31 = new Que1(20, "Darshika"); //Parameterized constructor
        Que1 a31_2 = new Que1();//Non-Parameterized constructor
    }

}
