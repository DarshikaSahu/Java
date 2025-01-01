package com.assignment7;

// Q1  Write a Java program that uses a Predicate to check if a given number is even or odd.
// Create a Predicate<Integer> to test whether a number is even.
// Use the test() method of Predicate to check if a number is even or odd and print the result.
// Input: 6
// Output: "6 is even"
// Input: 7
// Output: "7 is odd"
import java.util.Scanner;
import java.util.function.Predicate;

public class Que1 {

    public static void main(String args[]) {
        Predicate<Integer> p = x -> x % 2 == 0;//gives boolean T or F
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number to be checked: ");
        int x = s.nextInt();

        if (p.test(x)) {
            System.out.println(x + " is even number");
        } else {
            System.out.println(x + " is odd number");
        }
    }
}
