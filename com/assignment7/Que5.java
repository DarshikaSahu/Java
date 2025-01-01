package com.assignment7;

//Q 5 Write a Java program that uses a Predicate to check if a given number is prime.
//Create a Predicate<Integer> that returns true if the number is prime, 
//otherwise false. Use the test() method to check whether a number is prime. 
//Example Input/Output: Input: 7 Output: "7 is prime"
//Input: 10 Output: "10 is not prime"
import java.util.Scanner;
import java.util.function.Predicate;

public class Que5 {

    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            Predicate<Integer> isPrime = x -> {
                if (x <= 1) {
                    return false;
                }

                for (int i = 2; i < (x / 2); i++) {
                    if (x % i == 0) {
                        return false;
                    }
                }
                return true;
            };

            System.out.println("Enter number: ");
            int num = s.nextInt();

            if (isPrime.test(num)) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not prime number.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
