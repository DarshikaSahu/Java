//Q 1  Write a Java program that uses a Predicate to check if a given number is even or odd.
// Create a Predicate<Integer> to test whether a number is even.
// Use the test() method of Predicate to check if a number is even or odd and print the result.
// Input: 6
// Output: "6 is even"
// Input: 7
// Output: "7 is odd"

import java.util.function.Predicate;

public class Predicate {

    public static void main(String[] args) {

        Predicate<Integer> isEven = num -> num % 2 == 0;

    }
}
