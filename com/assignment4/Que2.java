package com.assignment4;

class MyCalculator {

    public static long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        }

        long result = 1;
        for (int i = 1; i <= p; i++) {
            result *= n;
        }

        return result;
    }
}

public class Que2 {

    public static void main(String[] args) {
        MyCalculator calculator = new MyCalculator();

        try {
            long result = MyCalculator.power(2, 3);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
