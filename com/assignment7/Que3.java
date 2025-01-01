package com.assignment7;

//Q3  Write a Java program that uses a Predicate to check if a given string contains 
//      the letter 'a'.
//      Create a Predicate<String> to test whether the string contains the letter 
//      'a' (case-insensitive).
//    Use the test() method of the Predicate interface to check the string.
//    Input: "Apple"
//    Output: "Apple contains the letter 'a'"
//   Input: "Banana"
//    Output: "Banana contains the letter 'a'"
//   Input: "Cherry"
//   Output: "Cherry does not contain the letter 'a'"
import java.util.Scanner;
import java.util.function.Predicate;

public class Que3 {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            Predicate<String> p = x -> x.toLowerCase().contains("a");
            System.out.println("Enter string to be checked for letter 'a' :");
            String y = s.next();
            if (p.test(y)) {
                System.out.println("Given string contains letter a.");
            } else {
                System.out.println("Given string doesn't contain letter a.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
