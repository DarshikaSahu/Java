package com.assignment4;

// Q 1	Take two integers  and  as input, you have to compute  x/y . If   x and  y  are not  integers or if  is zero , 
// exception will occur and you have to report it. Read sample Input/Output to know what to report in case of exceptions.
import java.util.*;

public class Que1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        try {
            System.out.println("X");
            int x = s.nextInt();
            System.out.println("Y");
            int y = s.nextInt();
            if (x == 0 || y == 0) {
                throw new java.lang.ArithmeticException();
            }

        } catch (ArithmeticException r) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter integers" + e);
        } finally {
            System.out.println("code is executed successfully");

        }

    }
}
