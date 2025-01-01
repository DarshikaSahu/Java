// 1) Write a function that checks whether a given number is prime. Use a loop to test for factors, and return true or false based on the
// result.

import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any number: ");
        
        int num = s.nextInt();
        s.close();
        
        if (num == 1 || num == 2) {
            System.out.println("True");
            return;
        }
        
        if (num % 2 == 0) {
            System.out.println("False");
            return;
        }
        
        for (int i = 3; i <= num / 2; i += 2) {
            if (num % i == 0) {
                System.out.println("False");
                return;
            }
        }
        
        System.out.println("True");
        s.close();
    }
}
