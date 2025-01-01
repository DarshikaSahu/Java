package com.assignment7;

//Q  2  Write a Java program that uses a Consumer to print the name of a student in 
//      uppercase.
//    Create a Consumer<String> to print the name of a student in uppercase.
//    Accept a student name and print it in uppercase.
//    Input: "John Doe"
//    Output: "JOHN DOE"
import java.util.function.Consumer;

public class Que2 {

    public static void main(String[] args) {
        Consumer<String> s = x -> System.out.println(x.toUpperCase());
        String y = "John Doe";
        s.accept(y);
    }

}
