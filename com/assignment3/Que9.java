package com.assignment3;

// Q 9 Write a JAVA program which contains a method square() such that square(3) returns 9,square(0.2) returns 0.04.
class Square {

    void square(int a) {
        System.out.println("Sqare of " + a + " : " + a * a);
    }

    void square(double a) {
        System.out.print("Sqare of " + a + " : ");
        System.out.format("%.2f", a * a);
    }
}

public class Que9 {

    public static void main(String[] args) {
        Square s1 = new Square();
        s1.square(3);
        s1.square(0.2);

    }

}
