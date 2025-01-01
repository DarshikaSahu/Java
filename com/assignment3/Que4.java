package com.assignment3;

// Q4 Write a program create a class ‘simpleobject‘. Using constructor display the message.
class Simpleobject {

    Simpleobject() {
        System.out.println("Non parameterized constructor is instantiated.");
    }
}

public class Que4 {

    public static void main(String[] args) {
        Simpleobject s1 = new Simpleobject();
    }

}
