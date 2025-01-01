package com.assignment5;

// Q 1) create a class three methods
// a) void cube(int a)
// b) void square (int b)
// c) void greater(int a,int b,int c)
// create another class having main method
// display menu
//   1) cube
//   2) square
//   3) greater
// Ask choice from user and based on choice call above methods
// Repeat the menu till choice is not equal to 0
import java.util.Scanner;

class Class1 {

    void cube(int a) {
        System.out.println("cube of " + a + " : " + a * a * a);
    }

    void square(int b) {
        System.out.println("square of " + b + " : " + b * b);
    }

    void greater(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("greatest among 3 : " + a);
        } else if (b > a && b > c) {
            System.out.println("greatest among 3 : " + b);
        } else {
            System.out.println("greatest among 3 : " + c);
        }

    }
}

class Class2 {

    int a, b, c;

    void greater() {
        System.out.println("greater() function is instantiated");
    }

    void greater(int a, int b) {
        System.out.println("greater(int a,int b)is instantiated");
        if (a > b) {
            System.out.println("greater: " + a);
        } else {
            System.out.println("greater " + b);
        }
    }

    void greater(int a, int b, int c) {
        System.out.println("greater(int a,int b,int c) is instantiated");
        if (a > b && a > c) {
            System.out.println("greatest among 3 : " + a);
        } else if (b > a && b > c) {
            System.out.println("greatest among 3 : " + b);
        } else {
            System.out.println("greatest among 3 : " + c);
        }
    }
}

public class Que1 {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int x1, x2, x3;
        Class1 x = new Class1();
        int choice = 1;
        while (choice != 0) {
            System.out.println("Enter value of a: ");
            x1 = s.nextInt();
            System.out.println("Enter value of b: ");
            x2 = s.nextInt();
            System.out.println("Enter value of c: ");
            x3 = s.nextInt();
            x.cube(x1);
            x.square(x2);
            x.greater(x1, x2, x3);
            System.out.println("Enter choice (0 to exit).");
            choice = s.nextInt();
        }
        int a, b, c;
        Class2 y = new Class2();
        System.out.println("Enter value of a: ");
        a = s.nextInt();
        System.out.println("Enter value of b: ");
        b = s.nextInt();
        System.out.println("Enter value of c: ");
        c = s.nextInt();

        y.greater();
        y.greater(a, b);
        y.greater(a, b, c);
    }

}
